package net.mcreator.pritchvolution.procedures;

import net.minecraft.world.entity.Entity;

public class ReturnEntityProcedure {
	public static Entity execute(Entity entity) {
		if (entity == null)
			return null;
		return entity;
	}
}