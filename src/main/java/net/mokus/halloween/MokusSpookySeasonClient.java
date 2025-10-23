package net.mokus.halloween;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.minecraft.client.particle.SpellParticle;
import net.minecraft.client.render.RenderLayer;
import net.mokus.halloween.Blocks.ModBlocks;
import net.mokus.halloween.particle.ModParticles;
import net.mokus.halloween.particle.SpookedParticleEffect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MokusSpookySeasonClient implements ClientModInitializer {

	@Override
	public void onInitializeClient() {

		ParticleFactoryRegistry.getInstance().register(ModParticles.SPOOKED_PARTICLE, SpellParticle.DefaultFactory::new);

		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BIG_CANDLE, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WHITE_BIG_CANDLE, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LIGHT_GRAY_BIG_CANDLE, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GRAY_BIG_CANDLE, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BLACK_BIG_CANDLE, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BROWN_BIG_CANDLE, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RED_BIG_CANDLE, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ORANGE_BIG_CANDLE, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.YELLOW_BIG_CANDLE, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LIME_BIG_CANDLE, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GREEN_BIG_CANDLE, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CYAN_BIG_CANDLE, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LIGHT_BLUE_BIG_CANDLE, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BLUE_BIG_CANDLE, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PURPLE_BIG_CANDLE, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MAGENTA_BIG_CANDLE, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PINK_BIG_CANDLE, RenderLayer.getCutout());

		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CANDY_BASKET, RenderLayer.getCutout());

	}
}