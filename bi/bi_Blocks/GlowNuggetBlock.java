package bi.bi_Blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import bi.bi_BasePackage.BaseClass;
import bi.bi_Config.Strings;
import bi.bi_Helper.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class GlowNuggetBlock extends Block 
{

	public GlowNuggetBlock(int par1, int par2) 
	{
		super(par1, Material.rock);
		this.setCreativeTab(BaseClass.BITab);
		this.setHardness(2F);
		this.setUnlocalizedName(Strings.GLOW_NUGGET_BLOCK);
		this.setLightValue(1F);
	}
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon(Strings.GLOW_NUGGET_BLOCK);
    }
	@SideOnly(Side.CLIENT)
	public Icon getIcon(int side, int meta) {
		return this.blockIcon;
	}
}

