
package net.mcreator.limbo.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.mcreator.limbo.procedures.LimboJointRightclickedProcedure;
import net.mcreator.limbo.init.LimboModTabs;

public class LimboJointItem extends Item {
	public LimboJointItem() {
		super(new Item.Properties().tab(LimboModTabs.TAB_LIMBO).stacksTo(64).rarity(Rarity.RARE));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.SPEAR;
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

		LimboJointRightclickedProcedure.execute(com.google.common.collect.ImmutableMap.<String, Object>builder().put("entity", entity).put("itemstack", itemstack).build());
		return ar;
	}
}
