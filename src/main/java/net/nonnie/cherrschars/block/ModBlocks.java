package net.nonnie.cherrschars.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.nonnie.cherrschars.CherrsChars;

public class ModBlocks {
    public static final Block ESSENSE_ORE = registerBlock("essence_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2,4),
                    AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    private static Block registerBlock (String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(CherrsChars.MOD_ID, name), block);
    }
    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(CherrsChars.MOD_ID, name),new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        CherrsChars.LOGGER.info("Registering Mod Blocks for "+ CherrsChars.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
            entries.add(ModBlocks.ESSENSE_ORE);
        });
    }
}
