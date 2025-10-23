package net.mokus.halloween.enchantments;

import com.mojang.serialization.MapCodec;
import net.minecraft.enchantment.EnchantmentEffectContext;
import net.minecraft.enchantment.effect.EnchantmentEntityEffect;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.Vec3d;
import net.mokus.halloween.effect.ModEffects;

public record SpookyEnchantmentEffect() implements EnchantmentEntityEffect {
    public static final MapCodec<SpookyEnchantmentEffect> CODEC = MapCodec.unit(SpookyEnchantmentEffect::new);

    @Override
    public void apply(ServerWorld world, int level, EnchantmentEffectContext context, Entity user, Vec3d pos) {
        if (user instanceof LivingEntity victim) {
            victim.addStatusEffect(new StatusEffectInstance(ModEffects.SPOOKED_EFFECT,20 * (level * 3) ,0));
        }
    }


    @Override
    public MapCodec<? extends EnchantmentEntityEffect> getCodec() {
        return CODEC;
    }
}
