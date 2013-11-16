package bi.bi_Models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelGrower extends ModelBase
{
	ModelRenderer Baza;
	ModelRenderer Stalp1;
	ModelRenderer Stalp2;
	ModelRenderer Stalp3;
	ModelRenderer Stalp4;
	ModelRenderer Out1;
	ModelRenderer Out2;
	ModelRenderer Out3;
	ModelRenderer Out4;
	ModelRenderer Acoperire1;
	ModelRenderer Acoperire2;
	ModelRenderer Acoperire3;
	ModelRenderer Acoperire4;
	ModelRenderer Eye;
	ModelRenderer Head;
	ModelRenderer Body;
	ModelRenderer Body2;
	ModelRenderer Spinare1;
	ModelRenderer Spinare2;
	ModelRenderer Spinare3;

	public ModelGrower()
	{
		textureWidth = 128;
		textureHeight = 128;

		Baza = new ModelRenderer(this, 0, 110);
		Baza.addBox(0F, 0F, 0F, 16, 1, 16);
		Baza.setRotationPoint(-8F, 23F, -8F);
		Baza.setTextureSize(128, 128);
		Baza.mirror = true;
		setRotation(Baza, 0F, 0F, 0F);
		Stalp1 = new ModelRenderer(this, 0, 76);
		Stalp1.addBox(0F, 0F, 0F, 1, 15, 15);
		Stalp1.setRotationPoint(-8F, 8F, -8F);
		Stalp1.setTextureSize(128, 128);
		Stalp1.mirror = true;
		setRotation(Stalp1, 0F, 0F, 0F);
		Stalp2 = new ModelRenderer(this, 34, 76);
		Stalp2.addBox(0F, 0F, 0F, 1, 15, 16);
		Stalp2.setRotationPoint(7F, 8F, -8F);
		Stalp2.setTextureSize(128, 128);
		Stalp2.mirror = true;
		setRotation(Stalp2, 0F, 0F, 0F);
		Stalp3 = new ModelRenderer(this, 0, 56);
		Stalp3.addBox(0F, -15F, 0F, 14, 15, 1);
		Stalp3.setRotationPoint(-7F, 23F, -8F);
		Stalp3.setTextureSize(128, 128);
		Stalp3.mirror = true;
		setRotation(Stalp3, 0F, 0F, 0F);
		Stalp4 = new ModelRenderer(this, 34, 56);
		Stalp4.addBox(0F, 0F, 0F, 15, 15, 1);
		Stalp4.setRotationPoint(-8F, 8F, 7F);
		Stalp4.setTextureSize(128, 128);
		Stalp4.mirror = true;
		setRotation(Stalp4, 0F, 0F, 0F);
		Out1 = new ModelRenderer(this, 0, 48);
		Out1.addBox(0F, 0F, 0F, 1, 1, 6);
		Out1.setRotationPoint(-3F, 7F, -3F);
		Out1.setTextureSize(128, 128);
		Out1.mirror = true;
		setRotation(Out1, 0F, 0F, 0F);
		Out2 = new ModelRenderer(this, 0, 44);
		Out2.addBox(0F, 0F, 0F, 6, 1, 1);
		Out2.setRotationPoint(-3F, 7F, 2F);
		Out2.setTextureSize(128, 128);
		Out2.mirror = true;
		setRotation(Out2, 0F, 0F, 0F);
		Out3 = new ModelRenderer(this, 34, 48);
		Out3.addBox(0F, 0F, 0F, 1, 1, 6);
		Out3.setRotationPoint(2F, 7F, -3F);
		Out3.setTextureSize(128, 128);
		Out3.mirror = true;
		setRotation(Out3, 0F, 0F, 0F);
		Out4 = new ModelRenderer(this, 34, 44);
		Out4.addBox(0F, 0F, 0F, 6, 1, 1);
		Out4.setRotationPoint(-3F, 7F, -3F);
		Out4.setTextureSize(128, 128);
		Out4.mirror = true;
		setRotation(Out4, 0F, 0F, 0F);
		Acoperire1 = new ModelRenderer(this, 0, 27);
		Acoperire1.addBox(0F, 0F, 0F, 5, 1, 14);
		Acoperire1.setRotationPoint(-7F, 8F, -7F);
		Acoperire1.setTextureSize(128, 128);
		Acoperire1.mirror = true;
		setRotation(Acoperire1, 0F, 0F, 0F);
		Acoperire2 = new ModelRenderer(this, 41, 27);
		Acoperire2.addBox(0F, 0F, 0F, 5, 1, 14);
		Acoperire2.setRotationPoint(2F, 8F, -7F);
		Acoperire2.setTextureSize(128, 128);
		Acoperire2.mirror = true;
		setRotation(Acoperire2, 0F, 0F, 0F);
		Acoperire3 = new ModelRenderer(this, 0, 17);
		Acoperire3.addBox(0F, 0F, 0F, 4, 1, 5);
		Acoperire3.setRotationPoint(-2F, 8F, -7F);
		Acoperire3.setTextureSize(128, 128);
		Acoperire3.mirror = true;
		setRotation(Acoperire3, 0F, 0F, 0F);
		Acoperire4 = new ModelRenderer(this, 34, 17);
		Acoperire4.addBox(0F, 0F, 0F, 4, 1, 5);
		Acoperire4.setRotationPoint(-2F, 8F, 2F);
		Acoperire4.setTextureSize(128, 128);
		Acoperire4.mirror = true;
		setRotation(Acoperire4, 0F, 0F, 0F);
		Eye = new ModelRenderer(this, 0, 14);
		Eye.addBox(0F, 0F, 0F, 0, 1, 1);
		Eye.setRotationPoint(-2.4F, 12.5F, 0F);
		Eye.setTextureSize(128, 128);
		Eye.mirror = true;
		setRotation(Eye, 0F, 0F, -1.003826F);
		Head = new ModelRenderer(this, 4, 12);
		Head.addBox(0F, 0F, 0F, 1, 3, 1);
		Head.setRotationPoint(-2.3F, 12.4F, 0F);
		Head.setTextureSize(128, 128);
		Head.mirror = true;
		setRotation(Head, 0F, 0F, -0.7435801F);
		Body = new ModelRenderer(this, 10, 11);
		Body.addBox(0F, 0F, 0F, 1, 4, 1);
		Body.setRotationPoint(-0.5F, 14F, 0F);
		Body.setTextureSize(128, 128);
		Body.mirror = true;
		setRotation(Body, 0F, 0F, -0.1487195F);
		Body2 = new ModelRenderer(this, 16, 6);
		Body2.addBox(0F, 0F, 0F, 1, 9, 1);
		Body2.setRotationPoint(0F, 17F, 0F);
		Body2.setTextureSize(128, 128);
		Body2.mirror = true;
		setRotation(Body2, 0F, 0F, 0F);
		Spinare1 = new ModelRenderer(this, 0, 0);
		Spinare1.addBox(0F, 0F, 0F, 1, 4, 0);
		Spinare1.setRotationPoint(0F, 13.8F, 0.4666667F);
		Spinare1.setTextureSize(128, 128);
		Spinare1.mirror = true;
		setRotation(Spinare1, 0F, 0F, -0.1487195F);
		Spinare2 = new ModelRenderer(this, 0, 0);
		Spinare2.addBox(0F, 0F, 0F, 1, 4, 1);
		Spinare2.setRotationPoint(0.5F, 17.5F, 0.5F);
		Spinare2.setTextureSize(128, 128);
		Spinare2.mirror = true;
		setRotation(Spinare2, 0F, 0F, 0F);
		Spinare3 = new ModelRenderer(this, 0, 0);
		Spinare3.addBox(0F, 0F, 0F, 1, 4, 0);
		Spinare3.setRotationPoint(0.5F, 21F, 0.5F);
		Spinare3.setTextureSize(128, 128);
		Spinare3.mirror = true;
		setRotation(Spinare3, 0F, 0F, 0.185895F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		Baza.render(f5);
		Stalp1.render(f5);
		Stalp2.render(f5);
		Stalp3.render(f5);
		Stalp4.render(f5);
		Out1.render(f5);
		Out2.render(f5);
		Out3.render(f5);
		Out4.render(f5);
		Acoperire1.render(f5);
		Acoperire2.render(f5);
		Acoperire3.render(f5);
		Acoperire4.render(f5);
		Eye.render(f5);
		Head.render(f5);
		Body.render(f5);
		Body2.render(f5);
		Spinare1.render(f5);
		Spinare2.render(f5);
		Spinare3.render(f5);
	}
	public void renderAll(float f5){
		Baza.render(f5);
		Stalp1.render(f5);
		Stalp2.render(f5);
		Stalp3.render(f5);
		Stalp4.render(f5);
		Out1.render(f5);
		Out2.render(f5);
		Out3.render(f5);
		Out4.render(f5);
		Acoperire1.render(f5);
		Acoperire2.render(f5);
		Acoperire3.render(f5);
		Acoperire4.render(f5);
		Eye.render(f5);
		Head.render(f5);
		Body.render(f5);
		Body2.render(f5);
		Spinare1.render(f5);
		Spinare2.render(f5);
		Spinare3.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5,Entity entity)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	}

}
