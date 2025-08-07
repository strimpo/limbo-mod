
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.limbo.init;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

public class LimboModSounds {
	public static SoundEvent PARANOIA = new SoundEvent(new ResourceLocation("limbo", "paranoia"));

	public static void load() {
		Registry.register(Registry.SOUND_EVENT, new ResourceLocation("limbo", "paranoia"), PARANOIA);
	}
}
