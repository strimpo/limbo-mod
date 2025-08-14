package net.mcreator.limbo.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;

import net.mcreator.limbo.init.LimboModMobEffects;
import net.mcreator.limbo.init.LimboModItems;
import net.mcreator.limbo.LimboMod;

import java.util.Map;

public class LimboJointRightclickedProcedure {

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				LimboMod.LOGGER.warn("Failed to load dependency entity for procedure LimboJointRightclicked!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				LimboMod.LOGGER.warn("Failed to load dependency itemstack for procedure LimboJointRightclicked!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		{
			ItemStack _ist = itemstack;
			if (_ist.hurt(200, RandomSource.create(), null)) {
				_ist.shrink(1);
				_ist.setDamageValue(0);
			}
		}
		if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1200, 60, false, false));
		if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 1200, 60, false, false));
		if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.DARKNESS, 1200, 60, false, false));
		if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(LimboModMobEffects.PARANOIA, 1200, 60, false, false));
		if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 1200, 60, false, false));
		if (entity instanceof Player _player) {
			ItemStack _stktoremove = new ItemStack(LimboModItems.LIMBO_JOINT);
			_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
		}
	}
}
