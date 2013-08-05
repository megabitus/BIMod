package bi.bi_Items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import bi.bi_BasePackage.BaseClass;
import bi.bi_Config.Strings;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class NetherFuel extends Item{

	public NetherFuel(int par1) {
		super(par1);
		this.setCreativeTab(BaseClass.BITab);
		this.setUnlocalizedName(Strings.NETHER_FUEL);
	}
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
    {
        this.itemIcon = par1IconRegister.registerIcon(Strings.NETHER_FUEL);
    }

}
