package net.mokus.halloween.Datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.mokus.halloween.Blocks.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {


    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(ModBlocks.SPOOKY_CARVED_PUMPKIN)
                .add(ModBlocks.DERP_CARVED_PUMPKIN)
                .add(ModBlocks.ANGRY_CARVED_PUMPKIN)
                .add(ModBlocks.CREEPER_CARVED_PUMPKIN)
                .add(ModBlocks.SMOL_CARVED_PUMPKIN)
                .add(ModBlocks.SPOOKY_JACK_O_LANTERN)
                .add(ModBlocks.DERP_JACK_O_LANTERN)
                .add(ModBlocks.ANGRY_JACK_O_LANTERN)
                .add(ModBlocks.CREEPER_JACK_O_LANTERN)
                .add(ModBlocks.SMOL_JACK_O_LANTERN);


//        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
//                .add(ModBlocks.TEST);
    }
}
