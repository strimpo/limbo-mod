package net.mcreator.limbo.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.limbo.init.LimboModItems;
import net.mcreator.limbo.init.LimboModEnchantments;
import net.mcreator.limbo.LimboMod;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;

import java.util.Map;

public class ChargedLimboEngineItemInInventoryTickProcedure {

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				LimboMod.LOGGER.warn("Failed to load dependency world for procedure ChargedLimboEngineItemInInventoryTick!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				LimboMod.LOGGER.warn("Failed to load dependency entity for procedure ChargedLimboEngineItemInInventoryTick!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				LimboMod.LOGGER.warn("Failed to load dependency itemstack for procedure ChargedLimboEngineItemInInventoryTick!");
			return;
		}
		LevelAccessor world = (LevelAccessor) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		double enchantlevel = 0;
		enchantlevel = EnchantmentHelper.getItemEnchantmentLevel(LimboModEnchantments.LIMBO_ACCUMULATION_ENCHANT, itemstack);
		if (enchantlevel == 0) {
			new Object() {
				private int ticks = 0;

				public void startDelay(LevelAccessor world) {
					ServerTickEvents.END_SERVER_TICK.register((server) -> {
						this.ticks++;
						if (this.ticks == 216000) {
							if (entity instanceof Player _player) {
								ItemStack _setstack = new ItemStack(LimboModItems.LIMBO_ARTIFACT);
								_setstack.setCount(1);
								_player.getInventory().add(_setstack);
							}
							return;
						}
					});
				}
			}.startDelay(world);
		}
		if (enchantlevel == 1) {
			new Object() {
				private int ticks = 0;

				public void startDelay(LevelAccessor world) {
					ServerTickEvents.END_SERVER_TICK.register((server) -> {
						this.ticks++;
						if (this.ticks == 144000) {
							if (entity instanceof Player _player) {
								ItemStack _setstack = new ItemStack(LimboModItems.LIMBO_ARTIFACT);
								_setstack.setCount(1);
								_player.getInventory().add(_setstack);
							}
							return;
						}
					});
				}
			}.startDelay(world);
		}
		if (enchantlevel == 2) {
			new Object() {
				private int ticks = 0;

				public void startDelay(LevelAccessor world) {
					ServerTickEvents.END_SERVER_TICK.register((server) -> {
						this.ticks++;
						if (this.ticks == 72000) {
							if (entity instanceof Player _player) {
								ItemStack _setstack = new ItemStack(LimboModItems.LIMBO_ARTIFACT);
								_setstack.setCount(1);
								_player.getInventory().add(_setstack);
							}
							return;
						}
					});
				}
			}.startDelay(world);
		}
		if (enchantlevel == 3) {
			new Object() {
				private int ticks = 0;

				public void startDelay(LevelAccessor world) {
					ServerTickEvents.END_SERVER_TICK.register((server) -> {
						this.ticks++;
						if (this.ticks == 36000) {
							if (entity instanceof Player _player) {
								ItemStack _setstack = new ItemStack(LimboModItems.LIMBO_ARTIFACT);
								_setstack.setCount(1);
								_player.getInventory().add(_setstack);
							}
							return;
						}
					});
				}
			}.startDelay(world);
		}
	}
}
