package net.mcreator.pritchvolution.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.pritchvolution.init.PritchvolutionModEntities;

public class RandomPritchanimalGeneratorOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		Entity pritchanimal = null;
		pritchanimal = world instanceof ServerLevel _level0 ? PritchvolutionModEntities.PRITCHANIMAL.get().spawn(_level0, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED) : null;
		RandomPritchanimalSetup1Procedure.execute(pritchanimal);
		RandomPritchanimalSetup2Procedure.execute(pritchanimal);
		if (!entity.level().isClientSide())
			entity.discard();
	}
}