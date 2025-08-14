
package net.mcreator.limbo.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.mcreator.limbo.procedures.LimboFlowerPetalRightclickedProcedure;
import net.mcreator.limbo.init.LimboModTabs;

public class LimboPetalUseableItem extends Item {
	public LimboPetalUseableItem() {
		super(new Item.Properties().tab(LimboModTabs.TAB_LIMBO).stacksTo(16).rarity(Rarity.RARE));
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

		LimboFlowerPetalRightclickedProcedure.execute(com.google.common.collect.ImmutableMap.<String, Object>builder().put("entity", entity).build());
		return ar;
	}
}
