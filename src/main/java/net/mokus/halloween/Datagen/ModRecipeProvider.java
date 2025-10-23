package net.mokus.halloween.Datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.mokus.halloween.Blocks.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.FOOD,ModBlocks.DERP_CARVED_PUMPKIN , Blocks.PUMPKIN);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.FOOD,ModBlocks.SPOOKY_CARVED_PUMPKIN, Blocks.PUMPKIN);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.FOOD,ModBlocks.CREEPER_CARVED_PUMPKIN, Blocks.PUMPKIN);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.FOOD,ModBlocks.ANGRY_CARVED_PUMPKIN, Blocks.PUMPKIN);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.FOOD,ModBlocks.SMOL_CARVED_PUMPKIN, Blocks.PUMPKIN);


        offerStonecuttingRecipe(recipeExporter, RecipeCategory.FOOD,ModBlocks.DERP_CARVED_PUMPKIN , Blocks.CARVED_PUMPKIN);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.FOOD,ModBlocks.SPOOKY_CARVED_PUMPKIN, Blocks.CARVED_PUMPKIN);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.FOOD,ModBlocks.CREEPER_CARVED_PUMPKIN, Blocks.CARVED_PUMPKIN);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.FOOD,ModBlocks.ANGRY_CARVED_PUMPKIN, Blocks.CARVED_PUMPKIN);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.FOOD,ModBlocks.SMOL_CARVED_PUMPKIN, Blocks.CARVED_PUMPKIN);

    }
}
