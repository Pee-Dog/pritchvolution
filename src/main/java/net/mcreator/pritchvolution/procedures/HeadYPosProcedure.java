package net.mcreator.pritchvolution.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.pritchvolution.entity.PritchanimalEntity;

public class HeadYPosProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "" + (entity instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_POSITION_Head_y) : 0);
	}
}