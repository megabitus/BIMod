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

public class GlowingSpeeder extends Block 
{
	@SideOnly(Side.CLIENT)
	private Icon field_94393_a;
	@SideOnly(Side.CLIENT)
	private Icon field_94392_b;
	public Icon getIcon(int par1, int par2) {
		return par1 == 0 ? this.field_94392_b : (par1 == 1 ? this.field_94393_a : this.blockIcon);
	}
	public GlowingSpeeder(int par1, int par2) 
	{
		super(par1, Material.wood);
		this.setCreativeTab(BaseClass.BITab);
		this.setHardness(2F);
		this.slipperiness = 1.5F;
		this.setUnlocalizedName(Strings.GLOWING_SPEEDER);
	}
	public void registerIcons(IconRegister par1IconRegister)
	{
		this.blockIcon = par1IconRegister.registerIcon("GlowingPlank");
		this.field_94393_a = par1IconRegister.registerIcon("GlowingSpeeder");
		this.field_94392_b = par1IconRegister.registerIcon("GlowingPlank");
	}
}

