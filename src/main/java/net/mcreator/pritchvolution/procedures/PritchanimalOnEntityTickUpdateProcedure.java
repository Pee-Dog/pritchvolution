package net.mcreator.pritchvolution.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.pritchvolution.entity.PritchanimalEntity;

public class PritchanimalOnEntityTickUpdateProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return entity instanceof PritchanimalEntity _datEntL0 && _datEntL0.getEntityData().get(PritchanimalEntity.DATA_armslegstest);
	}
}