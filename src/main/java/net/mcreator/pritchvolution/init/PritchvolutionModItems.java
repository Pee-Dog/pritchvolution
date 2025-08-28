/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pritchvolution.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;

import net.minecraft.world.item.Item;

import net.mcreator.pritchvolution.PritchvolutionMod;

public class PritchvolutionModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(PritchvolutionMod.MODID);
	public static final DeferredItem<Item> PRITCHANIMAL_SPAWN_EGG = REGISTRY.register("pritchanimal_spawn_egg", () -> new DeferredSpawnEggItem(PritchvolutionModEntities.PRITCHANIMAL, -1, -16777216, new Item.Properties()));
	public static final DeferredItem<Item> RANDOM_PRITCHANIMAL_GENERATOR_SPAWN_EGG = REGISTRY.register("random_pritchanimal_generator_spawn_egg",
			() -> new DeferredSpawnEggItem(PritchvolutionModEntities.RANDOM_PRITCHANIMAL_GENERATOR, -65383, -16777216, new Item.Properties()));
	// Start of user code block custom items
	// End of user code block custom items
}