
package net.mcreator.limbo.potion;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.limbo.procedures.ParanoiaEffectStartedappliedProcedure;

public class ParanoiaMobEffect extends MobEffect {
	public ParanoiaMobEffect() {
		super(MobEffectCategory.HARMFUL, -65434);
	}

	@Override
	public String getDescriptionId() {
		return "effect.limbo.paranoia";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		ParanoiaEffectStartedappliedProcedure.execute(com.google.common.collect.ImmutableMap.<String, Object>builder().put("world", world).put("x", x).put("y", y).put("z", z).put("entity", entity).build());
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
