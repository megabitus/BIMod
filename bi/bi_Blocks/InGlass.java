package bi.bi_Blocks;

import java.util.Random;

import bi.bi_BasePackage.BaseClass;
import bi.bi_Helper.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class InGlass extends Block 
{
	public static boolean fallInstantly = false;
	public InGlass(int par1, Material par2Material, boolean b) {
		super(par1, Material.glass);
		this.setCreativeTab(BaseClass.BITab);
	}
	public InGlass(int stormmGlassID, int i) {
		super(i, Material.glass);
		this.setCreativeTab(BaseClass.BITab);
	}
	public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, Entity par5Entity)
	{
		par5Entity.motionX *= 0.0D;
		par5Entity.motionZ *= 0.0D;
	}
	public int quantityDropped(Random par1Random)
	{
		return 1;
	}

	@SideOnly(Side.CLIENT)
	public int getRenderBlockPass()
	{
		return 0;
	}
	public boolean isOpaqueCube()
	{
		return false;
	}
	public boolean renderAsNormalBlock()
	{
		return false;
	}
	protected boolean canSilkHarvest()
	{
		return true;
	}
	public void registerIcons(IconRegister par1IconRegister)
	{
		this.blockIcon = par1IconRegister.registerIcon(Reference.MOD_NAME + ":" + this.getUnlocalizedName2());
	}
}


