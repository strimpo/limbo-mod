
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.limbo.init;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.mcreator.limbo.potion.ParanoiaMobEffect;
import net.mcreator.limbo.LimboMod;

public class LimboModMobEffects {
	public static MobEffect PARANOIA;

	public static void load() {
		PARANOIA = Registry.register(Registry.MOB_EFFECT, new ResourceLocation(LimboMod.MODID, "paranoia"), new ParanoiaMobEffect());
	}
}
