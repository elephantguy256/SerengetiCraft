package com.hyenamod.mob;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * AC hippo - EVo
 * Created using Tabula 5.1.0
 */
public class ModelHippo extends ModelBase {
    public ModelRenderer body;
    public ModelRenderer booty;
    public ModelRenderer neck;
    public ModelRenderer thigh;
    public ModelRenderer thigh_1;
    public ModelRenderer thigh_2;
    public ModelRenderer thigh_3;
    public ModelRenderer tail;
    public ModelRenderer shin;
    public ModelRenderer shin_1;
    public ModelRenderer head;
    public ModelRenderer nose;
    public ModelRenderer ear;
    public ModelRenderer ear_1;
    public ModelRenderer mouth;
    public ModelRenderer nose_1;
    public ModelRenderer shin_2;
    public ModelRenderer shin_3;

    public ModelHippo() {
        this.textureWidth = 350;
        this.textureHeight = 175;
        this.mouth = new ModelRenderer(this, 254, 38);
        this.mouth.setRotationPoint(2.0F, 3.5F, 7.5F);
        this.mouth.addBox(0.0F, 0.0F, 0.0F, 6, 9, 3, 0.0F);
        this.setRotateAngle(mouth, 1.4690436314036273F, 0.0F, 0.0F);
        this.shin_1 = new ModelRenderer(this, 200, 0);
        this.shin_1.setRotationPoint(0.0F, 10.0F, 0.5F);
        this.shin_1.addBox(0.0F, 0.0F, 0.0F, 6, 7, 7, 0.0F);
        this.setRotateAngle(shin_1, 0.091106186954104F, 0.0F, 0.0F);
        this.nose_1 = new ModelRenderer(this, 254, 21);
        this.nose_1.setRotationPoint(-0.5F, 3.6F, 0.0F);
        this.nose_1.addBox(0.0F, 0.0F, 0.0F, 8, 5, 6, 0.0F);
        this.setRotateAngle(nose_1, -0.06771877497737998F, 0.0F, 0.0F);
        this.tail = new ModelRenderer(this, 23, 51);
        this.tail.setRotationPoint(6.5F, 4.2F, 14.0F);
        this.tail.addBox(0.0F, 0.0F, 0.0F, 2, 8, 2, 0.0F);
        this.setRotateAngle(tail, 0.3389429407372988F, 0.0F, 0.0F);
        this.ear = new ModelRenderer(this, 233, 33);
        this.ear.setRotationPoint(8.3F, 8.3F, 3.0F);
        this.ear.addBox(0.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F);
        this.setRotateAngle(ear, -0.3389429407372988F, -0.4293509959906051F, 0.0F);
        this.thigh_3 = new ModelRenderer(this, 141, 0);
        this.thigh_3.setRotationPoint(-1.0F, 5.8F, 6.0F);
        this.thigh_3.addBox(0.0F, 0.0F, 0.0F, 6, 10, 8, 0.0F);
        this.ear_1 = new ModelRenderer(this, 240, 100);
        this.ear_1.setRotationPoint(0.7F, 8.3F, 3.0F);
        this.ear_1.addBox(0.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F);
        this.setRotateAngle(ear_1, -0.3389429407372988F, 0.4293509959906051F, 0.0F);
        this.nose = new ModelRenderer(this, 254, 0);
        this.nose.setRotationPoint(1.5F, 8.4F, 7.7F);
        this.nose.addBox(0.0F, 0.0F, 0.0F, 7, 4, 5, 0.0F);
        this.setRotateAngle(nose, 1.5142476590302805F, 0.0F, 0.0F);
        this.booty = new ModelRenderer(this, 0, 48);
        this.booty.setRotationPoint(-0.5F, -0.5F, 16.0F);
        this.booty.addBox(0.0F, 0.0F, 0.0F, 15, 15, 16, 0.0F);
        this.setRotateAngle(booty, -0.091106186954104F, 0.0F, 0.0F);
        this.body = new ModelRenderer(this, 129, 48);
        this.body.setRotationPoint(-12.4F, -10.0F, -16.0F);
        this.body.addBox(0.0F, 0.0F, 0.0F, 14, 14, 16, 0.0F);
        this.shin_2 = new ModelRenderer(this, 200, 23);
        this.shin_2.setRotationPoint(0.0F, 5.7F, 0.8F);
        this.shin_2.addBox(0.0F, 0.0F, 0.0F, 6, 8, 5, 0.0F);
        this.setRotateAngle(shin_2, -0.24434609527920614F, 0.0F, 0.0F);
        this.shin_3 = new ModelRenderer(this, 200, 23);
        this.shin_3.setRotationPoint(0.0F, 5.7F, 0.8F);
        this.shin_3.addBox(0.0F, 0.0F, 0.0F, 6, 8, 5, 0.0F);
        this.setRotateAngle(shin_3, -0.24434609527920614F, 0.0F, 0.0F);
        this.neck = new ModelRenderer(this, 0, 130);
        this.neck.setRotationPoint(3.5F, 12.3F, 0.2F);
        this.neck.addBox(0.0F, 0.0F, 0.0F, 7, 10, 10, 0.0F);
        this.setRotateAngle(neck, 2.8703684878298747F, 0.0F, 0.0F);
        this.thigh_2 = new ModelRenderer(this, 141, 0);
        this.thigh_2.setRotationPoint(10.0F, 5.8F, 6.0F);
        this.thigh_2.addBox(0.0F, 0.0F, 0.0F, 6, 10, 8, 0.0F);
        this.head = new ModelRenderer(this, 0, 0);
        this.head.setRotationPoint(-1.5F, 2.2F, 5.5F);
        this.head.addBox(0.0F, 0.0F, 0.0F, 10, 9, 8, 0.0F);
        this.setRotateAngle(head, 0.43458698374658805F, 0.0F, 0.0F);
        this.thigh = new ModelRenderer(this, 141, 25);
        this.thigh.setRotationPoint(9.0F, 9.5F, 1.4F);
        this.thigh.addBox(0.0F, 0.0F, 0.0F, 6, 7, 6, 0.0F);
        this.setRotateAngle(thigh, 0.24853488548399255F, 0.0F, 0.0F);
        this.shin = new ModelRenderer(this, 200, 0);
        this.shin.setRotationPoint(0.0F, 10.0F, 0.5F);
        this.shin.addBox(0.0F, 0.0F, 0.0F, 6, 7, 7, 0.0F);
        this.setRotateAngle(shin, 0.091106186954104F, 0.0F, 0.0F);
        this.thigh_1 = new ModelRenderer(this, 141, 25);
        this.thigh_1.setRotationPoint(-1.0F, 9.5F, 1.4F);
        this.thigh_1.addBox(0.0F, 0.0F, 0.0F, 6, 7, 6, 0.0F);
        this.setRotateAngle(thigh_1, 0.24853488548399255F, 0.0F, 0.0F);
        this.head.addChild(this.mouth);
        this.thigh_3.addChild(this.shin_1);
        this.nose.addChild(this.nose_1);
        this.booty.addChild(this.tail);
        this.head.addChild(this.ear);
        this.booty.addChild(this.thigh_3);
        this.head.addChild(this.ear_1);
        this.head.addChild(this.nose);
        this.body.addChild(this.booty);
        this.thigh.addChild(this.shin_2);
        this.thigh_1.addChild(this.shin_3);
        this.body.addChild(this.neck);
        this.booty.addChild(this.thigh_2);
        this.neck.addChild(this.head);
        this.body.addChild(this.thigh);
        this.thigh_2.addChild(this.shin);
        this.body.addChild(this.thigh_1);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
  	  setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.body.offsetX, this.body.offsetY, this.body.offsetZ);
        GlStateManager.translate(this.body.rotationPointX * f5, this.body.rotationPointY * f5, this.body.rotationPointZ * f5);
        GlStateManager.scale(1.5D, 1.5D, 1.5D);
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

public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity)
{
	this.thigh.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
	this.thigh_1.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
	this.thigh_2.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
	this.thigh_3.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
}
}
