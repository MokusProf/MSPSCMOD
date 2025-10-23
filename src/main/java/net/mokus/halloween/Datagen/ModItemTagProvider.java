package net.mokus.halloween.Datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.mokus.halloween.Items.ModItems;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ItemTags.MACE_ENCHANTABLE)
                .add(ModItems.SPOOKY_MACE);
        getOrCreateTagBuilder(ItemTags.VANISHING_ENCHANTABLE)
                .add(ModItems.SPOOKY_MACE)
                .add(ModItems.LOLLIPOP);
        getOrCreateTagBuilder(ItemTags.WEAPON_ENCHANTABLE)
                .add(ModItems.SPOOKY_MACE)
                .add(ModItems.LOLLIPOP);
        getOrCreateTagBuilder(ItemTags.DURABILITY_ENCHANTABLE)
                .add(ModItems.SPOOKY_MACE)
                .add(ModItems.LOLLIPOP);
        getOrCreateTagBuilder(ItemTags.FIRE_ASPECT_ENCHANTABLE)
                .add(ModItems.SPOOKY_MACE)
                .add(ModItems.LOLLIPOP);
        getOrCreateTagBuilder(ItemTags.BREAKS_DECORATED_POTS)
                .add(ModItems.SPOOKY_MACE)
                .add(ModItems.LOLLIPOP);

    }
}
