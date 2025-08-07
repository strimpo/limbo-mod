
package net.mcreator.limbo.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.mcreator.limbo.procedures.LimboStarRightclickedProcedure;
import net.mcreator.limbo.init.LimboModTabs;

public class LimboStarItem extends Item {
	public LimboStarItem() {
		super(new Item.Properties().tab(LimboModTabs.TAB_LIMBO).stacksTo(1).rarity(Rarity.EPIC));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		LimboStarRightclickedProcedure.execute(com.google.common.collect.ImmutableMap.<String, Object>builder().put("world", world).put("entity", entity).put("itemstack", itemstack).build());
		return ar;
	}
}
