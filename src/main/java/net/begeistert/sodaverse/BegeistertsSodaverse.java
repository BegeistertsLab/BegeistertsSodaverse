package net.begeistert.sodaverse;

import net.begeistert.sodaverse.block.ModBlocks;
import net.begeistert.sodaverse.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BegeistertsSodaverse implements ModInitializer {

	public static final String MOD_ID = "begeistertssodaverse";


	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		LOGGER.info("Initializing Begeisterts Sodaverse 0.0.1-1.20.1-07042025");
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		LOGGER.info("Finished Initializing Begeisterts Sodaverse!");
	}
}