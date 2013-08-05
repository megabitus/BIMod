package bi.bi_Items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import bi.bi_BasePackage.BaseClass;
import bi.bi_Config.Strings;
import bi.bi_Helper.Reference;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemFood;

public class ItemTurky extends ItemFood
{

	public ItemTurky(int par1, int par2, boolean par3) {
		super(par1, par2, par3);
		this.setCreativeTab(BaseClass.BITab);
		maxStackSize = 32;
		this.setUnlocalizedName(Strings.TURKY);
		this.setAlwaysEdible();
	}
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
    {
        this.itemIcon = par1IconRegister.registerIcon(Strings.TURKY);
    }



}
