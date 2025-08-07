
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.limbo.init;

import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.mcreator.limbo.item.LimboTeaItem;
import net.mcreator.limbo.item.LimboStarItem;
import net.mcreator.limbo.item.LimboResidueItem;
import net.mcreator.limbo.item.LimboPetalUseableItem;
import net.mcreator.limbo.item.LimboPetalItem;
import net.mcreator.limbo.item.LimboJointItem;
import net.mcreator.limbo.item.LimboGranulateItem;
import net.mcreator.limbo.item.LimboEngineItem;
import net.mcreator.limbo.item.LimboConcentrateItem;
import net.mcreator.limbo.item.LimboArtifactItem;
import net.mcreator.limbo.item.ChargedLimboEngineItem;
import net.mcreator.limbo.item.BucketOfLimboItem;
import net.mcreator.limbo.LimboMod;

public class LimboModItems {
	public static Item LIMBO_PETAL;
	public static Item LIMBO_PETAL_USEABLE;
	public static Item LIMBO_BLOCK;
	public static Item FALSE_PLAYER_SPAWN_EGG;
	public static Item LIMBO_FLOWER;
	public static Item LIMBO_SYNTHESIZER_CHARGED;
	public static Item LIMBO_SYNTHESIZER_UNCHARGED;
	public static Item LIMBO_GRANULATE;
	public static Item BUCKET_OF_LIMBO;
	public static Item LIMBO_RESIDUE;
	public static Item LIMBO_STAR;
	public static Item LIMBO_TEA;
	public static Item LIMBO_ARTIFACT;
	public static Item UNCHARGED_LIMBO_ENGINE;
	public static Item CHARGED_LIMBO_ENGINE;
	public static Item LIMBO_CONCENTRATE;
	public static Item LIMBO_JOINT;

	public static void load() {
		LIMBO_PETAL = Registry.register(Registry.ITEM, new ResourceLocation(LimboMod.MODID, "limbo_petal"), new LimboPetalItem());
		LIMBO_PETAL_USEABLE = Registry.register(Registry.ITEM, new ResourceLocation(LimboMod.MODID, "limbo_petal_useable"), new LimboPetalUseableItem());
		LIMBO_BLOCK = Registry.register(Registry.ITEM, new ResourceLocation(LimboMod.MODID, "limbo_block"), new BlockItem(LimboModBlocks.LIMBO_BLOCK, new Item.Properties().tab(LimboModTabs.TAB_LIMBO)));
		FALSE_PLAYER_SPAWN_EGG = Registry.register(Registry.ITEM, new ResourceLocation(LimboMod.MODID, "false_player_spawn_egg"),
				new SpawnEggItem(LimboModEntities.FALSE_PLAYER, -16777216, -65434, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
		LIMBO_FLOWER = Registry.register(Registry.ITEM, new ResourceLocation(LimboMod.MODID, "limbo_flower"), new BlockItem(LimboModBlocks.LIMBO_FLOWER, new Item.Properties().tab(LimboModTabs.TAB_LIMBO)));
		LIMBO_SYNTHESIZER_CHARGED = Registry.register(Registry.ITEM, new ResourceLocation(LimboMod.MODID, "limbo_synthesizer_charged"), new BlockItem(LimboModBlocks.LIMBO_SYNTHESIZER_CHARGED, new Item.Properties().tab(LimboModTabs.TAB_LIMBO)));
		LIMBO_SYNTHESIZER_UNCHARGED = Registry.register(Registry.ITEM, new ResourceLocation(LimboMod.MODID, "limbo_synthesizer_uncharged"), new BlockItem(LimboModBlocks.LIMBO_SYNTHESIZER_UNCHARGED, new Item.Properties().tab(LimboModTabs.TAB_LIMBO)));
		LIMBO_GRANULATE = Registry.register(Registry.ITEM, new ResourceLocation(LimboMod.MODID, "limbo_granulate"), new LimboGranulateItem());
		BUCKET_OF_LIMBO = Registry.register(Registry.ITEM, new ResourceLocation(LimboMod.MODID, "bucket_of_limbo"), new BucketOfLimboItem());
		LIMBO_RESIDUE = Registry.register(Registry.ITEM, new ResourceLocation(LimboMod.MODID, "limbo_residue"), new LimboResidueItem());
		LIMBO_STAR = Registry.register(Registry.ITEM, new ResourceLocation(LimboMod.MODID, "limbo_star"), new LimboStarItem());
		LIMBO_TEA = Registry.register(Registry.ITEM, new ResourceLocation(LimboMod.MODID, "limbo_tea"), new LimboTeaItem());
		LIMBO_ARTIFACT = Registry.register(Registry.ITEM, new ResourceLocation(LimboMod.MODID, "limbo_artifact"), new LimboArtifactItem());
		UNCHARGED_LIMBO_ENGINE = Registry.register(Registry.ITEM, new ResourceLocation(LimboMod.MODID, "uncharged_limbo_engine"), new LimboEngineItem());
		CHARGED_LIMBO_ENGINE = Registry.register(Registry.ITEM, new ResourceLocation(LimboMod.MODID, "charged_limbo_engine"), new ChargedLimboEngineItem());
		LIMBO_CONCENTRATE = Registry.register(Registry.ITEM, new ResourceLocation(LimboMod.MODID, "limbo_concentrate"), new LimboConcentrateItem());
		LIMBO_JOINT = Registry.register(Registry.ITEM, new ResourceLocation(LimboMod.MODID, "limbo_joint"), new LimboJointItem());
	}
}
