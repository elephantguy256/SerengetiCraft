package com.ac.item;


import com.hyeanmod.main.ACMain;

import net.minecraft.item.Item;

public class ItemSwords extends net.minecraft.item.ItemSword implements ItemModelProvider{

    private String name;

    public ItemSwords(ToolMaterial material, String name) {
        super(material);
        setRegistryName(name);
        setUnlocalizedName(name);
        this.name = name;
        setCreativeTab(ACMain.AfricaCraft_Items);
    }

    public void registerItemModel(Item item) {
    	ACMain.proxy.registerItemRenderer(this, 0, name);
    }

}