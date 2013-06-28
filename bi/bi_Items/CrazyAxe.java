package bi.bi_Items;

import bi.bi_BasePackage.BaseClass;
import bi.bi_Helper.Reference;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemAxe;

public class CrazyAxe extends ItemAxe
{
	public CrazyAxe(int itemID, EnumToolMaterial toolMaterial)
	{
		super(itemID, toolMaterial);
		this.setCreativeTab(BaseClass.BITab);
	}
	public void updateIcons(IconRegister par1IconRegister)
	{
		this.itemIcon = par1IconRegister.registerIcon(Reference.MOD_NAME + ":" + this.getUnlocalizedName());
	}


}