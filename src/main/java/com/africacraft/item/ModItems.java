package com.africacraft.item;

import com.africacraft.main.ArmorMaterials;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
    public static Item redstarpickaxe;


    public static void init() {

        redstarpickaxe = register(new ItemBooks(ArmorMaterials.starToolMaterial,"redstarpickaxe"));
    }

    private static <T extends Item> T register(T item) {
        GameRegistry.register(item);
        if (item instanceof ItemModelProvider) {
            ((ItemModelProvider)item).registerItemModel(item);
        }
        return item;
    }
}
