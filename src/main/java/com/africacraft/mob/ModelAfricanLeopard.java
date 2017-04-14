package com.africacraft.mob;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * AC lion male - Undefined
 * Created using Tabula 5.1.0
 */
public class ModelAfricanLeopard extends ModelBase {
    public ModelRenderer body;
    public ModelRenderer leg;
    public ModelRenderer leg_1;
    public ModelRenderer leg_2;
    public ModelRenderer leg_3;
    public ModelRenderer neck;
    public ModelRenderer Tail1;
    public ModelRenderer head;
    public ModelRenderer head_1;
    public ModelRenderer ear;
    public ModelRenderer ear_1;
    public ModelRenderer head_2;
    public ModelRenderer Tail2;
    public ModelRenderer Tail3;

    public ModelAfricanLeopard() {
        this.textureWidth = 200;
        this.textureHeight = 100;
        this.head_2 = new ModelRenderer(this, 0, 50);
        this.head_2.setRotationPoint(0.5F, 3.5F, 0.8F);
        this.head_2.addBox(0.0F, 0.0F, 0.0F, 5, 3, 4, 0.0F);
        this.setRotateAngle(head_2, -0.045553093477052F, 0.0F, 0.0F);
        this.body = new ModelRenderer(this, 0, 43);
        this.body.setRotationPoint(0.0F, 7.2F, -9.7F);
        this.body.addBox(0.0F, 0.0F, 0.0F, 13, 14, 30, 0.0F);
        this.head = new ModelRenderer(this, 57, 0);
        this.head.setRotationPoint(-0.5F, 2.2F, -8.3F);
        this.head.addBox(0.0F, 0.0F, 0.0F, 10, 10, 9, 0.0F);
        this.setRotateAngle(head, 0.27314402793711257F, 0.0F, 0.0F);
        this.leg_2 = new ModelRenderer(this, 0, 0);
        this.leg_2.setRotationPoint(0.5F, 13.0F, 23.5F);
        this.leg_2.addBox(0.0F, 0.0F, 0.0F, 5, 15, 6, 0.0F);
        this.neck = new ModelRenderer(this, 100, 50);
        this.neck.setRotationPoint(2.0F, -2.2F, -2.1F);
        this.neck.addBox(0.0F, 0.0F, 0.0F, 9, 10, 9, 0.0F);
        this.setRotateAngle(neck, -0.27314402793711257F, 0.0F, 0.0F);
        this.Tail2 = new ModelRenderer(this, 30, 87);
        this.Tail2.setRotationPoint(0.5F, 0.4F, 10.0F);
        this.Tail2.addBox(0.0F, 0.0F, 0.0F, 2, 2, 10, 0.0F);
        this.setRotateAngle(Tail2, -0.091106186954104F, -0.0F, 0.0F);
        this.head_1 = new ModelRenderer(this, 0, 27);
        this.head_1.setRotationPoint(2.0F, 3.7F, -5.5F);
        this.head_1.addBox(0.0F, 0.0F, 0.0F, 6, 5, 6, 0.0F);
        this.setRotateAngle(head_1, 0.18203784098300857F, 0.0F, 0.0F);
        this.leg_3 = new ModelRenderer(this, 0, 0);
        this.leg_3.setRotationPoint(7.5F, 13.0F, 23.5F);
        this.leg_3.addBox(0.0F, 0.0F, 0.0F, 5, 15, 6, 0.0F);
        this.ear = new ModelRenderer(this, 22, 25);
        this.ear.setRotationPoint(7.3F, -2.3F, 4.0F);
        this.ear.addBox(0.0F, 0.0F, 0.0F, 4, 3, 1, 0.0F);
        this.setRotateAngle(ear, 0.36425021489121656F, 0.0F, 0.40980330836826856F);
        this.leg = new ModelRenderer(this, 75, 20);
        this.leg.setRotationPoint(0.5F, 13.0F, 0.5F);
        this.leg.addBox(0.0F, 0.0F, 0.0F, 5, 15, 6, 0.0F);
        this.leg_1 = new ModelRenderer(this, 0, 0);
        this.leg_1.setRotationPoint(7.5F, 13.0F, 0.5F);
        this.leg_1.addBox(0.0F, 0.0F, 0.0F, 5, 15, 6, 0.0F);
        this.ear_1 = new ModelRenderer(this, 31, 25);
        this.ear_1.setRotationPoint(-1.0F, -0.6F, 3.9F);
        this.ear_1.addBox(0.0F, 0.0F, 0.0F, 4, 3, 1, 0.0F);
        this.setRotateAngle(ear_1, 0.40980330836826856F, 0.0F, -0.40980330836826856F);
        this.Tail3 = new ModelRenderer(this, 62, 90);
        this.Tail3.setRotationPoint(0.0F, 0.1F, 8.9F);
        this.Tail3.addBox(0.0F, 0.0F, 0.0F, 2, 2, 7, 0.0F);
        this.setRotateAngle(Tail3, 0.40980330836826856F, -0.0F, 0.0F);
        this.Tail1 = new ModelRenderer(this, 1, 87);
        this.Tail1.setRotationPoint(5.0F, 0.0F, 29.6F);
        this.Tail1.addBox(0.0F, 0.0F, 0.0F, 3, 3, 10, 0.0F);
        this.setRotateAngle(Tail1, -1.1383037381507017F, -0.0F, 0.0F);
        this.head_1.addChild(this.head_2);
        this.neck.addChild(this.head);
        this.body.addChild(this.leg_2);
        this.body.addChild(this.neck);
        this.Tail1.addChild(this.Tail2);
        this.head.addChild(this.head_1);
        this.body.addChild(this.leg_3);
        this.head.addChild(this.ear);
        this.body.addChild(this.leg);
        this.body.addChild(this.leg_1);
        this.head.addChild(this.ear_1);
        this.Tail2.addChild(this.Tail3);
        this.body.addChild(this.Tail1);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
    	  setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    	GlStateManager.pushMatrix();
        GlStateManager.translate(this.body.offsetX, this.body.offsetY, this.body.offsetZ);
        GlStateManager.translate(this.body.rotationPointX * f5, this.body.rotationPointY * f5, this.body.rotationPointZ * f5);
        GlStateManager.scale(0.6D, 0.6D, 0.6D);
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
	this.leg.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
	this.leg_1.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
	this.leg_2.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
	this.leg_3.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
}
}
