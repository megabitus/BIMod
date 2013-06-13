package bi.bi_Blocks;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import bi.bi_BasePackage.BaseClass;
import bi.bi_Helper.Reference;
import bi.bi_Helper.TileEntityMultiPart;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;

public class MultiPart extends BlockContainer
{
	@SideOnly(Side.CLIENT)
	private Icon field_94393_a;
	@SideOnly(Side.CLIENT)
	private Icon field_94392_b;	
	public MultiPart(int blockId)
	{
		super(blockId, Material.wood);
		setStepSound(Block.soundStoneFootstep);
		setHardness(3.5f);
	}
	public Icon getIcon(int par1, int par2) {
		return par1 == 0 ? this.field_94392_b : (par1 == 1 ? this.field_94393_a : this.blockIcon);
	}
	public void registerIcons(IconRegister par1IconRegister)
	{
	this.blockIcon = par1IconRegister.registerIcon(Reference.MOD_NAME + ":" + "brick");
	this.field_94393_a = par1IconRegister.registerIcon(Reference.MOD_NAME + ":" + "crafter_top");
	this.field_94392_b = par1IconRegister.registerIcon(Reference.MOD_NAME + ":" + "brick");
	}
	@Override
	public int idDropped(int par1, Random par2Random, int par3)
	{
		return ModBlocks.PoC.blockID;
	}
	
	@Override
	public TileEntity createNewTileEntity(World world)
	{
		return new TileEntityMultiPart();
	}
	@Override
	public void breakBlock(World world, int x, int y, int z, int par5, int par6)
	{
		TileEntityMultiPart dummy = (TileEntityMultiPart)world.getBlockTileEntity(x, y, z);
		
		if(dummy != null && dummy.getCore() != null)
			dummy.getCore().invalidateMultiblock();
		
		super.breakBlock(world, x, y, z, par5, par6);
	}
	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par6, float par7, float par8, float par9)
	{
		
		if(player.isSneaking())
			return false;
		
		TileEntityMultiPart dummy = (TileEntityMultiPart)world.getBlockTileEntity(x, y, z);
		if(dummy != null && dummy.getCore() != null)
		{
			TileEntityCrafter core = dummy.getCore();
			return core.getBlockType().onBlockActivated(world, core.xCoord, core.yCoord, core.zCoord, player, par6, par7, par8, par9);
		}
		
		return true;
	}
	
}
