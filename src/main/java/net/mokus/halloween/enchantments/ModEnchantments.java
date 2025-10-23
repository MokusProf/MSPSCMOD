package net.mokus.halloween.enchantments;

import net.minecraft.component.EnchantmentEffectComponentTypes;
import net.minecraft.component.type.AttributeModifierSlot;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.effect.EnchantmentEffectTarget;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Identifier;
import net.mokus.halloween.MokusSpookySeason;

public class ModEnchantments {
    public static final RegistryKey<Enchantment> SPOOKY =
            RegistryKey.of(RegistryKeys.ENCHANTMENT, Identifier.of(MokusSpookySeason.MOD_ID,"spooky"));


    public static void bootstrap(Registerable<Enchantment> registerable){
        var enchantments = registerable.getRegistryLookup(RegistryKeys.ENCHANTMENT);
        var items = registerable.getRegistryLookup(RegistryKeys.ITEM);

        register(registerable, SPOOKY, Enchantment.builder(Enchantment.definition(
                items.getOrThrow(ItemTags.WEAPON_ENCHANTABLE),
                items.getOrThrow(ItemTags.MACE_ENCHANTABLE),
                2,
                3,
                Enchantment.leveledCost(7, 9),
                Enchantment.leveledCost(25, 12),
                2,
                AttributeModifierSlot.MAINHAND
        )).addEffect(EnchantmentEffectComponentTypes.POST_ATTACK, EnchantmentEffectTarget.ATTACKER,EnchantmentEffectTarget.VICTIM,new SpookyEnchantmentEffect()));
    }

    private static void register(Registerable<Enchantment> registry, RegistryKey<Enchantment> key, Enchantment.Builder builder){
        registry.register(key,builder.build(key.getValue()));
    }

}
