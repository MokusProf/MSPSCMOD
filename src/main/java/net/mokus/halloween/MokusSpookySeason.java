package net.mokus.halloween;

import net.fabricmc.api.ModInitializer;

import net.mokus.halloween.Blocks.ModBlocks;
import net.mokus.halloween.Items.ModItemGroup;
import net.mokus.halloween.Items.ModItems;
import net.mokus.halloween.effect.ModEffects;
import net.mokus.halloween.enchantments.ModEnchantmentsEffects;
import net.mokus.halloween.particle.ModParticles;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MokusSpookySeason implements ModInitializer {
	public static final String MOD_ID = "mokus_halloween";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModItemGroup.registerItemGroups();
		ModBlocks.registerModBlocks();

		ModParticles.registerParticles();
		ModEffects.registerStatusEffects();

		ModEnchantmentsEffects.registerEnchantmentEffects();
	}
}