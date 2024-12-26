package net.lennilid.tutorial;

import net.fabricmc.api.ModInitializer;

import net.lennilid.tutorial.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Tutorial implements ModInitializer {
	public static final String MOD_ID = "tutorial";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();


		LOGGER.info("Hello Fabric world!");
	}
}