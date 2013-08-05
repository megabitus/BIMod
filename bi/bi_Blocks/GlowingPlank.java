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

public class GlowingPlank extends Block 
{

	public GlowingPlank(int par1, int par2) 
	{
		super(par1, Material.wood);
		this.setCreativeTab(BaseClass.BITab);
		this.setHardness(1F);
		this.setUnlocalizedName(Strings.GLOWING_PLANK);
		this.setLightValue(1F);
	}
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon(Strings.GLOWING_PLANK);
    }
	@SideOnly(Side.CLIENT)
	public Icon getIcon(int side, int meta) {
		return this.blockIcon;
	}
}

