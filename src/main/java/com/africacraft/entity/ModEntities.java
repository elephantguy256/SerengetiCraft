package com.africacraft.entity;

import com.africacraft.main.ACMain;
import com.africacraft.mob.EntityAfricaCraftElephant;
import com.africacraft.mob.EntityAfricanLeopard;
import com.africacraft.mob.EntityAfricanWildDog;
import com.africacraft.mob.EntityBlackLeopard;
import com.africacraft.mob.EntityEland;
import com.africacraft.mob.EntityGazelle;
import com.africacraft.mob.EntityGemsbok;
import com.africacraft.mob.EntityGiraffe;
import com.africacraft.mob.EntityGiraffe2;
import com.africacraft.mob.EntityGiraffe3;
import com.africacraft.mob.EntityHippo;
import com.africacraft.mob.EntityLion;
import com.africacraft.mob.EntityLioness;
import com.africacraft.mob.EntityPlainsZebra;
import com.africacraft.mob.EntityRatel;
import com.africacraft.mob.EntitySpottedHyena;
import com.africacraft.mob.EntityWildebeest;

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Biomes;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class ModEntities {
	
public static void registerEntity(){
	        // Every entity in our mod has an ID (local to this mod)
	        int id = 1;
	        EntityRegistry.registerModEntity(EntitySpottedHyena.class, "Spotted Hyena", id++, ACMain.instance, 64, 3, true, 0xffcc66, 0x7e4e41);
	        EntityRegistry.registerModEntity(EntityLion.class, "African Lion Male", id++, ACMain.instance, 64, 3, true, 0xe3bd60, 0x63482e);
		EntityRegistry.registerModEntity(EntityLioness.class, "African Lion Female", id++, ACMain.instance, 64, 3, true, 0xe3bd60, 0x63482e);
	        EntityRegistry.registerModEntity(EntityAfricaCraftElephant.class, "African Elephant", id++, ACMain.instance, 64, 3, true, 0x606060, 0x363535);
	        EntityRegistry.registerModEntity(EntityGiraffe.class, "Masai Giraffe", id++, ACMain.instance, 64, 3, true, 0xffb870, 0x662d10);
	        EntityRegistry.registerModEntity(EntityGiraffe2.class, "Reticulated Giraffe", id++, ACMain.instance, 64, 3, true, 0x662d10, 0xffb870);
	        EntityRegistry.registerModEntity(EntityGiraffe3.class, "Rothschild Giraffe", id++, ACMain.instance, 64, 3, true, 0xffb870, 0xcc5a20);
	        EntityRegistry.registerModEntity(EntityAfricanWildDog.class, "African Wild Dog", id++, ACMain.instance, 64, 3, true, 0xff7129, 0x2f2e2e);
	        EntityRegistry.registerModEntity(EntityWildebeest.class, "Wildebeest", id++, ACMain.instance, 64, 3, true, 0xbf9367, 0x383533);
	        EntityRegistry.registerModEntity(EntityHippo.class, "Hippopotamus", id++, ACMain.instance, 64, 3, true, 0x724d6a, 0xeea3df);
	        EntityRegistry.registerModEntity(EntityGemsbok.class, "Gemsbok", id++, ACMain.instance, 64, 3, true, 0xdfc091, 0x363535);
	        EntityRegistry.registerModEntity(EntityGazelle.class, "Thomson's Gazelle", id++, ACMain.instance, 64, 3, true, 0xdda95a, 0xececec);
	        EntityRegistry.registerModEntity(EntityPlainsZebra.class, "Savanna Zebra", id++, ACMain.instance, 64, 3, true, 0xfbfbfb, 0x313131);
	        EntityRegistry.registerModEntity(EntityAfricanLeopard.class, "African Leopard", id++, ACMain.instance, 64, 3, true, 0xd4b793, 0x3e3e3e);
	        EntityRegistry.registerModEntity(EntityBlackLeopard.class, "Black Leopard", id++, ACMain.instance, 64, 3, true, 0x3e3e3e, 0xc1bbb5);
	        EntityRegistry.registerModEntity(EntityEland.class, "Common Eland", id++, ACMain.instance, 64, 3, true, 0xf4cb97, 0xd4d4d4);
	        EntityRegistry.registerModEntity(EntityRatel.class, "Honey Badger", id++, ACMain.instance, 64, 3, true, 0x63431d, 0xdfb37d);

	addNaturalSpawns();
}

public static void addNaturalSpawns(){
	EntityRegistry.addSpawn(EntitySpottedHyena.class, 1, 2, 5, EnumCreatureType.AMBIENT, Biomes.SAVANNA_PLATEAU, Biomes.SAVANNA);
    EntityRegistry.addSpawn(EntityLion.class, 1, 3, 5, EnumCreatureType.AMBIENT, Biomes.SAVANNA, Biomes.SAVANNA);
    EntityRegistry.addSpawn(EntityAfricaCraftElephant.class, 1, 3, 5, EnumCreatureType.AMBIENT, Biomes.SAVANNA_PLATEAU, Biomes.SAVANNA);
    EntityRegistry.addSpawn(EntityGiraffe.class, 1, 3, 5, EnumCreatureType.AMBIENT, Biomes.SAVANNA, Biomes.SAVANNA);
    EntityRegistry.addSpawn(EntityGiraffe2.class, 1, 3, 5, EnumCreatureType.AMBIENT, Biomes.SAVANNA_PLATEAU, Biomes.SAVANNA);
    EntityRegistry.addSpawn(EntityGiraffe3.class, 1, 3, 5, EnumCreatureType.AMBIENT, Biomes.SAVANNA, Biomes.SAVANNA);
    EntityRegistry.addSpawn(EntityAfricanWildDog.class, 1, 3, 5, EnumCreatureType.AMBIENT, Biomes.SAVANNA, Biomes.SAVANNA, Biomes.DESERT);
    EntityRegistry.addSpawn(EntityWildebeest.class, 1, 3, 5, EnumCreatureType.AMBIENT, Biomes.SAVANNA_PLATEAU, Biomes.SAVANNA);
    EntityRegistry.addSpawn(EntityHippo.class, 1, 3, 5, EnumCreatureType.AMBIENT, Biomes.SWAMPLAND, Biomes.SAVANNA);
    EntityRegistry.addSpawn(EntityLioness.class, 1, 3, 5, EnumCreatureType.AMBIENT, Biomes.SAVANNA_PLATEAU, Biomes.SAVANNA);
    EntityRegistry.addSpawn(EntityGemsbok.class, 1, 3, 5, EnumCreatureType.AMBIENT, Biomes.DESERT, Biomes.SAVANNA);
    EntityRegistry.addSpawn(EntityGazelle.class, 1, 3, 5, EnumCreatureType.AMBIENT, Biomes.SAVANNA, Biomes.SAVANNA);
    EntityRegistry.addSpawn(EntityPlainsZebra.class, 1, 3, 5, EnumCreatureType.AMBIENT, Biomes.SAVANNA, Biomes.SAVANNA);
    EntityRegistry.addSpawn(EntityAfricanLeopard.class, 1, 3, 5, EnumCreatureType.AMBIENT, Biomes.JUNGLE, Biomes.SAVANNA, Biomes.SAVANNA_PLATEAU, Biomes.DESERT);
    EntityRegistry.addSpawn(EntityBlackLeopard.class, 1, 3, 5, EnumCreatureType.AMBIENT, Biomes.JUNGLE);
    EntityRegistry.addSpawn(EntityEland.class, 1, 3, 5, EnumCreatureType.AMBIENT, Biomes.SAVANNA);
    EntityRegistry.addSpawn(EntityRatel.class, 1, 3, 5, EnumCreatureType.AMBIENT, Biomes.SAVANNA, Biomes.SAVANNA, Biomes.DESERT);

}
}
