package com.hyenamod.mob;


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderRatel extends RenderLiving<EntityRatel>{
	
    private ResourceLocation mobTexture = new ResourceLocation("wildanimals:textures/entity/new/ratel.png");
    
	public RenderRatel(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn) {
		super(rendermanagerIn, modelbaseIn, shadowsizeIn);
	}
	
    /**
     * Renders the desired {@code T} type Entity.
     */
    public void doRender(EntityRatel entity, double x, double y, double z, float entityYaw, float partialTicks)
    {
        super.doRender(entity, x, y, z, entityYaw, partialTicks);
    }

    /**
     * Allows the render to do state modifications necessary before the model is rendered.
     */
    protected void preRenderCallback(EntityRatel entitylivingbaseIn, float partialTickTime)
    { 
        super.preRenderCallback(entitylivingbaseIn, partialTickTime);
    }

	@Override
	protected ResourceLocation getEntityTexture(EntityRatel entity) {
		return mobTexture;
	}
}