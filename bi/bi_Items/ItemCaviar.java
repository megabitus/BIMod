package bi.bi_Items;

import bi.bi_BasePackage.BaseClass;
import net.minecraft.item.ItemFood;

public class ItemCaviar extends ItemFood
{

	public ItemCaviar(int par1, int par2, boolean par3) {
		super(par1, par2, par3);
	}
	{
		this.setCreativeTab(BaseClass.BITab);
		maxStackSize = 16;
	}
	public String getTextureFile()
	{
		return "/Textures/Items.png";
	}



}
