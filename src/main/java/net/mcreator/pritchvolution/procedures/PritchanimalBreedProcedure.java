package net.mcreator.pritchvolution.procedures;

import net.minecraftforge.eventbus.api.Event;

public class PritchanimalBreedProcedure {
	public static void execute(Entity entity, Entity immediatesourceentity, Entity sourceentity) {
		if (entity == null || immediatesourceentity == null || sourceentity == null)
			return;
		BabyPritchanimalSetup1Procedure.execute(entity, immediatesourceentity, sourceentity);
		BabyPritchanimalSetup2Procedure.execute(entity, immediatesourceentity, sourceentity);
	}
}