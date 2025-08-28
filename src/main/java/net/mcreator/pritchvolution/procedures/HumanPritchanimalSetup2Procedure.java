package net.mcreator.pritchvolution.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.pritchvolution.entity.PritchanimalEntity;

public class HumanPritchanimalSetup2Procedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double ScaleBodyY = 0;
		double RandomSkin = 0;
		double ScaleNeckY = 0;
		if (entity instanceof PritchanimalEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_nose_type, 0);
		if (entity instanceof PritchanimalEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_ears_type, 0);
		if (entity instanceof PritchanimalEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_horn_type, 0);
		if (entity instanceof PritchanimalEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_tail_type, 0);
		if (entity instanceof PritchanimalEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Fishtail_y, 0);
		if (entity instanceof PritchanimalEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Fishtail_z, 0);
		if (entity instanceof PritchanimalEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_POSITION_Root_y, 0);
		if (entity instanceof PritchanimalEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_size, 100);
	}
}