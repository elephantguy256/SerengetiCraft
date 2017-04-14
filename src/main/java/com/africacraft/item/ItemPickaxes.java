package com.africacraft.item;


import com.africacraft.main.ACMain;

import net.minecraft.item.Item;

public class ItemPickaxes extends net.minecraft.item.ItemPickaxe implements ItemModelProvider {

    private String name;

    public ItemPickaxes(ToolMaterial material, String name) {
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