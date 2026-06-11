package net.Ndisclose.feature_remover;
import net.Ndisclose.feature_remover.Removal.EntityRemoval;
import net.Ndisclose.feature_remover.Removal.TradeRemoval;
import net.Ndisclose.feature_remover.item.CreativeMenuSanitization;
import net.Ndisclose.feature_remover.item.DisableUse;
import net.Ndisclose.feature_remover.item.InventorySanitization;
import net.Ndisclose.feature_remover.item.LootRemoval;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FeatureRemover implements ModInitializer {
	public static final String MOD_ID = "feature-removal";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		LOGGER.info("Feature Remover initializing.");
        EntityRemoval.initialize();
        LootRemoval.initialize();
        DisableUse.initialize();
        InventorySanitization.initialize();
        CreativeMenuSanitization.initialize();
        TradeRemoval.initialize();
        net.Ndisclose.feature_remover.configuration.ConfigManager.load();
        LOGGER.info("Configuration manager loaded");
    }
}