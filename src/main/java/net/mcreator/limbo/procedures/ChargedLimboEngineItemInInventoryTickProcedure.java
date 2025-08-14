package net.mcreator.limbo.procedures;

import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.limbo.init.LimboModItems;
import net.mcreator.limbo.init.LimboModEnchantments;
import net.mcreator.limbo.LimboMod;

import java.util.Map;

public class ChargedLimboEngineItemInInventoryTickProcedure {

	public static void execute(Map<String, Object> dependencies) {
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
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		double enchantlevel = 0;
		double limboenginetimer = 0;
		enchantlevel = EnchantmentHelper.getItemEnchantmentLevel(LimboModEnchantments.LIMBO_ACCUMULATION_ENCHANT, itemstack);
		if (enchantlevel == 0) {
			limboenginetimer = limboenginetimer + 1;
			if (limboenginetimer == 216000) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(LimboModItems.LIMBO_ARTIFACT);
					_setstack.setCount(1);
					_player.getInventory().add(_setstack);
				}
				limboenginetimer = 1;
			}
		}
		if (enchantlevel == 1) {
			limboenginetimer = limboenginetimer + 1;
			if (limboenginetimer == 144000) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(LimboModItems.LIMBO_ARTIFACT);
					_setstack.setCount(1);
					_player.getInventory().add(_setstack);
				}
				limboenginetimer = 1;
			}
		}
		if (enchantlevel == 2) {
			limboenginetimer = limboenginetimer + 1;
			if (limboenginetimer == 72000) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(LimboModItems.LIMBO_ARTIFACT);
					_setstack.setCount(1);
					_player.getInventory().add(_setstack);
				}
				limboenginetimer = 1;
			}
		}
		if (enchantlevel == 3) {
			limboenginetimer = limboenginetimer + 1;
			if (limboenginetimer == 36000) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(LimboModItems.LIMBO_ARTIFACT);
					_setstack.setCount(1);
					_player.getInventory().add(_setstack);
				}
				limboenginetimer = 1;
			}
		}
	}
}
