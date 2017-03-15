/*    */ package net.minecraft.entity.ai.gui;
import com.hyeanmod.main.ACMain;

import net.minecraft.entity.ai.gui.type.GuiAnimalEncyclopedia;
/*    */ 
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.world.World;
/*    */ import net.minecraftforge.fml.common.network.IGuiHandler;
/*    */ import net.minecraftforge.fml.common.network.NetworkRegistry;
/*    */ 
/*    */ public class GuiHandler implements IGuiHandler
/*    */ {
/*    */   public static void init()
/*    */   {
/* 19 */     NetworkRegistry.INSTANCE.registerGuiHandler(ACMain.instance, new GuiHandler());
/*    */   }
/*    */   
/*    */   public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
/*    */   {
/* 24 */     switch (ID) {
/* 25 */     case 1:  return new GuiAnimalEncyclopedia();
/*    */     }
/*    */     
/* 32 */     return null;
/*    */   }
/*    */   
/*    */   public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
/*    */   {
/* 37 */     String name = "Unavailable";
/*    */     
/*    */     
/*    */ 
/*    */ 
/*    */ 
/* 44 */     switch (ID) {
/* 45 */     case 1:  return new GuiAnimalEncyclopedia();	
/*    */     }
/*    */     
/* 52 */     return null;
/*    */   }
/*    */ }

