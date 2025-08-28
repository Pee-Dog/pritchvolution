/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pritchvolution.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.pritchvolution.entity.RandomPritchanimalGeneratorEntity;
import net.mcreator.pritchvolution.entity.PritchanimalEntity;
import net.mcreator.pritchvolution.entity.HumanPritchanimalGeneratorEntity;
import net.mcreator.pritchvolution.PritchvolutionMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PritchvolutionModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, PritchvolutionMod.MODID);
	public static final RegistryObject<EntityType<PritchanimalEntity>> PRITCHANIMAL = register("pritchanimal",
			EntityType.Builder.<PritchanimalEntity>of(PritchanimalEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PritchanimalEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RandomPritchanimalGeneratorEntity>> RANDOM_PRITCHANIMAL_GENERATOR = register("random_pritchanimal_generator",
			EntityType.Builder.<RandomPritchanimalGeneratorEntity>of(RandomPritchanimalGeneratorEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(RandomPritchanimalGeneratorEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<HumanPritchanimalGeneratorEntity>> HUMAN_PRITCHANIMAL_GENERATOR = register("human_pritchanimal_generator",
			EntityType.Builder.<HumanPritchanimalGeneratorEntity>of(HumanPritchanimalGeneratorEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(HumanPritchanimalGeneratorEntity::new)

					.sized(0.6f, 1.8f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			PritchanimalEntity.init();
			RandomPritchanimalGeneratorEntity.init();
			HumanPritchanimalGeneratorEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(PRITCHANIMAL.get(), PritchanimalEntity.createAttributes().build());
		event.put(RANDOM_PRITCHANIMAL_GENERATOR.get(), RandomPritchanimalGeneratorEntity.createAttributes().build());
		event.put(HUMAN_PRITCHANIMAL_GENERATOR.get(), HumanPritchanimalGeneratorEntity.createAttributes().build());
	}
}