package bi.bi_Items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import bi.bi_BasePackage.BaseClass;
import bi.bi_Blocks.LittleGlowstone;
import bi.bi_Config.Strings;
import bi.bi_Entitys.EntityLittleGlowstone;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CrazyBar extends Item 
{

	public CrazyBar(int par1) 
	{
		super(par1);
		this.setCreativeTab(BaseClass.BITab);
		this.setUnlocalizedName(Strings.CRAZY_BAR);
	}
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
    {
        this.itemIcon = par1IconRegister.registerIcon(Strings.CRAZY_BAR);
    }


}
