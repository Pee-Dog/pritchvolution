package net.mcreator.pritchvolution.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.pritchvolution.entity.HumanPritchanimalGeneratorEntity;

public class HumanPritchanimalGeneratorRenderer extends HumanoidMobRenderer<HumanPritchanimalGeneratorEntity, HumanoidModel<HumanPritchanimalGeneratorEntity>> {
	public HumanPritchanimalGeneratorRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<HumanPritchanimalGeneratorEntity>(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(HumanPritchanimalGeneratorEntity entity) {
		return ResourceLocation.parse("pritchvolution:textures/entities/nothing.png");
	}
}