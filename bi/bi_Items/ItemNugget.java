package bi.bi_Items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import bi.bi_BasePackage.BaseClass;
import bi.bi_Config.Strings;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemNugget extends Item 
{

	public ItemNugget(int par1) 
	{
		super(par1);
		this.setCreativeTab(BaseClass.BITab);
		maxStackSize = 16;
		this.setUnlocalizedName(Strings.GLOWSTONE_NUGGET);
	}
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
    {
        this.itemIcon = par1IconRegister.registerIcon(Strings.GLOWSTONE_NUGGET);
    }

}
