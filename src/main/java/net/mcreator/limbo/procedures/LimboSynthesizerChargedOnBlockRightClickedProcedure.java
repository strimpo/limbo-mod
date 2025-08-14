package net.mcreator.limbo.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.limbo.init.LimboModItems;
import net.mcreator.limbo.init.LimboModBlocks;
import net.mcreator.limbo.LimboMod;

import java.util.Map;

public class LimboSynthesizerChargedOnBlockRightClickedProcedure {

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				LimboMod.LOGGER.warn("Failed to load dependency world for procedure LimboSynthesizerChargedOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				LimboMod.LOGGER.warn("Failed to load dependency x for procedure LimboSynthesizerChargedOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				LimboMod.LOGGER.warn("Failed to load dependency y for procedure LimboSynthesizerChargedOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				LimboMod.LOGGER.warn("Failed to load dependency z for procedure LimboSynthesizerChargedOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				LimboMod.LOGGER.warn("Failed to load dependency entity for procedure LimboSynthesizerChargedOnBlockRightClicked!");
			return;
		}
		LevelAccessor world = (LevelAccessor) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		double NumberOfHeldItems = 0;
		NumberOfHeldItems = ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).getCount();
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == LimboModItems.LIMBO_RESIDUE) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(LimboModItems.LIMBO_STAR);
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
			{
				BlockPos _bp = new BlockPos(x, y, z);
				BlockState _bs = LimboModBlocks.LIMBO_SYNTHESIZER_UNCHARGED.defaultBlockState();
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
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.ENTITY_EFFECT, x, y, z, 5, 3, 3, 3, 1);
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.POTION) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(LimboModItems.LIMBO_TEA);
				_setstack.setCount((int) NumberOfHeldItems);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.ENTITY_EFFECT, x, y, z, 5, 3, 3, 3, 1);
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == LimboModItems.UNCHARGED_LIMBO_ENGINE) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(LimboModItems.CHARGED_LIMBO_ENGINE);
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
			{
				BlockPos _bp = new BlockPos(x, y, z);
				BlockState _bs = LimboModBlocks.LIMBO_SYNTHESIZER_UNCHARGED.defaultBlockState();
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
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.ENTITY_EFFECT, x, y, z, 5, 3, 3, 3, 1);
		}
	}
}
