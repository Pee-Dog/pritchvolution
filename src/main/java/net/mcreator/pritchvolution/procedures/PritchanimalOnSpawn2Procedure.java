package net.mcreator.pritchvolution.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.pritchvolution.entity.PritchanimalEntity;

public class PritchanimalOnSpawn2Procedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double ScaleBodyY = 0;
		double RandomSkin = 0;
		double ScaleNeckY = 0;
		if (entity instanceof PritchanimalEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_nose_type, Mth.nextInt(RandomSource.create(), 0, 3));
		if ((entity instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_nose_type) : 0) == 1) {
			if (entity instanceof PritchanimalEntity _datEntSetI)
				_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Nose_x, (int) Mth.nextDouble(RandomSource.create(), 50, 150));
			if (entity instanceof PritchanimalEntity _datEntSetI)
				_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Nose_y, (int) Mth.nextDouble(RandomSource.create(), 50, 150));
			if (entity instanceof PritchanimalEntity _datEntSetI)
				_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Nose_z, (int) Mth.nextDouble(RandomSource.create(), 50, 150));
		} else if ((entity instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_nose_type) : 0) == 2) {
			if (entity instanceof PritchanimalEntity _datEntSetI)
				_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Snout_x, (int) Mth.nextDouble(RandomSource.create(), 50, 150));
			if (entity instanceof PritchanimalEntity _datEntSetI)
				_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Snout_z, (int) Mth.nextDouble(RandomSource.create(), 100, 300));
			if (entity instanceof PritchanimalEntity _datEntSetI)
				_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_ROTATION_Snout_x, (int) Mth.nextDouble(RandomSource.create(), 0, 30));
		} else if ((entity instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_nose_type) : 0) == 3) {
			if (entity instanceof PritchanimalEntity _datEntSetI)
				_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Beak_x, (int) Mth.nextDouble(RandomSource.create(), 50, 150));
			if (entity instanceof PritchanimalEntity _datEntSetI)
				_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Beak_y, (int) Mth.nextDouble(RandomSource.create(), 50, 150));
			if (entity instanceof PritchanimalEntity _datEntSetI)
				_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Beak_z, (int) Mth.nextDouble(RandomSource.create(), 50, 300));
		}
		if (entity instanceof PritchanimalEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_ears_type, Mth.nextInt(RandomSource.create(), 0, 3));
		if ((entity instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_ears_type) : 0) == 1) {
			if (entity instanceof PritchanimalEntity _datEntSetI)
				_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Ear_x, (int) Mth.nextDouble(RandomSource.create(), 50, 150));
			if (entity instanceof PritchanimalEntity _datEntSetI)
				_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Ear_y, (int) Mth.nextDouble(RandomSource.create(), 50, 150));
			if (entity instanceof PritchanimalEntity _datEntSetI)
				_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Ear_z, (int) Mth.nextDouble(RandomSource.create(), 50, 150));
			if (entity instanceof PritchanimalEntity _datEntSetI)
				_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_POSITION_Ear_y, Mth.nextInt(RandomSource.create(), -5, 0));
		} else if ((entity instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_ears_type) : 0) == 2) {
			if (entity instanceof PritchanimalEntity _datEntSetI)
				_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Bunnyear_x, (int) Mth.nextDouble(RandomSource.create(), 50, 150));
			if (entity instanceof PritchanimalEntity _datEntSetI)
				_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Bunnyear_y, (int) Mth.nextDouble(RandomSource.create(), 25, 100));
			if (entity instanceof PritchanimalEntity _datEntSetI)
				_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Bunnyear_z, (int) Mth.nextDouble(RandomSource.create(), 100, 150));
		} else if ((entity instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_ears_type) : 0) == 3) {
			if (entity instanceof PritchanimalEntity _datEntSetI)
				_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Flopear_x, (int) Mth.nextDouble(RandomSource.create(), 25, 150));
			if (entity instanceof PritchanimalEntity _datEntSetI)
				_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Flopear_z, (int) Mth.nextDouble(RandomSource.create(), 25, 150));
			if (entity instanceof PritchanimalEntity _datEntSetI)
				_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_ROTATION_Flopear_z, (int) Mth.nextDouble(RandomSource.create(), -90, 90));
		}
		if (entity instanceof PritchanimalEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_horn_type, Mth.nextInt(RandomSource.create(), 0, 4));
		if ((entity instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_horn_type) : 0) == 1) {
			if (entity instanceof PritchanimalEntity _datEntSetI)
				_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Cowhorn_x, (int) Mth.nextDouble(RandomSource.create(), 100, 200));
			if (entity instanceof PritchanimalEntity _datEntSetI)
				_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Cowhorn_y, (int) Mth.nextDouble(RandomSource.create(), 50, 200));
			if (entity instanceof PritchanimalEntity _datEntSetI)
				_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Cowhorn_z, (int) Mth.nextDouble(RandomSource.create(), 100, 200));
		} else if ((entity instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_horn_type) : 0) == 2) {
			if (entity instanceof PritchanimalEntity _datEntSetI)
				_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Warmhorn_x, (int) Mth.nextDouble(RandomSource.create(), 50, 150));
			if (entity instanceof PritchanimalEntity _datEntSetI)
				_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Warmhorn_y, (int) Mth.nextDouble(RandomSource.create(), 50, 150));
			if (entity instanceof PritchanimalEntity _datEntSetI)
				_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Warmhorn_z, (int) Mth.nextDouble(RandomSource.create(), 50, 150));
		} else if ((entity instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_horn_type) : 0) == 3) {
			if (entity instanceof PritchanimalEntity _datEntSetI)
				_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Coldhorn_x, (int) Mth.nextDouble(RandomSource.create(), 50, 150));
			if (entity instanceof PritchanimalEntity _datEntSetI)
				_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Coldhorn_y, (int) Mth.nextDouble(RandomSource.create(), 50, 150));
			if (entity instanceof PritchanimalEntity _datEntSetI)
				_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Coldhorn_z, (int) Mth.nextDouble(RandomSource.create(), 50, 150));
		}
		if (entity instanceof PritchanimalEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_tail_type, Mth.nextInt(RandomSource.create(), 0, 2));
		if ((entity instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_tail_type) : 0) == 1) {
			if (entity instanceof PritchanimalEntity _datEntSetI)
				_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Tail_x, (int) Mth.nextDouble(RandomSource.create(), 75, 200));
			if (entity instanceof PritchanimalEntity _datEntSetI)
				_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Tail_y, (int) Mth.nextDouble(RandomSource.create(), 75, 200));
			if (entity instanceof PritchanimalEntity _datEntSetI)
				_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Tail_z, (int) Mth.nextDouble(RandomSource.create(), 50, 200));
		} else if ((entity instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_tail_type) : 0) == 2) {
			if (entity instanceof PritchanimalEntity _datEntSetI)
				_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Dolphintail_x, (int) Mth.nextDouble(RandomSource.create(), 50, 150));
			if (entity instanceof PritchanimalEntity _datEntSetI)
				_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Dolphintail_y, (int) Mth.nextDouble(RandomSource.create(), 50, 100));
			if (entity instanceof PritchanimalEntity _datEntSetI)
				_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Dolphintail_z, (int) Mth.nextDouble(RandomSource.create(), 50, 200));
			if (entity instanceof PritchanimalEntity _datEntSetI)
				_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Leg_x, 0);
			if (entity instanceof PritchanimalEntity _datEntSetI)
				_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Leg_y, 0);
			if (entity instanceof PritchanimalEntity _datEntSetI)
				_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Leg_z, 0);
		}
		if (entity instanceof PritchanimalEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Fishtail_y, 0);
		if (entity instanceof PritchanimalEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Fishtail_z, 0);
		if (entity instanceof PritchanimalEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_POSITION_Root_y, (int) ((-6) * (1 - (float) (entity instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_SCALE_Leg_y) : 0) / 100)));
		if (entity instanceof PritchanimalEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_size, (int) Mth.nextDouble(RandomSource.create(), 50, 150));
		RandomSkin = Math.random();
		if (RandomSkin > 0.75) {
			if (entity instanceof PritchanimalEntity _datEntSetS)
				_datEntSetS.getEntityData().set(PritchanimalEntity.DATA_skin, "cow");
		} else if (RandomSkin > 0.5) {
			if (entity instanceof PritchanimalEntity _datEntSetS)
				_datEntSetS.getEntityData().set(PritchanimalEntity.DATA_skin, "chicken");
		} else if (RandomSkin > 0.25) {
			if (entity instanceof PritchanimalEntity _datEntSetS)
				_datEntSetS.getEntityData().set(PritchanimalEntity.DATA_skin, "sheep");
		}
		if (Math.random() > 0.5) {
			if (entity instanceof PritchanimalEntity _datEntSetI)
				_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Neck_x, 0);
			if (entity instanceof PritchanimalEntity _datEntSetI)
				_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Neck_y, 0);
			if (entity instanceof PritchanimalEntity _datEntSetI)
				_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_SCALE_Neck_z, 0);
			if (entity instanceof PritchanimalEntity _datEntSetI)
				_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_POSITION_HeadOffset_y, 0);
			if (entity instanceof PritchanimalEntity _datEntSetI)
				_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_POSITION_HeadOffset_z, 0);
		}
	}
}