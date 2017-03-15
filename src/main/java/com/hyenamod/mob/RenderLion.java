package com.hyenamod.mob;

import javax.annotation.Nonnull;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderLion extends RenderLiving<EntityLion> {

    private ResourceLocation mobTexture = new ResourceLocation("wildanimals:textures/entity/bigcat/lion.png");


    public RenderLion(RenderManager rendermanagerIn, ModelLion modelLion, float f) {
        // We use the vanilla zombie model here and we simply
        // retexture it. Of course you can make your own model
        super(rendermanagerIn, new ModelLion(), 0.5F);
    }

	@Override
    @Nonnull
    protected ResourceLocation getEntityTexture(@Nonnull EntityLion entity) {
        return mobTexture;
    }
}