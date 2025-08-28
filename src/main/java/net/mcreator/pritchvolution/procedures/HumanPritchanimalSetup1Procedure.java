package net.mcreator.pritchvolution.procedures;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.pritchvolution.entity.PritchanimalEntity;

public class HumanPritchanimalSetup1Procedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double ScaleBodyY = 0;
		double RandomSkin = 0;
		double ScaleNeckY = 0;
		if (entity instanceof LivingEntity _livingEntity1 && _livingEntity1.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED))
			_livingEntity1.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue((Mth.nextDouble(RandomSource.create(), 0.2, 0.3)));
		if (entity instanceof PritchanimalEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Arm_x, 100);
		if (entity instanceof PritchanimalEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Arm_y, 100);
		if (entity instanceof PritchanimalEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Arm_z, 100);
		if (entity instanceof PritchanimalEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Leg_x, 100);
		if (entity instanceof PritchanimalEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Leg_y, 100);
		if (entity instanceof PritchanimalEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Leg_z, 100);
		if (entity instanceof PritchanimalEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_ROTATION_Body_x, 0);
		if (entity instanceof PritchanimalEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_ROTATION_Neck_x, 0);
		if (entity instanceof PritchanimalEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_ROTATION_Arm_x, 0);
		if (entity instanceof PritchanimalEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Body_x, 100);
		if (entity instanceof PritchanimalEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Body_y, 100);
		if (entity instanceof PritchanimalEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Body_z, 100);
		if (entity instanceof PritchanimalEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Head_x, 100);
		if (entity instanceof PritchanimalEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Head_y, 100);
		if (entity instanceof PritchanimalEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Head_z, 100);
		if (entity instanceof PritchanimalEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Neck_x, 0);
		if (entity instanceof PritchanimalEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Neck_y, 0);
		if (entity instanceof PritchanimalEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Neck_z, 0);
	}
}