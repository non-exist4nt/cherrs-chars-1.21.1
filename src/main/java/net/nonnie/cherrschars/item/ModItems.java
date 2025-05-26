package net.nonnie.cherrschars.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.nonnie.cherrschars.CherrsChars;

public class ModItems {
    public static final Item CHERRIE_BLOOM = registerItem("cherrie_bloom", new Item(new Item.Settings()));
    public static final Item BLOOM_SOUL = registerItem("bloom_soul", new Item(new Item.Settings()));

    private static Item registerItem (String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(CherrsChars.MOD_ID, name), item);
    }

    public static void registerModItems(){
        CherrsChars.LOGGER.info("registering Mod Items for "+CherrsChars.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
            entries.add(CHERRIE_BLOOM);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(BLOOM_SOUL);
        });
    }
}
