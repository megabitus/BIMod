package bi.bi_Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Icon;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import bi.bi_BasePackage.BaseClass;
import bi.bi_Helper.LittleGlowstoneHandler;
import bi.bi_Helper.Reference;

public class LittleGlowstone extends Block
{
	public LittleGlowstone(int par1, int i)
	{
		super(par1, Material.coral);
		this.setCreativeTab(BaseClass.BITab);
		this.setHardness(1F);
		setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
	}
	public void registerIcons(IconRegister par1IconRegister)
	{
		this.blockIcon = par1IconRegister.registerIcon(Reference.MOD_NAME + ":" + this.getUnlocalizedName2());
	}
	public static final boolean isRailBlockAt(World par0World, int par1, int par2, int par3)
	{
		int i = par0World.getBlockId(par1, par2, par3);
		return i == ModBlocks.LittleGlowstone.blockID;
	}


	public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int i)
	{
		return null;
	}

	public boolean isOpaqueCube()
	{
		return false;
	}

	/**
	 * If this block doesn't render as an ordinary block it will return False (examples: signs, buttons, stairs, etc)
	 */
	public boolean renderAsNormalBlock()
	{
		return false;
	}

	public MovingObjectPosition collisionRayTrace(World par1World, int par2, int par3, int par4, Vec3 par5Vec3, Vec3 par6Vec3)
	{
		this.setBlockBoundsBasedOnState(par1World, par2, par3, par4);
		return super.collisionRayTrace(par1World, par2, par3, par4, par5Vec3, par6Vec3);
	}

	public void setBlockBoundsBasedOnState(IBlockAccess par1IBlockAccess, int par2, int par3, int par4)
	{
		int i = par1IBlockAccess.getBlockMetadata(par2, par3, par4);

		if (i >= 2 && i <= 5)
		{
			setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.625F, 1.0F);
		}
		else
		{
			setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
		}
	}

	public Icon getBlockTextureFromSideAndMetadata(int par1, int par2)
	{
		return blockIcon;
	}

	public boolean canPlaceBlockAt(World par1World, int par2, int par3, int par4)
	{
		return par1World.isBlockNormalCube(par2, par3 - 1, par4);
	}

	public void onBlockAdded(World par1World, int par2, int par3, int par4)
	{
		if (!par1World.isRemote)
		{
			refreshTrackShape(par1World, par2, par3, par4, true);
		}
	}

	public void onNeighborBlockChange(World par1World, int par2, int par3, int par4, int par5)
	{
		if (par1World.isRemote)
		{
			return;
		}

		int i = par1World.getBlockMetadata(par2, par3, par4);
		int j = i;

		boolean flag = false;

		if (!par1World.isBlockNormalCube(par2, par3 - 1, par4))
		{
			flag = true;
		}

		if (j == 2 && !par1World.isBlockNormalCube(par2 + 1, par3, par4))
		{
			flag = true;
		}

		if (j == 3 && !par1World.isBlockNormalCube(par2 - 1, par3, par4))
		{
			flag = true;
		}

		if (j == 4 && !par1World.isBlockNormalCube(par2, par3, par4 - 1))
		{
			flag = true;
		}

		if (j == 5 && !par1World.isBlockNormalCube(par2, par3, par4 + 1))
		{
			flag = true;
		}

	}

	private void refreshTrackShape(World par1World, int par2, int par3, int par4, boolean par5)
	{
		if (par1World.isRemote)
		{
			return;
		}
		else
		{
			(new LittleGlowstoneHandler(this, par1World, par2, par3, par4)).refreshTrackShape(par1World.isBlockIndirectlyGettingPowered(par2, par3, par4), par5);
			return;
		}
	}
}
