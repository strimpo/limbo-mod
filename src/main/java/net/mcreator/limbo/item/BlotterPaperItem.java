
package net.mcreator.limbo.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.limbo.init.LimboModTabs;

public class BlotterPaperItem extends Item {
	public BlotterPaperItem() {
		super(new Item.Properties().tab(LimboModTabs.TAB_LIMBO).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
