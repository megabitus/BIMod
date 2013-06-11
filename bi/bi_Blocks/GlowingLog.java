package bi.bi_Blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import bi.bi_BasePackage.BaseClass;
import bi.bi_Helper.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class GlowingLog extends Block 
{
	@SideOnly(Side.CLIENT)
	private Icon field_94393_a;
	@SideOnly(Side.CLIENT)
	private Icon field_94392_b;
	public GlowingLog(int par1, int par2) 
	{
		super(par1, Material.wood);
		this.setCreativeTab(BaseClass.BITab);
		this.setHardness(2F);
	}
	public Icon getIcon(int par1, int par2) {
		return par1 == 0 ? this.field_94392_b : (par1 == 1 ? this.field_94393_a : this.blockIcon);
		}
	@Override
	public boolean canSustainLeaves(World world, int x, int y, int z)
	{
		return true;
	}

	@Override
	public boolean isWood(World world, int x, int y, int z)
	{
		return true;
	}
	public int getRenderType()
	{
		return 31;
	}
	public int quantityDropped(Random par1Random)
	{
		return 1;
	}
	public void registerIcons(IconRegister par1IconRegister)
	{
	this.blockIcon = par1IconRegister.registerIcon(Reference.MOD_NAME + ":" + "GlowingLog_side");
	this.field_94393_a = par1IconRegister.registerIcon(Reference.MOD_NAME + ":" + "GlowingLog_top");
	this.field_94392_b = par1IconRegister.registerIcon(Reference.MOD_NAME + ":" + "GlowingLog_top");
	}
	public int idDropped(int i, Random random, int j)
    {
        return ModBlocks.GlowingLog.blockID;
    }
}

