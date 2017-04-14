package com.africacraft.item;


import com.africacraft.main.ACMain;

import net.minecraft.item.Item;

public class ItemHoes extends net.minecraft.item.ItemHoe implements ItemModelProvider {

    private String name;

    public ItemHoes(ToolMaterial material, String name) {
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