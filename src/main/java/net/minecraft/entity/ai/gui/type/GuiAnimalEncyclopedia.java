package net.minecraft.entity.ai.gui.type;

import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

import com.hyeanmod.main.ACMain;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class GuiAnimalEncyclopedia extends GuiScreen {

private final int bookImageHeight = 288;
private final int bookImageWidth = 288;
private int currPage = 0;
private static final int bookTotalPages = 12;
private static ResourceLocation[] bookPageTextures = new ResourceLocation[bookTotalPages];
private static ResourceLocation bookPageButtonTextures = new ResourceLocation(ACMain.MODID + ":textures/gui/BookButtons.png");
private static String[] stringPageText = new String[bookTotalPages + 2];
private GuiButton buttonDone;
private NextPageButton buttonNextPage;
private NextPageButton buttonPreviousPage;

public GuiAnimalEncyclopedia() {
bookPageTextures[0] = new ResourceLocation(ACMain.MODID + ":textures/gui/AnimalBook/book.png");
bookPageTextures[1] = new ResourceLocation(ACMain.MODID + ":textures/gui/AnimalBook/book0.png");
bookPageTextures[2] = new ResourceLocation(ACMain.MODID + ":textures/gui/AnimalBook/book1.png");
bookPageTextures[3] = new ResourceLocation(ACMain.MODID + ":textures/gui/AnimalBook/book2.png");
bookPageTextures[4] = new ResourceLocation(ACMain.MODID + ":textures/gui/AnimalBook/book3.png");
bookPageTextures[5] = new ResourceLocation(ACMain.MODID + ":textures/gui/AnimalBook/book4.png");
bookPageTextures[6] = new ResourceLocation(ACMain.MODID + ":textures/gui/AnimalBook/book5.png");
bookPageTextures[7] = new ResourceLocation(ACMain.MODID + ":textures/gui/AnimalBook/book6.png");
bookPageTextures[8] = new ResourceLocation(ACMain.MODID + ":textures/gui/AnimalBook/book7.png");
bookPageTextures[9] = new ResourceLocation(ACMain.MODID + ":textures/gui/AnimalBook/book8.png");
bookPageTextures[10] = new ResourceLocation(ACMain.MODID + ":textures/gui/AnimalBook/book9.png");
bookPageTextures[11] = new ResourceLocation(ACMain.MODID + ":textures/gui/AnimalBook/book10.png");


stringPageText[0] = "";
stringPageText[1] = "";
stringPageText[2] = "";
stringPageText[3] = "";
stringPageText[4] = "";


stringPageText[5] =  "";
stringPageText[6] = "";
stringPageText[7] = "";
stringPageText[8] = "";
stringPageText[9] = "";
stringPageText[10] = "";
stringPageText[11] = "";
stringPageText[12] = "";
stringPageText[13] = "";
}

/**
* Adds the buttons (and other controls) to the screen in question.
*/
@Override
public void initGui() 
{
// DEBUG
System.out.println("GuiShadowmarks initGUI()");
buttonList.clear();
Keyboard.enableRepeatEvents(true);

buttonDone = new GuiButton(0, width / 2 + 2, 4 + bookImageHeight, 
98, 20, I18n.format("gui.done", new Object[0]));

buttonList.add(buttonDone);
int offsetFromScreenLeft = (width - bookImageWidth) / 2;
buttonList.add(buttonNextPage = new NextPageButton(1, 
offsetFromScreenLeft + 120, 150, true));
buttonList.add(buttonPreviousPage = new NextPageButton(2, 
offsetFromScreenLeft + 38, 150, false));
}

/**
* Called from the main game loop to update the screen.
*/
@Override
public void updateScreen() 
{
buttonDone.visible = (currPage == bookTotalPages - 1);
buttonNextPage.visible = (currPage < bookTotalPages - 1);
buttonPreviousPage.visible = currPage > 0;
}

/**
* Draws the screen and all the components in it.
*/
@Override
public void drawScreen(int parWidth, int parHeight, float p_73863_3_)
{
GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
int offsetFromScreenLeft = (width - bookImageWidth ) / 2;
String stringPageIndicator = I18n.format("book.pageIndicator", new Object[] {Integer.valueOf(currPage + 1), bookTotalPages});
int widthOfString = fontRendererObj.getStringWidth(stringPageIndicator);


if (currPage == 0)
{
mc.getTextureManager().bindTexture(bookPageTextures[0]);
drawTexturedModalRect(offsetFromScreenLeft, 2, 0, 0, 192, 192);
fontRendererObj.drawSplitString(stringPageText[0], offsetFromScreenLeft + 136, 34, 116, 0);

}
else if (currPage == 1)
{
mc.getTextureManager().bindTexture(bookPageTextures[1]);
drawTexturedModalRect(offsetFromScreenLeft, 2, 0, 0, 192, 192);
fontRendererObj.drawString(stringPageIndicator, offsetFromScreenLeft - widthOfString + bookImageWidth - 44, 18, 0);
fontRendererObj.drawSplitString(stringPageText[1], offsetFromScreenLeft + 16, 34, 116, 0);
fontRendererObj.drawSplitString(stringPageText[2], offsetFromScreenLeft + 136, 34, 116, 0);

} 
else if (currPage == 2)
{
mc.getTextureManager().bindTexture(bookPageTextures[2]);
drawTexturedModalRect(offsetFromScreenLeft, 2, 0, 0, 192, 192);
fontRendererObj.drawSplitString(stringPageText[3], offsetFromScreenLeft + 16, 34, 116, 0);
fontRendererObj.drawSplitString(stringPageText[4], offsetFromScreenLeft + 136, 34, 116, 0);

} 

else if (currPage == 3)
{
mc.getTextureManager().bindTexture(bookPageTextures[3]);
drawTexturedModalRect(offsetFromScreenLeft, 2, 0, 0, 192, 192);
fontRendererObj.drawSplitString(stringPageText[5], offsetFromScreenLeft + 136, 34, 116, 0);

} 

else if (currPage == 4)
{
mc.getTextureManager().bindTexture(bookPageTextures[4]);
drawTexturedModalRect(offsetFromScreenLeft, 2, 0, 0, 192, 192);
fontRendererObj.drawSplitString(stringPageText[6], offsetFromScreenLeft + 136, 34, 116, 0);
} 

else if (currPage == 5)
{
mc.getTextureManager().bindTexture(bookPageTextures[5]);
drawTexturedModalRect(offsetFromScreenLeft, 2, 0, 0, 192, 192);
fontRendererObj.drawSplitString(stringPageText[7], offsetFromScreenLeft + 136, 34, 116, 0);
} 
else if (currPage == 6)
{
mc.getTextureManager().bindTexture(bookPageTextures[6]);
drawTexturedModalRect(offsetFromScreenLeft, 2, 0, 0, 192, 192);
fontRendererObj.drawSplitString(stringPageText[8], offsetFromScreenLeft + 136, 34, 116, 0);
} 
else if (currPage == 7)
{
mc.getTextureManager().bindTexture(bookPageTextures[7]);
drawTexturedModalRect(offsetFromScreenLeft, 2, 0, 0, 192, 192);
fontRendererObj.drawSplitString(stringPageText[9], offsetFromScreenLeft + 136, 34, 116, 0);
} 
else if (currPage == 8)
{
mc.getTextureManager().bindTexture(bookPageTextures[8]);
drawTexturedModalRect(offsetFromScreenLeft, 2, 0, 0, 192, 192);
fontRendererObj.drawSplitString(stringPageText[10], offsetFromScreenLeft + 136, 34, 116, 0);
} 
else if (currPage == 9)
{
mc.getTextureManager().bindTexture(bookPageTextures[9]);
drawTexturedModalRect(offsetFromScreenLeft, 2, 0, 0, 192, 192);
fontRendererObj.drawSplitString(stringPageText[11], offsetFromScreenLeft + 136, 34, 116, 0);
} 
else if (currPage == 10)
{
mc.getTextureManager().bindTexture(bookPageTextures[10]);
drawTexturedModalRect(offsetFromScreenLeft, 2, 0, 0, 192, 192);
fontRendererObj.drawSplitString(stringPageText[11], offsetFromScreenLeft + 136, 34, 116, 0);
} 
else
{
mc.getTextureManager().bindTexture(bookPageTextures[11]);
drawTexturedModalRect(offsetFromScreenLeft, 2, 0, 0, 192, 192);
fontRendererObj.drawSplitString(stringPageText[12], offsetFromScreenLeft + 136, 34, 116, 0);
} 

super.drawScreen(parWidth, parHeight, p_73863_3_);



}

/**
* Called when a mouse button is pressed and the mouse is moved around. 
* Parameters are : mouseX, mouseY, lastButtonClicked & 
* timeSinceMouseClick.
*/
@Override
protected void mouseClickMove(int parMouseX, int parMouseY, 
int parLastButtonClicked, long parTimeSinceMouseClick) 
{

}

@Override
protected void actionPerformed(GuiButton parButton) 
{
if (parButton == buttonDone)
{
// You can send a packet to server here if you need server to do 
// something
mc.displayGuiScreen((GuiScreen)null);
}
else if (parButton == buttonNextPage)
{
if (currPage < bookTotalPages - 1)
{
++currPage;
}
}
else if (parButton == buttonPreviousPage)
{
if (currPage > 0)
{
--currPage;
}
}
}

/**
* Called when the screen is unloaded. Used to disable keyboard repeat 
* events
*/
@Override
public void onGuiClosed() 
{

}

/**
* Returns true if this GUI should pause the game when it is displayed in 
* single-player
*/
@Override
public boolean doesGuiPauseGame()
{
return true;
}

@SideOnly(Side.CLIENT)
static class NextPageButton extends GuiButton
{
private final boolean isNextButton;

public NextPageButton(int parButtonId, int parPosX, int parPosY, 
boolean parIsNextButton)
{
super(parButtonId, parPosX, parPosY, 23, 28, "");
isNextButton = parIsNextButton;
}

/**
* Draws this button to the screen.
*/
@Override
public void drawButton(Minecraft mc, int parX, int parY)
{
if (visible)
{
boolean isButtonPressed = (parX >= xPosition 
&& parY >= yPosition 
&& parX < xPosition + width 
&& parY < yPosition + height);
mc.getTextureManager().bindTexture(bookPageButtonTextures);
int textureX = 0;
int textureY = 0;

if (isButtonPressed)
{
textureX += 23;
}

if (!isNextButton)
{
textureY += 13;
}

drawTexturedModalRect(xPosition, yPosition, 
textureX, textureY, 
23, 13);
}
}
}
}
