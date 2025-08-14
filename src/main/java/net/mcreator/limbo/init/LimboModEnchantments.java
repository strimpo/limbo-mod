
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.limbo.init;

import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.mcreator.limbo.enchantment.LimboAccumulationEnchantEnchantment;
import net.mcreator.limbo.LimboMod;

public class LimboModEnchantments {
	public static Enchantment LIMBO_ACCUMULATION_ENCHANT;

	public static void load() {
		LIMBO_ACCUMULATION_ENCHANT = Registry.register(Registry.ENCHANTMENT, new ResourceLocation(LimboMod.MODID, "limbo_accumulation_enchant"), new LimboAccumulationEnchantEnchantment());
	}
}
