package net.mcreator.pritchvolution.procedures;

import net.minecraftforge.eventbus.api.Event;

@Mod.EventBusSubscriber
public class PritchanimalRightClickedOnEntityProcedure {
	@SubscribeEvent
	public static void onRightClickEntity(PlayerInteractEvent.EntityInteract event) {
		if (event.getHand() != InteractionHand.MAIN_HAND)
			return;
		execute(event, event.getTarget(), event.getEntity());
	}

	public static void execute(Entity entity, Entity sourceentity) {
		execute(null, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (entity instanceof PritchanimalEntity) {
			if ((entity instanceof PritchanimalEntity _datEntI ? _datEntI.getEntityData().get(PritchanimalEntity.DATA_fedTimer) : 0) < 0) {
				if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.WHEAT) {
					(sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).shrink(1);
					if (entity instanceof PritchanimalEntity _datEntSetI)
						_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_fedTimer, 200);
				}
				if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == Items.WHEAT) {
					(sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).shrink(1);
					if (entity instanceof PritchanimalEntity _datEntSetI)
						_datEntSetI.getEntityData().set(PritchanimalEntity.DATA_fedTimer, 200);
				}
			}
		}
	}
}