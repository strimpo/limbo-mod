
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.limbo.init;

import net.mcreator.limbo.procedures.ParanoiaEffectStartedappliedProcedure;
import net.mcreator.limbo.procedures.LimboTeaPlayerFinishesUsingItemProcedure;
import net.mcreator.limbo.procedures.LimboSynthesizerUnchargedOnBlockRightClickedProcedure;
import net.mcreator.limbo.procedures.LimboSynthesizerChargedOnBlockRightClickedProcedure;
import net.mcreator.limbo.procedures.LimboStarRightclickedProcedure;
import net.mcreator.limbo.procedures.LimboPetalProjectileHitsLivingEntityProcedure;
import net.mcreator.limbo.procedures.LimboJointRightclickedProcedure;
import net.mcreator.limbo.procedures.LimboFlowerPetalRightclickedProcedure;
import net.mcreator.limbo.procedures.LimboFlowerEntityCollidesInTheBlockProcedure;
import net.mcreator.limbo.procedures.FalsePlayerPlayerCollidesWithThisEntityProcedure;
import net.mcreator.limbo.procedures.FalsePlayerEntityShakingConditionProcedure;
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
	}
}
