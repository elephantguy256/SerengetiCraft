package com.africacraft.main;

import com.africacraft.mob.AfricaCraftElephant;
import com.africacraft.mob.EntityAfricaCraftElephant;
import com.africacraft.mob.EntityAfricanLeopard;
import com.africacraft.mob.EntityAfricanWildDog;
import com.africacraft.mob.EntityBlackLeopard;
import com.africacraft.mob.EntityEland;
import com.africacraft.mob.EntityGazelle;
import com.africacraft.mob.EntityGemsbok;
import com.africacraft.mob.EntityGiraffe;
import com.africacraft.mob.EntityGiraffe2;
import com.africacraft.mob.EntityGiraffe3;
import com.africacraft.mob.EntityHippo;
import com.africacraft.mob.EntityLion;
import com.africacraft.mob.EntityLioness;
import com.africacraft.mob.EntityPlainsZebra;
import com.africacraft.mob.EntityRatel;
import com.africacraft.mob.EntitySpottedHyena;
import com.africacraft.mob.EntityWildebeest;
import com.africacraft.mob.ModelAfricanLeopard;
import com.africacraft.mob.ModelAfricanWildDog;
import com.africacraft.mob.ModelBlueWildebeest;
import com.africacraft.mob.ModelEland;
import com.africacraft.mob.ModelGazelle;
import com.africacraft.mob.ModelGemsbok;
import com.africacraft.mob.ModelGiraffe;
import com.africacraft.mob.ModelHippo;
import com.africacraft.mob.ModelLion;
import com.africacraft.mob.ModelLioness;
import com.africacraft.mob.ModelPlainsZebra;
import com.africacraft.mob.ModelRatel;
import com.africacraft.mob.ModelSpottedHyena;
import com.africacraft.mob.RenderAfricaCraftElephant;
import com.africacraft.mob.RenderAfricanLeopard;
import com.africacraft.mob.RenderAfricanWildDog;
import com.africacraft.mob.RenderBlackLeopard;
import com.africacraft.mob.RenderEland;
import com.africacraft.mob.RenderGazelle;
import com.africacraft.mob.RenderGemsbok;
import com.africacraft.mob.RenderGiraffe;
import com.africacraft.mob.RenderGiraffe2;
import com.africacraft.mob.RenderGiraffe3;
import com.africacraft.mob.RenderHippo;
import com.africacraft.mob.RenderLion;
import com.africacraft.mob.RenderLioness;
import com.africacraft.mob.RenderPlainsZebra;
import com.africacraft.mob.RenderRatel;
import com.africacraft.mob.RenderSpottedHyena;
import com.africacraft.mob.RenderWildebeest;
import com.africacraft.mob.SoundEvents2;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy{
    @Override
    public void registerItemRenderer(Item item, int meta, String id) {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(ACMain.MODID + ":" + id, "inventory"));
    }

	
	public void preInit() {
    	SoundEvents2.registerSounds();
	}
	


	
    public void registerRenders() 
    {
        // the float parameter passed to the Render class is the shadow size for the entity
	//The code below is deprecated, don't have time rn, but it needs to be changed to IRenderFactory instead of RenderingRegistery
        RenderManager renderManager = Minecraft.getMinecraft().getRenderManager();
        // RenderingRegistry.registerEntityRenderingHandler(EntityGoldenGoose.class, new RenderGoldenGoose(renderManager, new ModelGoldenGoose(), 0.5F)); // 0.5F is shadow size 
    	RenderingRegistry.registerEntityRenderingHandler(EntitySpottedHyena.class, new RenderSpottedHyena(renderManager, new ModelSpottedHyena(), 0.5F));
    	RenderingRegistry.registerEntityRenderingHandler(EntityAfricaCraftElephant.class, new RenderAfricaCraftElephant(renderManager, new AfricaCraftElephant(), 0.5F));
    	RenderingRegistry.registerEntityRenderingHandler(EntityLion.class, new RenderLion(renderManager, new ModelLion(), 0.5F));
    	RenderingRegistry.registerEntityRenderingHandler(EntityLioness.class, new RenderLioness(renderManager, new ModelLioness(), 0.5F));
    	RenderingRegistry.registerEntityRenderingHandler(EntityAfricanLeopard.class, new RenderAfricanLeopard(renderManager, new ModelAfricanLeopard(), 0.5F));
    	RenderingRegistry.registerEntityRenderingHandler(EntityRatel.class, new RenderRatel(renderManager, new ModelRatel(), 0.5F));
    	RenderingRegistry.registerEntityRenderingHandler(EntityWildebeest.class, new RenderWildebeest(renderManager, new ModelBlueWildebeest(), 0.5F));
    	RenderingRegistry.registerEntityRenderingHandler(EntityPlainsZebra.class, new RenderPlainsZebra(renderManager, new ModelPlainsZebra(), 0.5F));
    	RenderingRegistry.registerEntityRenderingHandler(EntityGazelle.class, new RenderGazelle(renderManager, new ModelGazelle(), 0.5F));
    	RenderingRegistry.registerEntityRenderingHandler(EntityGemsbok.class, new RenderGemsbok(renderManager, new ModelGemsbok(), 0.5F));
    	RenderingRegistry.registerEntityRenderingHandler(EntityGiraffe.class, new RenderGiraffe(renderManager, new ModelGiraffe(), 0.5F));
    	RenderingRegistry.registerEntityRenderingHandler(EntityGiraffe2.class, new RenderGiraffe2(renderManager, new ModelGiraffe(), 0.5F));
    	RenderingRegistry.registerEntityRenderingHandler(EntityGiraffe3.class, new RenderGiraffe3(renderManager, new ModelGiraffe(), 0.5F));
    	RenderingRegistry.registerEntityRenderingHandler(EntityHippo.class, new RenderHippo(renderManager, new ModelHippo(), 0.5F));
    	RenderingRegistry.registerEntityRenderingHandler(EntityAfricanWildDog.class, new RenderAfricanWildDog(renderManager, new ModelAfricanWildDog(), 0.5F));
    	RenderingRegistry.registerEntityRenderingHandler(EntityBlackLeopard.class, new RenderBlackLeopard(renderManager, new ModelAfricanLeopard(), 0.5F));
    	RenderingRegistry.registerEntityRenderingHandler(EntityEland.class, new RenderEland(renderManager, new ModelEland(), 0.5F));

    }
}
