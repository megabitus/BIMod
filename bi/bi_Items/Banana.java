package bi.bi_Items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import bi.bi_BasePackage.BaseClass;
import bi.bi_Config.Strings;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;

public class Banana extends ItemFood{

	
	public Banana(int par1, int par2, boolean par3) {
		super(par1, par2, par3);
		this.setCreativeTab(BaseClass.BITab);
		this.setAlwaysEdible();
		this.setPotionEffect(Potion.regeneration.id, 10, 0, 1.0F);
		this.setUnlocalizedName(Strings.BANANA);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
    {
        this.itemIcon = par1IconRegister.registerIcon(Strings.BANANA);
    }

}
