/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pritchvolution.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.pritchvolution.PritchvolutionMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class PritchvolutionModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PritchvolutionMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(PritchvolutionModItems.PRITCHANIMAL_SPAWN_EGG.get());
			tabData.accept(PritchvolutionModItems.RANDOM_PRITCHANIMAL_GENERATOR_SPAWN_EGG.get());
			tabData.accept(PritchvolutionModItems.HUMAN_PRITCHANIMAL_GENERATOR_SPAWN_EGG.get());
		}
	}
}