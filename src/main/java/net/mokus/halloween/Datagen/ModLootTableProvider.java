package net.mokus.halloween.Datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;
import net.mokus.halloween.Blocks.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.SPOOKY_CARVED_PUMPKIN);
        addDrop(ModBlocks.DERP_CARVED_PUMPKIN);
        addDrop(ModBlocks.ANGRY_CARVED_PUMPKIN);
        addDrop(ModBlocks.CREEPER_CARVED_PUMPKIN);
        addDrop(ModBlocks.SMOL_CARVED_PUMPKIN);

        addDrop(ModBlocks.BIG_CANDLE);
        addDrop(ModBlocks.WHITE_BIG_CANDLE);
        addDrop(ModBlocks.LIGHT_GRAY_BIG_CANDLE);
        addDrop(ModBlocks.GRAY_BIG_CANDLE);
        addDrop(ModBlocks.BLACK_BIG_CANDLE);
        addDrop(ModBlocks.BROWN_BIG_CANDLE);
        addDrop(ModBlocks.RED_BIG_CANDLE);
        addDrop(ModBlocks.ORANGE_BIG_CANDLE);
        addDrop(ModBlocks.YELLOW_BIG_CANDLE);
        addDrop(ModBlocks.LIME_BIG_CANDLE);
        addDrop(ModBlocks.GREEN_BIG_CANDLE);
        addDrop(ModBlocks.CYAN_BIG_CANDLE);
        addDrop(ModBlocks.LIGHT_BLUE_BIG_CANDLE);
        addDrop(ModBlocks.BLUE_BIG_CANDLE);
        addDrop(ModBlocks.PURPLE_BIG_CANDLE);
        addDrop(ModBlocks.MAGENTA_BIG_CANDLE);
        addDrop(ModBlocks.PINK_BIG_CANDLE);
    }
}
