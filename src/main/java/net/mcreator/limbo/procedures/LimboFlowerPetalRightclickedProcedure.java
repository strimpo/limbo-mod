package net.mcreator.limbo.procedures;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.limbo.init.LimboModItems;
import net.mcreator.limbo.init.LimboModEntities;
import net.mcreator.limbo.entity.LimboPetalEntity;
import net.mcreator.limbo.LimboMod;

import java.util.Map;

public class LimboFlowerPetalRightclickedProcedure {

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				LimboMod.LOGGER.warn("Failed to load dependency entity for procedure LimboFlowerPetalRightclicked!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		{
			Entity _shootFrom = entity;
			Level projectileLevel = _shootFrom.level;
			if (!projectileLevel.isClientSide()) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getArrow(Level level, float damage, int knockback) {
						AbstractArrow entityToSpawn = new LimboPetalEntity(LimboModEntities.LIMBO_PETAL, level);

						entityToSpawn.setBaseDamage(damage);
						entityToSpawn.setKnockback(knockback);
						entityToSpawn.setSilent(true);

						entityToSpawn.setCritArrow(true);

						return entityToSpawn;
					}
				}.getArrow(projectileLevel, 0, 0);
				_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
				_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1, 0);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
		}
		if (entity instanceof Player _player) {
			ItemStack _stktoremove = new ItemStack(LimboModItems.LIMBO_PETAL_USEABLE);
			_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
		}
	}
}
