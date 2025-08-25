// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelpritchanimal<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "pritchanimal"), "main");
	private final ModelPart root_bone;
	private final ModelPart head;
	private final ModelPart head_offset;
	private final ModelPart nose;
	private final ModelPart snout;
	private final ModelPart beak;
	private final ModelPart right_ear;
	private final ModelPart left_ear;
	private final ModelPart left_bunnyear;
	private final ModelPart right_bunnyear;
	private final ModelPart left_arm;
	private final ModelPart left_arm_offset;
	private final ModelPart right_arm;
	private final ModelPart right_arm_offset;
	private final ModelPart body;
	private final ModelPart left_leg;
	private final ModelPart tail;
	private final ModelPart right_leg;

	public Modelpritchanimal(ModelPart root) {
		this.root_bone = root.getChild("root_bone");
		this.head = this.root_bone.getChild("head");
		this.head_offset = this.head.getChild("head_offset");
		this.nose = this.head_offset.getChild("nose");
		this.snout = this.head_offset.getChild("snout");
		this.beak = this.head_offset.getChild("beak");
		this.right_ear = this.head_offset.getChild("right_ear");
		this.left_ear = this.head_offset.getChild("left_ear");
		this.left_bunnyear = this.head_offset.getChild("left_bunnyear");
		this.right_bunnyear = this.head_offset.getChild("right_bunnyear");
		this.left_arm = this.root_bone.getChild("left_arm");
		this.left_arm_offset = this.left_arm.getChild("left_arm_offset");
		this.right_arm = this.root_bone.getChild("right_arm");
		this.right_arm_offset = this.right_arm.getChild("right_arm_offset");
		this.body = this.root_bone.getChild("body");
		this.left_leg = this.root_bone.getChild("left_leg");
		this.tail = this.root_bone.getChild("tail");
		this.right_leg = this.root_bone.getChild("right_leg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition root_bone = partdefinition.addOrReplaceChild("root_bone", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition head = root_bone.addOrReplaceChild("head", CubeListBuilder.create(),
				PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition head_offset = head.addOrReplaceChild("head_offset", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition nose = head_offset.addOrReplaceChild("nose", CubeListBuilder.create().texOffs(16, 0).addBox(
				-1.0F, -1.0F, -2.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.0F, -4.0F));

		PartDefinition snout = head_offset.addOrReplaceChild("snout", CubeListBuilder.create().texOffs(53, 1).addBox(
				-2.0F, -1.5F, -1.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.5F, -4.0F));

		PartDefinition beak = head_offset.addOrReplaceChild("beak", CubeListBuilder.create().texOffs(52, 5).addBox(
				-2.0F, -0.5F, -2.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.5F, -4.0F));

		PartDefinition right_ear = head_offset.addOrReplaceChild("right_ear", CubeListBuilder.create().texOffs(18, 9)
				.addBox(-3.0F, -4.0F, 0.0F, 5.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-4.0F, -7.0F, 0.0F));

		PartDefinition left_ear = head_offset.addOrReplaceChild("left_ear", CubeListBuilder.create().texOffs(19, 9)
				.addBox(-2.0F, -4.0F, 0.0F, 5.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(4.0F, -7.0F, 0.0F));

		PartDefinition left_bunnyear = head_offset.addOrReplaceChild("left_bunnyear", CubeListBuilder.create()
				.texOffs(21, 9).addBox(-1.5F, -9.0F, -0.5F, 3.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.5F, -8.0F, 0.5F));

		PartDefinition right_bunnyear = head_offset.addOrReplaceChild("right_bunnyear", CubeListBuilder.create()
				.texOffs(21, 9).addBox(-1.5F, -9.0F, -0.5F, 3.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.5F, -8.0F, 0.5F));

		PartDefinition left_arm = root_bone.addOrReplaceChild("left_arm", CubeListBuilder.create(),
				PartPose.offset(5.0F, -22.0F, 0.0F));

		PartDefinition left_arm_offset = left_arm.addOrReplaceChild("left_arm_offset", CubeListBuilder.create()
				.texOffs(32, 48).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition right_arm = root_bone.addOrReplaceChild("right_arm", CubeListBuilder.create(),
				PartPose.offset(-5.0F, -22.0F, 0.0F));

		PartDefinition right_arm_offset = right_arm.addOrReplaceChild("right_arm_offset", CubeListBuilder.create()
				.texOffs(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition body = root_bone.addOrReplaceChild("body", CubeListBuilder.create().texOffs(16, 16).addBox(-4.0F,
				-12.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -12.0F, 0.0F));

		PartDefinition left_leg = root_bone.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(16, 48)
				.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, -12.0F, 0.0F));

		PartDefinition tail = root_bone.addOrReplaceChild("tail", CubeListBuilder.create(),
				PartPose.offset(0.0F, -13.0F, 2.0F));

		PartDefinition tail_r1 = tail
				.addOrReplaceChild("tail_r1",
						CubeListBuilder.create().texOffs(16, 6).addBox(-1.0F, -0.7071F, -0.7071F, 2.0F, 8.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition right_leg = root_bone.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(0, 16)
				.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, -12.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		root_bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.left_leg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.right_arm_offset.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.tail.zRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.right_leg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.left_arm_offset.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.head_offset.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head_offset.xRot = headPitch / (180F / (float) Math.PI);
	}
}