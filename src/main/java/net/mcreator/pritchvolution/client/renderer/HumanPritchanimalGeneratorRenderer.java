package net.mcreator.pritchvolution.client.renderer;

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