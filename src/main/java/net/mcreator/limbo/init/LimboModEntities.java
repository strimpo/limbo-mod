
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.limbo.init;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.mcreator.limbo.entity.LimboPetalEntity;
import net.mcreator.limbo.entity.FalsePlayerEntity;
import net.mcreator.limbo.LimboMod;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;

public class LimboModEntities {
	public static EntityType<LimboPetalEntity> LIMBO_PETAL;
	public static EntityType<FalsePlayerEntity> FALSE_PLAYER;

	public static void load() {
		LIMBO_PETAL = Registry.register(Registry.ENTITY_TYPE, new ResourceLocation(LimboMod.MODID, "limbo_petal"), createArrowEntityType(LimboPetalEntity::new));
		FALSE_PLAYER = Registry.register(Registry.ENTITY_TYPE, new ResourceLocation(LimboMod.MODID, "false_player"),
				FabricEntityTypeBuilder.create(MobCategory.CREATURE, FalsePlayerEntity::new).dimensions(new EntityDimensions(0.6f, 1.8f, true)).fireImmune().trackRangeBlocks(64).forceTrackedVelocityUpdates(true).trackedUpdateRate(3).build());
		FalsePlayerEntity.init();
		FabricDefaultAttributeRegistry.register(FALSE_PLAYER, FalsePlayerEntity.createAttributes());
	}

	private static <T extends Entity> EntityType<T> createArrowEntityType(EntityType.EntityFactory<T> factory) {
		return FabricEntityTypeBuilder.create(MobCategory.MISC, factory).dimensions(EntityDimensions.fixed(0.5f, 0.5f)).trackRangeBlocks(1).trackedUpdateRate(64).build();
	}
}
