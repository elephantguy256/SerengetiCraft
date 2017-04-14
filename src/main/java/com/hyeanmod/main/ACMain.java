package com.hyeanmod.main;


import com.ac.entity.ModEntities;
import com.ac.item.ModItems;
import com.hyenamod.mob.SoundEvents2;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = ACMain.MODID, name = ACMain.MODNAME, version = ACMain.MODVERSION)


public class ACMain {

        public static final String MODID = "wildanimals";
        public static final String MODNAME = "SerengetiCraft, an African Safari Experience";
        public static final String MODVERSION = "0.0.1";

        public static final CreativeTabs AfricaCraft_Items = new CreativeTabs("AfricaCraft_Items") {
            @Override public Item getTabIconItem() {
                return ModItems.redstarpickaxe;
            }
        };

    	@SidedProxy(clientSide="com.hyeanmod.main.ClientProxy", serverSide="com.hyeanmod.main.ServerProxy")
        public static CommonProxy proxy;

        @Mod.Instance
        public static ACMain instance;

        public static org.apache.logging.log4j.Logger logger;

        @Mod.EventHandler
        public void preInit(FMLPreInitializationEvent e) {
            logger = e.getModLog();
            proxy.preInit(e);
        }

        @Mod.EventHandler
        public void init(FMLInitializationEvent e) {
            proxy.init(e);
            proxy.registerRenders();
		    proxy.registerRenders(); 
		    ModEntities.registerEntity();
			SoundEvents2.registerSounds();
        }

        @Mod.EventHandler
        public void postInit(FMLPostInitializationEvent e) {
            proxy.postInit(e);
        }

        public static ACMain getInstance(){

        return instance;

        }
}
