package net.mokus.halloween.enchantments;

import com.mojang.serialization.MapCodec;
import net.minecraft.enchantment.effect.EnchantmentEntityEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.mokus.halloween.MokusSpookySeason;

public class ModEnchantmentsEffects {

    public static final MapCodec<? extends EnchantmentEntityEffect> SPOOKY =
            registerEntityEffect("spooky",SpookyEnchantmentEffect.CODEC);


    private static MapCodec<? extends EnchantmentEntityEffect> registerEntityEffect(String name,
                                                                                    MapCodec<? extends  EnchantmentEntityEffect> codec){
        return Registry.register(Registries.ENCHANTMENT_ENTITY_EFFECT_TYPE, Identifier.of(MokusSpookySeason.MOD_ID,name), codec);
    }

    public static void registerEnchantmentEffects(){
        MokusSpookySeason.LOGGER.info("Registering Mod EnchantmentsEffects for" + MokusSpookySeason.MOD_ID);
    }
}
