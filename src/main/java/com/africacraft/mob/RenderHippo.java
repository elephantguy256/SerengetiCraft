package com.africacraft.mob;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderHippo extends RenderLiving<EntityHippo> {
		
	    private ResourceLocation mobTexture = new ResourceLocation("africacraft:textures/entity/hippo/hippo.png");
	    
		public RenderHippo(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn) {
			super(rendermanagerIn, modelbaseIn, shadowsizeIn);
		}

	    /**
	     * Renders the desired {@code T} type Entity.
	     */
	    public void doRender(EntityHippo entity, double x, double y, double z, float entityYaw, float partialTicks)
	    {
	        super.doRender(entity, x, y, z, entityYaw, partialTicks);
	    }

	    /**
	     * Allows the render to do state modifications necessary before the model is rendered.
	     */
	    protected void preRenderCallback(EntityHippo entitylivingbaseIn, float partialTickTime)
	    {
	        super.preRenderCallback(entitylivingbaseIn, partialTickTime);
	    }

		@Override
		protected ResourceLocation getEntityTexture(EntityHippo entity) {
			return mobTexture;
		}
	}