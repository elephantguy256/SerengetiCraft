package com.africacraft.mob;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * PalawanPeacock - Undefined
 * Created using Tabula 5.1.0
 */
public class ModelSecretaryBird extends ModelBase {
    public ModelRenderer body;
    public ModelRenderer tail;
    public ModelRenderer leg2;
    public ModelRenderer leg1;
    public ModelRenderer neck;
    public ModelRenderer shape14;
    public ModelRenderer shape14_1;
    public ModelRenderer shape9;
    public ModelRenderer shape20;
    public ModelRenderer shape9_1;
    public ModelRenderer shape20_1;
    public ModelRenderer head;
    public ModelRenderer beak;
    public ModelRenderer crest;
    public ModelRenderer beak_1;
    public ModelRenderer beak_2;
    public ModelRenderer beak_3;
    public ModelRenderer beak_4;
    public ModelRenderer beak_5;

    public ModelSecretaryBird() {
        this.textureWidth = 50;
        this.textureHeight = 100;
        this.shape14_1 = new ModelRenderer(this, 0, 50);
        this.shape14_1.setRotationPoint(10.0F, -1.5F, -2.9F);
        this.shape14_1.addBox(0.0F, 0.0F, 0.0F, 4, 10, 1, 0.0F);
        this.setRotateAngle(shape14_1, -0.091106186954104F, 0.0F, 1.5025539530419183F);
        this.beak_1 = new ModelRenderer(this, 33, 1);
        this.beak_1.setRotationPoint(2.8F, -0.7F, 1.3F);
        this.beak_1.addBox(0.5F, 0.1F, 0.0F, 1, 3, 2, 0.0F);
        this.setRotateAngle(beak_1, 3.141592653589793F, 0.0F, 2.276432943376204F);
        this.head = new ModelRenderer(this, 0, 64);
        this.head.setRotationPoint(1.5F, 5.8F, -0.2F);
        this.head.addBox(-0.5F, -0.8F, -1.2F, 4, 4, 3, 0.0F);
        this.setRotateAngle(head, 0.0F, 0.0F, 2.367539130330308F);
        this.beak_5 = new ModelRenderer(this, 32, 5);
        this.beak_5.setRotationPoint(0.1F, 2.0F, 0.4F);
        this.beak_5.addBox(0.2F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(beak_5, 0.22759093446006054F, 0.0F, 0.091106186954104F);
        this.body = new ModelRenderer(this, 0, 25);
        this.body.setRotationPoint(0.8F, 8.2F, 0.0F);
        this.body.addBox(-0.2F, -1.4F, -2.7F, 10, 5, 5, 0.0F);
        this.setRotateAngle(body, 0.0F, 1.5481070465189704F, 0.045553093477052F);
        this.shape9 = new ModelRenderer(this, 1, 57);
        this.shape9.setRotationPoint(-0.8F, 13.0F, -0.1F);
        this.shape9.addBox(0.0F, 0.0F, 0.0F, 1, 3, 2, 0.0F);
        this.setRotateAngle(shape9, 0.0F, 0.0F, -1.5025539530419183F);
        this.tail = new ModelRenderer(this, 0, 45);
        this.tail.setRotationPoint(1.6F, 0.1F, -2.1F);
        this.tail.addBox(-3.3F, 0.0F, -1.3F, 3, 12, 2, 0.0F);
        this.setRotateAngle(tail, -1.0016444577195458F, 1.5481070465189704F, 0.27314402793711257F);
        this.neck = new ModelRenderer(this, 0, 24);
        this.neck.setRotationPoint(8.6F, 0.8F, -0.7F);
        this.neck.addBox(-1.4F, 0.0F, -0.6F, 3, 6, 2, 0.0F);
        this.setRotateAngle(neck, 0.0F, -0.045553093477052F, -2.41309222380736F);
        this.leg2 = new ModelRenderer(this, 0, 0);
        this.leg2.mirror = true;
        this.leg2.setRotationPoint(3.8F, 2.8F, 0.9F);
        this.leg2.addBox(-0.9F, 0.0F, 0.5F, 1, 13, 1, 0.0F);
        this.beak_4 = new ModelRenderer(this, 32, 5);
        this.beak_4.setRotationPoint(0.1F, 0.2F, 0.2F);
        this.beak_4.addBox(0.1F, -0.2F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(beak_4, 0.0F, 0.0F, 0.091106186954104F);
        this.shape9_1 = new ModelRenderer(this, 1, 57);
        this.shape9_1.setRotationPoint(0.1F, 13.0F, -1.8F);
        this.shape9_1.addBox(0.0F, 0.0F, 0.0F, 1, 3, 2, 0.0F);
        this.setRotateAngle(shape9_1, 0.0F, 0.0F, -1.593485607070823F);
        this.shape20 = new ModelRenderer(this, 0, 57);
        this.shape20.setRotationPoint(-1.3F, 0.0F, 0.0F);
        this.shape20.addBox(0.0F, 0.0F, 0.0F, 2, 4, 2, 0.0F);
        this.shape20_1 = new ModelRenderer(this, 0, 57);
        this.shape20_1.setRotationPoint(-0.5F, 0.0F, -1.8F);
        this.shape20_1.addBox(0.0F, 0.0F, 0.0F, 2, 4, 2, 0.0F);
        this.beak = new ModelRenderer(this, 33, 1);
        this.beak.setRotationPoint(2.9F, 1.3F, 0.2F);
        this.beak.addBox(0.1F, -0.7F, -1.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(beak, 0.045553093477052F, 0.0F, -0.8651597102135892F);
        this.shape14 = new ModelRenderer(this, 0, 50);
        this.shape14.setRotationPoint(9.8F, 2.7F, 2.5F);
        this.shape14.addBox(0.0F, 0.0F, 0.0F, 4, 10, 1, 0.0F);
        this.setRotateAngle(shape14, -0.091106186954104F, 3.141592653589793F, 1.5481070465189704F);
        this.crest = new ModelRenderer(this, 21, 28);
        this.crest.setRotationPoint(0.5F, 0.8F, 0.1F);
        this.crest.addBox(-1.0F, 0.0F, -0.4F, 2, 5, 2, 0.0F);
        this.setRotateAngle(crest, 0.31869712141416456F, -1.593485607070823F, 1.6390387005478748F);
        this.beak_3 = new ModelRenderer(this, 32, 5);
        this.beak_3.setRotationPoint(0.1F, -0.3F, 0.0F);
        this.beak_3.addBox(-0.4F, -0.5F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(beak_3, -0.091106186954104F, 0.0F, -0.27314402793711257F);
        this.leg1 = new ModelRenderer(this, 0, 0);
        this.leg1.mirror = true;
        this.leg1.setRotationPoint(2.9F, 3.0F, -0.7F);
        this.leg1.addBox(0.2F, 0.0F, -1.3F, 1, 13, 1, 0.0F);
        this.beak_2 = new ModelRenderer(this, 32, 5);
        this.beak_2.setRotationPoint(0.2F, 0.8F, -0.6F);
        this.beak_2.addBox(0.0F, 0.3F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(beak_2, 0.091106186954104F, 0.0F, 0.5009094953223726F);
        this.body.addChild(this.shape14_1);
        this.head.addChild(this.beak_1);
        this.neck.addChild(this.head);
        this.beak_1.addChild(this.beak_5);
        this.leg2.addChild(this.shape9);
        this.body.addChild(this.tail);
        this.body.addChild(this.neck);
        this.body.addChild(this.leg2);
        this.beak_2.addChild(this.beak_4);
        this.leg1.addChild(this.shape9_1);
        this.leg2.addChild(this.shape20);
        this.leg1.addChild(this.shape20_1);
        this.head.addChild(this.beak);
        this.body.addChild(this.shape14);
        this.head.addChild(this.crest);
        this.beak_2.addChild(this.beak_3);
        this.body.addChild(this.leg1);
        this.beak.addChild(this.beak_2);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
    	  setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    	this.body.render(f5);
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
}
}
