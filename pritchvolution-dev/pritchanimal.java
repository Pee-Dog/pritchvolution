// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class pritchanimal<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "pritchanimal"), "main");
	private final ModelPart root_bone;
	private final ModelPart head;
	private final ModelPart head_offset;
	private final ModelPart nose;
	private final ModelPart snout;
	private final ModelPart beak;
	private final ModelPart right_ear;
	private final ModelPart left_ear;
	private final ModelPart left_flopear;
	private final ModelPart right_flopear;
	private final ModelPart left_bunnyear;
	private final ModelPart right_bunnyear;
	private final ModelPart left_cowhorn;
	private final ModelPart right_cowhorn;
	private final ModelPart left_warmhorn;
	private final ModelPart right_warmhorn;
	private final ModelPart left_coldhorn;
	private final ModelPart right_coldhorn;
	private final ModelPart left_arm;
	private final ModelPart left_arm_offset;
	private final ModelPart right_arm;
	private final ModelPart right_arm_offset;
	private final ModelPart body;
	private final ModelPart left_leg;
	private final ModelPart tail;
	private final ModelPart fishtail;
	private final ModelPart dolphintail;
	private final ModelPart right_leg;

	public pritchanimal(ModelPart root) {
		this.root_bone = root.getChild("root_bone");
		this.head = this.root_bone.getChild("head");
		this.head_offset = this.head.getChild("head_offset");
		this.nose = this.head_offset.getChild("nose");
		this.snout = this.head_offset.getChild("snout");
		this.beak = this.head_offset.getChild("beak");
		this.right_ear = this.head_offset.getChild("right_ear");
		this.left_ear = this.head_offset.getChild("left_ear");
		this.left_flopear = this.head_offset.getChild("left_flopear");
		this.right_flopear = this.head_offset.getChild("right_flopear");
		this.left_bunnyear = this.head_offset.getChild("left_bunnyear");
		this.right_bunnyear = this.head_offset.getChild("right_bunnyear");
		this.left_cowhorn = this.head_offset.getChild("left_cowhorn");
		this.right_cowhorn = this.head_offset.getChild("right_cowhorn");
		this.left_warmhorn = this.head_offset.getChild("left_warmhorn");
		this.right_warmhorn = this.head_offset.getChild("right_warmhorn");
		this.left_coldhorn = this.head_offset.getChild("left_coldhorn");
		this.right_coldhorn = this.head_offset.getChild("right_coldhorn");
		this.left_arm = this.root_bone.getChild("left_arm");
		this.left_arm_offset = this.left_arm.getChild("left_arm_offset");
		this.right_arm = this.root_bone.getChild("right_arm");
		this.right_arm_offset = this.right_arm.getChild("right_arm_offset");
		this.body = this.root_bone.getChild("body");
		this.left_leg = this.root_bone.getChild("left_leg");
		this.tail = this.root_bone.getChild("tail");
		this.fishtail = this.root_bone.getChild("fishtail");
		this.dolphintail = this.root_bone.getChild("dolphintail");
		this.right_leg = this.root_bone.getChild("right_leg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition root_bone = partdefinition.addOrReplaceChild("root_bone", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition head = root_bone.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition head_offset = head.addOrReplaceChild("head_offset", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition nose = head_offset.addOrReplaceChild("nose", CubeListBuilder.create().texOffs(44, 5).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.0F, -4.0F));

		PartDefinition snout = head_offset.addOrReplaceChild("snout", CubeListBuilder.create().texOffs(45, 0).addBox(-2.0F, -0.5F, -2.0F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.5F, -4.0F));

		PartDefinition beak = head_offset.addOrReplaceChild("beak", CubeListBuilder.create().texOffs(32, 4).addBox(-2.0F, -0.5F, -2.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.5F, -4.0F));

		PartDefinition right_ear = head_offset.addOrReplaceChild("right_ear", CubeListBuilder.create().texOffs(32, 8).addBox(-3.0F, -4.0F, 0.0F, 5.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, -7.0F, 0.0F));

		PartDefinition left_ear = head_offset.addOrReplaceChild("left_ear", CubeListBuilder.create().texOffs(32, 8).mirror().addBox(-2.0F, -4.0F, 0.0F, 5.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(4.0F, -7.0F, 0.0F));

		PartDefinition left_flopear = head_offset.addOrReplaceChild("left_flopear", CubeListBuilder.create(), PartPose.offset(4.0F, -6.0F, 0.5F));

		PartDefinition head_r1 = left_flopear.addOrReplaceChild("head_r1", CubeListBuilder.create().texOffs(32, 8).addBox(-2.5F, -4.0F, -0.5F, 5.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 0.0F, 0.0F, -1.5708F, 1.5708F));

		PartDefinition right_flopear = head_offset.addOrReplaceChild("right_flopear", CubeListBuilder.create(), PartPose.offset(-4.0F, -6.0F, 0.5F));

		PartDefinition head_r2 = right_flopear.addOrReplaceChild("head_r2", CubeListBuilder.create().texOffs(32, 8).addBox(-2.5F, 7.0F, -0.5F, 5.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.0F, -0.5F, 0.0F, 0.0F, -1.5708F, 1.5708F));

		PartDefinition left_bunnyear = head_offset.addOrReplaceChild("left_bunnyear", CubeListBuilder.create().texOffs(0, 32).mirror().addBox(-1.5F, -9.0F, -0.5F, 3.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.5F, -8.0F, 0.5F));

		PartDefinition right_bunnyear = head_offset.addOrReplaceChild("right_bunnyear", CubeListBuilder.create().texOffs(0, 32).addBox(-1.5F, -9.0F, -0.5F, 3.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.5F, -8.0F, 0.5F));

		PartDefinition left_cowhorn = head_offset.addOrReplaceChild("left_cowhorn", CubeListBuilder.create().texOffs(41, 0).addBox(0.0F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, -7.0F, -1.5F));

		PartDefinition right_cowhorn = head_offset.addOrReplaceChild("right_cowhorn", CubeListBuilder.create().texOffs(41, 0).addBox(-1.0F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, -7.0F, -1.5F));

		PartDefinition left_warmhorn = head_offset.addOrReplaceChild("left_warmhorn", CubeListBuilder.create().texOffs(29, 0).addBox(0.0F, -1.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(33, 0).addBox(2.0F, -3.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, -7.0F, -2.0F));

		PartDefinition right_warmhorn = head_offset.addOrReplaceChild("right_warmhorn", CubeListBuilder.create().texOffs(29, 0).mirror().addBox(-4.0F, -1.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(33, 0).mirror().addBox(-4.0F, -3.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-4.0F, -7.0F, -2.0F));

		PartDefinition left_coldhorn = head_offset.addOrReplaceChild("left_coldhorn", CubeListBuilder.create(), PartPose.offset(4.0F, -7.0F, -2.0F));

		PartDefinition head_r3 = left_coldhorn.addOrReplaceChild("head_r3", CubeListBuilder.create().texOffs(24, 0).addBox(0.0F, -1.0F, -1.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, 1.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition right_coldhorn = head_offset.addOrReplaceChild("right_coldhorn", CubeListBuilder.create(), PartPose.offset(-4.0F, -7.0F, -2.0F));

		PartDefinition head_r4 = right_coldhorn.addOrReplaceChild("head_r4", CubeListBuilder.create().texOffs(24, 0).addBox(0.0F, -1.0F, -1.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.0F, 1.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition left_arm = root_bone.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.offset(5.0F, -22.0F, 0.0F));

		PartDefinition left_arm_offset = left_arm.addOrReplaceChild("left_arm_offset", CubeListBuilder.create().texOffs(40, 16).mirror().addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition right_arm = root_bone.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.offset(-5.0F, -22.0F, 0.0F));

		PartDefinition right_arm_offset = right_arm.addOrReplaceChild("right_arm_offset", CubeListBuilder.create().texOffs(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition body = root_bone.addOrReplaceChild("body", CubeListBuilder.create().texOffs(16, 16).addBox(-4.0F, -12.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -12.0F, 0.0F));

		PartDefinition left_leg = root_bone.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, -12.0F, 0.0F));

		PartDefinition tail = root_bone.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, -13.0F, 2.0F));

		PartDefinition tail_r1 = tail.addOrReplaceChild("tail_r1", CubeListBuilder.create().texOffs(8, 32).addBox(-1.0F, -0.7071F, -0.7071F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition fishtail = root_bone.addOrReplaceChild("fishtail", CubeListBuilder.create(), PartPose.offset(0.0F, -13.0F, 2.0F));

		PartDefinition tail_r2 = fishtail.addOrReplaceChild("tail_r2", CubeListBuilder.create().texOffs(0, 52).addBox(-4.0F, -0.4571F, 0.0429F, 7.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5708F, 0.0F, 1.5708F));

		PartDefinition dolphintail = root_bone.addOrReplaceChild("dolphintail", CubeListBuilder.create(), PartPose.offset(0.0F, -12.0F, 0.0F));

		PartDefinition tail_r3 = dolphintail.addOrReplaceChild("tail_r3", CubeListBuilder.create().texOffs(6, 32).addBox(-1.0F, 2.5429F, -3.9571F, 1.0F, 6.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.5F, 3.0F, 1.5708F, 0.0F, 1.5708F));

		PartDefinition tail_r4 = dolphintail.addOrReplaceChild("tail_r4", CubeListBuilder.create().texOffs(28, 35).addBox(-2.0F, -0.4571F, -1.9571F, 5.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 0.0F, 1.5708F, 0.0F, 1.5708F));

		PartDefinition right_leg = root_bone.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(0, 16).mirror().addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.0F, -12.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		root_bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}