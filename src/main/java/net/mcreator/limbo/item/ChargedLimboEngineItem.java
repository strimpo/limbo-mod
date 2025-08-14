
package net.mcreator.limbo.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

import net.mcreator.limbo.procedures.ChargedLimboEngineItemInInventoryTickProcedure;
import net.mcreator.limbo.init.LimboModTabs;

public class ChargedLimboEngineItem extends Item {
	public ChargedLimboEngineItem() {
		super(new Item.Properties().tab(LimboModTabs.TAB_LIMBO).stacksTo(1).rarity(Rarity.RARE));
	}

	@Override
	public int getEnchantmentValue() {
		return 22;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		ChargedLimboEngineItemInInventoryTickProcedure.execute(com.google.common.collect.ImmutableMap.<String, Object>builder().put("entity", entity).put("itemstack", itemstack).build());
	}
}
