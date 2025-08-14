
package net.mcreator.limbo.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.limbo.init.LimboModTabs;

public class LimboEngineItem extends Item {
	public LimboEngineItem() {
		super(new Item.Properties().tab(LimboModTabs.TAB_LIMBO).stacksTo(16).rarity(Rarity.UNCOMMON));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
