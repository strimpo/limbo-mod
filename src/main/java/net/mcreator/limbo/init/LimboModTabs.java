
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.limbo.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;

public class LimboModTabs {
	public static CreativeModeTab TAB_LIMBO;

	public static void load() {
		TAB_LIMBO = FabricItemGroupBuilder.create(new ResourceLocation("limbo", "limbo")).icon(() -> new ItemStack(LimboModItems.LIMBO_PETAL)).build();
	}
}
