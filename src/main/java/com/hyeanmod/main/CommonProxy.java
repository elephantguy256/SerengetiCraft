package com.hyeanmod.main;

import com.ac.item.ModItems;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


public class CommonProxy {
        public void preInit(FMLPreInitializationEvent e) {
            ModItems.init();
        }

        public void init(FMLInitializationEvent e) {
        }

        public void postInit(FMLPostInitializationEvent e) {

        }

    public void registerRenders(){
    }

    public void registerItemRenderer(Item item, int meta, String id) {
    }
}
