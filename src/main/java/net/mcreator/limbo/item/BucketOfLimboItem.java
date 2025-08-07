
package net.mcreator.limbo.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.limbo.init.LimboModTabs;

public class BucketOfLimboItem extends Item {
	public BucketOfLimboItem() {
		super(new Item.Properties().tab(LimboModTabs.TAB_LIMBO).stacksTo(1).rarity(Rarity.RARE));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
