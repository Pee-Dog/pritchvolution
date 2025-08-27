package net.mcreator.pritchvolution.procedures;

import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.pritchvolution.init.PritchvolutionModEntities;
import net.mcreator.pritchvolution.entity.PritchanimalEntity;

public class PritchanimalOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double ScaleBodyY = 0;
		double RandomSkin = 0;
		double ScaleNeckY = 0;
		if ((entity instanceof PritchanimalEntity _datEntL0 && _datEntL0.getEntityData().get(PritchanimalEntity.DATA_isInitialized)) == false) {
			if (entity instanceof PritchanimalEntity _datEntSetL)
				_datEntSetL.getEntityData().set(PritchanimalEntity.DATA_isInitialized, true);
			if (entity instanceof LivingEntity _livingEntity3 && _livingEntity3.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED))
				_livingEntity3.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue((Mth.nextDouble(RandomSource.create(), 0.2, 0.3)));
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
			ScaleNeckY = (float) (entity instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_SCALE_Neck_y) : 0) / 100;
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
			PritchanimalOnSpawn2Procedure.execute(entity);
		}
		if (entity instanceof PritchanimalEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_fedTimer, (int) ((entity instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_fedTimer) : 0) - 1));
		if ((entity instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_fedTimer) : 0) > 0) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.HEART, x, y, z, (int) 0.5, 0.5, 0.5, 0.5, 1);
			for (Entity entityiterator : world.getEntities(entity, new AABB((x + 10), (y + 10), (z + 10), (x - 10), (y - 10), (z - 10)))) {
				if ((entityiterator instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_fedTimer) : 0) > 0) {
					if (entity instanceof Mob _entity)
						_entity.getNavigation().moveTo((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 1);
				}
			}
			for (Entity entityiterator : world.getEntities(entity, new AABB((x + 1), (y + 1), (z + 1), (x - 1), (y - 1), (z - 1)))) {
				if ((entityiterator instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_fedTimer) : 0) > 0) {
					if (entity instanceof PritchanimalEntity _datEntSetI)
						_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_fedTimer, -1);
					if (entityiterator instanceof PritchanimalEntity _datEntSetI)
						_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_fedTimer, -1);
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = PritchvolutionModEntities.PRITCHANIMAL.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setDeltaMovement(0, 0, 0);
						}
					}
				}
			}
		}
	}
}