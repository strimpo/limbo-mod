package net.mcreator.limbo.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundSource;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.core.BlockPos;

import net.mcreator.limbo.init.LimboModItems;
import net.mcreator.limbo.init.LimboModBlocks;
import net.mcreator.limbo.LimboMod;

import java.util.Map;

public class LimboSynthesizerUnchargedOnBlockRightClickedProcedure {

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				LimboMod.LOGGER.warn("Failed to load dependency world for procedure LimboSynthesizerUnchargedOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				LimboMod.LOGGER.warn("Failed to load dependency x for procedure LimboSynthesizerUnchargedOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				LimboMod.LOGGER.warn("Failed to load dependency y for procedure LimboSynthesizerUnchargedOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				LimboMod.LOGGER.warn("Failed to load dependency z for procedure LimboSynthesizerUnchargedOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				LimboMod.LOGGER.warn("Failed to load dependency entity for procedure LimboSynthesizerUnchargedOnBlockRightClicked!");
			return;
		}
		LevelAccessor world = (LevelAccessor) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == LimboModItems.BUCKET_OF_LIMBO) {
			{
				BlockPos _bp = new BlockPos(x, y, z);
				BlockState _bs = LimboModBlocks.LIMBO_SYNTHESIZER_CHARGED.defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(Items.BUCKET);
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z), SoundEvents.PORTAL_TRAVEL, SoundSource.NEUTRAL, (float) 0.3, 1);
				} else {
					_level.playLocalSound(x, y, z, SoundEvents.PORTAL_TRAVEL, SoundSource.NEUTRAL, (float) 0.3, 1, false);
				}
			}
		}
	}
}
