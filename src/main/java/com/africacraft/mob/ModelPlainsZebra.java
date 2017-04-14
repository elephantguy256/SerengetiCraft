package com.africacraft.mob;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * ModelHorse - Either Mojang or a mod author
 * Created using Tabula 5.1.0
 */
public class ModelPlainsZebra extends ModelBase {
	  public ModelRenderer body;
	    public ModelRenderer neck;
	    public ModelRenderer field_110688_A;
	    public ModelRenderer field_110684_D;
	    public ModelRenderer thigh;
	    public ModelRenderer field_110722_x;
	    public ModelRenderer field_110712_l;
	    public ModelRenderer head;
	    public ModelRenderer mane;
	    public ModelRenderer ear;
	    public ModelRenderer earleft;
	    public ModelRenderer field_110689_B;
	    public ModelRenderer field_110690_C;
	    public ModelRenderer field_110685_E;
	    public ModelRenderer field_110686_F;
	    public ModelRenderer shin;
	    public ModelRenderer hoof;
	    public ModelRenderer field_110721_y;
	    public ModelRenderer field_110720_z;
	    public ModelRenderer field_110713_m;
	    public ModelRenderer field_110710_n;

	    public ModelPlainsZebra() {
	        this.textureWidth = 128;
	        this.textureHeight = 128;
	        this.earleft = new ModelRenderer(this, 0, 0);
	        this.earleft.setRotationPoint(0.0F, -0.5F, -1.8F);
	        this.earleft.addBox(0.45F, -12.0F, 4.0F, 2, 3, 1, 0.0F);
	        this.shin = new ModelRenderer(this, 78, 43);
	        this.shin.setRotationPoint(0.0F, 7.0F, 0.0F);
	        this.shin.addBox(-2.0F, 0.0F, -1.5F, 3, 5, 3, 0.0F);
	        this.body = new ModelRenderer(this, 0, 64);
	        this.body.setRotationPoint(0.0F, 10.9F, 9.0F);
	        this.body.addBox(-5.0F, -8.0F, -19.0F, 10, 10, 24, 0.0F);
	        this.field_110684_D = new ModelRenderer(this, 60, 29);
	        this.field_110684_D.setRotationPoint(-3.7F, -2.0F, -16.2F);
	        this.field_110684_D.addBox(-1.1F, -1.0F, -2.1F, 3, 8, 4, 0.0F);
	        this.field_110686_F = new ModelRenderer(this, 60, 51);
	        this.field_110686_F.setRotationPoint(0.0F, 0.0F, 0.0F);
	        this.field_110686_F.addBox(-1.6F, 5.1F, -2.1F, 4, 3, 4, 0.0F);
	        this.field_110710_n = new ModelRenderer(this, 26, 5);
	        this.field_110710_n.setRotationPoint(-0.5F, 2.0F, 0.1F);
	        this.field_110710_n.addBox(-1.5F, -4.5F, 9.0F, 3, 3, 5, 0.0F);
	        this.neck = new ModelRenderer(this, 0, 12);
	        this.neck.setRotationPoint(0.0F, -6.7F, -19.5F);
	        this.neck.addBox(-2.05F, -9.8F, -2.0F, 4, 14, 8, 0.0F);
	        this.setRotateAngle(neck, 0.5918411493512771F, 0.0F, 0.0F);
	        this.field_110722_x = new ModelRenderer(this, 96, 29);
	        this.field_110722_x.setRotationPoint(-4.0F, -2.0F, 2.0F);
	        this.field_110722_x.addBox(-1.5F, -2.0F, -2.5F, 4, 9, 5, 0.0F);
	        this.field_110690_C = new ModelRenderer(this, 44, 51);
	        this.field_110690_C.setRotationPoint(0.0F, 0.0F, 0.0F);
	        this.field_110690_C.addBox(-2.4F, 5.1F, -2.1F, 4, 3, 4, 0.0F);
	        this.mane = new ModelRenderer(this, 60, 0);
	        this.mane.setRotationPoint(0.0F, 0.0F, 0.0F);
	        this.mane.addBox(-1.0F, -11.5F, 5.0F, 2, 16, 4, 0.0F);
	        this.field_110713_m = new ModelRenderer(this, 38, 7);
	        this.field_110713_m.setRotationPoint(0.5F, 0.0F, -0.5F);
	        this.field_110713_m.addBox(-1.5F, -2.0F, 3.0F, 2, 2, 7, 0.0F);
	        this.setRotateAngle(field_110713_m, -0.31869712141416456F, 0.0F, 0.0F);
	        this.head = new ModelRenderer(this, 80, 12);
	        this.head.setRotationPoint(0.0F, -0.1F, 1.3F);
	        this.head.addBox(-2.5F, -10.1F, -7.0F, 5, 5, 10, 0.0F);
	        this.setRotateAngle(head, -0.091106186954104F, 0.0F, 0.0F);
	        this.ear = new ModelRenderer(this, 0, 0);
	        this.ear.setRotationPoint(0.0F, -0.5F, -1.8F);
	        this.ear.addBox(-2.45F, -12.0F, 4.0F, 2, 3, 1, 0.0F);
	        this.field_110712_l = new ModelRenderer(this, 44, 0);
	        this.field_110712_l.setRotationPoint(0.0F, -6.0F, 4.2F);
	        this.field_110712_l.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 3, 0.0F);
	        this.setRotateAngle(field_110712_l, -1.0016444577195458F, 0.0F, 0.0F);
	        this.field_110689_B = new ModelRenderer(this, 44, 41);
	        this.field_110689_B.setRotationPoint(0.0F, 7.0F, 0.0F);
	        this.field_110689_B.addBox(-1.9F, 0.0F, -1.6F, 3, 5, 3, 0.0F);
	        this.field_110688_A = new ModelRenderer(this, 44, 29);
	        this.field_110688_A.setRotationPoint(3.7F, -2.0F, -16.2F);
	        this.field_110688_A.addBox(-1.9F, -1.0F, -2.1F, 3, 8, 4, 0.0F);
	        this.field_110721_y = new ModelRenderer(this, 96, 43);
	        this.field_110721_y.setRotationPoint(0.0F, 7.0F, 0.0F);
	        this.field_110721_y.addBox(-1.0F, 0.0F, -1.5F, 3, 5, 3, 0.0F);
	        this.thigh = new ModelRenderer(this, 78, 29);
	        this.thigh.setRotationPoint(4.0F, -2.0F, 2.0F);
	        this.thigh.addBox(-2.5F, -2.0F, -2.5F, 4, 9, 5, 0.0F);
	        this.hoof = new ModelRenderer(this, 78, 51);
	        this.hoof.setRotationPoint(0.0F, 0.0F, 0.0F);
	        this.hoof.addBox(-2.5F, 5.1F, -2.0F, 4, 3, 4, 0.0F);
	        this.field_110720_z = new ModelRenderer(this, 96, 51);
	        this.field_110720_z.setRotationPoint(0.0F, 0.0F, 0.0F);
	        this.field_110720_z.addBox(-1.5F, 5.1F, -2.0F, 4, 3, 4, 0.0F);
	        this.field_110685_E = new ModelRenderer(this, 60, 41);
	        this.field_110685_E.setRotationPoint(0.0F, 7.0F, 0.0F);
	        this.field_110685_E.addBox(-1.1F, 0.0F, -1.6F, 3, 5, 3, 0.0F);
	        this.head.addChild(this.earleft);
	        this.thigh.addChild(this.shin);
	        this.body.addChild(this.field_110684_D);
	        this.field_110685_E.addChild(this.field_110686_F);
	        this.field_110713_m.addChild(this.field_110710_n);
	        this.body.addChild(this.neck);
	        this.body.addChild(this.field_110722_x);
	        this.field_110689_B.addChild(this.field_110690_C);
	        this.neck.addChild(this.mane);
	        this.field_110712_l.addChild(this.field_110713_m);
	        this.neck.addChild(this.head);
	        this.head.addChild(this.ear);
	        this.body.addChild(this.field_110712_l);
	        this.field_110688_A.addChild(this.field_110689_B);
	        this.body.addChild(this.field_110688_A);
	        this.field_110722_x.addChild(this.field_110721_y);
	        this.body.addChild(this.thigh);
	        this.shin.addChild(this.hoof);
	        this.field_110721_y.addChild(this.field_110720_z);
	        this.field_110684_D.addChild(this.field_110685_E);
	    }
    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
    	  setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.body.offsetX, this.body.offsetY, this.body.offsetZ);
        GlStateManager.translate(this.body.rotationPointX * f5, this.body.rotationPointY * f5, this.body.rotationPointZ * f5);
        GlStateManager.scale(1.2D, 1.3D, 1.4D);
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

    this.field_110688_A.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F) * 1.4F * p_78087_2_;
    this.field_110684_D.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F + (float)Math.PI) * 1.4F * p_78087_2_;
    this.field_110722_x.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F + (float)Math.PI) * 1.4F * p_78087_2_;
    this.thigh.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F) * 1.4F * p_78087_2_;
}
}
