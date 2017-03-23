package com.hyenamod.mob;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.opengl.GL11;
import net.minecraft.util.math.MathHelper;

/**
 * Hyena - Undefined
 * Created using Tabula 5.1.0
 */
public class ModelSpottedHyenaNew extends ModelBase {
    public ModelRenderer leg32;
    public ModelRenderer leg2;
    public ModelRenderer leg42;
    public ModelRenderer leg3;
    public ModelRenderer leg4;
    public ModelRenderer leg1;
    public ModelRenderer shape1;
    public ModelRenderer field_78185_a0;
    public ModelRenderer field_78180_g;
    public ModelRenderer shape15;
    public ModelRenderer shape15_1;
    public ModelRenderer shape15_2;
    public ModelRenderer shape23;
    public ModelRenderer shape23_1;
    public ModelRenderer field_78185_a3;
    public ModelRenderer field_78185_a1;
    public ModelRenderer field_78185_a1_1;
    public ModelRenderer shape15_3;

    public ModelSpottedHyenaNew() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.leg4 = new ModelRenderer(this, 17, 38);
        this.leg4.setRotationPoint(1.7F, 9.9F, -7.2F);
        this.leg4.addBox(0.0F, 0.0F, 0.0F, 3, 7, 3, 0.0F);
        this.setRotateAngle(leg4, -0.4553564018453205F, 0.0F, 0.0F);
        this.leg42 = new ModelRenderer(this, 17, 38);
        this.leg42.setRotationPoint(1.6F, 15.9F, -10.2F);
        this.leg42.addBox(0.0F, 0.0F, 0.0F, 3, 8, 3, 0.0F);
        this.shape23_1 = new ModelRenderer(this, 0, 14);
        this.shape23_1.setRotationPoint(-4.5F, 5.6F, -8.9F);
        this.shape23_1.addBox(0.0F, 0.0F, 0.0F, 8, 9, 7, 0.0F);
        this.shape1 = new ModelRenderer(this, 0, 14);
        this.shape1.setRotationPoint(-3.1F, 13.5F, 4.2F);
        this.shape1.addBox(0.0F, 0.0F, 0.0F, 7, 8, 7, 0.0F);
        this.setRotateAngle(shape1, 1.5481070465189704F, 0.0F, 0.0F);
        this.shape23 = new ModelRenderer(this, 0, 3);
        this.shape23.setRotationPoint(-4.5F, 5.6F, -2.0F);
        this.shape23.addBox(0.0F, 0.0F, 0.0F, 8, 9, 9, 0.0F);
        this.leg2 = new ModelRenderer(this, 17, 38);
        this.leg2.setRotationPoint(-4.14F, 12.9F, 4.4F);
        this.leg2.addBox(0.0F, 0.0F, 0.0F, 3, 11, 3, 0.0F);
        this.shape15_2 = new ModelRenderer(this, 0, 22);
        this.shape15_2.setRotationPoint(0.2F, 3.3F, 0.0F);
        this.shape15_2.addBox(0.0F, 0.0F, 0.0F, 1, 4, 2, 0.0F);
        this.setRotateAngle(shape15_2, 0.22759093446006054F, 0.0F, 0.0F);
        this.field_78180_g = new ModelRenderer(this, 54, 19);
        this.field_78180_g.setRotationPoint(-1.2F, 5.8F, -8.5F);
        this.field_78180_g.addBox(0.0F, 0.0F, 0.0F, 3, 10, 2, 0.0F);
        this.setRotateAngle(field_78180_g, -0.40980330836826856F, 0.0F, 0.0F);
        this.leg3 = new ModelRenderer(this, 17, 38);
        this.leg3.setRotationPoint(-4.1F, 9.5F, -8.6F);
        this.leg3.addBox(-0.1F, 0.0F, 0.0F, 3, 7, 3, 0.0F);
        this.setRotateAngle(leg3, -0.18203784098300857F, 0.0F, 0.0F);
        this.shape15 = new ModelRenderer(this, 0, 21);
        this.shape15.setRotationPoint(0.2F, 3.54F, 5.9F);
        this.shape15.addBox(0.0F, 0.0F, 0.0F, 1, 4, 2, 0.0F);
        this.setRotateAngle(shape15, 0.136659280431156F, 0.0F, 0.0F);
        this.leg32 = new ModelRenderer(this, 17, 38);
        this.leg32.setRotationPoint(-3.2F, 15.9F, -8.4F);
        this.leg32.addBox(-1.0F, 0.0F, -1.5F, 3, 8, 3, 0.0F);
        this.leg1 = new ModelRenderer(this, 17, 18);
        this.leg1.setRotationPoint(1.8F, 13.0F, 4.4F);
        this.leg1.addBox(0.0F, 0.0F, 0.0F, 3, 11, 3, 0.0F);
        this.field_78185_a0 = new ModelRenderer(this, 33, 6);
        this.field_78185_a0.setRotationPoint(-3.5F, 5.6F, 9.9F);
        this.field_78185_a0.addBox(0.0F, 0.0F, 0.0F, 7, 8, 7, 0.0F);
        this.setRotateAngle(field_78185_a0, -0.091106186954104F, 0.0F, 0.0F);
        this.field_78185_a1 = new ModelRenderer(this, 41, 14);
        this.field_78185_a1.setRotationPoint(0.0F, -2.6F, 2.3F);
        this.field_78185_a1.addBox(0.0F, 0.0F, 0.0F, 2, 4, 1, 0.0F);
        this.shape15_1 = new ModelRenderer(this, 0, 21);
        this.shape15_1.setRotationPoint(0.2F, 3.2F, 2.7F);
        this.shape15_1.addBox(0.0F, 0.0F, 0.0F, 1, 4, 2, 0.0F);
        this.setRotateAngle(shape15_1, 0.136659280431156F, 0.0F, 0.0F);
        this.shape15_3 = new ModelRenderer(this, 0, 19);
        this.shape15_3.setRotationPoint(3.1F, -1.9F, -0.9F);
        this.shape15_3.addBox(0.0F, 0.0F, 0.0F, 1, 4, 2, 0.0F);
        this.setRotateAngle(shape15_3, 0.22759093446006054F, 0.0F, 0.0F);
        this.field_78185_a1_1 = new ModelRenderer(this, 41, 14);
        this.field_78185_a1_1.setRotationPoint(4.8F, -2.7F, 2.4F);
        this.field_78185_a1_1.addBox(0.0F, 0.0F, 0.0F, 2, 4, 1, 0.0F);
        this.field_78185_a3 = new ModelRenderer(this, 43, 22);
        this.field_78185_a3.setRotationPoint(1.6F, 3.0F, 4.5F);
        this.field_78185_a3.addBox(0.0F, 0.0F, 0.0F, 4, 4, 6, 0.0F);
        this.setRotateAngle(field_78185_a3, -0.18203784098300857F, 0.0F, 0.0F);
        this.field_78185_a0.addChild(this.field_78185_a1);
        this.field_78185_a0.addChild(this.shape15_3);
        this.field_78185_a0.addChild(this.field_78185_a1_1);
        this.field_78185_a0.addChild(this.field_78185_a3);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);		
        this.leg4.render(f5);
        this.leg42.render(f5);
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.shape23_1.offsetX, this.shape23_1.offsetY, this.shape23_1.offsetZ);
        GlStateManager.translate(this.shape23_1.rotationPointX * f5, this.shape23_1.rotationPointY * f5, this.shape23_1.rotationPointZ * f5);
        GlStateManager.scale(1.2D, 1.0D, 1.1D);
        GlStateManager.translate(-this.shape23_1.offsetX, -this.shape23_1.offsetY, -this.shape23_1.offsetZ);
        GlStateManager.translate(-this.shape23_1.rotationPointX * f5, -this.shape23_1.rotationPointY * f5, -this.shape23_1.rotationPointZ * f5);
        this.shape23_1.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.shape1.offsetX, this.shape1.offsetY, this.shape1.offsetZ);
        GlStateManager.translate(this.shape1.rotationPointX * f5, this.shape1.rotationPointY * f5, this.shape1.rotationPointZ * f5);
        GlStateManager.scale(1.0D, 1.1D, 1.1D);
        GlStateManager.translate(-this.shape1.offsetX, -this.shape1.offsetY, -this.shape1.offsetZ);
        GlStateManager.translate(-this.shape1.rotationPointX * f5, -this.shape1.rotationPointY * f5, -this.shape1.rotationPointZ * f5);
        this.shape1.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.shape23.offsetX, this.shape23.offsetY, this.shape23.offsetZ);
        GlStateManager.translate(this.shape23.rotationPointX * f5, this.shape23.rotationPointY * f5, this.shape23.rotationPointZ * f5);
        GlStateManager.scale(1.2D, 1.0D, 1.1D);
        GlStateManager.translate(-this.shape23.offsetX, -this.shape23.offsetY, -this.shape23.offsetZ);
        GlStateManager.translate(-this.shape23.rotationPointX * f5, -this.shape23.rotationPointY * f5, -this.shape23.rotationPointZ * f5);
        this.shape23.render(f5);
        GlStateManager.popMatrix();
        this.leg2.render(f5);
        this.shape15_2.render(f5);
        this.field_78180_g.render(f5);
        this.leg3.render(f5);
        this.shape15.render(f5);
        this.leg32.render(f5);
        this.leg1.render(f5);
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.field_78185_a0.offsetX, this.field_78185_a0.offsetY, this.field_78185_a0.offsetZ);
        GlStateManager.translate(this.field_78185_a0.rotationPointX * f5, this.field_78185_a0.rotationPointY * f5, this.field_78185_a0.rotationPointZ * f5);
        GlStateManager.scale(1.1D, 1.0D, 1.0D);
        GlStateManager.translate(-this.field_78185_a0.offsetX, -this.field_78185_a0.offsetY, -this.field_78185_a0.offsetZ);
        GlStateManager.translate(-this.field_78185_a0.rotationPointX * f5, -this.field_78185_a0.rotationPointY * f5, -this.field_78185_a0.rotationPointZ * f5);
        this.field_78185_a0.render(f5);
        GlStateManager.popMatrix();
        this.shape15_1.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}

public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity)
{
	this.leg1.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
	this.leg2.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
	this.leg3.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
	this.leg4.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
	this.leg42.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
	this.leg32.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
}
}
