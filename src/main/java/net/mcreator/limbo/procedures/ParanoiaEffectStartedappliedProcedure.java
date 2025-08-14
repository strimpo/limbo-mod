package net.mcreator.limbo.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.sounds.SoundSource;
import net.minecraft.core.BlockPos;

import net.mcreator.limbo.init.LimboModSounds;
import net.mcreator.limbo.LimboMod;

import java.util.Map;

public class ParanoiaEffectStartedappliedProcedure {

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				LimboMod.LOGGER.warn("Failed to load dependency world for procedure ParanoiaEffectStartedapplied!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				LimboMod.LOGGER.warn("Failed to load dependency x for procedure ParanoiaEffectStartedapplied!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				LimboMod.LOGGER.warn("Failed to load dependency y for procedure ParanoiaEffectStartedapplied!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				LimboMod.LOGGER.warn("Failed to load dependency z for procedure ParanoiaEffectStartedapplied!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				LimboMod.LOGGER.warn("Failed to load dependency entity for procedure ParanoiaEffectStartedapplied!");
			return;
		}
		LevelAccessor world = (LevelAccessor) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, new BlockPos(x, y, z), LimboModSounds.PARANOIA, SoundSource.PLAYERS, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, LimboModSounds.PARANOIA, SoundSource.PLAYERS, 1, 1, false);
			}
		}
		if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 3000, 10, false, false));
		if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, 3000, 5, false, false));
	}
}
