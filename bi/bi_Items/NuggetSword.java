package bi.bi_Items;

import bi.bi_BasePackage.BaseClass;
import bi.bi_Helper.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class NuggetSword extends ItemSword
{
	public NuggetSword(int itemID, EnumToolMaterial toolMaterial)
	{
		super(itemID, toolMaterial);
		this.setCreativeTab(BaseClass.BITab);
	}
	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack par1ItemStack)
	{
		return true;
	}
	public void updateIcons(IconRegister par1IconRegister)
    {
        this.itemIcon = par1IconRegister.registerIcon(Reference.MOD_NAME + ":" + this.getUnlocalizedName());
    }


}