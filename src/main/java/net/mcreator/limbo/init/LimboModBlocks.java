
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.limbo.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.mcreator.limbo.block.LimboSynthesizerUnchargedBlock;
import net.mcreator.limbo.block.LimboSynthesizerChargedBlock;
import net.mcreator.limbo.block.LimboFlowerBlock;
import net.mcreator.limbo.block.LimboBlockBlock;
import net.mcreator.limbo.block.DistillationTableBlock;
import net.mcreator.limbo.LimboMod;

public class LimboModBlocks {
	public static Block LIMBO_BLOCK;
	public static Block LIMBO_FLOWER;
	public static Block LIMBO_SYNTHESIZER_CHARGED;
	public static Block LIMBO_SYNTHESIZER_UNCHARGED;
	public static Block CRYSTALLIZATION_TABLE;

	public static void load() {
		LIMBO_BLOCK = Registry.register(Registry.BLOCK, new ResourceLocation(LimboMod.MODID, "limbo_block"), new LimboBlockBlock());
		LIMBO_FLOWER = Registry.register(Registry.BLOCK, new ResourceLocation(LimboMod.MODID, "limbo_flower"), new LimboFlowerBlock());
		LIMBO_SYNTHESIZER_CHARGED = Registry.register(Registry.BLOCK, new ResourceLocation(LimboMod.MODID, "limbo_synthesizer_charged"), new LimboSynthesizerChargedBlock());
		LIMBO_SYNTHESIZER_UNCHARGED = Registry.register(Registry.BLOCK, new ResourceLocation(LimboMod.MODID, "limbo_synthesizer_uncharged"), new LimboSynthesizerUnchargedBlock());
		CRYSTALLIZATION_TABLE = Registry.register(Registry.BLOCK, new ResourceLocation(LimboMod.MODID, "crystallization_table"), new DistillationTableBlock());
	}

	public static void clientLoad() {
		LimboBlockBlock.clientInit();
		LimboFlowerBlock.clientInit();
		LimboSynthesizerChargedBlock.clientInit();
		LimboSynthesizerUnchargedBlock.clientInit();
		DistillationTableBlock.clientInit();
	}
}
