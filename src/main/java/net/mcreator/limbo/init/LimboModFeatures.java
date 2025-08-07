
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.limbo.init;

import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Registry;

import net.mcreator.limbo.world.features.plants.LimboFlowerFeature;
import net.mcreator.limbo.LimboMod;

import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;

import java.util.function.Predicate;

public class LimboModFeatures {
	public static void load() {
		register("limbo_flower", LimboFlowerFeature.feature(), LimboFlowerFeature.GENERATE_BIOMES, GenerationStep.Decoration.VEGETAL_DECORATION);
	}

	private static void register(String registryName, Feature feature, Predicate<BiomeSelectionContext> biomes, GenerationStep.Decoration genStep) {
		Registry.register(Registry.FEATURE, new ResourceLocation(LimboMod.MODID, registryName), feature);
		BiomeModifications.addFeature(biomes, genStep, ResourceKey.create(Registry.PLACED_FEATURE_REGISTRY, new ResourceLocation(LimboMod.MODID, registryName)));
	}
}
