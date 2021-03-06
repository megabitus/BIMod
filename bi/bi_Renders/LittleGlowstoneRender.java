package bi.bi_Renders;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import bi.bi_Entitys.TileEntityLittleGlowstone;
import bi.bi_Models.LittleGlowstoneModel;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class LittleGlowstoneRender extends TileEntitySpecialRenderer{

	public LittleGlowstoneRender(){
		aModel = new LittleGlowstoneModel();
	}

	public void renderTileEntityAt(TileEntity te, double x, double y, double z, float f) {
		TileEntityLittleGlowstone tileEntity = (TileEntityLittleGlowstone) te;

		int meta;
		if (tileEntity.worldObj != null) {
			meta = tileEntity.getBlockMetadata();
		} else {
			meta = 0;
		}

		GL11.glPushMatrix();
		GL11.glTranslatef((float)x + 0.5F, (float)y + 1.52F, (float)z + 0.5F);
		GL11.glRotatef(180F, 0F, 0F, 1F);
		this.bindTexture(new ResourceLocation("minecraft","textures/models/LittleGlowstone.png"));
		GL11.glPushMatrix();
		aModel.renderAll(0.0625F);
		GL11.glPopMatrix();
		GL11.glPopMatrix();
	}


	private static int getmetaDirection(int meta) {
		switch (meta) {
		case 0: // S
			return 0;
		case 1: // N
			return 2;
		case 2: // E
			return 3;
		case 3: // W
			return 1;
		default:
			return 2;
		}
	}



	private LittleGlowstoneModel aModel;


}