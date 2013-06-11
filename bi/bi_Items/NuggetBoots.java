package bi.bi_Items;

import bi.bi_Helper.Reference;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;



public class NuggetBoots extends ItemArmor{

	public NuggetBoots(int par1, EnumArmorMaterial par2EnumArmorMaterial,
			int par3, int par4) {
		super(par1, par2EnumArmorMaterial, par3, par4);
	}
	public void updateIcons(IconRegister par1IconRegister)
    {
        this.itemIcon = par1IconRegister.registerIcon(Reference.MOD_NAME + ":" + this.getUnlocalizedName());
    }

}
