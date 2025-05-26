package net.nonnie.cherrschars;

import net.fabricmc.api.ModInitializer;

import net.nonnie.cherrschars.block.ModBlocks;
import net.nonnie.cherrschars.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//hi there
public class CherrsChars implements ModInitializer {
	public static final String MOD_ID="cherrschars";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}