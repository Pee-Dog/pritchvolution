package net.mcreator.pritchvolution.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.animation.KeyframeAnimations;
import net.minecraft.client.animation.Keyframe;
import net.minecraft.client.animation.AnimationDefinition;
import net.minecraft.client.animation.AnimationChannel;

import net.mcreator.pritchvolution.entity.PritchanimalEntity;
import net.mcreator.pritchvolution.client.model.Modelpritchanimal;

import com.mojang.blaze3d.vertex.PoseStack;

public class PritchanimalRenderer extends MobRenderer<PritchanimalEntity, Modelpritchanimal<PritchanimalEntity>> {
	public PritchanimalRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelpritchanimal.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(PritchanimalEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(entity.getScale(), entity.getScale(), entity.getScale());
	}

	@Override
	public ResourceLocation getTextureLocation(PritchanimalEntity entity) {
		return ResourceLocation.parse("pritchvolution:textures/entities/player.png");
	}

	private static final class AnimatedModel extends Modelpritchanimal<PritchanimalEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<PritchanimalEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(PritchanimalEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				double sus = 0;
				sus = entity.getEntityData().get(PritchanimalEntity.DATA_SCALE_Arm_x);

				AnimationDefinition armslegstest = AnimationDefinition.Builder.withLength(0.0F).looping()
						.addAnimation("body",
								new AnimationChannel(AnimationChannel.Targets.ROTATION, 
										new Keyframe(0.0F, 
												KeyframeAnimations.degreeVec((float) entity.getEntityData().get(PritchanimalEntity.DATA_ROTATION_Body_x), 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)))
						.addAnimation("left_arm",
								new AnimationChannel(AnimationChannel.Targets.SCALE,
										new Keyframe(0.0F,
												KeyframeAnimations.scaleVec((float) entity.getEntityData().get(PritchanimalEntity.DATA_SCALE_Arm_x) / 100, (float) entity.getEntityData().get(PritchanimalEntity.DATA_SCALE_Arm_y) / 100,
														(float) entity.getEntityData().get(PritchanimalEntity.DATA_SCALE_Arm_z) / 100),
												AnimationChannel.Interpolations.LINEAR)))
						.addAnimation("right_arm", 
								new AnimationChannel(AnimationChannel.Targets.SCALE, 
										new Keyframe(0.0F, 
												KeyframeAnimations.scaleVec((float) entity.getEntityData().get(PritchanimalEntity.DATA_SCALE_Arm_x) / 100,(float) entity.getEntityData().get(PritchanimalEntity.DATA_SCALE_Arm_y) / 100, 
														(float) entity.getEntityData().get(PritchanimalEntity.DATA_SCALE_Arm_z) / 100), 
												AnimationChannel.Interpolations.LINEAR)))
						.addAnimation("left_leg", 
								new AnimationChannel(AnimationChannel.Targets.SCALE, 
										new Keyframe(0.0F, 
												KeyframeAnimations.scaleVec(0.8F, 0.8F, 0.8F), AnimationChannel.Interpolations.LINEAR)))
						.addAnimation("right_leg", new AnimationChannel(AnimationChannel.Targets.SCALE, new Keyframe(0.0F, KeyframeAnimations.scaleVec(0.8F, 0.8F, 0.8F), AnimationChannel.Interpolations.LINEAR)))
						.addAnimation("root", new AnimationChannel(AnimationChannel.Targets.POSITION, new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -10.0F, 0.0F), AnimationChannel.Interpolations.LINEAR))).build();
				this.animate(entity.animationState0, armslegstest, ageInTicks, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(PritchanimalEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}