package net.mcreator.pritchvolution.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.pritchvolution.entity.PritchanimalEntity;

public class HeadZPosProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "" + (entity instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_POSITION_Head_z) : 0);
	}
}