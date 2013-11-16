package bi.bi_Renders;

import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.model.IModelCustom;

import org.lwjgl.opengl.GL11;

public class LittleGlowstoneItemRender implements IItemRenderer {

	private IModelCustom model;
	
	public static final ResourceLocation texture = new ResourceLocation("minecraft", "textures/models/LittleGlowstone.png");
	
	public LittleGlowstoneItemRender(IModelCustom model) {
		this.model = model;
	}
	
	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) {
		return true;
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {

		return true;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
		GL11.glPushMatrix();
		GL11.glScalef(0.5F, 0.5F, 0.5F);
		
		Minecraft.getMinecraft().getTextureManager().bindTexture(texture);
		model.renderAll();
		
		GL11.glPopMatrix();
	}

}
