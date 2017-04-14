package com.africacraft.mob;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * LukeWolfHyena - Undefined
 * Created using Tabula 5.1.0
 */
public class ModelSpottedHyena extends ModelBase {
    public ModelRenderer shape1;
    public ModelRenderer shape2;
    public ModelRenderer tail;
    public ModelRenderer backleg1;
    public ModelRenderer legback;
    public ModelRenderer shape32222;
    public ModelRenderer shape12222;
    public ModelRenderer legfront1;
    public ModelRenderer legfront;
    public ModelRenderer shape28;
    public ModelRenderer shape32;
    public ModelRenderer shape302;
    public ModelRenderer shape37;
    public ModelRenderer shape378;
    public ModelRenderer shape301;
    public ModelRenderer shape42;
    public ModelRenderer kneefront1;
    public ModelRenderer footfront1;
    public ModelRenderer kneefront;
    public ModelRenderer footfront;
    public ModelRenderer backknee1;
    public ModelRenderer backfoot1;
    public ModelRenderer kneeback;
    public ModelRenderer backfeet;

    public ModelSpottedHyena() {
        this.textureWidth = 50;
        this.textureHeight = 100;
        this.shape32 = new ModelRenderer(this, 0, 51);
        this.shape32.setRotationPoint(-0.3F, -1.4F, -5.2F);
        this.shape32.addBox(0.0F, 0.0F, 0.0F, 1, 8, 2, 0.0F);
        this.setRotateAngle(shape32, 1.6915731110329044F, 0.0F, 0.0F);
        this.backknee1 = new ModelRenderer(this, 22, 39);
        this.backknee1.setRotationPoint(0.4F, 2.7F, 0.7F);
        this.backknee1.addBox(0.0F, 0.0F, 0.0F, 3, 4, 2, 0.0F);
        this.setRotateAngle(backknee1, 0.24172810140121462F, 0.0F, 0.0F);
        this.shape301 = new ModelRenderer(this, 7, 51);
        this.shape301.setRotationPoint(-0.7F, 2.4F, -2.3F);
        this.shape301.addBox(-1.9F, -1.1F, -4.7F, 4, 1, 6, 0.0F);
        this.setRotateAngle(shape301, 0.13665928043115597F, 0.0F, 0.0F);
        this.kneefront = new ModelRenderer(this, 22, 39);
        this.kneefront.setRotationPoint(-0.9F, 3.8F, -0.9F);
        this.kneefront.addBox(0.0F, 0.0F, 0.0F, 3, 6, 2, 0.0F);
        this.footfront = new ModelRenderer(this, 22, 0);
        this.footfront.setRotationPoint(0.1F, 5.9F, -1.1F);
        this.footfront.addBox(0.0F, 0.0F, 0.0F, 3, 3, 2, 0.0F);
        this.setRotateAngle(footfront, 1.5481070465189704F, 0.0F, 0.0F);
        this.shape378 = new ModelRenderer(this, 7, 39);
        this.shape378.setRotationPoint(1.8F, -6.2F, 0.5F);
        this.shape378.addBox(0.0F, 0.0F, 0.0F, 1, 4, 3, 0.0F);
        this.setRotateAngle(shape378, -0.18203784098300857F, 1.5428710587629875F, 0.045553093477052F);
        this.tail = new ModelRenderer(this, 0, 9);
        this.tail.setRotationPoint(0.5F, -0.20000000000000018F, 7.2F);
        this.tail.addBox(-1.5F, 0.0F, 0.0F, 3, 8, 2, 0.0F);
        this.setRotateAngle(tail, 0.5019566928735693F, 0.0F, 0.0F);
        this.backfoot1 = new ModelRenderer(this, 22, 0);
        this.backfoot1.setRotationPoint(0.1F, 5.8F, -1.4F);
        this.backfoot1.addBox(0.0F, 0.0F, 0.0F, 3, 3, 3, 0.0F);
        this.setRotateAngle(backfoot1, 1.4313445195605496F, 0.0F, 0.0F);
        this.shape12222 = new ModelRenderer(this, 0, 64);
        this.shape12222.setRotationPoint(-1.0F, 1.5F, -6.2F);
        this.shape12222.addBox(-3.5F, -2.1F, -4.1F, 8, 6, 8, 0.0F);
        this.setRotateAngle(shape12222, 0.1097812099504433F, 0.0F, 0.0F);
        this.backfeet = new ModelRenderer(this, 22, 0);
        this.backfeet.setRotationPoint(0.0F, 5.8F, -1.4F);
        this.backfeet.addBox(0.0F, 0.0F, 0.0F, 3, 3, 3, 0.0F);
        this.setRotateAngle(backfeet, 1.505695545695508F, 0.0F, 0.0F);
        this.shape302 = new ModelRenderer(this, 0, 0);
        this.shape302.setRotationPoint(-1.0F, -0.7F, -3.0F);
        this.shape302.addBox(-1.7F, -1.0F, -4.0F, 4, 3, 6, 0.0F);
        this.shape37 = new ModelRenderer(this, 7, 39);
        this.shape37.setRotationPoint(-5.8F, -5.8F, 0.4F);
        this.shape37.addBox(0.0F, 0.0F, 0.0F, 1, 4, 3, 0.0F);
        this.setRotateAngle(shape37, 0.0F, 1.505695545695508F, -0.136659280431156F);
        this.legfront1 = new ModelRenderer(this, 22, 39);
        this.legfront1.setRotationPoint(1.4F, 8.7F, -4.2F);
        this.legfront1.addBox(-1.6F, -1.8F, -0.2F, 4, 5, 3, 0.0F);
        this.setRotateAngle(legfront1, 0.2731440279371124F, 0.0F, 0.0F);
        this.kneeback = new ModelRenderer(this, 22, 39);
        this.kneeback.setRotationPoint(0.4F, 2.8F, 0.5F);
        this.kneeback.addBox(0.0F, 0.0F, 0.0F, 3, 4, 2, 0.0F);
        this.setRotateAngle(kneeback, 0.24172810140121462F, 0.0F, 0.0F);
        this.shape28 = new ModelRenderer(this, 1, 85);
        this.shape28.setRotationPoint(0.7F, 1.8F, -5.1F);
        this.shape28.addBox(-4.7F, -3.7F, -3.9F, 8, 7, 7, 0.0F);
        this.setRotateAngle(shape28, 0.32951816277652934F, 0.0F, 0.0F);
        this.shape32222 = new ModelRenderer(this, 0, 51);
        this.shape32222.setRotationPoint(0.2F, -2.7F, -1.7F);
        this.shape32222.addBox(0.0F, 0.0F, 0.0F, 1, 8, 2, 0.0F);
        this.setRotateAngle(shape32222, 1.5428710587629875F, 0.0F, 0.0F);
        this.backleg1 = new ModelRenderer(this, 22, 39);
        this.backleg1.setRotationPoint(0.8F, 5.1F, 5.6F);
        this.backleg1.addBox(0.0F, 0.0F, 0.0F, 4, 4, 3, 0.0F);
        this.setRotateAngle(backleg1, -0.021991148575128516F, 0.0F, 0.0F);
        this.shape2 = new ModelRenderer(this, 0, 25);
        this.shape2.setRotationPoint(1.3F, -2.2F, 0.2F);
        this.shape2.addBox(-5.1F, -0.9F, -6.2F, 9, 9, 10, 0.0F);
        this.setRotateAngle(shape2, -0.09302604913129774F, 0.0F, 0.0F);
        this.legback = new ModelRenderer(this, 22, 38);
        this.legback.setRotationPoint(-4.2F, 5.3F, 5.7F);
        this.legback.addBox(0.1F, -1.4F, 0.0F, 4, 5, 3, 0.0F);
        this.setRotateAngle(legback, 0.02199114857512864F, 0.0F, 0.0F);
        this.shape1 = new ModelRenderer(this, 4, 26);
        this.shape1.setRotationPoint(-3.4F, 11.399999999999999F, -0.7000000000000002F);
        this.shape1.addBox(-4.0F, -3.0F, 0.0F, 9, 9, 9, 0.0F);
        this.setRotateAngle(shape1, -0.13665928043115583F, 0.0F, 0.0F);
        this.footfront1 = new ModelRenderer(this, 22, 0);
        this.footfront1.setRotationPoint(0.1F, 5.8F, -1.1F);
        this.footfront1.addBox(-1.3F, 0.0F, 0.0F, 3, 3, 2, 0.0F);
        this.setRotateAngle(footfront1, 1.5481070465189704F, 0.0F, 0.0F);
        this.kneefront1 = new ModelRenderer(this, 22, 39);
        this.kneefront1.setRotationPoint(0.4F, 2.8F, 0.5F);
        this.kneefront1.addBox(-1.3F, 0.0F, 0.0F, 3, 5, 2, 0.0F);
        this.legfront = new ModelRenderer(this, 17, 39);
        this.legfront.setRotationPoint(-3.3F, 7.7F, -3.4F);
        this.legfront.addBox(-1.5F, 0.0F, -1.4F, 4, 4, 3, 0.0F);
        this.setRotateAngle(legfront, 0.3295181627765294F, 0.0F, 0.0F);
        this.shape42 = new ModelRenderer(this, 0, 0);
        this.shape42.setRotationPoint(-1.2F, -1.0F, -3.5F);
        this.shape42.addBox(0.0F, 0.0F, 0.0F, 3, 2, 5, 0.0F);
        this.setRotateAngle(shape42, 0.27314402793711257F, 0.0F, 0.0F);
        this.shape12222.addChild(this.shape32);
        this.backleg1.addChild(this.backknee1);
        this.shape28.addChild(this.shape301);
        this.legfront.addChild(this.kneefront);
        this.kneefront.addChild(this.footfront);
        this.shape28.addChild(this.shape378);
        this.shape1.addChild(this.tail);
        this.backknee1.addChild(this.backfoot1);
        this.shape2.addChild(this.shape12222);
        this.kneeback.addChild(this.backfeet);
        this.shape28.addChild(this.shape302);
        this.shape28.addChild(this.shape37);
        this.shape2.addChild(this.legfront1);
        this.legback.addChild(this.kneeback);
        this.shape12222.addChild(this.shape28);
        this.shape1.addChild(this.shape32222);
        this.shape1.addChild(this.backleg1);
        this.shape1.addChild(this.shape2);
        this.shape1.addChild(this.legback);
        this.kneefront1.addChild(this.footfront1);
        this.legfront1.addChild(this.kneefront1);
        this.shape2.addChild(this.legfront);
        this.shape302.addChild(this.shape42);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
  	  setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    	GlStateManager.pushMatrix();
        GlStateManager.translate(this.shape1.offsetX, this.shape1.offsetY, this.shape1.offsetZ);
        GlStateManager.translate(this.shape1.rotationPointX * f5, this.shape1.rotationPointY * f5, this.shape1.rotationPointZ * f5);
        GlStateManager.scale(0.8D, 0.9D, 1.1D);
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

public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity)
{
	this.backleg1.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
	this.legback.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
	this.legfront.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
	this.legfront1.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;

}
}