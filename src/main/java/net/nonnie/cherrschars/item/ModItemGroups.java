package net.nonnie.cherrschars.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.nonnie.cherrschars.CherrsChars;
import net.nonnie.cherrschars.block.ModBlocks;

public class ModItemGroups {

    public static final ItemGroup CHERRS_CHARS_ITEMS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(CherrsChars.MOD_ID, "cherrs_chars_items"),
            FabricItemGroup.builder().icon(()-> new ItemStack(ModItems.CHERRIE_BLOOM))
                    .displayName(Text.translatable("itemgroup.tutorialmod.cherrs_chars_items"))
                    .entries((displayContext, entries) -> {
                        entries.add((ModItems.BLOOM_SOUL));
                        entries.add(ModItems.CHERRIE_BLOOM);
                        entries.add(ModBlocks.ESSENSE_ORE);
                        entries.add(ModItems.RAW_ESSENCE);
                        entries.add(ModItems.ESSENCE_ALLOY);
                    })
                    .build());

    public static void registerItemGroups(){

    }
}
