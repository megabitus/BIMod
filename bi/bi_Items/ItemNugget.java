package bi.bi_Items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import bi.bi_BasePackage.BaseClass;
import bi.bi_Helper.Reference;

public class ItemNugget extends Item 
{

	public ItemNugget(int par1) 
	{
		super(par1);
		this.setCreativeTab(BaseClass.BITab);
		maxStackSize = 16;
	}
	public void updateIcons(IconRegister par1IconRegister)
    {
        this.itemIcon = par1IconRegister.registerIcon(Reference.MOD_NAME + ":" + this.getUnlocalizedName());
    }

}
