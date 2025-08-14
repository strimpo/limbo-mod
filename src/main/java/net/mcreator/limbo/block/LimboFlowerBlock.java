
package net.mcreator.limbo.block;

import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.limbo.procedures.LimboFlowerEntityCollidesInTheBlockProcedure;
import net.mcreator.limbo.init.LimboModMobEffects;
import net.mcreator.limbo.init.LimboModItems;
import net.mcreator.limbo.init.LimboModBlocks;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

import java.util.List;
import java.util.Collections;

public class LimboFlowerBlock extends FlowerBlock {
	public LimboFlowerBlock() {
		super(LimboModMobEffects.PARANOIA, 1, BlockBehaviour.Properties.of(Material.PLANT).sound(SoundType.GRASS).instabreak().noCollission());
		FlammableBlockRegistry.getDefaultInstance().add(this, 100, 60);
	}

	@Override
	public int getEffectDuration() {
		return 1;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(LimboModItems.LIMBO_PETAL_USEABLE, 3));
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
		super.entityInside(blockstate, world, pos, entity);
		LimboFlowerEntityCollidesInTheBlockProcedure.execute(com.google.common.collect.ImmutableMap.<String, Object>builder().put("entity", entity).build());
	}

	@Environment(EnvType.CLIENT)
	public static void clientInit() {
		BlockRenderLayerMap.INSTANCE.putBlock(LimboModBlocks.LIMBO_FLOWER, RenderType.cutoutMipped());
	}
}
