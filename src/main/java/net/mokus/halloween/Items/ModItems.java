package net.mokus.halloween.Items;

import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.ToolComponent;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.MaceItem;
import net.minecraft.predicate.item.EnchantmentsPredicate;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.mokus.halloween.MokusSpookySeason;

public class ModItems {

    public static final Item SPOOKY_MACE = registerItem("spooky_mace",
            new SpookyMace(new Item.Settings().maxCount(1).rarity(Rarity.EPIC).fireproof()
                    .maxDamage(1024)
                    .component(DataComponentTypes.TOOL, SpookyMace.createToolComponent())
                    .attributeModifiers(SpookyMace.createAttributeModifiers())));


    public static final Item CANDY_CORN = registerItem("candy_corn",
            new Item(new Item.Settings().food(ModFoodComponents.CANDIES)));

    public static final Item GUMMY_EYE = registerItem("gummy_eye",
            new Item(new Item.Settings().food(ModFoodComponents.GUMMY_CANDIES)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(MokusSpookySeason.MOD_ID,name), item);
    }

    public static void registerModItems(){
        MokusSpookySeason.LOGGER.info("Registering Mod Items for" + MokusSpookySeason.MOD_ID);
    }
}
