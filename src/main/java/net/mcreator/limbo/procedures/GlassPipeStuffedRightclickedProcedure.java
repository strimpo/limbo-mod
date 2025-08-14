package net.mcreator.limbo.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.InteractionHand;

import net.mcreator.limbo.init.LimboModMobEffects;
import net.mcreator.limbo.init.LimboModItems;
import net.mcreator.limbo.LimboMod;

import java.util.Map;

public class GlassPipeStuffedRightclickedProcedure {

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				LimboMod.LOGGER.warn("Failed to load dependency entity for procedure GlassPipeStuffedRightclicked!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double usecount = 0;
		if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(LimboModMobEffects.PARANOIA, 1200, 3, false, true));
		if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1200, 5, false, false));
		if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1200, 8, false, false));
		if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.WITHER, 1200, 3, false, false));
		if (entity instanceof LivingEntity _entity) {
			ItemStack _setstack = new ItemStack(LimboModItems.GLASS_PIPE);
			_setstack.setCount(1);
			_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
			if (_entity instanceof Player _player)
				_player.getInventory().setChanged();
		}
	}
}
