package com.africacraft.mob;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * Wildebeest - Undefined
 * Created using Tabula 5.1.0
 */
public class ModelBlueWildebeest extends ModelBase {
    public ModelRenderer body;
    public ModelRenderer chest;
    public ModelRenderer leg3;
    public ModelRenderer leg3_1;
    public ModelRenderer tail;
    public ModelRenderer leg1;
    public ModelRenderer leg1_1;
    public ModelRenderer neck;
    public ModelRenderer thigh1;
    public ModelRenderer hoof1;
    public ModelRenderer thigh1_1;
    public ModelRenderer hoof1_1;
    public ModelRenderer mane;
    public ModelRenderer head;
    public ModelRenderer nose;
    public ModelRenderer ear1;
    public ModelRenderer ear2;
    public ModelRenderer horn11;
    public ModelRenderer horn21;
    public ModelRenderer beard;
    public ModelRenderer horn12;
    public ModelRenderer horn22;
    public ModelRenderer thigh3;
    public ModelRenderer leg3_2;
    public ModelRenderer hoof3;
    public ModelRenderer thigh3_1;
    public ModelRenderer leg3_3;
    public ModelRenderer hoof3_1;
    public ModelRenderer tail_1;

    public ModelBlueWildebeest() {
        this.textureWidth = 50;
        this.textureHeight = 100;
        this.thigh1_1 = new ModelRenderer(this, 0, 0);
        this.thigh1_1.setRotationPoint(1.1F, 5.5F, 3.2F);
        this.thigh1_1.addBox(-0.9F, 0.0F, -1.6F, 2, 8, 2, 0.0F);
        this.setRotateAngle(thigh1_1, 0.0F, 0.0F, 0.00715584993317675F);
        this.mane = new ModelRenderer(this, 0, 65);
        this.mane.setRotationPoint(-0.7F, -0.5F, 1.4F);
        this.mane.addBox(0.0F, 0.0F, 0.0F, 1, 9, 3, 0.0F);
        this.setRotateAngle(mane, 1.5997687923780024F, 0.0F, 0.0F);
        this.leg3_1 = new ModelRenderer(this, 0, 0);
        this.leg3_1.setRotationPoint(-4.1F, -2.2F, 8.1F);
        this.leg3_1.addBox(0.0F, 0.0F, 0.0F, 2, 7, 3, 0.0F);
        this.hoof1 = new ModelRenderer(this, 0, 65);
        this.hoof1.setRotationPoint(0.6F, 8.2F, 0.0F);
        this.hoof1.addBox(-2.0F, -0.6F, -2.0F, 3, 2, 3, 0.0F);
        this.horn21 = new ModelRenderer(this, 0, 65);
        this.horn21.setRotationPoint(-5.3F, -3.8F, 4.2F);
        this.horn21.addBox(0.0F, 0.0F, 0.0F, 1, 4, 1, 0.0F);
        this.setRotateAngle(horn21, 3.141592653589793F, 0.045553093477052F, 2.0032889154390916F);
        this.leg1_1 = new ModelRenderer(this, 0, 0);
        this.leg1_1.setRotationPoint(1.8F, -2.9F, 1.3F);
        this.leg1_1.addBox(-0.1F, 0.0F, 0.7F, 3, 8, 3, 0.0F);
        this.setRotateAngle(leg1_1, -0.045553093477052F, 0.0F, 0.0F);
        this.hoof3_1 = new ModelRenderer(this, 0, 65);
        this.hoof3_1.setRotationPoint(1.6F, 3.9F, 1.4F);
        this.hoof3_1.addBox(-2.0F, -0.6F, -2.0F, 3, 2, 3, 0.0F);
        this.hoof3 = new ModelRenderer(this, 0, 65);
        this.hoof3.setRotationPoint(1.6F, 3.9F, 1.4F);
        this.hoof3.addBox(-2.0F, -0.6F, -2.0F, 3, 2, 3, 0.0F);
        this.thigh3_1 = new ModelRenderer(this, 0, 0);
        this.thigh3_1.setRotationPoint(0.8F, 5.6F, 1.4F);
        this.thigh3_1.addBox(-0.9F, 0.0F, -1.6F, 2, 4, 3, 0.0F);
        this.setRotateAngle(thigh3_1, 0.18203784098300857F, 0.0F, 0.00715584993317675F);
        this.hoof1_1 = new ModelRenderer(this, 0, 65);
        this.hoof1_1.setRotationPoint(0.6F, 8.2F, 0.0F);
        this.hoof1_1.addBox(-2.0F, -0.6F, -2.0F, 3, 2, 3, 0.0F);
        this.body = new ModelRenderer(this, 0, 0);
        this.body.setRotationPoint(0.0F, 5.5F, -3.3F);
        this.body.addBox(-3.5F, -4.6F, 0.0F, 7, 9, 13, 0.0F);
        this.setRotateAngle(body, 0.045553093477052F, 0.0F, 0.0F);
        this.neck = new ModelRenderer(this, 0, 25);
        this.neck.setRotationPoint(0.1F, -2.2F, 2.8F);
        this.neck.addBox(-2.4F, -2.3F, -1.8F, 5, 7, 10, 0.0F);
        this.setRotateAngle(neck, -0.045553093477052F, 0.0F, 0.0F);
        this.ear2 = new ModelRenderer(this, 0, 0);
        this.ear2.setRotationPoint(-3.7F, -3.3F, 0.6F);
        this.ear2.addBox(0.0F, 0.0F, 0.0F, 1, 3, 2, 0.0F);
        this.setRotateAngle(ear2, 0.18203784098300857F, 0.0F, -0.4553564018453205F);
        this.leg1 = new ModelRenderer(this, 0, 0);
        this.leg1.setRotationPoint(-2.9F, -2.9F, 1.6F);
        this.leg1.addBox(-1.1F, 0.0F, -1.4F, 3, 8, 5, 0.0F);
        this.ear1 = new ModelRenderer(this, 0, 0);
        this.ear1.setRotationPoint(2.9F, -4.0F, 1.1F);
        this.ear1.addBox(0.0F, 0.0F, 0.0F, 1, 3, 2, 0.0F);
        this.setRotateAngle(ear1, 0.0F, 0.0F, 0.40980330836826856F);
        this.head = new ModelRenderer(this, 0, 49);
        this.head.setRotationPoint(0.1F, -0.3F, 7.2F);
        this.head.addBox(-3.1F, -2.4F, 0.0F, 6, 8, 5, 0.0F);
        this.setRotateAngle(head, 0.045553093477052F, 0.045553093477052F, 0.0F);
        this.horn11 = new ModelRenderer(this, 0, 65);
        this.horn11.setRotationPoint(4.8F, -3.3F, 2.8F);
        this.horn11.addBox(0.0F, 0.0F, 0.0F, 1, 4, 1, 0.0F);
        this.setRotateAngle(horn11, 0.0F, 0.0F, 1.2747884856566583F);
        this.horn22 = new ModelRenderer(this, 0, 65);
        this.horn22.setRotationPoint(0.6F, 0.0F, 0.0F);
        this.horn22.addBox(0.0F, 0.0F, 0.0F, 1, 4, 1, 0.0F);
        this.setRotateAngle(horn22, 0.0F, 0.0F, 1.9123572614101867F);
        this.tail_1 = new ModelRenderer(this, 0, 65);
        this.tail_1.setRotationPoint(0.5F, 4.6F, 1.4F);
        this.tail_1.addBox(-1.5F, 0.0F, -1.8F, 2, 8, 1, 0.0F);
        this.setRotateAngle(tail_1, -0.6373942428283291F, 0.0F, 0.0F);
        this.chest = new ModelRenderer(this, 0, 0);
        this.chest.setRotationPoint(0.3F, 0.0F, 1.5F);
        this.chest.addBox(-3.8F, -4.6F, -3.3F, 8, 9, 10, 0.0F);
        this.setRotateAngle(chest, 0.045553093477052F, 3.141592653589793F, 0.0F);
        this.leg3 = new ModelRenderer(this, 0, 0);
        this.leg3.setRotationPoint(1.3F, -2.2F, 8.1F);
        this.leg3.addBox(1.0F, 0.0F, 0.0F, 2, 7, 3, 0.0F);
        this.horn12 = new ModelRenderer(this, 0, 65);
        this.horn12.setRotationPoint(0.6F, 0.0F, 0.0F);
        this.horn12.addBox(0.0F, 0.0F, 0.0F, 1, 4, 1, 0.0F);
        this.setRotateAngle(horn12, 0.0F, 0.0F, 1.9123572614101867F);
        this.thigh3 = new ModelRenderer(this, 0, 0);
        this.thigh3.setRotationPoint(1.8F, 5.6F, 1.3F);
        this.thigh3.addBox(-0.9F, 0.0F, -1.6F, 2, 4, 3, 0.0F);
        this.setRotateAngle(thigh3, 0.18203784098300857F, 0.0F, 0.00715584993317675F);
        this.leg3_2 = new ModelRenderer(this, 0, 0);
        this.leg3_2.setRotationPoint(-0.9F, 4.0F, -1.1F);
        this.leg3_2.addBox(0.0F, -1.1F, -0.2F, 2, 6, 2, 0.0F);
        this.setRotateAngle(leg3_2, -0.18203784098300857F, 0.0F, 0.0F);
        this.tail = new ModelRenderer(this, 0, 0);
        this.tail.setRotationPoint(0.0F, -3.3F, 11.5F);
        this.tail.addBox(-0.7F, 0.2F, -0.4F, 1, 4, 1, 0.0F);
        this.setRotateAngle(tail, 0.8651597102135892F, 0.0F, 0.0F);
        this.leg3_3 = new ModelRenderer(this, 0, 0);
        this.leg3_3.setRotationPoint(-0.9F, 4.0F, -1.0F);
        this.leg3_3.addBox(0.0F, -1.1F, -0.2F, 2, 6, 2, 0.0F);
        this.setRotateAngle(leg3_3, -0.22759093446006054F, 0.0F, 0.0F);
        this.thigh1 = new ModelRenderer(this, 0, 0);
        this.thigh1.setRotationPoint(0.7F, 5.6F, 1.9F);
        this.thigh1.addBox(-0.9F, 0.0F, -1.6F, 2, 8, 2, 0.0F);
        this.setRotateAngle(thigh1, 0.0F, 0.0F, 0.00715584993317675F);
        this.beard = new ModelRenderer(this, 0, 65);
        this.beard.setRotationPoint(-0.3F, 7.0F, -3.9F);
        this.beard.addBox(0.0F, 0.0F, 0.0F, 1, 6, 3, 0.0F);
        this.setRotateAngle(beard, 1.593485607070823F, 0.0F, 0.0F);
        this.nose = new ModelRenderer(this, 0, 90);
        this.nose.setRotationPoint(-0.1F, 1.0F, 3.3F);
        this.nose.addBox(-1.6F, 0.0F, -1.2F, 3, 7, 3, 0.0F);
        this.setRotateAngle(nose, 0.136659280431156F, 0.0F, 0.0F);
        this.leg1_1.addChild(this.thigh1_1);
        this.neck.addChild(this.mane);
        this.body.addChild(this.leg3_1);
        this.thigh1.addChild(this.hoof1);
        this.head.addChild(this.horn21);
        this.chest.addChild(this.leg1_1);
        this.leg3_3.addChild(this.hoof3_1);
        this.leg3_2.addChild(this.hoof3);
        this.leg3_1.addChild(this.thigh3_1);
        this.thigh1_1.addChild(this.hoof1_1);
        this.chest.addChild(this.neck);
        this.head.addChild(this.ear2);
        this.chest.addChild(this.leg1);
        this.head.addChild(this.ear1);
        this.neck.addChild(this.head);
        this.head.addChild(this.horn11);
        this.horn21.addChild(this.horn22);
        this.tail.addChild(this.tail_1);
        this.body.addChild(this.chest);
        this.body.addChild(this.leg3);
        this.horn11.addChild(this.horn12);
        this.leg3.addChild(this.thigh3);
        this.thigh3.addChild(this.leg3_2);
        this.body.addChild(this.tail);
        this.thigh3_1.addChild(this.leg3_3);
        this.leg1.addChild(this.thigh1);
        this.head.addChild(this.beard);
        this.head.addChild(this.nose);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        GlStateManager.pushMatrix();
  	  setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        GlStateManager.translate(this.body.offsetX, this.body.offsetY, this.body.offsetZ);
        GlStateManager.translate(this.body.rotationPointX * f5, this.body.rotationPointY * f5, this.body.rotationPointZ * f5);
        GlStateManager.scale(1.2D, 1.5D, 1.3D);
        GlStateManager.translate(-this.body.offsetX, -this.body.offsetY, -this.body.offsetZ);
        GlStateManager.translate(-this.body.rotationPointX * f5, -this.body.rotationPointY * f5, -this.body.rotationPointZ * f5);
        this.body.render(f5);
        GlStateManager.popMatrix();
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }


  

    public void setRotationAngles(float p_78087_1_, float p_78087_2_, float p_78087_3_, float p_78087_4_, float p_78087_5_, float p_78087_6_, Entity p_78087_7_)
    {
        float f6 = (180F / (float)Math.PI);

        this.leg1.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F) * 1.4F * p_78087_2_;
        this.leg1_1.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F + (float)Math.PI) * 1.4F * p_78087_2_;
        this.leg3.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F) * 1.4F * p_78087_2_;
        this.leg3_3.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F + (float)Math.PI) * 1.4F * p_78087_2_;
    }
    }