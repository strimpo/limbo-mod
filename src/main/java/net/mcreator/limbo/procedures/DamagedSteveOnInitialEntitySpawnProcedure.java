package net.mcreator.limbo.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.limbo.LimboMod;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;

import java.util.Map;

public class DamagedSteveOnInitialEntitySpawnProcedure {

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				LimboMod.LOGGER.warn("Failed to load dependency world for procedure DamagedSteveOnInitialEntitySpawn!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				LimboMod.LOGGER.warn("Failed to load dependency entity for procedure DamagedSteveOnInitialEntitySpawn!");
			return;
		}
		LevelAccessor world = (LevelAccessor) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
		new Object() {
			private int ticks = 0;

			public void startDelay(LevelAccessor world) {
				ServerTickEvents.END_SERVER_TICK.register((server) -> {
					this.ticks++;
					if (this.ticks == 3600) {
						if (!entity.level.isClientSide())
							entity.discard();
						return;
					}
				});
			}
		}.startDelay(world);
	}
}
