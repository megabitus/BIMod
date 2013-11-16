package bi.bi_Renders;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import bi.bi_Entitys.GrowerTileEntity;
import bi.bi_Models.LittleGlowstoneModel;
import bi.bi_Models.ModelGrower;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


@SideOnly(Side.CLIENT)
public class RenderGrower extends TileEntitySpecialRenderer{
	
	public RenderGrower(){
		aModel = new ModelGrower();
	}

	public void renderTileEntityAt(TileEntity te, double x, double y, double z, float f) {
		GrowerTileEntity tileEntity = (GrowerTileEntity) te;

		int meta;
		if (tileEntity.worldObj != null) {
			meta = tileEntity.getBlockMetadata();
		} else {
			meta = 0;
		}

		GL11.glPushMatrix();
		GL11.glTranslatef((float)x + 0.5F, (float)y + 1.52F, (float)z + 0.5F);
		GL11.glRotatef(180F, 0F, 0F, 1F);
		this.bindTexture(new ResourceLocation("minecraft","textures/models/Grower.png"));
		GL11.glPushMatrix();
		aModel.renderAll(0.0625F);
		GL11.glPopMatrix();
		GL11.glPopMatrix();
	}
	private ModelGrower aModel;


}