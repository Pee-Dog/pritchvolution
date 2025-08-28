package net.mcreator.pritchvolution.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.pritchvolution.entity.PritchanimalEntity;

public class PritchanimalOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double ScaleBodyY = 0;
		double RandomSkin = 0;
		double ScaleNeckY = 0;
		Entity baby = null;
		if ((entity instanceof PritchanimalEntity _datEntL0 && _datEntL0.getEntityData().get(PritchanimalEntity.DATA_isInitialized)) == false) {
			if (entity instanceof PritchanimalEntity _datEntSetL)
				_datEntSetL.getEntityData().set(PritchanimalEntity.DATA_isInitialized, true);
			ScaleNeckY = 0;
			if (entity instanceof PritchanimalEntity _datEntL2 && _datEntL2.getEntityData().get(PritchanimalEntity.DATA_hasNeck)) {
				ScaleNeckY = (float) (entity instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_SCALE_Neck_y) : 0) / 100;
			}
			if (entity instanceof PritchanimalEntity _datEntSetI)
				_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_POSITION_HeadOffset_y,
						(int) (8 * ScaleNeckY * Math.cos(Math.toRadians(entity instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_ROTATION_Neck_x) : 0))));
			if (entity instanceof PritchanimalEntity _datEntSetI)
				_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_POSITION_HeadOffset_z,
						(int) ((-10) * ScaleNeckY * Math.sin(Math.toRadians(entity instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_ROTATION_Neck_x) : 0))));
			ScaleBodyY = (float) (entity instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_SCALE_Body_y) : 0) / 100;
			if (entity instanceof PritchanimalEntity _datEntSetI)
				_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_POSITION_Head_y,
						(int) (12 * (ScaleBodyY - 1) - 12 * ScaleBodyY * Math.sin(Math.toRadians(entity instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_ROTATION_Body_x) : 0))));
			if (entity instanceof PritchanimalEntity _datEntSetI)
				_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_POSITION_Head_y,
						(int) (12 * (ScaleBodyY - 1) - 12 * ScaleBodyY * Math.sin(Math.toRadians(entity instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_ROTATION_Body_x) : 0))));
			if (entity instanceof PritchanimalEntity _datEntSetI)
				_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_POSITION_Head_z,
						(int) ((-16) * ScaleBodyY * Math.sin(Math.toRadians(entity instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_ROTATION_Body_x) : 0))));
			if (entity instanceof PritchanimalEntity _datEntSetI)
				_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_POSITION_Arm_y,
						(int) (10 * (ScaleBodyY - 1) - 10 * ScaleBodyY * Math.sin(Math.toRadians(entity instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_ROTATION_Body_x) : 0))));
			if (entity instanceof PritchanimalEntity _datEntSetI)
				_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_POSITION_Arm_z,
						(int) ((-10) * ScaleBodyY * Math.sin(Math.toRadians(entity instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_ROTATION_Body_x) : 0))));
		}
		PritchanimalFedTimerProcedure.execute(world, x, y, z, entity);
		if (Math.random() < 0.001) {
			if (entity instanceof PritchanimalEntity _datEntSetI)
				_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_fedTimer, 200);
		}
	}
}