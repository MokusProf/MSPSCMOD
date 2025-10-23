package net.mokus.halloween.Datagen;

import com.google.gson.JsonObject;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.*;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.mokus.halloween.Blocks.BigCandle;
import net.mokus.halloween.Blocks.ModBlocks;
import net.mokus.halloween.Items.ModItems;
import net.mokus.halloween.MokusSpookySeason;

import java.util.function.BiConsumer;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        TextureMap textureMap = TextureMap.sideEnd(Blocks.PUMPKIN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(ModBlocks.SPOOKY_CARVED_PUMPKIN,textureMap);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(ModBlocks.DERP_CARVED_PUMPKIN,textureMap);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(ModBlocks.CREEPER_CARVED_PUMPKIN,textureMap);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(ModBlocks.ANGRY_CARVED_PUMPKIN,textureMap);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(ModBlocks.SMOL_CARVED_PUMPKIN,textureMap);

        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(ModBlocks.SPOOKY_JACK_O_LANTERN,textureMap);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(ModBlocks.DERP_JACK_O_LANTERN,textureMap);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(ModBlocks.CREEPER_JACK_O_LANTERN,textureMap);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(ModBlocks.ANGRY_JACK_O_LANTERN,textureMap);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(ModBlocks.SMOL_JACK_O_LANTERN,textureMap);



        registerLitBlock(blockStateModelGenerator, ModBlocks.BIG_CANDLE, "big_candle");
        registerLitBlock(blockStateModelGenerator, ModBlocks.WHITE_BIG_CANDLE, "white_big_candle");
        registerLitBlock(blockStateModelGenerator, ModBlocks.LIGHT_GRAY_BIG_CANDLE, "light_gray_big_candle");
        registerLitBlock(blockStateModelGenerator, ModBlocks.GRAY_BIG_CANDLE, "gray_big_candle");
        registerLitBlock(blockStateModelGenerator, ModBlocks.BLACK_BIG_CANDLE, "black_big_candle");
        registerLitBlock(blockStateModelGenerator, ModBlocks.BROWN_BIG_CANDLE, "brown_big_candle");
        registerLitBlock(blockStateModelGenerator, ModBlocks.RED_BIG_CANDLE, "red_big_candle");
        registerLitBlock(blockStateModelGenerator, ModBlocks.ORANGE_BIG_CANDLE, "orange_big_candle");
        registerLitBlock(blockStateModelGenerator, ModBlocks.YELLOW_BIG_CANDLE, "yellow_big_candle");
        registerLitBlock(blockStateModelGenerator, ModBlocks.LIME_BIG_CANDLE, "lime_big_candle");
        registerLitBlock(blockStateModelGenerator, ModBlocks.GREEN_BIG_CANDLE, "green_big_candle");
        registerLitBlock(blockStateModelGenerator, ModBlocks.CYAN_BIG_CANDLE, "cyan_big_candle");
        registerLitBlock(blockStateModelGenerator, ModBlocks.LIGHT_BLUE_BIG_CANDLE, "light_blue_big_candle");
        registerLitBlock(blockStateModelGenerator, ModBlocks.BLUE_BIG_CANDLE, "blue_big_candle");
        registerLitBlock(blockStateModelGenerator, ModBlocks.PURPLE_BIG_CANDLE, "purple_big_candle");
        registerLitBlock(blockStateModelGenerator, ModBlocks.MAGENTA_BIG_CANDLE, "magenta_big_candle");
        registerLitBlock(blockStateModelGenerator, ModBlocks.PINK_BIG_CANDLE, "pink_big_candle");

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.SPOOKY_MACE, Models.HANDHELD_MACE);
        itemModelGenerator.register(ModItems.GUMMY_EYE,Models.GENERATED);
        itemModelGenerator.register(ModItems.GUMMY_BEAR,Models.GENERATED);

        itemModelGenerator.register(ModItems.CANDY_CORN,Models.GENERATED);
        itemModelGenerator.register(ModItems.LOLLIPOP,Models.HANDHELD);
        itemModelGenerator.register(ModItems.CARAMEL,Models.GENERATED);
        itemModelGenerator.register(ModItems.CARAMEL_APPLE,Models.GENERATED);




        itemModelGenerator.register(Item.fromBlock(ModBlocks.BIG_CANDLE),Models.GENERATED);
        itemModelGenerator.register(Item.fromBlock(ModBlocks.WHITE_BIG_CANDLE),Models.GENERATED);
        itemModelGenerator.register(Item.fromBlock(ModBlocks.LIGHT_GRAY_BIG_CANDLE),Models.GENERATED);
        itemModelGenerator.register(Item.fromBlock(ModBlocks.GRAY_BIG_CANDLE),Models.GENERATED);
        itemModelGenerator.register(Item.fromBlock(ModBlocks.BLACK_BIG_CANDLE),Models.GENERATED);
        itemModelGenerator.register(Item.fromBlock(ModBlocks.BROWN_BIG_CANDLE),Models.GENERATED);
        itemModelGenerator.register(Item.fromBlock(ModBlocks.RED_BIG_CANDLE),Models.GENERATED);
        itemModelGenerator.register(Item.fromBlock(ModBlocks.ORANGE_BIG_CANDLE),Models.GENERATED);
        itemModelGenerator.register(Item.fromBlock(ModBlocks.YELLOW_BIG_CANDLE),Models.GENERATED);
        itemModelGenerator.register(Item.fromBlock(ModBlocks.LIME_BIG_CANDLE),Models.GENERATED);
        itemModelGenerator.register(Item.fromBlock(ModBlocks.GREEN_BIG_CANDLE),Models.GENERATED);
        itemModelGenerator.register(Item.fromBlock(ModBlocks.CYAN_BIG_CANDLE),Models.GENERATED);
        itemModelGenerator.register(Item.fromBlock(ModBlocks.LIGHT_BLUE_BIG_CANDLE),Models.GENERATED);
        itemModelGenerator.register(Item.fromBlock(ModBlocks.BLUE_BIG_CANDLE),Models.GENERATED);
        itemModelGenerator.register(Item.fromBlock(ModBlocks.PURPLE_BIG_CANDLE),Models.GENERATED);
        itemModelGenerator.register(Item.fromBlock(ModBlocks.MAGENTA_BIG_CANDLE),Models.GENERATED);
        itemModelGenerator.register(Item.fromBlock(ModBlocks.PINK_BIG_CANDLE),Models.GENERATED);
    }

    private static void registerLitBlock(BlockStateModelGenerator generator, Block block, String baseName) {
        generator.blockStateCollector.accept(
                VariantsBlockStateSupplier.create(block)
                        .coordinate(BlockStateVariantMap.create(BigCandle.LIT)
                                .register(false, BlockStateVariant.create().put(
                                        VariantSettings.MODEL, Identifier.of(MokusSpookySeason.MOD_ID + ":block/" + baseName)))
                                .register(true, BlockStateVariant.create().put(
                                        VariantSettings.MODEL, Identifier.of(MokusSpookySeason.MOD_ID + ":block/" + baseName + "_lit"))))
        );

        // Helper to generate model JSON
        BiConsumer<String, String> createModel = (fileName, textureName) -> {
            JsonObject json = new JsonObject();
            json.addProperty("parent", MokusSpookySeason.MOD_ID + ":block/template_big_candle");

            JsonObject textures = new JsonObject();
            textures.addProperty("texture", MokusSpookySeason.MOD_ID + ":block/" + textureName);
            json.add("textures", textures);

            JsonObject particle = new JsonObject();
            textures.addProperty("particle", MokusSpookySeason.MOD_ID + ":block/" + textureName);
            json.add("particle", textures);

            generator.modelCollector.accept(
                    Identifier.of(MokusSpookySeason.MOD_ID + ":block/" + fileName),
                    () -> json
            );
        };

        createModel.accept(baseName, baseName);
        createModel.accept(baseName + "_lit", baseName + "_lit");
    }
}
