package com.africacraft.mob;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * AfricaCraft gemsbok final - Undefined
 * Created using Tabula 5.1.0
 */
public class ModelEland extends ModelBase {
    public ModelRenderer bodymiddle;
    public ModelRenderer bodyback;
    public ModelRenderer frontkneeleft;
    public ModelRenderer frontkneeright;
    public ModelRenderer neckbottom;
    public ModelRenderer bump;
    public ModelRenderer backthighleft;
    public ModelRenderer backthighright;
    public ModelRenderer tail;
    public ModelRenderer backlegleft;
    public ModelRenderer backfootleft;
    public ModelRenderer backlegright;
    public ModelRenderer backfootright;
    public ModelRenderer frontlegleft;
    public ModelRenderer frontfootleft;
    public ModelRenderer frontlegright;
    public ModelRenderer frontfootright;
    public ModelRenderer neckmiddle;
    public ModelRenderer dewflap;
    public ModelRenderer necktop;
    public ModelRenderer headback;
    public ModelRenderer earleft;
    public ModelRenderer earight;
    public ModelRenderer headmiddle;
    public ModelRenderer hormbottomright;
    public ModelRenderer headfront;
    public ModelRenderer hormmid;
    public ModelRenderer hormbottomright_1;
    public ModelRenderer hormtop;
    public ModelRenderer hormmid_1;
    public ModelRenderer hormtop_1;
    public ModelRenderer bump_1;

    public ModelEland() {
        this.textureWidth = 120;
        this.textureHeight = 90;
        this.earight = new ModelRenderer(this, 0, 22);
        this.earight.setRotationPoint(-0.8F, -0.9F, 6.9F);
        this.earight.addBox(0.0F, 0.0F, -0.1F, 2, 3, 1, 0.0F);
        this.setRotateAngle(earight, 0.7853981633974483F, 2.356194490192345F, -0.2617993877991494F);
        this.frontkneeright = new ModelRenderer(this, 56, 52);
        this.frontkneeright.setRotationPoint(1.5F, 8.7F, 3.0F);
        this.frontkneeright.addBox(-1.1F, -1.0F, -2.1F, 4, 8, 4, 0.0F);
        this.setRotateAngle(frontkneeright, 0.02617993877991494F, 0.0F, 0.0F);
        this.hormbottomright_1 = new ModelRenderer(this, 99, 0);
        this.hormbottomright_1.setRotationPoint(3.7F, 0.1F, 0.0F);
        this.hormbottomright_1.addBox(0.0F, 0.0F, 0.0F, 2, 5, 2, 0.0F);
        this.backthighleft = new ModelRenderer(this, 79, 29);
        this.backthighleft.setRotationPoint(8.0F, 8.8F, 8.0F);
        this.backthighleft.addBox(-2.5F, -2.0F, -2.5F, 4, 9, 5, 0.0F);
        this.setRotateAngle(backthighleft, -0.015707963267948967F, 0.0F, 0.0F);
        this.frontlegleft = new ModelRenderer(this, 74, 47);
        this.frontlegleft.setRotationPoint(0.5F, 2.2F, 0.0F);
        this.frontlegleft.addBox(-1.9F, 0.0F, -1.6F, 3, 13, 3, 0.0F);
        this.bump = new ModelRenderer(this, 50, 11);
        this.bump.setRotationPoint(2.0F, 0.3F, -0.8F);
        this.bump.addBox(0.0F, 0.0F, 0.0F, 6, 4, 8, 0.0F);
        this.setRotateAngle(bump, 0.36425021489121656F, 0.0F, 0.0F);
        this.tail = new ModelRenderer(this, 0, 41);
        this.tail.setRotationPoint(4.0F, 1.7F, 9.1F);
        this.tail.addBox(0.0F, 0.0F, 0.0F, 2, 12, 3, 0.0F);
        this.setRotateAngle(tail, 0.31869712141416456F, 0.0F, 0.0F);
        this.headfront = new ModelRenderer(this, 0, 35);
        this.headfront.setRotationPoint(0.0F, 2.1F, 0.4F);
        this.headfront.addBox(0.0F, 0.0F, 0.0F, 5, 1, 4, 0.0F);
        this.setRotateAngle(headfront, -0.22689280275926282F, 0.0F, 0.0F);
        this.earleft = new ModelRenderer(this, 0, 22);
        this.earleft.setRotationPoint(9.0F, -0.5F, 5.5F);
        this.earleft.addBox(0.0F, 0.0F, 0.0F, 2, 3, 1, 0.0F);
        this.setRotateAngle(earleft, 0.7853981633974483F, -2.356194490192345F, 0.2617993877991494F);
        this.backthighright = new ModelRenderer(this, 79, 29);
        this.backthighright.setRotationPoint(2.0F, 8.8F, 8.0F);
        this.backthighright.addBox(-1.5F, -2.0F, -2.5F, 4, 9, 5, 0.0F);
        this.setRotateAngle(backthighright, -0.015707963267948967F, 0.0F, 0.0F);
        this.hormtop_1 = new ModelRenderer(this, 31, 0);
        this.hormtop_1.setRotationPoint(0.0F, 4.9F, 0.5F);
        this.hormtop_1.addBox(0.0F, 0.0F, 0.0F, 1, 6, 1, 0.0F);
        this.dewflap = new ModelRenderer(this, 27, 11);
        this.dewflap.setRotationPoint(3.5F, 2.5F, 3.3F);
        this.dewflap.addBox(0.0F, 0.0F, 0.0F, 0, 7, 7, 0.0F);
        this.setRotateAngle(dewflap, -1.0016444577195458F, 0.0F, 0.0F);
        this.backlegright = new ModelRenderer(this, 86, 49);
        this.backlegright.setRotationPoint(0.0F, 5.0F, 0.0F);
        this.backlegright.addBox(-1.0F, 0.0F, -1.5F, 3, 10, 3, 0.0F);
        this.hormbottomright = new ModelRenderer(this, 99, 0);
        this.hormbottomright.setRotationPoint(0.6F, 1.9F, 3.8F);
        this.hormbottomright.addBox(0.0F, 0.0F, 0.0F, 2, 5, 2, 0.0F);
        this.setRotateAngle(hormbottomright, 1.9123572614101867F, 0.0F, 0.0F);
        this.neckmiddle = new ModelRenderer(this, 37, 0);
        this.neckmiddle.setRotationPoint(1.2F, -0.4F, -4.2F);
        this.neckmiddle.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(neckmiddle, -0.22759093446006054F, 0.0F, 0.0F);
        this.frontlegright = new ModelRenderer(this, 74, 47);
        this.frontlegright.setRotationPoint(0.5F, 2.2F, 0.0F);
        this.frontlegright.addBox(-1.1F, 0.0F, -1.6F, 3, 13, 3, 0.0F);
        this.backfootright = new ModelRenderer(this, 93, 64);
        this.backfootright.setRotationPoint(0.0F, 5.0F, 0.1F);
        this.backfootright.addBox(-1.5F, 5.0F, -2.0F, 4, 2, 4, 0.0F);
        this.headmiddle = new ModelRenderer(this, 73, 0);
        this.headmiddle.setRotationPoint(1.0F, 2.5F, -4.9F);
        this.headmiddle.addBox(0.0F, 0.0F, 0.0F, 5, 3, 5, 0.0F);
        this.setRotateAngle(headmiddle, 0.22759093446006054F, -0.019381909172257912F, 0.0F);
        this.frontfootleft = new ModelRenderer(this, 52, 64);
        this.frontfootleft.setRotationPoint(0.0F, 8.0F, 0.0F);
        this.frontfootleft.addBox(-2.4F, 5.0F, -2.1F, 4, 2, 4, 0.0F);
        this.headback = new ModelRenderer(this, 0, 20);
        this.headback.setRotationPoint(-1.0F, 4.4F, -5.6F);
        this.headback.addBox(0.0F, 0.0F, 0.0F, 7, 6, 7, 0.0F);
        this.setRotateAngle(headback, 0.7285004297824331F, 0.0F, 0.0F);
        this.frontfootright = new ModelRenderer(this, 52, 64);
        this.frontfootright.setRotationPoint(0.0F, 8.0F, 0.0F);
        this.frontfootright.addBox(-1.6F, 5.0F, -2.1F, 4, 2, 4, 0.0F);
        this.bodyback = new ModelRenderer(this, 60, 67);
        this.bodyback.setRotationPoint(0.0F, 0.0F, 12.6F);
        this.bodyback.addBox(0.0F, 0.0F, 0.0F, 10, 11, 12, 0.0F);
        this.setRotateAngle(bodyback, 0.03316125578789226F, 0.0F, 0.0F);
        this.frontkneeleft = new ModelRenderer(this, 56, 52);
        this.frontkneeleft.setRotationPoint(7.5F, 8.7F, 3.0F);
        this.frontkneeleft.addBox(-1.9F, -1.0F, -2.1F, 4, 8, 4, 0.0F);
        this.setRotateAngle(frontkneeleft, 0.02617993877991494F, 0.0F, 0.0F);
        this.hormtop = new ModelRenderer(this, 31, 0);
        this.hormtop.setRotationPoint(0.0F, 4.9F, 0.5F);
        this.hormtop.addBox(0.0F, 0.0F, 0.0F, 1, 6, 1, 0.0F);
        this.necktop = new ModelRenderer(this, 45, 38);
        this.necktop.setRotationPoint(-0.2F, -0.7F, 0.6F);
        this.necktop.addBox(0.0F, 0.0F, 0.0F, 5, 7, 7, 0.0F);
        this.hormmid_1 = new ModelRenderer(this, 41, 1);
        this.hormmid_1.setRotationPoint(0.0F, 4.4F, 0.0F);
        this.hormmid_1.addBox(0.0F, 0.0F, 0.0F, 1, 5, 2, 0.0F);
        this.setRotateAngle(hormmid_1, 0.0F, 0.27314402793711257F, -0.22759093446006054F);
        this.bump_1 = new ModelRenderer(this, 50, 11);
        this.bump_1.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.bump_1.addBox(0.0F, 0.0F, 0.0F, 6, 4, 7, 0.0F);
        this.setRotateAngle(bump_1, -0.7740535232594852F, 0.0F, 0.0F);
        this.backlegleft = new ModelRenderer(this, 86, 49);
        this.backlegleft.setRotationPoint(0.0F, 5.0F, 0.0F);
        this.backlegleft.addBox(-2.0F, 0.0F, -1.5F, 3, 10, 3, 0.0F);
        this.backfootleft = new ModelRenderer(this, 93, 64);
        this.backfootleft.setRotationPoint(0.0F, 5.0F, 0.0F);
        this.backfootleft.addBox(-2.5F, 5.0F, -2.0F, 4, 2, 4, 0.0F);
        this.bodymiddle = new ModelRenderer(this, 8, 64);
        this.bodymiddle.setRotationPoint(-6.0F, 0.6F, -10.6F);
        this.bodymiddle.addBox(0.0F, 0.0F, 0.0F, 10, 11, 13, 0.0F);
        this.setRotateAngle(bodymiddle, -0.02617993877991494F, 0.0F, 0.0F);
        this.hormmid = new ModelRenderer(this, 41, 1);
        this.hormmid.setRotationPoint(0.9F, 4.4F, -0.2F);
        this.hormmid.addBox(0.0F, 0.0F, 0.0F, 1, 5, 2, 0.0F);
        this.setRotateAngle(hormmid, 0.0F, -0.27314402793711257F, 0.22759093446006054F);
        this.neckbottom = new ModelRenderer(this, 0, 0);
        this.neckbottom.setRotationPoint(1.5F, -1.4F, -3.4F);
        this.neckbottom.addBox(0.0F, 0.0F, 0.0F, 7, 8, 8, 0.0F);
        this.setRotateAngle(neckbottom, -0.36425021489121656F, 0.0F, 0.0F);
        this.headback.addChild(this.earight);
        this.bodymiddle.addChild(this.frontkneeright);
        this.hormbottomright.addChild(this.hormbottomright_1);
        this.bodyback.addChild(this.backthighleft);
        this.frontkneeleft.addChild(this.frontlegleft);
        this.bodymiddle.addChild(this.bump);
        this.bodyback.addChild(this.tail);
        this.headmiddle.addChild(this.headfront);
        this.headback.addChild(this.earleft);
        this.bodyback.addChild(this.backthighright);
        this.hormmid_1.addChild(this.hormtop_1);
        this.neckbottom.addChild(this.dewflap);
        this.backthighright.addChild(this.backlegright);
        this.headback.addChild(this.hormbottomright);
        this.neckbottom.addChild(this.neckmiddle);
        this.frontkneeright.addChild(this.frontlegright);
        this.backlegright.addChild(this.backfootright);
        this.headback.addChild(this.headmiddle);
        this.frontlegleft.addChild(this.frontfootleft);
        this.necktop.addChild(this.headback);
        this.frontlegright.addChild(this.frontfootright);
        this.bodymiddle.addChild(this.bodyback);
        this.bodymiddle.addChild(this.frontkneeleft);
        this.hormmid.addChild(this.hormtop);
        this.neckmiddle.addChild(this.necktop);
        this.hormbottomright_1.addChild(this.hormmid_1);
        this.bump.addChild(this.bump_1);
        this.backthighleft.addChild(this.backlegleft);
        this.backlegleft.addChild(this.backfootleft);
        this.hormbottomright.addChild(this.hormmid);
        this.bodymiddle.addChild(this.neckbottom);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
    	  setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    	GlStateManager.pushMatrix();
        GlStateManager.translate(this.bodymiddle.offsetX, this.bodymiddle.offsetY, this.bodymiddle.offsetZ);
        GlStateManager.translate(this.bodymiddle.rotationPointX * f5, this.bodymiddle.rotationPointY * f5, this.bodymiddle.rotationPointZ * f5);
        GlStateManager.scale(0.8D, 0.9D, 0.8D);
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