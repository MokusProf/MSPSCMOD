package net.mokus.halloween.Blocks;

import net.minecraft.block.AbstractCandleBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.item.FlintAndSteelItem;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.registry.Registries;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.event.GameEvent;
import org.jetbrains.annotations.Nullable;

import java.util.function.ToIntFunction;

public class BigCandle extends Block {
    public static final BooleanProperty LIT = Properties.LIT;
    public static final ToIntFunction<BlockState> STATE_TO_LUMINANCE = state -> state.get(LIT) ? 12 : 0;
    private static final VoxelShape ONE_CANDLE_SHAPE = Block.createCuboidShape(5.5, 0.0, 5.5, 10.5, 13.0, 10.5);

    public BigCandle(Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState().with(LIT, false));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(LIT);
    }

    @Override
    protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
        ItemStack mainHand = player.getStackInHand(player.getActiveHand());
        if (player.getAbilities().allowModifyWorld && player.getStackInHand(player.getActiveHand()).isEmpty() && !this.isNotLit(state)) {
            extinguish(player, state, world, pos);
            return ActionResult.success(world.isClient);
        } else if  (player.getAbilities().allowModifyWorld && (player.getStackInHand(player.getActiveHand()).getItem() instanceof FlintAndSteelItem) && this.isNotLit(state)) {
            lit(player,state,world,pos);
            return ActionResult.success(world.isClient);
        } else {
            return ActionResult.PASS;
        }
    }

    @Override
    public void onProjectileHit(World world, BlockState state, BlockHitResult hit, ProjectileEntity projectile) {
        if (!world.isClient && projectile.isOnFire() && this.isNotLit(state)) {
            setLit(world, state, hit.getBlockPos(), true);
        }
    }

    protected boolean isNotLit(BlockState state) {
        return !(Boolean)state.get(LIT);
    }

    @Override
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        if (!this.isNotLit(state)) {
            spawnCandleParticles(world, pos.toCenterPos(), random);
        }
    }

    private static void spawnCandleParticles(World world, Vec3d vec3d, Random random) {
        float f = random.nextFloat();
        if (f < 0.3F) {
            world.addParticle(ParticleTypes.SMOKE, vec3d.x, vec3d.y + 0.45, vec3d.z, 0.0, 0.0, 0.0);
            if (f < 0.17F) {
                world.playSound(
                        vec3d.x,
                        vec3d.y + 0.5,
                        vec3d.z,
                        SoundEvents.BLOCK_CANDLE_AMBIENT,
                        SoundCategory.BLOCKS,
                        1.0F + random.nextFloat(),
                        random.nextFloat() * 0.7F + 0.3F,
                        false
                );
            }
        }

        world.addParticle(ParticleTypes.FLAME, vec3d.x, vec3d.y + 0.5, vec3d.z, 0.0, 0.0, 0.0);
    }

    public static void extinguish(@Nullable PlayerEntity player, BlockState state, WorldAccess world, BlockPos pos) {
        setLit(world, state, pos, false);
        if (state.getBlock() instanceof AbstractCandleBlock) {
            world.addParticle(ParticleTypes.SMOKE, pos.getX(), pos.getY(), pos.getZ(), 0.0, 0.1F, 0.0);
        }

        world.playSound(null, pos, SoundEvents.BLOCK_CANDLE_EXTINGUISH, SoundCategory.BLOCKS, 1.0F, 1.0F);
        world.emitGameEvent(player, GameEvent.BLOCK_CHANGE, pos);
    }

    private static void setLit(WorldAccess world, BlockState state, BlockPos pos, boolean lit) {
        world.setBlockState(pos, state.with(LIT, lit), Block.NOTIFY_ALL | Block.REDRAW_ON_MAIN_THREAD);
    }

    public static void lit(@Nullable PlayerEntity player, BlockState state, WorldAccess world, BlockPos pos) {
        setLit(world, state, pos, true);
        world.playSound(null, pos, SoundEvents.ITEM_FLINTANDSTEEL_USE, SoundCategory.BLOCKS, 1.0F, 1.0F);
        world.emitGameEvent(player, GameEvent.BLOCK_CHANGE, pos);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return ONE_CANDLE_SHAPE;
    }
}
