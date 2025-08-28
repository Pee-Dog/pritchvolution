/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pritchvolution.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.pritchvolution.client.renderer.RandomPritchanimalGeneratorRenderer;
import net.mcreator.pritchvolution.client.renderer.PritchanimalRenderer;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class PritchvolutionModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(PritchvolutionModEntities.PRITCHANIMAL.get(), PritchanimalRenderer::new);
		event.registerEntityRenderer(PritchvolutionModEntities.RANDOM_PRITCHANIMAL_GENERATOR.get(), RandomPritchanimalGeneratorRenderer::new);
	}
}