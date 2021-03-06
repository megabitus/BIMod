package bi.bi_Blocks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import bi.bi_BasePackage.BaseClass;
import bi.bi_Config.Strings;
import bi.bi_Helper.Reference;
import bi.bi_Items.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLeavesBase;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.ColorizerFoliage;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.IShearable;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class GlowingLeaves extends Block implements IShearable
{
	protected GlowingLeaves(int par1)
	{
		super(par1, Material.leaves);
		this.setTickRandomly(true);
		this.setHardness(0.2F);
		this.setCreativeTab(BaseClass.BITab);
		this.setUnlocalizedName(Strings.GLOWING_LEAVES);
		this.setLightValue(1F);
	}
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
	{
		this.blockIcon = par1IconRegister.registerIcon(Strings.GLOWING_LEAVES);
	}
	@SideOnly(Side.CLIENT)
	public Icon getIcon(int side, int meta) {
		return this.blockIcon;
	}
	public void breakBlock(World par1World, int par2, int par3, int par4, int par5, int par6)
	{
		byte b0 = 1;
		int j1 = b0 + 1;

		if (par1World.checkChunksExist(par2 - j1, par3 - j1, par4 - j1, par2 + j1, par3 + j1, par4 + j1))
		{
			for (int k1 = -b0; k1 <= b0; ++k1)
			{
				for (int l1 = -b0; l1 <= b0; ++l1)
				{
					for (int i2 = -b0; i2 <= b0; ++i2)
					{
						int j2 = par1World.getBlockId(par2 + k1, par3 + l1, par4 + i2);

						if (Block.blocksList[j2] != null)
						{
							Block.blocksList[j2].beginLeavesDecay(par1World, par2 + k1, par3 + l1, par4 + i2);
						}
					}
				}
			}
		}
	}

	/**
	 * Ticks the block if it's been scheduled
	 */
	public void updateTick(World par1World, int x, int y, int z, Random par5Random)
	{
		if(!search(par1World, x, y, z, ModBlocks.GlowingLog)){
			removeLeaves(par1World, x, y, z);
		}
	}

	private void removeLeaves(World par1World, int par2, int par3, int par4)
	{
		this.dropBlockAsItem(par1World, par2, par3, par4, par1World.getBlockMetadata(par2, par3, par4), 0);
		par1World.setBlockToAir(par2, par3, par4);
	}

	/**
	 * Returns the quantity of items to drop on block destruction.
	 */
	public int quantityDropped(Random par1Random)
	{
		return par1Random.nextInt(20) == 0 ? 1 : 0;
	}

	/**
	 * Returns the ID of the items to drop on destruction.
	 */
	public int idDropped(int par1, Random par2Random, int par3)
	{
		return ModBlocks.GlowingSapling.blockID;
	}

	/**
	 * Drops the block items with a specified chance of dropping the specified items
	 */
	public void dropBlockAsItemWithChance(World par1World, int par2, int par3, int par4, int par5, float par6, int par7)
	{
		if (!par1World.isRemote)
		{
			int j1 = 20;

			if ((par5 & 3) == 3)
			{
				j1 = 40;
			}

			if (par7 > 0)
			{
				j1 -= 2 << par7;

				if (j1 < 10)
				{
					j1 = 10;
				}
			}

			if (par1World.rand.nextInt(j1) == 0)
			{
				int k1 = this.idDropped(par5, par1World.rand, par7);
				this.dropBlockAsItem_do(par1World, par2, par3, par4, new ItemStack(k1, 1, this.damageDropped(par5)));
			}

			j1 = 200;

			if (par7 > 0)
			{
				j1 -= 10 << par7;

				if (j1 < 40)
				{
					j1 = 40;
				}
			}

			if ((par5 & 3) == 0 && par1World.rand.nextInt(j1) == 0)
			{
				this.dropBlockAsItem_do(par1World, par2, par3, par4, new ItemStack(ModItems.GlowingRubber, 10, 0));
			}
		}
	}

	/**
	 * Called when the player destroys a block with an item that can harvest it. (i, j, k) are the coordinates of the
	 * block and l is the block's subtype/damage.
	 */
	public void harvestBlock(World par1World, EntityPlayer par2EntityPlayer, int par3, int par4, int par5, int par6)
	{
		super.harvestBlock(par1World, par2EntityPlayer, par3, par4, par5, par6);
	}

	/**
	 * Determines the damage on the item the block drops. Used in cloth and wood.
	 */
	public int damageDropped(int par1)
	{
		return par1 & 3;
	}
	@SideOnly(Side.CLIENT)

	/**
	 * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
	 */
	public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List)
	{
		par3List.add(new ItemStack(par1, 1, 0));

	}

	/**
	 * Returns an item stack containing a single instance of the current block type. 'i' is the block's subtype/damage
	 * and is ignored for blocks which do not support subtypes. Blocks which cannot be harvested should return null.
	 */
	protected ItemStack createStackedBlock(int par1)
	{
		return new ItemStack(this.blockID, 1, par1 & 3);
	}

	@Override
	public boolean isShearable(ItemStack item, World world, int x, int y, int z)
	{
		return true;
	}

	@Override
	public ArrayList<ItemStack> onSheared(ItemStack item, World world, int x, int y, int z, int fortune)
	{
		ArrayList<ItemStack> ret = new ArrayList<ItemStack>();
		ret.add(new ItemStack(this, 1, world.getBlockMetadata(x, y, z) & 3));
		return ret;
	}

	@Override
	public void beginLeavesDecay(World world, int x, int y, int z)
	{
		world.setBlockMetadataWithNotify(x, y, z, world.getBlockMetadata(x, y, z) | 8, 4);
	}

	@Override
	public boolean isLeaves(World world, int x, int y, int z)
	{
		return true;
	}
	public boolean search(World world, int x, int y, int z,Block block){
		boolean variabila = false;
		for (int i = x - 2; i <= x + 2; ++i)
		{
			for (int k = z - 2; k <= z + 2; ++k)
			{
				for (int j = y - 1; j <= y + 1; ++j)
				{
					if (i!=0 || k != 0 || j != 0)
					{
						if (world.getBlockId(i, j, k) == block.blockID)
						{
							variabila = true;
						}
					}
				} 
			}
		} 
		return variabila;
	}
}
