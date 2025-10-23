package net.mokus.halloween.Blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.mokus.halloween.MokusSpookySeason;

public class ModBlocks {


    public static final Block SPOOKY_CARVED_PUMPKIN = registerBlock("spooky_carved_pumpkin",
            new WearableCarvedPumpkinBlock(AbstractBlock.Settings.copy(Blocks.CARVED_PUMPKIN)));
    public static final Block CREEPER_CARVED_PUMPKIN = registerBlock("creeper_carved_pumpkin",
            new WearableCarvedPumpkinBlock(AbstractBlock.Settings.copy(Blocks.CARVED_PUMPKIN)));
    public static final Block DERP_CARVED_PUMPKIN = registerBlock("derp_carved_pumpkin",
            new WearableCarvedPumpkinBlock(AbstractBlock.Settings.copy(Blocks.CARVED_PUMPKIN)));
    public static final Block ANGRY_CARVED_PUMPKIN = registerBlock("angry_carved_pumpkin",
            new WearableCarvedPumpkinBlock(AbstractBlock.Settings.copy(Blocks.CARVED_PUMPKIN)));
    public static final Block SMOL_CARVED_PUMPKIN = registerBlock("smol_carved_pumpkin",
            new WearableCarvedPumpkinBlock(AbstractBlock.Settings.copy(Blocks.CARVED_PUMPKIN)));

    public static final Block SPOOKY_JACK_O_LANTERN = registerBlock("spooky_jack_o_lantern",
            new WearableCarvedPumpkinBlock(AbstractBlock.Settings.copy(Blocks.JACK_O_LANTERN)));
    public static final Block CREEPER_JACK_O_LANTERN = registerBlock("creeper_jack_o_lantern",
            new WearableCarvedPumpkinBlock(AbstractBlock.Settings.copy(Blocks.JACK_O_LANTERN)));
    public static final Block DERP_JACK_O_LANTERN = registerBlock("derp_jack_o_lantern",
            new WearableCarvedPumpkinBlock(AbstractBlock.Settings.copy(Blocks.JACK_O_LANTERN)));
    public static final Block ANGRY_JACK_O_LANTERN = registerBlock("angry_jack_o_lantern",
            new WearableCarvedPumpkinBlock(AbstractBlock.Settings.copy(Blocks.JACK_O_LANTERN)));
    public static final Block SMOL_JACK_O_LANTERN = registerBlock("smol_jack_o_lantern",
            new CarvedPumpkinBlock(AbstractBlock.Settings.copy(Blocks.JACK_O_LANTERN)));

    public static final Block CANDY_BASKET = registerBlock("candy_basket",
            new CandyBasket(AbstractBlock.Settings.copy(Blocks.WHITE_WOOL)));










    public static final Block BIG_CANDLE = registerBlock("big_candle",
            new BigCandle(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.1F)
                    .sounds(BlockSoundGroup.CANDLE)
                    .luminance(BigCandle.STATE_TO_LUMINANCE)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block WHITE_BIG_CANDLE = registerBlock("white_big_candle",
            new BigCandle(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.1F)
                    .sounds(BlockSoundGroup.CANDLE)
                    .luminance(BigCandle.STATE_TO_LUMINANCE)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block LIGHT_GRAY_BIG_CANDLE = registerBlock("light_gray_big_candle",
            new BigCandle(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.1F)
                    .sounds(BlockSoundGroup.CANDLE)
                    .luminance(BigCandle.STATE_TO_LUMINANCE)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block GRAY_BIG_CANDLE = registerBlock("gray_big_candle",
            new BigCandle(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.1F)
                    .sounds(BlockSoundGroup.CANDLE)
                    .luminance(BigCandle.STATE_TO_LUMINANCE)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block BLACK_BIG_CANDLE = registerBlock("black_big_candle",
            new BigCandle(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.1F)
                    .sounds(BlockSoundGroup.CANDLE)
                    .luminance(BigCandle.STATE_TO_LUMINANCE)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block BROWN_BIG_CANDLE = registerBlock("brown_big_candle",
            new BigCandle(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.1F)
                    .sounds(BlockSoundGroup.CANDLE)
                    .luminance(BigCandle.STATE_TO_LUMINANCE)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block RED_BIG_CANDLE = registerBlock("red_big_candle",
            new BigCandle(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.1F)
                    .sounds(BlockSoundGroup.CANDLE)
                    .luminance(BigCandle.STATE_TO_LUMINANCE)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block ORANGE_BIG_CANDLE = registerBlock("orange_big_candle",
            new BigCandle(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.1F)
                    .sounds(BlockSoundGroup.CANDLE)
                    .luminance(BigCandle.STATE_TO_LUMINANCE)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block YELLOW_BIG_CANDLE = registerBlock("yellow_big_candle",
            new BigCandle(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.1F)
                    .sounds(BlockSoundGroup.CANDLE)
                    .luminance(BigCandle.STATE_TO_LUMINANCE)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block LIME_BIG_CANDLE = registerBlock("lime_big_candle",
            new BigCandle(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.1F)
                    .sounds(BlockSoundGroup.CANDLE)
                    .luminance(BigCandle.STATE_TO_LUMINANCE)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block GREEN_BIG_CANDLE = registerBlock("green_big_candle",
            new BigCandle(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.1F)
                    .sounds(BlockSoundGroup.CANDLE)
                    .luminance(BigCandle.STATE_TO_LUMINANCE)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block CYAN_BIG_CANDLE = registerBlock("cyan_big_candle",
            new BigCandle(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.1F)
                    .sounds(BlockSoundGroup.CANDLE)
                    .luminance(BigCandle.STATE_TO_LUMINANCE)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block LIGHT_BLUE_BIG_CANDLE = registerBlock("light_blue_big_candle",
            new BigCandle(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.1F)
                    .sounds(BlockSoundGroup.CANDLE)
                    .luminance(BigCandle.STATE_TO_LUMINANCE)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block BLUE_BIG_CANDLE = registerBlock("blue_big_candle",
            new BigCandle(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.1F)
                    .sounds(BlockSoundGroup.CANDLE)
                    .luminance(BigCandle.STATE_TO_LUMINANCE)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block PURPLE_BIG_CANDLE = registerBlock("purple_big_candle",
            new BigCandle(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.1F)
                    .sounds(BlockSoundGroup.CANDLE)
                    .luminance(BigCandle.STATE_TO_LUMINANCE)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block MAGENTA_BIG_CANDLE = registerBlock("magenta_big_candle",
            new BigCandle(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.1F)
                    .sounds(BlockSoundGroup.CANDLE)
                    .luminance(BigCandle.STATE_TO_LUMINANCE)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block PINK_BIG_CANDLE = registerBlock("pink_big_candle",
            new BigCandle(AbstractBlock.Settings.create().nonOpaque()
                    .strength(0.1F)
                    .sounds(BlockSoundGroup.CANDLE)
                    .luminance(BigCandle.STATE_TO_LUMINANCE)
                    .pistonBehavior(PistonBehavior.DESTROY)));


    private static Block registerBlock(String name, Block block){
        registerBlockItem(name,block);
        return Registry.register(Registries.BLOCK, Identifier.of(MokusSpookySeason.MOD_ID,name),block);
    }

    private static void registerBlockItem(String name, Block block){
        Registry.register(Registries.ITEM, Identifier.of(MokusSpookySeason.MOD_ID,name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks(){
        MokusSpookySeason.LOGGER.info("Registering Block for" + MokusSpookySeason.MOD_ID);
    }
}
