package com.africacraft.item;

import com.africacraft.main.ACMain;

/**
 * Created by xavier on 11/8/2016.
 */

import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;


public class ItemShovels extends ItemSpade implements ItemModelProvider{

    private String name;

    public ItemShovels(ToolMaterial material, String name) {
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
