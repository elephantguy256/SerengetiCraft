package com.ac.item;


import com.hyeanmod.main.ACMain;

import net.minecraft.item.Item;

public class ItemAxes extends net.minecraft.item.ItemAxe implements ItemModelProvider {

    private String name;

    public ItemAxes(ToolMaterial material, String name) {
        super(material, 8f, -3.1f);
        setRegistryName(name);
        setUnlocalizedName(name);
        this.name = name;
        setCreativeTab(ACMain.AfricaCraft_Items);
    }

    public void registerItemModel(Item item) {
    	ACMain.proxy.registerItemRenderer(this, 0, name);
    }

}
