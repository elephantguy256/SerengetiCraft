package com.africacraft.item;

import com.africacraft.main.ACMain;

import net.minecraft.item.Item;

public class BaseItems extends Item implements ItemModelProvider{

    protected String name;

    public BaseItems(String name) {
        this.name = name;
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(ACMain.AfricaCraft_Items);
    }
    @Override
    public void registerItemModel(Item item) {
    	ACMain.proxy.registerItemRenderer(this, 0, name);
    }

}