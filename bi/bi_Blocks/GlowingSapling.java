package bi.bi_Blocks;

import java.util.List;
import java.util.Random;

import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenBigTree;
import net.minecraft.world.gen.feature.WorldGenForest;
import net.minecraft.world.gen.feature.WorldGenHugeTrees;
import net.minecraft.world.gen.feature.WorldGenTaiga2;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.event.terraingen.TerrainGen;
import bi.bi_BasePackage.BaseClass;
import bi.bi_Config.Strings;
import bi.bi_Helper.Reference;
import bi.bi_Helper.WorldGenGlowTree;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class GlowingSapling extends BlockFlower
{
	public GlowingSapling(int par1, int par2) 
	{
		super(par1, Material.leaves);
		this.setCreativeTab(BaseClass.BITab);
		this.setHardness(0.01F);
		float f = 0.4F;
		this.setStepSound(soundGravelFootstep);
		this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 2.0F, 0.5F + f);
		this.setUnlocalizedName(Strings.GLOWING_SAPLING);
		this.setLightValue(1F);
	}
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon(Strings.GLOWING_SAPLING);
    }
	@SideOnly(Side.CLIENT)
	public Icon getIcon(int side, int meta) {
		return this.blockIcon;
	}
	public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random)
	{
		if (!par1World.isRemote)
		{
			super.updateTick(par1World, par2, par3, par4, par5Random);

			if (par1World.getBlockLightValue(par2, par3 + 1, par4) >= 9 && par5Random.nextInt(7) == 0)
			{
				int var6 = par1World.getBlockMetadata(par2, par3, par4);

				if ((var6 & 8) == 0)
				{
					par1World.setBlockMetadataWithNotify(par2, par3, par4, var6 | 8, var6);
				}
				else
				{
					this.growTree(par1World, par2, par3, par4, par5Random);
				}
			}
		}
	}
	public void growTree(World par1World, int par2, int par3, int par4, Random par5Random)
	{
		if (!TerrainGen.saplingGrowTree(par1World, par5Random, par2, par3, par4)) return;

		int var6 = par1World.getBlockMetadata(par2, par3, par4) & 3;
		Object var7 = null;
		int var8 = 0;
		int var9 = 0;
		boolean var10 = false;

		if (var6 == 1)
		{
			var7 = new WorldGenTaiga2(true);
		}
		else if (var6 == 2)
		{
			var7 = new WorldGenForest(true);
		}
		else if (var6 == 3)
		{
			for (var8 = 0; var8 >= -1; --var8)
			{
				for (var9 = 0; var9 >= -1; --var9)
				{
					if (this.isSameSapling(par1World, par2 + var8, par3, par4 + var9, 3) && this.isSameSapling(par1World, par2 + var8 + 1, par3, par4 + var9, 3) && this.isSameSapling(par1World, par2 + var8, par3, par4 + var9 + 1, 3) && this.isSameSapling(par1World, par2 + var8 + 1, par3, par4 + var9 + 1, 3))
					{
						var7 = new WorldGenHugeTrees(true, 10 + par5Random.nextInt(20), 3, 3);
						var10 = true;
						break;
					}
				}

				if (var7 != null)
				{
					break;
				}
			}

			if (var7 == null)
			{
				var9 = 0;
				var8 = 0;
				var7 = new WorldGenGlowTree(true, 4 + par5Random.nextInt(7), 3, 3, false);
			}
		}
		else
		{
			var7 = new WorldGenGlowTree(true);

			if (par5Random.nextInt(10) == 0)
			{
				var7 = new WorldGenBigTree(true);
			}
		}

		if (var10)
		{
			par1World.setBlock(par2 + var8, par3, par4 + var9, 0);
			par1World.setBlock(par2 + var8 + 1, par3, par4 + var9, 0);
			par1World.setBlock(par2 + var8, par3, par4 + var9 + 1, 0);
			par1World.setBlock(par2 + var8 + 1, par3, par4 + var9 + 1, 0);
		}
		else
		{
			par1World.setBlock(par2, par3, par4, 0);
		}

		if (!((WorldGenerator)var7).generate(par1World, par5Random, par2 + var8, par3, par4 + var9))
		{
			if (var10)
			{
				par1World.setBlock(par2 + var8, par3, par4 + var9, this.blockID, var6, 4);
				par1World.setBlock(par2 + var8 + 1, par3, par4 + var9, this.blockID, var6, 4);
				par1World.setBlock(par2 + var8, par3, par4 + var9 + 1, this.blockID, var6, 4);
				par1World.setBlock(par2 + var8 + 1, par3, par4 + var9 + 1, this.blockID, var6, 4);
			}
			else
			{
				par1World.setBlock(par2, par3, par4, this.blockID, var6, 4);
			}
		}
	}
	public boolean isSameSapling(World par1World, int par2, int par3, int par4, int par5)
	{
		return par1World.getBlockId(par2, par3, par4) == this.blockID && (par1World.getBlockMetadata(par2, par3, par4) & 3) == par5;
	}
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
}

