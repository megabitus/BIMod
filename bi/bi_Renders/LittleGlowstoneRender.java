package bi.bi_Renders;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import bi.bi_Models.LittleGlowstoneModel;

public class LittleGlowstoneRender extends TileEntitySpecialRenderer{
	
	private LittleGlowstoneModel model;
	
	public LittleGlowstoneRender(){
		model = new LittleGlowstoneModel();
	}
	
	private static final ResourceLocation texture = new ResourceLocation("minecraft", "textures/models/LittleGlowstone.pngs");

	@Override
	public void renderTileEntityAt(TileEntity entity, double x, double y, double z, float yaw) {
		GL11.glPushMatrix();
		GL11.glTranslatef((float) x,(float) y,(float) z);
		GL11.glScalef(-1F, -1F, -1F);
		GL11.glPopMatrix();
		
	}

	@Override
	protected void func_110628_a(ResourceLocation par1ResourceLocation) {
		
	}

}
