package net.mokus.halloween.Items;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.mokus.halloween.Blocks.ModBlocks;
import net.mokus.halloween.MokusSpookySeason;

public class ModItemGroup {

    public static final ItemGroup SPOOKY_SEASON_ITEMGROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MokusSpookySeason.MOD_ID,"spooky_season_itemgroup"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.ANGRY_CARVED_PUMPKIN))
                    .displayName(Text.translatable("itemgroup.mokus_halloween.spooky_season_itemgroup"))
                    .entries((displayContext, entries) -> {

                        entries.add(ModItems.SPOOKY_MACE);
                        entries.add(ModItems.LOLLIPOP);
                        entries.add(ModItems.GUMMY_EYE);
                        entries.add(ModItems.GUMMY_BEAR);

                        entries.add(ModItems.CANDY_CORN);
                        entries.add(ModItems.CARAMEL);
                        entries.add(ModItems.CARAMEL_APPLE);

                        entries.add(ModBlocks.CANDY_BASKET);

                        entries.add(ModBlocks.SPOOKY_CARVED_PUMPKIN);
                        entries.add(ModBlocks.CREEPER_CARVED_PUMPKIN);
                        entries.add(ModBlocks.DERP_CARVED_PUMPKIN);
                        entries.add(ModBlocks.ANGRY_CARVED_PUMPKIN);
                        entries.add(ModBlocks.SMOL_CARVED_PUMPKIN);

                        entries.add(ModBlocks.SPOOKY_JACK_O_LANTERN);
                        entries.add(ModBlocks.CREEPER_JACK_O_LANTERN);
                        entries.add(ModBlocks.DERP_JACK_O_LANTERN);
                        entries.add(ModBlocks.ANGRY_JACK_O_LANTERN);
                        entries.add(ModBlocks.SMOL_JACK_O_LANTERN);



                        entries.add(ModBlocks.BIG_CANDLE);
                        entries.add(ModBlocks.WHITE_BIG_CANDLE);
                        entries.add(ModBlocks.LIGHT_GRAY_BIG_CANDLE);
                        entries.add(ModBlocks.GRAY_BIG_CANDLE);
                        entries.add(ModBlocks.BLACK_BIG_CANDLE);
                        entries.add(ModBlocks.BROWN_BIG_CANDLE);
                        entries.add(ModBlocks.RED_BIG_CANDLE);
                        entries.add(ModBlocks.ORANGE_BIG_CANDLE);
                        entries.add(ModBlocks.YELLOW_BIG_CANDLE);
                        entries.add(ModBlocks.LIME_BIG_CANDLE);
                        entries.add(ModBlocks.GREEN_BIG_CANDLE);
                        entries.add(ModBlocks.CYAN_BIG_CANDLE);
                        entries.add(ModBlocks.LIGHT_BLUE_BIG_CANDLE);
                        entries.add(ModBlocks.BLUE_BIG_CANDLE);
                        entries.add(ModBlocks.PURPLE_BIG_CANDLE);
                        entries.add(ModBlocks.MAGENTA_BIG_CANDLE);
                        entries.add(ModBlocks.PINK_BIG_CANDLE);


                    }).build());

    public static void registerItemGroups(){

    }
}
