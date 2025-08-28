/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pritchvolution.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.registries.Registries;

import net.mcreator.pritchvolution.entity.RandomPritchanimalGeneratorEntity;
import net.mcreator.pritchvolution.entity.PritchanimalEntity;
import net.mcreator.pritchvolution.entity.HumanPritchanimalGeneratorEntity;
import net.mcreator.pritchvolution.PritchvolutionMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class PritchvolutionModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, PritchvolutionMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<PritchanimalEntity>> PRITCHANIMAL = register("pritchanimal",
			EntityType.Builder.<PritchanimalEntity>of(PritchanimalEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<RandomPritchanimalGeneratorEntity>> RANDOM_PRITCHANIMAL_GENERATOR = register("random_pritchanimal_generator",
			EntityType.Builder.<RandomPritchanimalGeneratorEntity>of(RandomPritchanimalGeneratorEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f).sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<HumanPritchanimalGeneratorEntity>> HUMAN_PRITCHANIMAL_GENERATOR = register("human_pritchanimal_generator",
			EntityType.Builder.<HumanPritchanimalGeneratorEntity>of(HumanPritchanimalGeneratorEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f).sized(0.6f, 1.8f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(RegisterSpawnPlacementsEvent event) {
		PritchanimalEntity.init(event);
		RandomPritchanimalGeneratorEntity.init(event);
		HumanPritchanimalGeneratorEntity.init(event);
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(PRITCHANIMAL.get(), PritchanimalEntity.createAttributes().build());
		event.put(RANDOM_PRITCHANIMAL_GENERATOR.get(), RandomPritchanimalGeneratorEntity.createAttributes().build());
		event.put(HUMAN_PRITCHANIMAL_GENERATOR.get(), HumanPritchanimalGeneratorEntity.createAttributes().build());
	}
}