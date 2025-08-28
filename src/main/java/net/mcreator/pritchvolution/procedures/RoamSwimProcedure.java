package net.mcreator.pritchvolution.procedures;

import net.minecraftforge.eventbus.api.Event;

public class RoamSwimProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_roamType) : 0) == 2) {
			return true;
		}
		return false;
	}
}