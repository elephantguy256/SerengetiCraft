package com.ac.item;


import com.hyeanmod.main.ACMain;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.ai.gui.type.GuiAnimalEncyclopedia;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class ItemBooks extends net.minecraft.item.ItemPickaxe implements ItemModelProvider {

    private String name;

    public ItemBooks(ToolMaterial material, String name) {
        super(material);
        setRegistryName(name);
        setUnlocalizedName(name);
        this.name = name;
        setCreativeTab(ACMain.AfricaCraft_Items);
    }


    public void registerItemModel(Item item) {
    	ACMain.proxy.registerItemRenderer(this, 0, name);
    }


@Override
public ActionResult<ItemStack> onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn, EnumHand hand) {
    Minecraft.getMinecraft().displayGuiScreen(new GuiAnimalEncyclopedia());
    return super.onItemRightClick(itemStackIn, worldIn, playerIn, hand);
}
}
