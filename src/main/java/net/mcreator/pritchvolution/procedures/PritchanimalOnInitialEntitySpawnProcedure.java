package net.mcreator.pritchvolution.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.pritchvolution.entity.PritchanimalEntity;

public class PritchanimalOnInitialEntitySpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (Math.random() < 0.3) {
			if (entity instanceof PritchanimalEntity _datEntSetL)
				_datEntSetL.getEntityData().set(PritchanimalEntity.DATA_armslegstest, true);
		}
		if (entity instanceof PritchanimalEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Arm_x,
					(int) ((entity instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_SCALE_Arm_x) : 0) + Mth.nextDouble(RandomSource.create(), -50, 50)));
		if (entity instanceof PritchanimalEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Arm_y,
					(int) ((entity instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_SCALE_Arm_y) : 0) + Mth.nextDouble(RandomSource.create(), -50, 50)));
		if (entity instanceof PritchanimalEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Arm_z,
					(int) ((entity instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_SCALE_Arm_z) : 0) + Mth.nextDouble(RandomSource.create(), -50, 50)));
		if (entity instanceof PritchanimalEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Leg_x,
					(int) ((entity instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_SCALE_Leg_x) : 0) + Mth.nextDouble(RandomSource.create(), -50, 50)));
		if (entity instanceof PritchanimalEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Leg_y,
					(int) ((entity instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_SCALE_Leg_y) : 0) + Mth.nextDouble(RandomSource.create(), -50, 50)));
		if (entity instanceof PritchanimalEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Leg_z,
					(int) ((entity instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_SCALE_Leg_z) : 0) + Mth.nextDouble(RandomSource.create(), -50, 50)));
		if (entity instanceof PritchanimalEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_ROTATION_Body_x,
					(int) ((entity instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_ROTATION_Body_x) : 0) + Mth.nextDouble(RandomSource.create(), 0, 90)));
		if (entity instanceof PritchanimalEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_ROTATION_Arm_x,
					(int) ((entity instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_ROTATION_Arm_x) : 0) + Mth.nextDouble(RandomSource.create(), 0, 90)));
		if (entity instanceof PritchanimalEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Body_x,
					(int) ((entity instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_SCALE_Body_x) : 0) + Mth.nextDouble(RandomSource.create(), -50, 50)));
		if (entity instanceof PritchanimalEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Body_y,
					(int) ((entity instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_SCALE_Body_y) : 0) + Mth.nextDouble(RandomSource.create(), -50, 50)));
		if (entity instanceof PritchanimalEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Body_z,
					(int) ((entity instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_SCALE_Body_z) : 0) + Mth.nextDouble(RandomSource.create(), -50, 50)));
		if (entity instanceof PritchanimalEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Head_x,
					(int) ((entity instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_SCALE_Head_x) : 0) + Mth.nextDouble(RandomSource.create(), -50, 50)));
		if (entity instanceof PritchanimalEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Head_y,
					(int) ((entity instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_SCALE_Head_y) : 0) + Mth.nextDouble(RandomSource.create(), -50, 50)));
		if (entity instanceof PritchanimalEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Head_z,
					(int) ((entity instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_SCALE_Head_z) : 0) + Mth.nextDouble(RandomSource.create(), -50, 50)));
		if (entity instanceof PritchanimalEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_POSITION_Head_y, (int) ((entity instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_ROTATION_Body_x) : 0) / (-5)));
	}
}