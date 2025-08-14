package net.mcreator.limbo.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.limbo.LimboMod;

import java.util.Map;

public class FalsePlayerPlayerCollidesWithThisEntityProcedure {

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				LimboMod.LOGGER.warn("Failed to load dependency entity for procedure FalsePlayerPlayerCollidesWithThisEntity!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (!entity.level.isClientSide())
			entity.discard();
	}
}
