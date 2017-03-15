package com.hyenamod.mob;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * giraffe - crazydino1
 * Created using Tabula 5.1.0
 */
public class ModelGiraffe extends ModelBase {
    public ModelRenderer bodymiddle;
    public ModelRenderer bodyback;
    public ModelRenderer frontkneeleft;
    public ModelRenderer frontkneeright;
    public ModelRenderer neckbottom;
    public ModelRenderer backthighleft;
    public ModelRenderer backthighright;
    public ModelRenderer tail;
    public ModelRenderer backlegleft;
    public ModelRenderer backfootleft;
    public ModelRenderer backlegright;
    public ModelRenderer backfootright;
    public ModelRenderer tail_1;
    public ModelRenderer frontlegleft;
    public ModelRenderer frontfootleft;
    public ModelRenderer frontlegright;
    public ModelRenderer frontfootright;
    public ModelRenderer neckmiddle;
    public ModelRenderer BodyBack;
    public ModelRenderer necktop;
    public ModelRenderer BodyBack_1;
    public ModelRenderer headback;
    public ModelRenderer BodyBack_2;
    public ModelRenderer headmiddle;
    public ModelRenderer hornright;
    public ModelRenderer hornleft;
    public ModelRenderer ear;
    public ModelRenderer ear_1;
    public ModelRenderer headfront;

    public ModelGiraffe() {
        this.textureWidth = 120;
        this.textureHeight = 90;
        this.frontlegright = new ModelRenderer(this, 74, 47);
        this.frontlegright.setRotationPoint(0.5F, 4.0F, 0.0F);
        this.frontlegright.addBox(-1.1F, 0.0F, -1.6F, 3, 13, 3, 0.0F);
        this.backlegright = new ModelRenderer(this, 86, 49);
        this.backlegright.setRotationPoint(0.0F, 5.0F, 0.0F);
        this.backlegright.addBox(-1.0F, 0.0F, -1.5F, 3, 10, 3, 0.0F);
        this.frontlegleft = new ModelRenderer(this, 74, 47);
        this.frontlegleft.setRotationPoint(0.5F, 4.0F, 0.0F);
        this.frontlegleft.addBox(-1.9F, 0.0F, -1.6F, 3, 13, 3, 0.0F);
        this.backthighleft = new ModelRenderer(this, 79, 29);
        this.backthighleft.setRotationPoint(8.0F, 10.0F, 8.0F);
        this.backthighleft.addBox(-2.5F, -2.0F, -2.5F, 4, 9, 5, 0.0F);
        this.setRotateAngle(backthighleft, 0.15707963267948966F, 0.0F, 0.0F);
        this.BodyBack_2 = new ModelRenderer(this, 92, 0);
        this.BodyBack_2.setRotationPoint(2.0F, -1.1F, 0.5F);
        this.BodyBack_2.addBox(0.0F, 0.0F, 0.0F, 1, 2, 10, 0.0F);
        this.setRotateAngle(BodyBack_2, 0.091106186954104F, 0.0F, 0.0F);
        this.headmiddle = new ModelRenderer(this, 73, 0);
        this.headmiddle.setRotationPoint(1.0F, 1.7F, -5.8F);
        this.headmiddle.addBox(0.0F, 0.0F, 0.0F, 4, 3, 6, 0.0F);
        this.setRotateAngle(headmiddle, 0.22759093446006054F, 0.0F, 0.0F);
        this.frontfootleft = new ModelRenderer(this, 52, 64);
        this.frontfootleft.setRotationPoint(0.0F, 8.0F, 0.0F);
        this.frontfootleft.addBox(-2.4F, 5.0F, -2.1F, 4, 2, 4, 0.0F);
        this.hornleft = new ModelRenderer(this, 0, 44);
        this.hornleft.setRotationPoint(3.8F, -2.5F, 6.1F);
        this.hornleft.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(hornleft, -0.5462880558742251F, 0.0F, 0.0F);
        this.backfootright = new ModelRenderer(this, 93, 64);
        this.backfootright.setRotationPoint(0.0F, 5.0F, 0.1F);
        this.backfootright.addBox(-1.5F, 5.0F, -2.0F, 4, 2, 4, 0.0F);
        this.tail_1 = new ModelRenderer(this, 0, 67);
        this.tail_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail_1.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.BodyBack = new ModelRenderer(this, 92, 0);
        this.BodyBack.setRotationPoint(3.5F, -1.0F, 0.0F);
        this.BodyBack.addBox(0.0F, 0.0F, 0.0F, 1, 2, 9, 0.0F);
        this.headback = new ModelRenderer(this, 0, 20);
        this.headback.setRotationPoint(-0.5F, 5.1F, -2.9F);
        this.headback.addBox(0.0F, 0.0F, 0.0F, 6, 5, 7, 0.0F);
        this.setRotateAngle(headback, 1.0927506446736497F, 0.0F, 0.0F);
        this.backlegleft = new ModelRenderer(this, 86, 49);
        this.backlegleft.setRotationPoint(0.0F, 5.0F, 0.0F);
        this.backlegleft.addBox(-2.0F, 0.0F, -1.5F, 3, 10, 3, 0.0F);
        this.necktop = new ModelRenderer(this, 41, 34);
        this.necktop.setRotationPoint(0.5F, 1.0F, -9.9F);
        this.necktop.addBox(0.0F, 0.0F, 0.0F, 5, 6, 10, 0.0F);
        this.neckmiddle = new ModelRenderer(this, 37, 0);
        this.neckmiddle.setRotationPoint(1.0F, -1.5F, -8.4F);
        this.neckmiddle.addBox(0.0F, 0.0F, 0.0F, 6, 8, 11, 0.0F);
        this.setRotateAngle(neckmiddle, -0.2181661564992912F, 0.0F, 0.0F);
        this.BodyBack_1 = new ModelRenderer(this, 92, 0);
        this.BodyBack_1.setRotationPoint(2.5F, -1.0F, 0.5F);
        this.BodyBack_1.addBox(0.0F, 0.0F, 0.0F, 1, 2, 9, 0.0F);
        this.setRotateAngle(BodyBack_1, 0.045553093477052F, 0.0F, 0.0F);
        this.tail = new ModelRenderer(this, 0, 67);
        this.tail.setRotationPoint(4.5F, 1.4F, 10.7F);
        this.tail.addBox(0.0F, 0.0F, 0.0F, 1, 13, 1, 0.0F);
        this.setRotateAngle(tail, 0.27314402793711257F, 0.0F, 0.0F);
        this.backthighright = new ModelRenderer(this, 79, 29);
        this.backthighright.setRotationPoint(2.0F, 10.0F, 8.0F);
        this.backthighright.addBox(-1.5F, -2.0F, -2.5F, 4, 9, 5, 0.0F);
        this.setRotateAngle(backthighright, 0.15707963267948966F, 0.0F, 0.0F);
        this.frontkneeleft = new ModelRenderer(this, 56, 50);
        this.frontkneeleft.setRotationPoint(9.0F, 12.0F, 3.0F);
        this.frontkneeleft.addBox(-1.9F, -1.0F, -2.1F, 4, 8, 4, 0.0F);
        this.setRotateAngle(frontkneeleft, 0.06981317007977318F, 0.0F, 0.0F);
        this.backfootleft = new ModelRenderer(this, 93, 64);
        this.backfootleft.setRotationPoint(0.0F, 5.0F, 0.0F);
        this.backfootleft.addBox(-2.5F, 5.0F, -2.0F, 4, 2, 4, 0.0F);
        this.ear = new ModelRenderer(this, 30, 21);
        this.ear.setRotationPoint(-0.4F, -1.4F, 4.0F);
        this.ear.addBox(0.0F, 0.0F, 0.0F, 2, 3, 1, 0.0F);
        this.setRotateAngle(ear, 0.6108652381980153F, 0.0F, -0.2181661564992912F);
        this.bodyback = new ModelRenderer(this, 60, 67);
        this.bodyback.setRotationPoint(1.0F, 2.0F, 13.0F);
        this.bodyback.addBox(0.0F, 0.0F, 0.0F, 10, 11, 12, 0.0F);
        this.setRotateAngle(bodyback, -0.07958701389094143F, 0.0F, 0.0F);
        this.hornright = new ModelRenderer(this, 0, 44);
        this.hornright.setRotationPoint(1.2F, -2.5F, 6.1F);
        this.hornright.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(hornright, -0.5462880558742251F, 0.0F, 0.0F);
        this.headfront = new ModelRenderer(this, 0, 35);
        this.headfront.setRotationPoint(0.5F, 1.1F, 0.4F);
        this.headfront.addBox(0.0F, 0.0F, 0.0F, 3, 2, 6, 0.0F);
        this.setRotateAngle(headfront, -0.22689280275926282F, 0.0F, 0.0F);
        this.frontfootright = new ModelRenderer(this, 52, 64);
        this.frontfootright.setRotationPoint(0.0F, 8.0F, 0.0F);
        this.frontfootright.addBox(-1.6F, 5.0F, -2.1F, 4, 2, 4, 0.0F);
        this.bodymiddle = new ModelRenderer(this, 8, 64);
        this.bodymiddle.setRotationPoint(-6.0F, -16.5F, -10.7F);
        this.bodymiddle.addBox(0.0F, 0.0F, 0.0F, 12, 13, 13, 0.0F);
        this.setRotateAngle(bodymiddle, -0.07958701389094143F, 0.0F, 0.0F);
        this.neckbottom = new ModelRenderer(this, 4, 0);
        this.neckbottom.setRotationPoint(2.0F, -4.2F, 1.2F);
        this.neckbottom.addBox(0.0F, 0.0F, 0.0F, 8, 10, 8, 0.0F);
        this.setRotateAngle(neckbottom, -0.7285004297824331F, 0.0F, 0.0F);
        this.ear_1 = new ModelRenderer(this, 0, 0);
        this.ear_1.setRotationPoint(4.4F, -1.8F, 4.0F);
        this.ear_1.addBox(0.0F, 0.0F, 0.0F, 2, 3, 1, 0.0F);
        this.setRotateAngle(ear_1, 0.6108652381980153F, 0.0F, 0.2181661564992912F);
        this.frontkneeright = new ModelRenderer(this, 56, 50);
        this.frontkneeright.setRotationPoint(2.0F, 12.0F, 3.0F);
        this.frontkneeright.addBox(-1.1F, -1.0F, -2.1F, 4, 8, 4, 0.0F);
        this.setRotateAngle(frontkneeright, 0.06981317007977318F, 0.0F, 0.0F);
        this.frontkneeright.addChild(this.frontlegright);
        this.backthighright.addChild(this.backlegright);
        this.frontkneeleft.addChild(this.frontlegleft);
        this.bodyback.addChild(this.backthighleft);
        this.necktop.addChild(this.BodyBack_2);
        this.headback.addChild(this.headmiddle);
        this.frontlegleft.addChild(this.frontfootleft);
        this.headback.addChild(this.hornleft);
        this.backlegright.addChild(this.backfootright);
        this.tail.addChild(this.tail_1);
        this.neckbottom.addChild(this.BodyBack);
        this.necktop.addChild(this.headback);
        this.backthighleft.addChild(this.backlegleft);
        this.neckmiddle.addChild(this.necktop);
        this.neckbottom.addChild(this.neckmiddle);
        this.neckmiddle.addChild(this.BodyBack_1);
        this.bodyback.addChild(this.tail);
        this.bodyback.addChild(this.backthighright);
        this.bodymiddle.addChild(this.frontkneeleft);
        this.backlegleft.addChild(this.backfootleft);
        this.headback.addChild(this.ear);
        this.bodymiddle.addChild(this.bodyback);
        this.headback.addChild(this.hornright);
        this.headmiddle.addChild(this.headfront);
        this.frontlegright.addChild(this.frontfootright);
        this.bodymiddle.addChild(this.neckbottom);
        this.headback.addChild(this.ear_1);
        this.bodymiddle.addChild(this.frontkneeright);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
    	  setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.bodymiddle.offsetX, this.bodymiddle.offsetY, this.bodymiddle.offsetZ);
        GlStateManager.translate(this.bodymiddle.rotationPointX * f5, this.bodymiddle.rotationPointY * f5, this.bodymiddle.rotationPointZ * f5);
        GlStateManager.scale(1.3D, 1.3D, 1.1D);
        GlStateManager.translate(-this.bodymiddle.offsetX, -this.bodymiddle.offsetY, -this.bodymiddle.offsetZ);
        GlStateManager.translate(-this.bodymiddle.rotationPointX * f5, -this.bodymiddle.rotationPointY * f5, -this.bodymiddle.rotationPointZ * f5);
        this.bodymiddle.render(f5);
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

        this.frontkneeleft.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F) * 1.4F * p_78087_2_;
        this.frontkneeright.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F + (float)Math.PI) * 1.4F * p_78087_2_;
        this.backthighleft.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F) * 1.4F * p_78087_2_;
        this.backthighright.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F + (float)Math.PI) * 1.4F * p_78087_2_;
    }
    }