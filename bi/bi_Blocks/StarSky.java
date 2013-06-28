package bi.bi_Blocks;

import bi.bi_BasePackage.BaseClass;
import bi.bi_Helper.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class StarSky extends Block 
{
	public StarSky(int par1, int par2) 
	{
		super(par1, Material.wood);
		this.setCreativeTab(BaseClass.BITab);
		this.setHardness(1.4F);
	}
	public void onEntityWalking(World world,  int xPos, int zPos, int yPos, Entity entity)
	{
		entity.motionY += 1.5;
	}
	public static int getInt() 
	{
		return 0;
	}
	public void registerIcons(IconRegister par1IconRegister)
	{
		this.blockIcon = par1IconRegister.registerIcon(Reference.MOD_NAME + ":" + this.getUnlocalizedName2());
	}
	
}

