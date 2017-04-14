package com.africacraft.mob;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * Ratel - Undefined
 * Created using Tabula 5.1.0
 */
public class ModelRatel extends ModelBase {
    public ModelRenderer shape1;
    public ModelRenderer shape1_1;
    public ModelRenderer leg1;
    public ModelRenderer leg2;
    public ModelRenderer leg2_1;
    public ModelRenderer leg2_2;
    public ModelRenderer shape1_2;
    public ModelRenderer shape1_3;
    public ModelRenderer shape1_4;
    public ModelRenderer shape1_5;


    public ModelRatel() {
        this.textureWidth = 50;
        this.textureHeight = 100;
        this.shape1_5 = new ModelRenderer(this, 0, 27);
        this.shape1_5.setRotationPoint(1.2F, 1.9F, 1.5F);
        this.shape1_5.addBox(0.0F, 0.0F, 0.0F, 4, 5, 4, 0.0F);
        this.setRotateAngle(shape1_5, -1.2292353921796064F, 0.0F, 0.0F);
        this.leg2 = new ModelRenderer(this, 0, 80);
        this.leg2.setRotationPoint(-2.9F, 5.6F, -7.7F);
        this.leg2.addBox(0.0F, 0.0F, 0.0F, 3, 7, 4, 0.0F);
        this.leg2_2 = new ModelRenderer(this, 0, 80);
        this.leg2_2.setRotationPoint(-2.8F, 5.8F, 8.4F);
        this.leg2_2.addBox(0.0F, 0.0F, 0.0F, 4, 7, 4, 0.0F);
        this.leg2_1 = new ModelRenderer(this, 0, 80);
        this.leg2_1.setRotationPoint(1.0F, 5.8F, 8.3F);
        this.leg2_1.addBox(0.0F, 0.0F, 0.0F, 4, 7, 4, 0.0F);
        this.shape1_4 = new ModelRenderer(this, 0, 38);
        this.shape1_4.setRotationPoint(-0.5F, -0.5F, -3.6F);
        this.shape1_4.addBox(0.0F, 0.0F, 0.0F, 7, 7, 8, 0.0F);
        this.shape1_1 = new ModelRenderer(this, 0, 0);
        this.shape1_1.setRotationPoint(-2.9F, -1.9F, -7.8F);
        this.shape1_1.addBox(0.0F, 0.0F, 0.0F, 8, 9, 13, 0.0F);
        this.shape1_2 = new ModelRenderer(this, 0, 60);
        this.shape1_2.setRotationPoint(-1.6F, -0.8F, 6.5F);
        this.shape1_2.addBox(0.0F, 0.0F, 0.0F, 5, 4, 13, 0.0F);
        this.setRotateAngle(shape1_2, -0.31869712141416456F, 0.0F, 0.0F);
        this.leg1 = new ModelRenderer(this, 0, 80);
        this.leg1.setRotationPoint(3.7F, 5.6F, -5.8F);
        this.leg1.addBox(-1.8F, 0.0F, -1.8F, 3, 7, 4, 0.0F);
        this.shape1 = new ModelRenderer(this, 0, 0);
        this.shape1.setRotationPoint(0.0F, 13.7F, 0.0F);
        this.shape1.addBox(-2.9F, -1.2F, 0.0F, 8, 8, 13, 0.0F);
        this.shape1_3 = new ModelRenderer(this, 0, 0);
        this.shape1_3.setRotationPoint(0.9F, 0.5F, -4.3F);
        this.shape1_3.addBox(0.0F, 0.0F, 0.0F, 6, 6, 13, 0.0F);
        this.shape1_4.addChild(this.shape1_5);
        this.shape1.addChild(this.leg2);
        this.shape1.addChild(this.leg2_2);
        this.shape1.addChild(this.leg2_1);
        this.shape1_3.addChild(this.shape1_4);
        this.shape1.addChild(this.shape1_1);
        this.shape1.addChild(this.shape1_2);
        this.shape1.addChild(this.leg1);
        this.shape1_1.addChild(this.shape1_3);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
    	  setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    	GlStateManager.pushMatrix();
        GlStateManager.translate(this.shape1.offsetX, this.shape1.offsetY, this.shape1.offsetZ);
        GlStateManager.translate(this.shape1.rotationPointX * f5, this.shape1.rotationPointY * f5, this.shape1.rotationPointZ * f5);
        GlStateManager.scale(0.9D, 0.8D, 0.7D);
        GlStateManager.translate(-this.shape1.offsetX, -this.shape1.offsetY, -this.shape1.offsetZ);
        GlStateManager.translate(-this.shape1.rotationPointX * f5, -this.shape1.rotationPointY * f5, -this.shape1.rotationPointZ * f5);
        this.shape1.render(f5);
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
    this.leg2.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F + (float)Math.PI) * 1.4F * p_78087_2_;
    this.leg2_1.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F + (float)Math.PI) * 1.4F * p_78087_2_;
    this.leg2_2.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F) * 1.4F * p_78087_2_;
}
}