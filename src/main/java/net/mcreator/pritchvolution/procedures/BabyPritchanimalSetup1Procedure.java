package net.mcreator.pritchvolution.procedures;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.pritchvolution.entity.PritchanimalEntity;

public class BabyPritchanimalSetup1Procedure {
	public static void execute(Entity entity, Entity immediatesourceentity, Entity sourceentity) {
		if (entity == null || immediatesourceentity == null || sourceentity == null)
			return;
		double ScaleBodyY = 0;
		double RandomSkin = 0;
		double ScaleNeckY = 0;
		Entity father = null;
		Entity mother = null;
		father = sourceentity;
		mother = immediatesourceentity;
		if (entity instanceof LivingEntity _livingEntity3 && _livingEntity3.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED))
			_livingEntity3.getAttribute(Attributes.MOVEMENT_SPEED)
					.setBaseValue((Math.random()
							* ((mother instanceof LivingEntity _livingEntity0 && _livingEntity0.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED) ? _livingEntity0.getAttribute(Attributes.MOVEMENT_SPEED).getBaseValue() : 0)
									- (father instanceof LivingEntity _livingEntity1 && _livingEntity1.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED) ? _livingEntity1.getAttribute(Attributes.MOVEMENT_SPEED).getBaseValue() : 0))
							+ (father instanceof LivingEntity _livingEntity2 && _livingEntity2.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED) ? _livingEntity2.getAttribute(Attributes.MOVEMENT_SPEED).getBaseValue() : 0)));
		if (entity instanceof PritchanimalEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Arm_x,
					(int) (Math.random()
							* ((mother instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_SCALE_Arm_x) : 0)
									- (father instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_SCALE_Arm_x) : 0))
							+ (father instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_SCALE_Arm_x) : 0)));
		if (entity instanceof PritchanimalEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Arm_y,
					(int) (Math.random()
							* ((mother instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_SCALE_Arm_y) : 0)
									- (father instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_SCALE_Arm_y) : 0))
							+ (father instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_SCALE_Arm_y) : 0)));
		if (entity instanceof PritchanimalEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Arm_z,
					(int) (Math.random()
							* ((mother instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_SCALE_Arm_z) : 0)
									- (father instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_SCALE_Arm_z) : 0))
							+ (father instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_SCALE_Arm_z) : 0)));
		if (entity instanceof PritchanimalEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Leg_x,
					(int) (Math.random()
							* ((mother instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_SCALE_Leg_x) : 0)
									- (father instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_SCALE_Leg_x) : 0))
							+ (father instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_SCALE_Leg_x) : 0)));
		if (entity instanceof PritchanimalEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Leg_y,
					(int) (Math.random()
							* ((mother instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_SCALE_Leg_y) : 0)
									- (father instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_SCALE_Leg_y) : 0))
							+ (father instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_SCALE_Leg_y) : 0)));
		if (entity instanceof PritchanimalEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Leg_z,
					(int) (Math.random()
							* ((mother instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_SCALE_Leg_z) : 0)
									- (father instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_SCALE_Leg_z) : 0))
							+ (father instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_SCALE_Leg_z) : 0)));
		if (entity instanceof PritchanimalEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_ROTATION_Body_x,
					(int) (Math.random()
							* ((mother instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_ROTATION_Body_x) : 0)
									- (father instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_ROTATION_Body_x) : 0))
							+ (father instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_ROTATION_Body_x) : 0)));
		if (entity instanceof PritchanimalEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_ROTATION_Neck_x,
					(int) (Math.random()
							* ((mother instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_ROTATION_Neck_x) : 0)
									- (father instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_ROTATION_Neck_x) : 0))
							+ (father instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_ROTATION_Neck_x) : 0)));
		if (entity instanceof PritchanimalEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_ROTATION_Arm_x,
					(int) (Math.random()
							* ((mother instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_ROTATION_Arm_x) : 0)
									- (father instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_ROTATION_Arm_x) : 0))
							+ (father instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_ROTATION_Arm_x) : 0)));
		if (entity instanceof PritchanimalEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Body_x,
					(int) (Math.random()
							* ((mother instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_SCALE_Body_x) : 0)
									- (father instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_SCALE_Body_x) : 0))
							+ (father instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_SCALE_Body_x) : 0)));
		if (entity instanceof PritchanimalEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Body_y,
					(int) (Math.random()
							* ((mother instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_SCALE_Body_y) : 0)
									- (father instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_SCALE_Body_y) : 0))
							+ (father instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_SCALE_Body_y) : 0)));
		if (entity instanceof PritchanimalEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Body_z,
					(int) (Math.random()
							* ((mother instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_SCALE_Body_z) : 0)
									- (father instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_SCALE_Body_z) : 0))
							+ (father instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_SCALE_Body_z) : 0)));
		if (entity instanceof PritchanimalEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Head_x,
					(int) (Math.random()
							* ((mother instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_SCALE_Head_x) : 0)
									- (father instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_SCALE_Head_x) : 0))
							+ (father instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_SCALE_Head_x) : 0)));
		if (entity instanceof PritchanimalEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Head_y,
					(int) (Math.random()
							* ((mother instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_SCALE_Head_y) : 0)
									- (father instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_SCALE_Head_y) : 0))
							+ (father instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_SCALE_Head_y) : 0)));
		if (entity instanceof PritchanimalEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Head_z,
					(int) (Math.random()
							* ((mother instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_SCALE_Head_z) : 0)
									- (father instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_SCALE_Head_z) : 0))
							+ (father instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_SCALE_Head_z) : 0)));
		if (entity instanceof PritchanimalEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Neck_x,
					(int) (Math.random()
							* ((mother instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_SCALE_Neck_x) : 0)
									- (father instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_SCALE_Neck_x) : 0))
							+ (father instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_SCALE_Neck_x) : 0)));
		if (entity instanceof PritchanimalEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Neck_y,
					(int) (Math.random()
							* ((mother instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_SCALE_Neck_y) : 0)
									- (father instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_SCALE_Neck_y) : 0))
							+ (father instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_SCALE_Neck_y) : 0)));
		if (entity instanceof PritchanimalEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Neck_z,
					(int) (Math.random()
							* ((mother instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_SCALE_Neck_z) : 0)
									- (father instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_SCALE_Neck_z) : 0))
							+ (father instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_SCALE_Neck_z) : 0)));
		if (entity instanceof PritchanimalEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_hue, (int) (Math.random()
					* ((mother instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_hue) : 0) - (father instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_hue) : 0))
					+ (father instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_hue) : 0)));
		if (entity instanceof PritchanimalEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_saturation,
					(int) (Math.random()
							* ((mother instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_saturation) : 0)
									- (father instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_saturation) : 0))
							+ (father instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_saturation) : 0)));
		if (entity instanceof PritchanimalEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_brightness,
					(int) (Math.random()
							* ((mother instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_brightness) : 0)
									- (father instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_brightness) : 0))
							+ (father instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_brightness) : 0)));
		if (Math.random() > 0.5) {
			if (entity instanceof PritchanimalEntity _datEntSetL)
				_datEntSetL.getEntityData().set(PritchanimalEntity.DATA_hasArms, (mother instanceof PritchanimalEntity _datEntL88 && _datEntL88.getEntityData().get(PritchanimalEntity.DATA_hasArms)));
		} else {
			if (entity instanceof PritchanimalEntity _datEntSetL)
				_datEntSetL.getEntityData().set(PritchanimalEntity.DATA_hasArms, (father instanceof PritchanimalEntity _datEntL90 && _datEntL90.getEntityData().get(PritchanimalEntity.DATA_hasArms)));
		}
		if (Math.random() > 0.5) {
			if (entity instanceof PritchanimalEntity _datEntSetL)
				_datEntSetL.getEntityData().set(PritchanimalEntity.DATA_hasLegs, (mother instanceof PritchanimalEntity _datEntL92 && _datEntL92.getEntityData().get(PritchanimalEntity.DATA_hasLegs)));
		} else {
			if (entity instanceof PritchanimalEntity _datEntSetL)
				_datEntSetL.getEntityData().set(PritchanimalEntity.DATA_hasLegs, (father instanceof PritchanimalEntity _datEntL94 && _datEntL94.getEntityData().get(PritchanimalEntity.DATA_hasLegs)));
		}
		if (Math.random() > 0.5) {
			if (entity instanceof PritchanimalEntity _datEntSetL)
				_datEntSetL.getEntityData().set(PritchanimalEntity.DATA_hasNeck, (mother instanceof PritchanimalEntity _datEntL96 && _datEntL96.getEntityData().get(PritchanimalEntity.DATA_hasNeck)));
		} else {
			if (entity instanceof PritchanimalEntity _datEntSetL)
				_datEntSetL.getEntityData().set(PritchanimalEntity.DATA_hasNeck, (father instanceof PritchanimalEntity _datEntL98 && _datEntL98.getEntityData().get(PritchanimalEntity.DATA_hasNeck)));
		}
		if (Math.random() > 0.5) {
			if (entity instanceof PritchanimalEntity _datEntSetL)
				_datEntSetL.getEntityData().set(PritchanimalEntity.DATA_hasHead, (mother instanceof PritchanimalEntity _datEntL100 && _datEntL100.getEntityData().get(PritchanimalEntity.DATA_hasHead)));
		} else {
			if (entity instanceof PritchanimalEntity _datEntSetL)
				_datEntSetL.getEntityData().set(PritchanimalEntity.DATA_hasHead, (father instanceof PritchanimalEntity _datEntL102 && _datEntL102.getEntityData().get(PritchanimalEntity.DATA_hasHead)));
		}
	}
}