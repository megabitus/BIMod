package bi.bi_Items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import bi.bi_BasePackage.BaseClass;
import bi.bi_Config.Strings;
import bi.bi_Helper.Reference;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class LaserMunition extends Item
{
	public LaserMunition(int par1) {
		super(par1);
		this.setCreativeTab(BaseClass.BITab);
		this.setUnlocalizedName(Strings.LASER_MUNITIONS);
	}
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
    {
        this.itemIcon = par1IconRegister.registerIcon(Strings.LASER_MUNITIONS);
    }
	@SideOnly(Side.CLIENT)
	public EnumRarity getRarity(ItemStack par1ItemStack)
	{
		return par1ItemStack.getItemDamage() == 1 ? EnumRarity.rare : EnumRarity.epic;
	}
	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack par1ItemStack)
	{
		return par1ItemStack.getItemDamage() > 1;
	}

}
