
package net.mcreator.limbo.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.limbo.init.LimboModTabs;

public class LimboDistillateItem extends Item {
	public LimboDistillateItem() {
		super(new Item.Properties().tab(LimboModTabs.TAB_LIMBO).stacksTo(1).rarity(Rarity.RARE));
	}

	@Override
	public boolean hasCraftingRemainingItem() {
		return true;
	}

	@Override
	public ItemStack getRecipeRemainder(ItemStack itemstack) {
		return new ItemStack(Items.GLASS_BOTTLE);
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
