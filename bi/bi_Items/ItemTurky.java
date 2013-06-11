package bi.bi_Items;

import bi.bi_BasePackage.BaseClass;
import bi.bi_Helper.Reference;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemFood;

public class ItemTurky extends ItemFood
{

	public ItemTurky(int par1, int par2, boolean par3) {
		super(par1, par2, par3);
	}
	{
		this.setCreativeTab(BaseClass.BITab);
		maxStackSize = 32;
	}
	public void updateIcons(IconRegister par1IconRegister)
    {
        this.itemIcon = par1IconRegister.registerIcon(Reference.MOD_NAME + ":" + this.getUnlocalizedName());
    }



}
