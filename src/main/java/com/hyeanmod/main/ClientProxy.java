package com.hyeanmod.main;

import com.hyenamod.mob.AfricaCraftElephant;
import com.hyenamod.mob.EntityAfricaCraftElephant;
import com.hyenamod.mob.EntityAfricanLeopard;
import com.hyenamod.mob.EntityAfricanWildDog;
import com.hyenamod.mob.EntityBlackLeopard;
import com.hyenamod.mob.EntityEland;
import com.hyenamod.mob.EntityGazelle;
import com.hyenamod.mob.EntityGemsbok;
import com.hyenamod.mob.EntityGiraffe;
import com.hyenamod.mob.EntityGiraffe2;
import com.hyenamod.mob.EntityGiraffe3;
import com.hyenamod.mob.EntityHippo;
import com.hyenamod.mob.EntityLion;
import com.hyenamod.mob.EntityLioness;
import com.hyenamod.mob.EntityPlainsZebra;
import com.hyenamod.mob.EntityRatel;
import com.hyenamod.mob.EntitySpottedHyena;
import com.hyenamod.mob.EntityWildebeest;
import com.hyenamod.mob.ModelAfricanLeopard;
import com.hyenamod.mob.ModelAfricanWildDog;
import com.hyenamod.mob.ModelBlueWildebeest;
import com.hyenamod.mob.ModelEland;
import com.hyenamod.mob.ModelGazelle;
import com.hyenamod.mob.ModelGemsbok;
import com.hyenamod.mob.ModelGiraffe;
import com.hyenamod.mob.ModelHippo;
import com.hyenamod.mob.ModelLion;
import com.hyenamod.mob.ModelLioness;
import com.hyenamod.mob.ModelPlainsZebra;
import com.hyenamod.mob.ModelRatel;
import com.hyenamod.mob.ModelSpottedHyena;
import com.hyenamod.mob.RenderAfricaCraftElephant;
import com.hyenamod.mob.RenderAfricanLeopard;
import com.hyenamod.mob.RenderAfricanWildDog;
import com.hyenamod.mob.RenderBlackLeopard;
import com.hyenamod.mob.RenderEland;
import com.hyenamod.mob.RenderGazelle;
import com.hyenamod.mob.RenderGemsbok;
import com.hyenamod.mob.RenderGiraffe;
import com.hyenamod.mob.RenderGiraffe2;
import com.hyenamod.mob.RenderGiraffe3;
import com.hyenamod.mob.RenderHippo;
import com.hyenamod.mob.RenderLion;
import com.hyenamod.mob.RenderLioness;
import com.hyenamod.mob.RenderPlainsZebra;
import com.hyenamod.mob.RenderRatel;
import com.hyenamod.mob.RenderSpottedHyena;
import com.hyenamod.mob.RenderWildebeest;
import com.hyenamod.mob.SoundEvents2;

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