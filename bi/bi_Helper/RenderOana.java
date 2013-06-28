package bi.bi_Helper;

import bi.bi_Entitys.EntityOana;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class RenderOana extends RenderLiving
{
	protected ModelOana model;

	public RenderOana (ModelOana modelOanal, float f)
	{
		super(modelOanal, f);
		model = ((ModelOana)mainModel);
	}

	public void modelOanal(EntityOana entity, double par2, double par4, double par6, float par8, float par9)
	{
		super.doRenderLiving(entity, par2, par4, par6, par8, par9);
	}

	public void doRenderLiving(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9)
	{
		modelOanal((EntityOana)par1EntityLiving, par2, par4, par6, par8, par9);
	}

	public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9)
	{
		modelOanal((EntityOana)par1Entity, par2, par4, par6, par8, par9);
	}
}