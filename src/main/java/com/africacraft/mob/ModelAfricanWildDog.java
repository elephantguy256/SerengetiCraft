package com.africacraft.mob;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * ModelWolf - Either Mojang or a mod author
 * Created using Tabula 5.1.0
 */
public class ModelAfricanWildDog extends ModelBase {
    public ModelRenderer leg2;
    public ModelRenderer field_78186_h;
    public ModelRenderer field_78183_b;
    public ModelRenderer leg4;
    public ModelRenderer leg3;
    public ModelRenderer leg1;
    public ModelRenderer field_78180_g;
    public ModelRenderer field_78185_a0;
    public ModelRenderer field_78185_a1;
    public ModelRenderer field_78185_a2;
    public ModelRenderer field_78185_a3;

    public ModelAfricanWildDog() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.leg3 = new ModelRenderer(this, 0, 18);
        this.leg3.setRotationPoint(-2.5F, 16.0F, 6.7F);
        this.leg3.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
        this.field_78183_b = new ModelRenderer(this, 18, 14);
        this.field_78183_b.setRotationPoint(0.0F, 14.3F, -1.9F);
        this.field_78183_b.addBox(-4.0F, -2.0F, -3.0F, 6, 9, 6, 0.0F);
        this.setRotateAngle(field_78183_b, 1.5707963267948966F, 0.0F, 0.0F);
        this.field_78186_h = new ModelRenderer(this, 23, 1);
        this.field_78186_h.setRotationPoint(1.2F, 12.9F, -3.9F);
        this.field_78186_h.addBox(-4.0F, -3.0F, -3.0F, 4, 5, 7, 0.0F);
        this.setRotateAngle(field_78186_h, 2.276432943376204F, 0.0F, 0.0F);
        this.leg1 = new ModelRenderer(this, 0, 18);
        this.leg1.setRotationPoint(-2.5F, 16.0F, -3.5F);
        this.leg1.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
        this.field_78185_a1 = new ModelRenderer(this, 16, 14);
        this.field_78185_a1.setRotationPoint(-0.4F, 13.0F, -7.0F);
        this.field_78185_a1.addBox(-3.0F, -5.0F, 0.0F, 2, 2, 1, 0.0F);
        this.setRotateAngle(field_78185_a1, -0.017453292519943295F, 0.0F, 0.0F);
        this.field_78185_a3 = new ModelRenderer(this, 0, 10);
        this.field_78185_a3.setRotationPoint(-1.0F, 9.1F, -7.0F);
        this.field_78185_a3.addBox(-1.5F, 0.0F, -5.0F, 3, 3, 4, 0.0F);
        this.setRotateAngle(field_78185_a3, 0.22759093446006054F, 0.0F, 0.0F);
        this.field_78180_g = new ModelRenderer(this, 9, 18);
        this.field_78180_g.setRotationPoint(-1.0F, 12.0F, 7.0F);
        this.field_78180_g.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
        this.setRotateAngle(field_78180_g, 0.31869712141416456F, 0.0F, 0.0F);
        this.leg2 = new ModelRenderer(this, 0, 18);
        this.leg2.setRotationPoint(0.5F, 16.0F, -3.5F);
        this.leg2.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
        this.leg4 = new ModelRenderer(this, 0, 18);
        this.leg4.setRotationPoint(0.5F, 16.0F, 6.7F);
        this.leg4.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
        this.field_78185_a0 = new ModelRenderer(this, 0, 0);
        this.field_78185_a0.setRotationPoint(-0.5F, 10.7F, -7.0F);
        this.field_78185_a0.addBox(-3.0F, -3.0F, -2.0F, 5, 5, 4, 0.0F);
        this.setRotateAngle(field_78185_a0, -0.017453292519943295F, 0.0F, 0.0F);
        this.field_78185_a2 = new ModelRenderer(this, 16, 14);
        this.field_78185_a2.setRotationPoint(-1.6F, 12.9F, -7.0F);
        this.field_78185_a2.addBox(1.0F, -5.0F, 0.0F, 2, 2, 1, 0.0F);
        this.setRotateAngle(field_78185_a2, -0.017453292519943295F, 0.0F, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        this.leg3.render(f5);
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.field_78183_b.offsetX, this.field_78183_b.offsetY, this.field_78183_b.offsetZ);
        GlStateManager.translate(this.field_78183_b.rotationPointX * f5, this.field_78183_b.rotationPointY * f5, this.field_78183_b.rotationPointZ * f5);
        GlStateManager.scale(1.0D, 1.0D, 1.4D);
        GlStateManager.translate(-this.field_78183_b.offsetX, -this.field_78183_b.offsetY, -this.field_78183_b.offsetZ);
        GlStateManager.translate(-this.field_78183_b.rotationPointX * f5, -this.field_78183_b.rotationPointY * f5, -this.field_78183_b.rotationPointZ * f5);
        this.field_78183_b.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.field_78186_h.offsetX, this.field_78186_h.offsetY, this.field_78186_h.offsetZ);
        GlStateManager.translate(this.field_78186_h.rotationPointX * f5, this.field_78186_h.rotationPointY * f5, this.field_78186_h.rotationPointZ * f5);
        GlStateManager.scale(1.1D, 1.0D, 1.0D);
        GlStateManager.translate(-this.field_78186_h.offsetX, -this.field_78186_h.offsetY, -this.field_78186_h.offsetZ);
        GlStateManager.translate(-this.field_78186_h.rotationPointX * f5, -this.field_78186_h.rotationPointY * f5, -this.field_78186_h.rotationPointZ * f5);
        this.field_78186_h.render(f5);
        GlStateManager.popMatrix();
        this.leg1.render(f5);
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.field_78185_a1.offsetX, this.field_78185_a1.offsetY, this.field_78185_a1.offsetZ);
        GlStateManager.translate(this.field_78185_a1.rotationPointX * f5, this.field_78185_a1.rotationPointY * f5, this.field_78185_a1.rotationPointZ * f5);
        GlStateManager.scale(1.3D, 1.6D, 1.0D);
        GlStateManager.translate(-this.field_78185_a1.offsetX, -this.field_78185_a1.offsetY, -this.field_78185_a1.offsetZ);
        GlStateManager.translate(-this.field_78185_a1.rotationPointX * f5, -this.field_78185_a1.rotationPointY * f5, -this.field_78185_a1.rotationPointZ * f5);
        this.field_78185_a1.render(f5);
        GlStateManager.popMatrix();
        this.field_78185_a3.render(f5);
        this.field_78180_g.render(f5);
        this.leg2.render(f5);
        this.leg4.render(f5);
        this.field_78185_a0.render(f5);
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.field_78185_a2.offsetX, this.field_78185_a2.offsetY, this.field_78185_a2.offsetZ);
        GlStateManager.translate(this.field_78185_a2.rotationPointX * f5, this.field_78185_a2.rotationPointY * f5, this.field_78185_a2.rotationPointZ * f5);
        GlStateManager.scale(1.3D, 1.6D, 1.0D);
        GlStateManager.translate(-this.field_78185_a2.offsetX, -this.field_78185_a2.offsetY, -this.field_78185_a2.offsetZ);
        GlStateManager.translate(-this.field_78185_a2.rotationPointX * f5, -this.field_78185_a2.rotationPointY * f5, -this.field_78185_a2.rotationPointZ * f5);
        this.field_78185_a2.render(f5);
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
	this.leg1.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
	this.leg2.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
	this.leg3.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
	this.leg4.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
}
}
