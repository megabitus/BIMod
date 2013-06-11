package bi.bi_Blocks;

import bi.bi_BasePackage.BaseClass;
import bi.bi_Helper.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class ReinforcedStone extends Block 
{

	public ReinforcedStone(int par1, int par2) 
	{
		super(par1, Material.rock);
		this.setCreativeTab(BaseClass.BITab);
		this.setHardness(5F);
	}
	public void registerIcons(IconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon(Reference.MOD_NAME + ":" + this.getUnlocalizedName2());
    }
}