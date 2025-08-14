package net.mcreator.limbo.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;

import net.mcreator.limbo.init.LimboModItems;
import net.mcreator.limbo.LimboMod;

import java.util.Map;

public class GlassPipeRightclickedProcedure {

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				LimboMod.LOGGER.warn("Failed to load dependency entity for procedure GlassPipeRightclicked!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(LimboModItems.LIMBO_CRYSTAL_SHARD)) : false) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(LimboModItems.LIMBO_CRYSTAL_SHARD);
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(LimboModItems.GLASS_PIPE_STUFFED);
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		}
	}
}
