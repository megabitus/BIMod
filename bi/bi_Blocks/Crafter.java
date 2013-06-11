package bi.bi_Blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import bi.bi_BasePackage.BaseClass;
import bi.bi_Helper.Reference;
import net.minecraft.util.Icon;

public class Crafter extends Block 
{
	@SideOnly(Side.CLIENT)
	private Icon field_94393_a;
	@SideOnly(Side.CLIENT)
	private Icon field_94392_b;
	public Crafter(int par1) 
	{
		super(par1, Material.wood);
		this.setCreativeTab(BaseClass.BITab);
		this.blockHardness = 2F;
	}
	public Icon getIcon(int par1, int par2) {
		return par1 == 0 ? this.field_94392_b : (par1 == 1 ? this.field_94393_a
		: this.blockIcon);
		}
	private static boolean keepTableInventory = true;
	public void registerIcons(IconRegister par1IconRegister)
	{
	this.blockIcon = par1IconRegister.registerIcon(Reference.MOD_NAME + ":" + "crafter_front");
	this.field_94393_a = par1IconRegister.registerIcon(Reference.MOD_NAME + ":" + "crafter_top");
	this.field_94392_b = par1IconRegister.registerIcon(Reference.MOD_NAME + ":" + "crafter_side");
	}
	public boolean onBlockActivated(World var1, int var2, int var3, int var4, EntityPlayer player, int var6, float var7, float var8, float var9)
	{
		if (!player.isSneaking())
		{
			player.openGui(BaseClass.instance, 1, var1, var2, var3, var4);
			return true;
		}
		else
		{
			return false;
		}
	}
}
