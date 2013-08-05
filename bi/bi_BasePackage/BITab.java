package bi.bi_BasePackage;

import bi.bi_Items.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


public class BITab extends CreativeTabs 
{
	public BITab(int par1, String par2str)
	{
		super(par1, par2str);
	}
	@SideOnly(Side.CLIENT)
	public int getTabIconItemIndex()
	{
		return ModItems.GlowstoneNugget.itemID;
	}
	public String getTranslatedTabLabel()
	{
		return "B&I Mod";
	}
}
