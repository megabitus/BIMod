package bi.bi_Blocks;

import bi.bi_BasePackage.BaseClass;
import bi.bi_Helper.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;

public class GlowingSpeeder extends Block 
{
	public GlowingSpeeder(int par1, int par2) 
	{
		super(par1, Material.grass);
		this.setCreativeTab(BaseClass.BITab);
		this.setHardness(2F);
		this.slipperiness = 1.5F;
	}
	public void registerIcons(IconRegister par1IconRegister)
	{
		this.blockIcon = par1IconRegister.registerIcon(Reference.MOD_NAME + ":" + this.getUnlocalizedName2());
	}
}

