package bi.bi_Blocks;

import java.util.Random;




import bi.bi_BasePackage.BaseClass;
import bi.bi_Helper.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class BlockStormm extends Block 
{
	public BlockStormm(int par1, int par2) 
	{
		super(par1, Material.sand);
		this.setCreativeTab(BaseClass.BITab);
		this.setHardness(2F);
	}
	public String getTextureFile()
	{
		return "/Textures/Blocks.png";
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
	public void registerIcons(IconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon(Reference.MOD_NAME + ":" + this.getUnlocalizedName2());
    }
}
