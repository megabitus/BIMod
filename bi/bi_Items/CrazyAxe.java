package bi.bi_Items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import bi.bi_BasePackage.BaseClass;
import bi.bi_Config.Strings;
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
		this.setUnlocalizedName(Strings.CRAZY_AXE);
	}
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
    {
        this.itemIcon = par1IconRegister.registerIcon(Strings.CRAZY_AXE);
    }


}