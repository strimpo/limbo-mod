package net.mcreator.limbo.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.client.Minecraft;

import net.mcreator.limbo.init.LimboModMobEffects;
import net.mcreator.limbo.LimboMod;

import java.util.Map;

public class LimboStarRightclickedProcedure {

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				LimboMod.LOGGER.warn("Failed to load dependency world for procedure LimboStarRightclicked!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				LimboMod.LOGGER.warn("Failed to load dependency entity for procedure LimboStarRightclicked!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				LimboMod.LOGGER.warn("Failed to load dependency itemstack for procedure LimboStarRightclicked!");
			return;
		}
		LevelAccessor world = (LevelAccessor) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		if (world.isClientSide())
			Minecraft.getInstance().gameRenderer.displayItemActivation(itemstack);
		if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(LimboModMobEffects.PARANOIA, 600, 1, false, false));
		if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 600, 2, false, false));
		if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 2, false, false));
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(itemstack.getItem(), 6000);
	}
}
