package net.mcreator.limbo.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;

import net.mcreator.limbo.init.LimboModItems;
import net.mcreator.limbo.LimboMod;

import java.util.Map;

public class LimboDistillateRightclickedOnBlockProcedure {

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				LimboMod.LOGGER.warn("Failed to load dependency world for procedure LimboDistillateRightclickedOnBlock!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				LimboMod.LOGGER.warn("Failed to load dependency x for procedure LimboDistillateRightclickedOnBlock!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				LimboMod.LOGGER.warn("Failed to load dependency y for procedure LimboDistillateRightclickedOnBlock!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				LimboMod.LOGGER.warn("Failed to load dependency z for procedure LimboDistillateRightclickedOnBlock!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				LimboMod.LOGGER.warn("Failed to load dependency entity for procedure LimboDistillateRightclickedOnBlock!");
			return;
		}
		LevelAccessor world = (LevelAccessor) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == LimboModItems.LIMBO_DISTILLATE) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(Items.GLASS_BOTTLE);
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, (y + 1), z, new ItemStack(LimboModItems.LIMBO_CRYSTAL_SHARD));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == LimboModItems.BLOTTER_PAPER_DRYING) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(LimboModItems.BLOTTER_PAPER_DRYING);
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, (y + 1), z, new ItemStack(LimboModItems.LIMBO_TAB));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
		}
	}
}
