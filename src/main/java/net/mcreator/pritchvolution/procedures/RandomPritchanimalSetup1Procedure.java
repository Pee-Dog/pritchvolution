package net.mcreator.pritchvolution.procedures;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.pritchvolution.entity.PritchanimalEntity;

public class RandomPritchanimalSetup1Procedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double ScaleBodyY = 0;
		double RandomSkin = 0;
		double ScaleNeckY = 0;
		if (entity instanceof LivingEntity _livingEntity1 && _livingEntity1.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED))
			_livingEntity1.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue((Mth.nextDouble(RandomSource.create(), 0.2, 0.3)));
		if (entity instanceof PritchanimalEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Arm_x, (int) Mth.nextDouble(RandomSource.create(), 50, 150));
		if (entity instanceof PritchanimalEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Arm_y, (int) Mth.nextDouble(RandomSource.create(), 50, 150));
		if (entity instanceof PritchanimalEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Arm_z, (int) Mth.nextDouble(RandomSource.create(), 50, 150));
		if (entity instanceof PritchanimalEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Leg_x, (int) Mth.nextDouble(RandomSource.create(), 50, 150));
		if (entity instanceof PritchanimalEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Leg_y, (int) Mth.nextDouble(RandomSource.create(), 50, 150));
		if (entity instanceof PritchanimalEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Leg_z, (int) Mth.nextDouble(RandomSource.create(), 50, 150));
		if (entity instanceof PritchanimalEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_ROTATION_Body_x, (int) Mth.nextDouble(RandomSource.create(), 0, 90));
		if (entity instanceof PritchanimalEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_ROTATION_Neck_x, (int) Mth.nextDouble(RandomSource.create(), 0, 90));
		if (entity instanceof PritchanimalEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_ROTATION_Arm_x, (int) Mth.nextDouble(RandomSource.create(), -90, 0));
		if (entity instanceof PritchanimalEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Body_x, (int) Mth.nextDouble(RandomSource.create(), 50, 150));
		if (entity instanceof PritchanimalEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Body_y, (int) Mth.nextDouble(RandomSource.create(), 50, 150));
		if (entity instanceof PritchanimalEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Body_z, (int) Mth.nextDouble(RandomSource.create(), 50, 150));
		if (entity instanceof PritchanimalEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Head_x, (int) Mth.nextDouble(RandomSource.create(), 50, 150));
		if (entity instanceof PritchanimalEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Head_y, (int) Mth.nextDouble(RandomSource.create(), 50, 150));
		if (entity instanceof PritchanimalEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Head_z, (int) Mth.nextDouble(RandomSource.create(), 50, 150));
		if (entity instanceof PritchanimalEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Neck_x,
					(int) ((entity instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_SCALE_Body_x) : 0) - Mth.nextDouble(RandomSource.create(), 0, 25)));
		if (entity instanceof PritchanimalEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Neck_y, (int) Mth.nextDouble(RandomSource.create(), 50, 200));
		if (entity instanceof PritchanimalEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Neck_z,
					(int) ((entity instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_SCALE_Body_z) : 0) - Mth.nextDouble(RandomSource.create(), 0, 25)));
		if (entity instanceof PritchanimalEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_roamType, Mth.nextInt(RandomSource.create(), 0, 3));
	}
}