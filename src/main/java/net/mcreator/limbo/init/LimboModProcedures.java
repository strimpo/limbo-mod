
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.limbo.init;

import net.mcreator.limbo.procedures.ParanoiaEffectStartedappliedProcedure;
import net.mcreator.limbo.procedures.LimboTeaPlayerFinishesUsingItemProcedure;
import net.mcreator.limbo.procedures.LimboTabRightclickedProcedure;
import net.mcreator.limbo.procedures.LimboSynthesizerUnchargedOnBlockRightClickedProcedure;
import net.mcreator.limbo.procedures.LimboSynthesizerChargedOnBlockRightClickedProcedure;
import net.mcreator.limbo.procedures.LimboStarRightclickedProcedure;
import net.mcreator.limbo.procedures.LimboPetalProjectileHitsLivingEntityProcedure;
import net.mcreator.limbo.procedures.LimboJointRightclickedProcedure;
import net.mcreator.limbo.procedures.LimboFlowerPetalRightclickedProcedure;
import net.mcreator.limbo.procedures.LimboFlowerEntityCollidesInTheBlockProcedure;
import net.mcreator.limbo.procedures.LimboDistillateRightclickedOnBlockProcedure;
import net.mcreator.limbo.procedures.HallucinationT1PlayerCollidesWithThisEntityProcedure;
import net.mcreator.limbo.procedures.HallucinationT1OnInitialEntitySpawnProcedure;
import net.mcreator.limbo.procedures.GlassPipeStuffedRightclickedProcedure;
import net.mcreator.limbo.procedures.GlassPipeRightclickedProcedure;
import net.mcreator.limbo.procedures.FalsePlayerPlayerCollidesWithThisEntityProcedure;
import net.mcreator.limbo.procedures.FalsePlayerEntityShakingConditionProcedure;
import net.mcreator.limbo.procedures.DamagedSteveOnInitialEntitySpawnProcedure;
import net.mcreator.limbo.procedures.ChargedLimboEngineItemInInventoryTickProcedure;

@SuppressWarnings("InstantiationOfUtilityClass")
public class LimboModProcedures {
	public static void load() {
		new LimboFlowerEntityCollidesInTheBlockProcedure();
		new LimboPetalProjectileHitsLivingEntityProcedure();
		new LimboFlowerPetalRightclickedProcedure();
		new ParanoiaEffectStartedappliedProcedure();
		new FalsePlayerPlayerCollidesWithThisEntityProcedure();
		new FalsePlayerEntityShakingConditionProcedure();
		new LimboSynthesizerChargedOnBlockRightClickedProcedure();
		new LimboSynthesizerUnchargedOnBlockRightClickedProcedure();
		new LimboStarRightclickedProcedure();
		new LimboTeaPlayerFinishesUsingItemProcedure();
		new ChargedLimboEngineItemInInventoryTickProcedure();
		new LimboJointRightclickedProcedure();
		new LimboDistillateRightclickedOnBlockProcedure();
		new GlassPipeStuffedRightclickedProcedure();
		new GlassPipeRightclickedProcedure();
		new LimboTabRightclickedProcedure();
		new HallucinationT1OnInitialEntitySpawnProcedure();
		new HallucinationT1PlayerCollidesWithThisEntityProcedure();
		new DamagedSteveOnInitialEntitySpawnProcedure();
	}
}
