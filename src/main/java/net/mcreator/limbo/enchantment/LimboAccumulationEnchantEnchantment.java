
package net.mcreator.limbo.enchantment;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.EquipmentSlot;

import net.mcreator.limbo.init.LimboModItems;

public class LimboAccumulationEnchantEnchantment extends Enchantment {
	public LimboAccumulationEnchantEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.VERY_RARE, EnchantmentCategory.VANISHABLE, slots);
	}

	@Override
	public int getMaxLevel() {
		return 5;
	}

	@Override
	public boolean canEnchant(ItemStack stack) {
		if (stack.getItem() == LimboModItems.CHARGED_LIMBO_ENGINE)
			return true;
		return false;
	}
}
