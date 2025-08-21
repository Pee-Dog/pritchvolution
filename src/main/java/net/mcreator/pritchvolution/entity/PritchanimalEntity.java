package net.mcreator.pritchvolution.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.BreedGoal;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.AnimationState;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.Difficulty;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.Packet;
import net.minecraft.nbt.CompoundTag;

import net.mcreator.pritchvolution.procedures.PritchanimalOnInitialEntitySpawnProcedure;
import net.mcreator.pritchvolution.procedures.PritchanimalOnEntityTickUpdateProcedure;
import net.mcreator.pritchvolution.init.PritchvolutionModEntities;

import javax.annotation.Nullable;

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
	public final AnimationState animationState0 = new AnimationState();

	public PritchanimalEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(PritchvolutionModEntities.PRITCHANIMAL.get(), world);
	}

	public PritchanimalEntity(EntityType<PritchanimalEntity> type, Level world) {
		super(type, world);
		setMaxUpStep(0.6f);
		xpReward = 0;
		setNoAi(false);
	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void defineSynchedData() {
		super.defineSynchedData();
		this.entityData.define(DATA_armslegstest, true);
		this.entityData.define(DATA_SCALE_Arm_x, 100);
		this.entityData.define(DATA_SCALE_Arm_y, 100);
		this.entityData.define(DATA_SCALE_Arm_z, 100);
		this.entityData.define(DATA_SCALE_Leg_x, 100);
		this.entityData.define(DATA_SCALE_Leg_y, 100);
		this.entityData.define(DATA_SCALE_Leg_z, 100);
		this.entityData.define(DATA_ROTATION_Arm_x, 0);
		this.entityData.define(DATA_ROTATION_Body_x, 0);
		this.entityData.define(DATA_SCALE_Body_x, 100);
		this.entityData.define(DATA_SCALE_Body_y, 100);
		this.entityData.define(DATA_SCALE_Body_z, 100);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.2, false) {
			@Override
			protected double getAttackReachSqr(LivingEntity entity) {
				return this.mob.getBbWidth() * this.mob.getBbWidth() + entity.getBbWidth();
			}
		});
		this.goalSelector.addGoal(2, new BreedGoal(this, 1));
		this.goalSelector.addGoal(3, new RandomStrollGoal(this, 1));
		this.targetSelector.addGoal(4, new HurtByTargetGoal(this));
		this.goalSelector.addGoal(5, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(6, new FloatGoal(this));
	}

	@Override
	public MobType getMobType() {
		return MobType.UNDEFINED;
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("entity.generic.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("entity.generic.death"));
	}

	@Override
	public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
		SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata, tag);
		PritchanimalOnInitialEntitySpawnProcedure.execute(this);
		return retval;
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
	}

	@Override
	public void tick() {
		super.tick();
		if (this.level().isClientSide()) {
			this.animationState0.animateWhen(PritchanimalOnEntityTickUpdateProcedure.execute(this), this.tickCount);
		}
	}

	@Override
	public void baseTick() {
		super.baseTick();
		PritchanimalOnEntityTickUpdateProcedure.execute(this);
	}

	@Override
	public AgeableMob getBreedOffspring(ServerLevel serverWorld, AgeableMob ageable) {
		PritchanimalEntity retval = PritchvolutionModEntities.PRITCHANIMAL.get().create(serverWorld);
		retval.finalizeSpawn(serverWorld, serverWorld.getCurrentDifficultyAt(retval.blockPosition()), MobSpawnType.BREEDING, null, null);
		return retval;
	}

	@Override
	public boolean isFood(ItemStack stack) {
		return Ingredient.of(new ItemStack(Items.WHEAT)).test(stack);
	}

	public static void init() {
		SpawnPlacements.register(PritchvolutionModEntities.PRITCHANIMAL.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
				(entityType, world, reason, pos, random) -> (world.getDifficulty() != Difficulty.PEACEFUL && Monster.isDarkEnoughToSpawn(world, pos, random) && Mob.checkMobSpawnRules(entityType, world, reason, pos, random)));
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.25);
		builder = builder.add(Attributes.MAX_HEALTH, 10);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 3);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);
		return builder;
	}
}