
package net.mcreator.limbo.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.mcreator.limbo.procedures.GlassPipeStuffedRightclickedProcedure;
import net.mcreator.limbo.init.LimboModTabs;

public class GlassPipeStuffedItem extends Item {
	public GlassPipeStuffedItem() {
		super(new Item.Properties().tab(LimboModTabs.TAB_LIMBO).durability(200).rarity(Rarity.UNCOMMON));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 20;
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		GlassPipeStuffedRightclickedProcedure.execute(com.google.common.collect.ImmutableMap.<String, Object>builder().put("entity", entity).build());
		return ar;
	}
}
