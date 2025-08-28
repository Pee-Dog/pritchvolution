package net.mcreator.pritchvolution.entity;

import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;

import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.TemptGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.SpawnPlacementTypes;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.AnimationState;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.Difficulty;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.pritchvolution.procedures.PritchanimalOnInitialEntitySpawnProcedure;
import net.mcreator.pritchvolution.init.PritchvolutionModItems;
import net.mcreator.pritchvolution.init.PritchvolutionModEntities;

public class PritchanimalEntity extends Animal {
	public static final EntityDataAccessor<Boolean> DATA_armslegstest = SynchedEntityData.defineId(PritchanimalEntity.class, EntityDataSerializers.BOOLEAN);
	public static final EntityDataAccessor<Integer> DATA_SCALE_Arm_x = SynchedEntityData.defineId(PritchanimalEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_SCALE_Arm_y = SynchedEntityData.defineId(PritchanimalEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_SCALE_Arm_z = SynchedEntityData.defineId(PritchanimalEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_SCALE_Leg_x = SynchedEntityData.defineId(PritchanimalEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_SCALE_Leg_y = SynchedEntityData.defineId(PritchanimalEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_SCALE_Leg_z = SynchedEntityData.defineId(PritchanimalEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_ROTATION_Arm_x = SynchedEntityData.defineId(PritchanimalEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_ROTATION_Body_x = SynchedEntityData.defineId(PritchanimalEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_SCALE_Body_x = SynchedEntityData.defineId(PritchanimalEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_SCALE_Body_y = SynchedEntityData.defineId(PritchanimalEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_SCALE_Body_z = SynchedEntityData.defineId(PritchanimalEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_SCALE_Head_x = SynchedEntityData.defineId(PritchanimalEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_SCALE_Head_y = SynchedEntityData.defineId(PritchanimalEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_SCALE_Head_z = SynchedEntityData.defineId(PritchanimalEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_POSITION_Head_y = SynchedEntityData.defineId(PritchanimalEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_POSITION_Head_z = SynchedEntityData.defineId(PritchanimalEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_POSITION_Arm_y = SynchedEntityData.defineId(PritchanimalEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_POSITION_Arm_z = SynchedEntityData.defineId(PritchanimalEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_nose_type = SynchedEntityData.defineId(PritchanimalEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_ears_type = SynchedEntityData.defineId(PritchanimalEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_tail_type = SynchedEntityData.defineId(PritchanimalEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_SCALE_Nose_x = SynchedEntityData.defineId(PritchanimalEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_SCALE_Nose_y = SynchedEntityData.defineId(PritchanimalEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_SCALE_Nose_z = SynchedEntityData.defineId(PritchanimalEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_SCALE_Snout_x = SynchedEntityData.defineId(PritchanimalEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_SCALE_Snout_z = SynchedEntityData.defineId(PritchanimalEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_SCALE_Ear_x = SynchedEntityData.defineId(PritchanimalEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_SCALE_Ear_y = SynchedEntityData.defineId(PritchanimalEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_SCALE_Ear_z = SynchedEntityData.defineId(PritchanimalEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_SCALE_Bunnyear_x = SynchedEntityData.defineId(PritchanimalEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_SCALE_Bunnyear_y = SynchedEntityData.defineId(PritchanimalEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_SCALE_Bunnyear_z = SynchedEntityData.defineId(PritchanimalEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_POSITION_Root_y = SynchedEntityData.defineId(PritchanimalEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_SCALE_Beak_x = SynchedEntityData.defineId(PritchanimalEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_SCALE_Beak_y = SynchedEntityData.defineId(PritchanimalEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_SCALE_Beak_z = SynchedEntityData.defineId(PritchanimalEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_SCALE_Tail_x = SynchedEntityData.defineId(PritchanimalEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_SCALE_Tail_y = SynchedEntityData.defineId(PritchanimalEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_SCALE_Tail_z = SynchedEntityData.defineId(PritchanimalEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_size = SynchedEntityData.defineId(PritchanimalEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_SCALE_Flopear_x = SynchedEntityData.defineId(PritchanimalEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_SCALE_Flopear_z = SynchedEntityData.defineId(PritchanimalEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_ROTATION_Flopear_z = SynchedEntityData.defineId(PritchanimalEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_POSITION_Ear_y = SynchedEntityData.defineId(PritchanimalEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_ROTATION_Snout_x = SynchedEntityData.defineId(PritchanimalEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_SCALE_Cowhorn_x = SynchedEntityData.defineId(PritchanimalEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_SCALE_Cowhorn_y = SynchedEntityData.defineId(PritchanimalEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_SCALE_Cowhorn_z = SynchedEntityData.defineId(PritchanimalEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_SCALE_Warmhorn_x = SynchedEntityData.defineId(PritchanimalEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_SCALE_Warmhorn_y = SynchedEntityData.defineId(PritchanimalEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_SCALE_Warmhorn_z = SynchedEntityData.defineId(PritchanimalEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_SCALE_Coldhorn_x = SynchedEntityData.defineId(PritchanimalEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_SCALE_Coldhorn_y = SynchedEntityData.defineId(PritchanimalEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_SCALE_Coldhorn_z = SynchedEntityData.defineId(PritchanimalEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_SCALE_Dolphintail_x = SynchedEntityData.defineId(PritchanimalEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_SCALE_Dolphintail_y = SynchedEntityData.defineId(PritchanimalEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_SCALE_Dolphintail_z = SynchedEntityData.defineId(PritchanimalEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_horn_type = SynchedEntityData.defineId(PritchanimalEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_SCALE_Fishtail_y = SynchedEntityData.defineId(PritchanimalEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_SCALE_Fishtail_z = SynchedEntityData.defineId(PritchanimalEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<String> DATA_skin = SynchedEntityData.defineId(PritchanimalEntity.class, EntityDataSerializers.STRING);
	public static final EntityDataAccessor<Integer> DATA_POSITION_HeadOffset_y = SynchedEntityData.defineId(PritchanimalEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_SCALE_Neck_x = SynchedEntityData.defineId(PritchanimalEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_SCALE_Neck_y = SynchedEntityData.defineId(PritchanimalEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_SCALE_Neck_z = SynchedEntityData.defineId(PritchanimalEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_ROTATION_Neck_x = SynchedEntityData.defineId(PritchanimalEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_POSITION_HeadOffset_z = SynchedEntityData.defineId(PritchanimalEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Boolean> DATA_isInitialized = SynchedEntityData.defineId(PritchanimalEntity.class, EntityDataSerializers.BOOLEAN);
	public static final EntityDataAccessor<Integer> DATA_fedTimer = SynchedEntityData.defineId(PritchanimalEntity.class, EntityDataSerializers.INT);
	public final AnimationState animationState0 = new AnimationState();

	public PritchanimalEntity(EntityType<PritchanimalEntity> type, Level world) {
		super(type, world);
		xpReward = 0;
		setNoAi(false);
	}

	@Override
	protected void defineSynchedData(SynchedEntityData.Builder builder) {
		super.defineSynchedData(builder);
		builder.define(DATA_armslegstest, true);
		builder.define(DATA_SCALE_Arm_x, 100);
		builder.define(DATA_SCALE_Arm_y, 100);
		builder.define(DATA_SCALE_Arm_z, 100);
		builder.define(DATA_SCALE_Leg_x, 100);
		builder.define(DATA_SCALE_Leg_y, 100);
		builder.define(DATA_SCALE_Leg_z, 100);
		builder.define(DATA_ROTATION_Arm_x, 0);
		builder.define(DATA_ROTATION_Body_x, 0);
		builder.define(DATA_SCALE_Body_x, 100);
		builder.define(DATA_SCALE_Body_y, 100);
		builder.define(DATA_SCALE_Body_z, 100);
		builder.define(DATA_SCALE_Head_x, 100);
		builder.define(DATA_SCALE_Head_y, 100);
		builder.define(DATA_SCALE_Head_z, 100);
		builder.define(DATA_POSITION_Head_y, 0);
		builder.define(DATA_POSITION_Head_z, 0);
		builder.define(DATA_POSITION_Arm_y, 0);
		builder.define(DATA_POSITION_Arm_z, 0);
		builder.define(DATA_nose_type, 0);
		builder.define(DATA_ears_type, 0);
		builder.define(DATA_tail_type, 0);
		builder.define(DATA_SCALE_Nose_x, 0);
		builder.define(DATA_SCALE_Nose_y, 0);
		builder.define(DATA_SCALE_Nose_z, 0);
		builder.define(DATA_SCALE_Snout_x, 0);
		builder.define(DATA_SCALE_Snout_z, 0);
		builder.define(DATA_SCALE_Ear_x, 0);
		builder.define(DATA_SCALE_Ear_y, 0);
		builder.define(DATA_SCALE_Ear_z, 0);
		builder.define(DATA_SCALE_Bunnyear_x, 0);
		builder.define(DATA_SCALE_Bunnyear_y, 0);
		builder.define(DATA_SCALE_Bunnyear_z, 0);
		builder.define(DATA_POSITION_Root_y, 0);
		builder.define(DATA_SCALE_Beak_x, 0);
		builder.define(DATA_SCALE_Beak_y, 0);
		builder.define(DATA_SCALE_Beak_z, 0);
		builder.define(DATA_SCALE_Tail_x, 0);
		builder.define(DATA_SCALE_Tail_y, 0);
		builder.define(DATA_SCALE_Tail_z, 0);
		builder.define(DATA_size, 0);
		builder.define(DATA_SCALE_Flopear_x, 0);
		builder.define(DATA_SCALE_Flopear_z, 0);
		builder.define(DATA_ROTATION_Flopear_z, 0);
		builder.define(DATA_POSITION_Ear_y, 0);
		builder.define(DATA_ROTATION_Snout_x, 0);
		builder.define(DATA_SCALE_Cowhorn_x, 0);
		builder.define(DATA_SCALE_Cowhorn_y, 0);
		builder.define(DATA_SCALE_Cowhorn_z, 0);
		builder.define(DATA_SCALE_Warmhorn_x, 0);
		builder.define(DATA_SCALE_Warmhorn_y, 0);
		builder.define(DATA_SCALE_Warmhorn_z, 0);
		builder.define(DATA_SCALE_Coldhorn_x, 0);
		builder.define(DATA_SCALE_Coldhorn_y, 0);
		builder.define(DATA_SCALE_Coldhorn_z, 0);
		builder.define(DATA_SCALE_Dolphintail_x, 0);
		builder.define(DATA_SCALE_Dolphintail_y, 0);
		builder.define(DATA_SCALE_Dolphintail_z, 0);
		builder.define(DATA_horn_type, 0);
		builder.define(DATA_SCALE_Fishtail_y, 0);
		builder.define(DATA_SCALE_Fishtail_z, 0);
		builder.define(DATA_skin, "player");
		builder.define(DATA_POSITION_HeadOffset_y, 0);
		builder.define(DATA_SCALE_Neck_x, 0);
		builder.define(DATA_SCALE_Neck_y, 0);
		builder.define(DATA_SCALE_Neck_z, 0);
		builder.define(DATA_ROTATION_Neck_x, 0);
		builder.define(DATA_POSITION_HeadOffset_z, 0);
		builder.define(DATA_isInitialized, false);
		builder.define(DATA_fedTimer, -1);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.2, false) {
			@Override
			protected boolean canPerformAttack(LivingEntity entity) {
				return this.isTimeToAttack() && this.mob.distanceToSqr(entity) < (this.mob.getBbWidth() * this.mob.getBbWidth() + entity.getBbWidth()) && this.mob.getSensing().hasLineOfSight(entity);
			}
		});
		this.goalSelector.addGoal(2, new TemptGoal(this, 1.5, Ingredient.of(Items.WHEAT), false));
		this.goalSelector.addGoal(3, new RandomStrollGoal(this, 1));
		this.targetSelector.addGoal(4, new HurtByTargetGoal(this));
		this.goalSelector.addGoal(5, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(6, new FloatGoal(this));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.generic.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.generic.death"));
	}

	@Override
	public void addAdditionalSaveData(CompoundTag compound) {
		super.addAdditionalSaveData(compound);
		compound.putBoolean("Dataarmslegstest", this.entityData.get(DATA_armslegstest));
		compound.putInt("DataSCALE_Arm_x", this.entityData.get(DATA_SCALE_Arm_x));
		compound.putInt("DataSCALE_Arm_y", this.entityData.get(DATA_SCALE_Arm_y));
		compound.putInt("DataSCALE_Arm_z", this.entityData.get(DATA_SCALE_Arm_z));
		compound.putInt("DataSCALE_Leg_x", this.entityData.get(DATA_SCALE_Leg_x));
		compound.putInt("DataSCALE_Leg_y", this.entityData.get(DATA_SCALE_Leg_y));
		compound.putInt("DataSCALE_Leg_z", this.entityData.get(DATA_SCALE_Leg_z));
		compound.putInt("DataROTATION_Arm_x", this.entityData.get(DATA_ROTATION_Arm_x));
		compound.putInt("DataROTATION_Body_x", this.entityData.get(DATA_ROTATION_Body_x));
		compound.putInt("DataSCALE_Body_x", this.entityData.get(DATA_SCALE_Body_x));
		compound.putInt("DataSCALE_Body_y", this.entityData.get(DATA_SCALE_Body_y));
		compound.putInt("DataSCALE_Body_z", this.entityData.get(DATA_SCALE_Body_z));
		compound.putInt("DataSCALE_Head_x", this.entityData.get(DATA_SCALE_Head_x));
		compound.putInt("DataSCALE_Head_y", this.entityData.get(DATA_SCALE_Head_y));
		compound.putInt("DataSCALE_Head_z", this.entityData.get(DATA_SCALE_Head_z));
		compound.putInt("DataPOSITION_Head_y", this.entityData.get(DATA_POSITION_Head_y));
		compound.putInt("DataPOSITION_Head_z", this.entityData.get(DATA_POSITION_Head_z));
		compound.putInt("DataPOSITION_Arm_y", this.entityData.get(DATA_POSITION_Arm_y));
		compound.putInt("DataPOSITION_Arm_z", this.entityData.get(DATA_POSITION_Arm_z));
		compound.putInt("Datanose_type", this.entityData.get(DATA_nose_type));
		compound.putInt("Dataears_type", this.entityData.get(DATA_ears_type));
		compound.putInt("Datatail_type", this.entityData.get(DATA_tail_type));
		compound.putInt("DataSCALE_Nose_x", this.entityData.get(DATA_SCALE_Nose_x));
		compound.putInt("DataSCALE_Nose_y", this.entityData.get(DATA_SCALE_Nose_y));
		compound.putInt("DataSCALE_Nose_z", this.entityData.get(DATA_SCALE_Nose_z));
		compound.putInt("DataSCALE_Snout_x", this.entityData.get(DATA_SCALE_Snout_x));
		compound.putInt("DataSCALE_Snout_z", this.entityData.get(DATA_SCALE_Snout_z));
		compound.putInt("DataSCALE_Ear_x", this.entityData.get(DATA_SCALE_Ear_x));
		compound.putInt("DataSCALE_Ear_y", this.entityData.get(DATA_SCALE_Ear_y));
		compound.putInt("DataSCALE_Ear_z", this.entityData.get(DATA_SCALE_Ear_z));
		compound.putInt("DataSCALE_Bunnyear_x", this.entityData.get(DATA_SCALE_Bunnyear_x));
		compound.putInt("DataSCALE_Bunnyear_y", this.entityData.get(DATA_SCALE_Bunnyear_y));
		compound.putInt("DataSCALE_Bunnyear_z", this.entityData.get(DATA_SCALE_Bunnyear_z));
		compound.putInt("DataPOSITION_Root_y", this.entityData.get(DATA_POSITION_Root_y));
		compound.putInt("DataSCALE_Beak_x", this.entityData.get(DATA_SCALE_Beak_x));
		compound.putInt("DataSCALE_Beak_y", this.entityData.get(DATA_SCALE_Beak_y));
		compound.putInt("DataSCALE_Beak_z", this.entityData.get(DATA_SCALE_Beak_z));
		compound.putInt("DataSCALE_Tail_x", this.entityData.get(DATA_SCALE_Tail_x));
		compound.putInt("DataSCALE_Tail_y", this.entityData.get(DATA_SCALE_Tail_y));
		compound.putInt("DataSCALE_Tail_z", this.entityData.get(DATA_SCALE_Tail_z));
		compound.putInt("Datasize", this.entityData.get(DATA_size));
		compound.putInt("DataSCALE_Flopear_x", this.entityData.get(DATA_SCALE_Flopear_x));
		compound.putInt("DataSCALE_Flopear_z", this.entityData.get(DATA_SCALE_Flopear_z));
		compound.putInt("DataROTATION_Flopear_z", this.entityData.get(DATA_ROTATION_Flopear_z));
		compound.putInt("DataPOSITION_Ear_y", this.entityData.get(DATA_POSITION_Ear_y));
		compound.putInt("DataROTATION_Snout_x", this.entityData.get(DATA_ROTATION_Snout_x));
		compound.putInt("DataSCALE_Cowhorn_x", this.entityData.get(DATA_SCALE_Cowhorn_x));
		compound.putInt("DataSCALE_Cowhorn_y", this.entityData.get(DATA_SCALE_Cowhorn_y));
		compound.putInt("DataSCALE_Cowhorn_z", this.entityData.get(DATA_SCALE_Cowhorn_z));
		compound.putInt("DataSCALE_Warmhorn_x", this.entityData.get(DATA_SCALE_Warmhorn_x));
		compound.putInt("DataSCALE_Warmhorn_y", this.entityData.get(DATA_SCALE_Warmhorn_y));
		compound.putInt("DataSCALE_Warmhorn_z", this.entityData.get(DATA_SCALE_Warmhorn_z));
		compound.putInt("DataSCALE_Coldhorn_x", this.entityData.get(DATA_SCALE_Coldhorn_x));
		compound.putInt("DataSCALE_Coldhorn_y", this.entityData.get(DATA_SCALE_Coldhorn_y));
		compound.putInt("DataSCALE_Coldhorn_z", this.entityData.get(DATA_SCALE_Coldhorn_z));
		compound.putInt("DataSCALE_Dolphintail_x", this.entityData.get(DATA_SCALE_Dolphintail_x));
		compound.putInt("DataSCALE_Dolphintail_y", this.entityData.get(DATA_SCALE_Dolphintail_y));
		compound.putInt("DataSCALE_Dolphintail_z", this.entityData.get(DATA_SCALE_Dolphintail_z));
		compound.putInt("Datahorn_type", this.entityData.get(DATA_horn_type));
		compound.putInt("DataSCALE_Fishtail_y", this.entityData.get(DATA_SCALE_Fishtail_y));
		compound.putInt("DataSCALE_Fishtail_z", this.entityData.get(DATA_SCALE_Fishtail_z));
		compound.putString("Dataskin", this.entityData.get(DATA_skin));
		compound.putInt("DataPOSITION_HeadOffset_y", this.entityData.get(DATA_POSITION_HeadOffset_y));
		compound.putInt("DataSCALE_Neck_x", this.entityData.get(DATA_SCALE_Neck_x));
		compound.putInt("DataSCALE_Neck_y", this.entityData.get(DATA_SCALE_Neck_y));
		compound.putInt("DataSCALE_Neck_z", this.entityData.get(DATA_SCALE_Neck_z));
		compound.putInt("DataROTATION_Neck_x", this.entityData.get(DATA_ROTATION_Neck_x));
		compound.putInt("DataPOSITION_HeadOffset_z", this.entityData.get(DATA_POSITION_HeadOffset_z));
		compound.putBoolean("DataisInitialized", this.entityData.get(DATA_isInitialized));
		compound.putInt("DatafedTimer", this.entityData.get(DATA_fedTimer));
	}

	@Override
	public void readAdditionalSaveData(CompoundTag compound) {
		super.readAdditionalSaveData(compound);
		if (compound.contains("Dataarmslegstest"))
			this.entityData.set(DATA_armslegstest, compound.getBoolean("Dataarmslegstest"));
		if (compound.contains("DataSCALE_Arm_x"))
			this.entityData.set(DATA_SCALE_Arm_x, compound.getInt("DataSCALE_Arm_x"));
		if (compound.contains("DataSCALE_Arm_y"))
			this.entityData.set(DATA_SCALE_Arm_y, compound.getInt("DataSCALE_Arm_y"));
		if (compound.contains("DataSCALE_Arm_z"))
			this.entityData.set(DATA_SCALE_Arm_z, compound.getInt("DataSCALE_Arm_z"));
		if (compound.contains("DataSCALE_Leg_x"))
			this.entityData.set(DATA_SCALE_Leg_x, compound.getInt("DataSCALE_Leg_x"));
		if (compound.contains("DataSCALE_Leg_y"))
			this.entityData.set(DATA_SCALE_Leg_y, compound.getInt("DataSCALE_Leg_y"));
		if (compound.contains("DataSCALE_Leg_z"))
			this.entityData.set(DATA_SCALE_Leg_z, compound.getInt("DataSCALE_Leg_z"));
		if (compound.contains("DataROTATION_Arm_x"))
			this.entityData.set(DATA_ROTATION_Arm_x, compound.getInt("DataROTATION_Arm_x"));
		if (compound.contains("DataROTATION_Body_x"))
			this.entityData.set(DATA_ROTATION_Body_x, compound.getInt("DataROTATION_Body_x"));
		if (compound.contains("DataSCALE_Body_x"))
			this.entityData.set(DATA_SCALE_Body_x, compound.getInt("DataSCALE_Body_x"));
		if (compound.contains("DataSCALE_Body_y"))
			this.entityData.set(DATA_SCALE_Body_y, compound.getInt("DataSCALE_Body_y"));
		if (compound.contains("DataSCALE_Body_z"))
			this.entityData.set(DATA_SCALE_Body_z, compound.getInt("DataSCALE_Body_z"));
		if (compound.contains("DataSCALE_Head_x"))
			this.entityData.set(DATA_SCALE_Head_x, compound.getInt("DataSCALE_Head_x"));
		if (compound.contains("DataSCALE_Head_y"))
			this.entityData.set(DATA_SCALE_Head_y, compound.getInt("DataSCALE_Head_y"));
		if (compound.contains("DataSCALE_Head_z"))
			this.entityData.set(DATA_SCALE_Head_z, compound.getInt("DataSCALE_Head_z"));
		if (compound.contains("DataPOSITION_Head_y"))
			this.entityData.set(DATA_POSITION_Head_y, compound.getInt("DataPOSITION_Head_y"));
		if (compound.contains("DataPOSITION_Head_z"))
			this.entityData.set(DATA_POSITION_Head_z, compound.getInt("DataPOSITION_Head_z"));
		if (compound.contains("DataPOSITION_Arm_y"))
			this.entityData.set(DATA_POSITION_Arm_y, compound.getInt("DataPOSITION_Arm_y"));
		if (compound.contains("DataPOSITION_Arm_z"))
			this.entityData.set(DATA_POSITION_Arm_z, compound.getInt("DataPOSITION_Arm_z"));
		if (compound.contains("Datanose_type"))
			this.entityData.set(DATA_nose_type, compound.getInt("Datanose_type"));
		if (compound.contains("Dataears_type"))
			this.entityData.set(DATA_ears_type, compound.getInt("Dataears_type"));
		if (compound.contains("Datatail_type"))
			this.entityData.set(DATA_tail_type, compound.getInt("Datatail_type"));
		if (compound.contains("DataSCALE_Nose_x"))
			this.entityData.set(DATA_SCALE_Nose_x, compound.getInt("DataSCALE_Nose_x"));
		if (compound.contains("DataSCALE_Nose_y"))
			this.entityData.set(DATA_SCALE_Nose_y, compound.getInt("DataSCALE_Nose_y"));
		if (compound.contains("DataSCALE_Nose_z"))
			this.entityData.set(DATA_SCALE_Nose_z, compound.getInt("DataSCALE_Nose_z"));
		if (compound.contains("DataSCALE_Snout_x"))
			this.entityData.set(DATA_SCALE_Snout_x, compound.getInt("DataSCALE_Snout_x"));
		if (compound.contains("DataSCALE_Snout_z"))
			this.entityData.set(DATA_SCALE_Snout_z, compound.getInt("DataSCALE_Snout_z"));
		if (compound.contains("DataSCALE_Ear_x"))
			this.entityData.set(DATA_SCALE_Ear_x, compound.getInt("DataSCALE_Ear_x"));
		if (compound.contains("DataSCALE_Ear_y"))
			this.entityData.set(DATA_SCALE_Ear_y, compound.getInt("DataSCALE_Ear_y"));
		if (compound.contains("DataSCALE_Ear_z"))
			this.entityData.set(DATA_SCALE_Ear_z, compound.getInt("DataSCALE_Ear_z"));
		if (compound.contains("DataSCALE_Bunnyear_x"))
			this.entityData.set(DATA_SCALE_Bunnyear_x, compound.getInt("DataSCALE_Bunnyear_x"));
		if (compound.contains("DataSCALE_Bunnyear_y"))
			this.entityData.set(DATA_SCALE_Bunnyear_y, compound.getInt("DataSCALE_Bunnyear_y"));
		if (compound.contains("DataSCALE_Bunnyear_z"))
			this.entityData.set(DATA_SCALE_Bunnyear_z, compound.getInt("DataSCALE_Bunnyear_z"));
		if (compound.contains("DataPOSITION_Root_y"))
			this.entityData.set(DATA_POSITION_Root_y, compound.getInt("DataPOSITION_Root_y"));
		if (compound.contains("DataSCALE_Beak_x"))
			this.entityData.set(DATA_SCALE_Beak_x, compound.getInt("DataSCALE_Beak_x"));
		if (compound.contains("DataSCALE_Beak_y"))
			this.entityData.set(DATA_SCALE_Beak_y, compound.getInt("DataSCALE_Beak_y"));
		if (compound.contains("DataSCALE_Beak_z"))
			this.entityData.set(DATA_SCALE_Beak_z, compound.getInt("DataSCALE_Beak_z"));
		if (compound.contains("DataSCALE_Tail_x"))
			this.entityData.set(DATA_SCALE_Tail_x, compound.getInt("DataSCALE_Tail_x"));
		if (compound.contains("DataSCALE_Tail_y"))
			this.entityData.set(DATA_SCALE_Tail_y, compound.getInt("DataSCALE_Tail_y"));
		if (compound.contains("DataSCALE_Tail_z"))
			this.entityData.set(DATA_SCALE_Tail_z, compound.getInt("DataSCALE_Tail_z"));
		if (compound.contains("Datasize"))
			this.entityData.set(DATA_size, compound.getInt("Datasize"));
		if (compound.contains("DataSCALE_Flopear_x"))
			this.entityData.set(DATA_SCALE_Flopear_x, compound.getInt("DataSCALE_Flopear_x"));
		if (compound.contains("DataSCALE_Flopear_z"))
			this.entityData.set(DATA_SCALE_Flopear_z, compound.getInt("DataSCALE_Flopear_z"));
		if (compound.contains("DataROTATION_Flopear_z"))
			this.entityData.set(DATA_ROTATION_Flopear_z, compound.getInt("DataROTATION_Flopear_z"));
		if (compound.contains("DataPOSITION_Ear_y"))
			this.entityData.set(DATA_POSITION_Ear_y, compound.getInt("DataPOSITION_Ear_y"));
		if (compound.contains("DataROTATION_Snout_x"))
			this.entityData.set(DATA_ROTATION_Snout_x, compound.getInt("DataROTATION_Snout_x"));
		if (compound.contains("DataSCALE_Cowhorn_x"))
			this.entityData.set(DATA_SCALE_Cowhorn_x, compound.getInt("DataSCALE_Cowhorn_x"));
		if (compound.contains("DataSCALE_Cowhorn_y"))
			this.entityData.set(DATA_SCALE_Cowhorn_y, compound.getInt("DataSCALE_Cowhorn_y"));
		if (compound.contains("DataSCALE_Cowhorn_z"))
			this.entityData.set(DATA_SCALE_Cowhorn_z, compound.getInt("DataSCALE_Cowhorn_z"));
		if (compound.contains("DataSCALE_Warmhorn_x"))
			this.entityData.set(DATA_SCALE_Warmhorn_x, compound.getInt("DataSCALE_Warmhorn_x"));
		if (compound.contains("DataSCALE_Warmhorn_y"))
			this.entityData.set(DATA_SCALE_Warmhorn_y, compound.getInt("DataSCALE_Warmhorn_y"));
		if (compound.contains("DataSCALE_Warmhorn_z"))
			this.entityData.set(DATA_SCALE_Warmhorn_z, compound.getInt("DataSCALE_Warmhorn_z"));
		if (compound.contains("DataSCALE_Coldhorn_x"))
			this.entityData.set(DATA_SCALE_Coldhorn_x, compound.getInt("DataSCALE_Coldhorn_x"));
		if (compound.contains("DataSCALE_Coldhorn_y"))
			this.entityData.set(DATA_SCALE_Coldhorn_y, compound.getInt("DataSCALE_Coldhorn_y"));
		if (compound.contains("DataSCALE_Coldhorn_z"))
			this.entityData.set(DATA_SCALE_Coldhorn_z, compound.getInt("DataSCALE_Coldhorn_z"));
		if (compound.contains("DataSCALE_Dolphintail_x"))
			this.entityData.set(DATA_SCALE_Dolphintail_x, compound.getInt("DataSCALE_Dolphintail_x"));
		if (compound.contains("DataSCALE_Dolphintail_y"))
			this.entityData.set(DATA_SCALE_Dolphintail_y, compound.getInt("DataSCALE_Dolphintail_y"));
		if (compound.contains("DataSCALE_Dolphintail_z"))
			this.entityData.set(DATA_SCALE_Dolphintail_z, compound.getInt("DataSCALE_Dolphintail_z"));
		if (compound.contains("Datahorn_type"))
			this.entityData.set(DATA_horn_type, compound.getInt("Datahorn_type"));
		if (compound.contains("DataSCALE_Fishtail_y"))
			this.entityData.set(DATA_SCALE_Fishtail_y, compound.getInt("DataSCALE_Fishtail_y"));
		if (compound.contains("DataSCALE_Fishtail_z"))
			this.entityData.set(DATA_SCALE_Fishtail_z, compound.getInt("DataSCALE_Fishtail_z"));
		if (compound.contains("Dataskin"))
			this.entityData.set(DATA_skin, compound.getString("Dataskin"));
		if (compound.contains("DataPOSITION_HeadOffset_y"))
			this.entityData.set(DATA_POSITION_HeadOffset_y, compound.getInt("DataPOSITION_HeadOffset_y"));
		if (compound.contains("DataSCALE_Neck_x"))
			this.entityData.set(DATA_SCALE_Neck_x, compound.getInt("DataSCALE_Neck_x"));
		if (compound.contains("DataSCALE_Neck_y"))
			this.entityData.set(DATA_SCALE_Neck_y, compound.getInt("DataSCALE_Neck_y"));
		if (compound.contains("DataSCALE_Neck_z"))
			this.entityData.set(DATA_SCALE_Neck_z, compound.getInt("DataSCALE_Neck_z"));
		if (compound.contains("DataROTATION_Neck_x"))
			this.entityData.set(DATA_ROTATION_Neck_x, compound.getInt("DataROTATION_Neck_x"));
		if (compound.contains("DataPOSITION_HeadOffset_z"))
			this.entityData.set(DATA_POSITION_HeadOffset_z, compound.getInt("DataPOSITION_HeadOffset_z"));
		if (compound.contains("DataisInitialized"))
			this.entityData.set(DATA_isInitialized, compound.getBoolean("DataisInitialized"));
		if (compound.contains("DatafedTimer"))
			this.entityData.set(DATA_fedTimer, compound.getInt("DatafedTimer"));
	}

	@Override
	public void tick() {
		super.tick();
		if (this.level().isClientSide()) {
			this.animationState0.animateWhen(true, this.tickCount);
		}
	}

	@Override
	public void baseTick() {
		super.baseTick();
		PritchanimalOnInitialEntitySpawnProcedure.execute(this.level(), this.getX(), this.getY(), this.getZ(), this);
	}

	@Override
	public AgeableMob getBreedOffspring(ServerLevel serverWorld, AgeableMob ageable) {
		PritchanimalEntity retval = PritchvolutionModEntities.PRITCHANIMAL.get().create(serverWorld);
		retval.finalizeSpawn(serverWorld, serverWorld.getCurrentDifficultyAt(retval.blockPosition()), MobSpawnType.BREEDING, null);
		return retval;
	}

	@Override
	public boolean isFood(ItemStack stack) {
		return Ingredient.of(new ItemStack(PritchvolutionModItems.PRITCHANIMAL_SPAWN_EGG.get())).test(stack);
	}

	public static void init(RegisterSpawnPlacementsEvent event) {
		event.register(PritchvolutionModEntities.PRITCHANIMAL.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
				(entityType, world, reason, pos, random) -> (world.getDifficulty() != Difficulty.PEACEFUL && Monster.isDarkEnoughToSpawn(world, pos, random) && Mob.checkMobSpawnRules(entityType, world, reason, pos, random)),
				RegisterSpawnPlacementsEvent.Operation.REPLACE);
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.25);
		builder = builder.add(Attributes.MAX_HEALTH, 10);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 3);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);
		builder = builder.add(Attributes.STEP_HEIGHT, 0.6);
		return builder;
	}
}