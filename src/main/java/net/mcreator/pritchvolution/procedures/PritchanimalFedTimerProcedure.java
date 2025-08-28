package net.mcreator.pritchvolution.procedures;

import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.pritchvolution.init.PritchvolutionModEntities;
import net.mcreator.pritchvolution.entity.PritchanimalEntity;

public class PritchanimalFedTimerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double ScaleBodyY = 0;
		double RandomSkin = 0;
		double ScaleNeckY = 0;
		Entity baby = null;
		if (entity instanceof PritchanimalEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_fedTimer, (int) ((entity instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_fedTimer) : 0) - 1));
		if ((entity instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_fedTimer) : 0) > 0) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.HEART, x, y, z, (int) 1, 1, 1, 1, 1);
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
					baby = world instanceof ServerLevel _level13 ? PritchvolutionModEntities.PRITCHANIMAL.get().spawn(_level13, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED) : null;
					PritchanimalBreedProcedure.execute(baby, entity, entityiterator);
				}
			}
		}
	}
}