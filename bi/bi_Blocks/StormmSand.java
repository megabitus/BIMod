package bi.bi_Blocks;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import bi.bi_BasePackage.BaseClass;
import bi.bi_Config.Strings;
import bi.bi_Helper.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityFallingSand;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class StormmSand extends Block 
{
	public static boolean fallInstantly = true;

	public StormmSand(int par1, int par2) 
	{
		super(par1, Material.sand);
		this.setCreativeTab(BaseClass.BITab);
		this.setHardness(1F);
		this.setUnlocalizedName(Strings.STORMM_SAND);
		this.setResistance(2.0F);
		this.setLightValue(0.0F);
		this.setStepSound(Block.soundGravelFootstep);
	}

	public void randomDisplayTick(World par1World, int par2, int par3, int par4, Random par5Random)
	{
		super.randomDisplayTick(par1World, par2, par3, par4, par5Random);

		if (par5Random.nextInt(10) == 0)
		{
			par1World.spawnParticle("townaura", (double)((float)par2 + par5Random.nextFloat()), (double)((float)par3 + 1.1F), (double)((float)par4 + par5Random.nextFloat()), 0.0D, 0.0D, 0.0D);
		}
	}
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
	{
		float f = 0.200F;
		return AxisAlignedBB.getAABBPool().getAABB((double)par2, (double)par3, (double)par4, (double)(par2 + 1), (double)((float)(par3 + 1) - f), (double)(par4 + 1));
	}
	public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, Entity par5Entity)
	{
		par5Entity.motionX *= 0.0D;
		par5Entity.motionZ *= 0.0D;
	}
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon(Strings.STORMM_SAND);
    }

	int a1 = 0,a2 = 0,a3 = 0,a4 = 0,a5 = 0,a6 = 0;

	Icon gor = null, dol = null, st1 = null, st2 = null, st3 = null, st4 = null;

	boolean red = false;
	public void onBlockAdded(World world, int i, int j, int k){
		world.scheduleBlockUpdate(i, j, k, blockID, tickRate());
	}
	public boolean isPoweringTo(IBlockAccess blockAccess, int i, int j, int k, int l){
		return red;
	}
	public void onNeighborBlockChange(World world, int i, int j, int k, int l){
		world.scheduleBlockUpdate(i, j, k, blockID, tickRate());
	}
	public int tickRate()
	{
		return 2;
	}

	/**
	 * Ticks the block if it's been scheduled
	 */
	public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random)
	{
		tryToFall(par1World, par2, par3, par4);
	}

	/**
	 * If there is space to fall below will start this block falling
	 */
	private void tryToFall(World par1World, int par2, int par3, int par4)
	{
		int i = par2;
		int j = par3;
		int k = par4;
		if (canFallBelow(par1World, i, j - 1, k) && j >= 0)
		{
			byte byte0 = 32;

			if (false || !par1World.checkChunksExist(par2 - byte0, par3 - byte0, par4 - byte0, par2 + byte0, par3 + byte0, par4 + byte0))
			{
				 par1World.setBlock(par2, par3, par4, 0);

				for (; canFallBelow(par1World, par2, par3 - 1, par4) && par3 > 0; par3--) { }

				if (par3 > 0)
				{
					 par1World.setBlock(par2, par3, par4, blockID);
				}
			}
			else if (!par1World.isRemote)
			{
				EntityFallingSand entityfallingsand = new EntityFallingSand(par1World, (float)par2 + 0.5F, (float)par3 + 0.5F, (float)par4 + 0.5F, blockID);
				par1World.spawnEntityInWorld(entityfallingsand);
			}
		}
	}

	/**
	 * Checks to see if the sand can fall into the block below it
	 */
	public static boolean canFallBelow(World par0World, int par1, int par2, int par3)
	{
		int i = par0World.getBlockId(par1, par2, par3);

		if (i == 0)
		{
			return true;
		}

		if (i == Block.fire.blockID)
		{
			return true;
		}

		Material material = Block.blocksList[i].blockMaterial;

		if (material == Material.water)
		{
			return true;
		}

		return material == Material.lava;
	}
}
