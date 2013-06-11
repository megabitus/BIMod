package bi.bi_Items;

import bi.bi_BasePackage.BaseClass;
import bi.bi_Helper.Reference;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class InfusedCoal extends Item 
{

	public InfusedCoal(int par1) 
	{
		super(par1);
		this.setCreativeTab(BaseClass.BITab);
	}
	public void updateIcons(IconRegister par1IconRegister)
    {
        this.itemIcon = par1IconRegister.registerIcon(Reference.MOD_NAME + ":" + this.getUnlocalizedName());
    }

}
