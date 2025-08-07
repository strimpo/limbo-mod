
package net.mcreator.limbo.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.limbo.init.LimboModTabs;
import net.mcreator.limbo.init.LimboModItems;

public class LimboGranulateItem extends Item {
	public LimboGranulateItem() {
		super(new Item.Properties().tab(LimboModTabs.TAB_LIMBO).stacksTo(64).rarity(Rarity.UNCOMMON));
	}

	@Override
	public boolean hasCraftingRemainingItem() {
		return true;
	}

	@Override
	public ItemStack getRecipeRemainder(ItemStack itemstack) {
		return new ItemStack(LimboModItems.LIMBO_RESIDUE);
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
