package com.ac.main;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

public abstract interface IACEntity
{
  public abstract void riderIsDisconnecting(boolean paramBoolean);
  
  public abstract void selectType();
  
  public abstract String getName();
  
  public abstract void setName(String paramString);
  
  public abstract boolean getIsTamed();
  
  public abstract void setTamed(boolean paramBoolean);
  
  public abstract boolean getIsAdult();
  
  public abstract void setAdult(boolean paramBoolean);
  
  public abstract boolean checkSpawningBiome();
  
  public abstract boolean getCanSpawnHere();
  
  public abstract void performAnimation(int paramInt);
  
  public abstract boolean renderName();
  
  public abstract int nameYOffset();
  
  public abstract void makeEntityJump();
  
  public abstract void makeEntityDive();
  
  public abstract float getSizeFactor();
  
  public abstract float getAdjustedYOffset();
  
  public abstract String getOwnerName();
  
  public abstract void setOwner(String paramString);
  
  public abstract void setArmorType(byte paramByte);
  
  public abstract int getType();
  
  public abstract void setType(int paramInt);
  
  public abstract void dismountEntity();
  
  public abstract float rollRotationOffset();
  
  public abstract float pitchRotationOffset();
  
  public abstract void setEdad(int paramInt);
  
  public abstract int getEdad();
  
  public abstract float yawRotationOffset();
  
  public abstract float getAdjustedZOffset();
  
  public abstract float getAdjustedXOffset();
  
  public abstract ResourceLocation getTexture();
  
  public abstract boolean canAttackTarget(EntityLivingBase paramEntityLivingBase);
  
  public abstract boolean getIsSitting();
  
  public abstract boolean isNotScared();
  
  public abstract boolean isMovementCeased();
  
  public abstract boolean shouldAttackPlayers();
  
  public abstract double getDivingDepth();
  
  public abstract boolean isDiving();
  
  public abstract void forceEntityJump();
  
  public abstract int maxFlyingHeight();
  
  public abstract int minFlyingHeight();
  
  public abstract boolean isFlyer();
  
  public abstract boolean getIsFlying();
}
