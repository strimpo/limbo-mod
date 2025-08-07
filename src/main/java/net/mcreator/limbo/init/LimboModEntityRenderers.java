
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.limbo.init;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.limbo.client.renderer.FalsePlayerRenderer;

import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

@Environment(EnvType.CLIENT)
public class LimboModEntityRenderers {
	public static void load() {
		EntityRendererRegistry.register(LimboModEntities.LIMBO_PETAL, ThrownItemRenderer::new);
		EntityRendererRegistry.register(LimboModEntities.FALSE_PLAYER, FalsePlayerRenderer::new);
	}
}
