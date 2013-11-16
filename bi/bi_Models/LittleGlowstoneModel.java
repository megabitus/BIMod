package bi.bi_Models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class LittleGlowstoneModel extends ModelBase
{
	//fields
	ModelRenderer Baza;
	ModelRenderer Suprafata;

	public LittleGlowstoneModel()
	{
		textureWidth = 64;
		textureHeight = 32;

		Baza = new ModelRenderer(this, 0, 0);
		Baza.addBox(-1F, -1F, -1F, 4, 1, 4);
		Baza.setRotationPoint(-1F, 24.5F, -1F);
		Baza.setTextureSize(64, 32);
		Baza.mirror = true;
		setRotation(Baza, 0F, 0F, 0F);
		Suprafata = new ModelRenderer(this, 16, 0);
		Suprafata.addBox(-1F, -1F, -1F, 2, 1, 2);
		Suprafata.setRotationPoint(0F, 24.3F, 0F);
		Suprafata.setTextureSize(64, 32);
		Suprafata.mirror = true;
		setRotation(Suprafata, 0F, 0F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		Baza.render(f5);
		Suprafata.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}
	public void renderAll(float f5){
		Baza.render(f5);
		Suprafata.render(f5);
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	}

}
