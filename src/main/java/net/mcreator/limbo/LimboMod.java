/*
 *	MCreator note:
 *
 *	If you lock base mod element files, you can edit this file and the proxy files
 *	and they won't get overwritten. If you change your mod package or modid, you
 *	need to apply these changes to this file MANUALLY.
 *
 *
 *	If you do not lock base mod element files in Workspace settings, this file
 *	will be REGENERATED on each build.
 *
 */
package net.mcreator.limbo;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.mcreator.limbo.init.LimboModTrades;
import net.mcreator.limbo.init.LimboModTabs;
import net.mcreator.limbo.init.LimboModSounds;
import net.mcreator.limbo.init.LimboModProcedures;
import net.mcreator.limbo.init.LimboModMobEffects;
import net.mcreator.limbo.init.LimboModItems;
import net.mcreator.limbo.init.LimboModFeatures;
import net.mcreator.limbo.init.LimboModEntities;
import net.mcreator.limbo.init.LimboModEnchantments;
import net.mcreator.limbo.init.LimboModBlocks;

import net.fabricmc.api.ModInitializer;

public class LimboMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "limbo";

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing LimboMod");

		LimboModTabs.load();

		LimboModEnchantments.load();
		LimboModMobEffects.load();

		LimboModEntities.load();
		LimboModBlocks.load();
		LimboModItems.load();

		LimboModFeatures.load();

		LimboModProcedures.load();

		LimboModTrades.registerTrades();
		LimboModSounds.load();

	}
}
