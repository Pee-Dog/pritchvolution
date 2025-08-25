/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pritchvolution.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

import net.mcreator.pritchvolution.PritchvolutionMod;

public class PritchvolutionModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, PritchvolutionMod.MODID);
	public static final RegistryObject<Item> PRITCHANIMAL_SPAWN_EGG = REGISTRY.register("pritchanimal_spawn_egg", () -> new ForgeSpawnEggItem(PritchvolutionModEntities.PRITCHANIMAL, -1, -16777216, new Item.Properties()));
	// Start of user code block custom items
	// End of user code block custom items
}