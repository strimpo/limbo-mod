package net.mcreator.limbo.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.limbo.init.LimboModMobEffects;
import net.mcreator.limbo.LimboMod;

import java.util.Map;

public class LimboPetalProjectileHitsLivingEntityProcedure {

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				LimboMod.LOGGER.warn("Failed to load dependency entity for procedure LimboPetalProjectileHitsLivingEntity!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(LimboModMobEffects.PARANOIA, 1, 1, false, false));
	}
}
