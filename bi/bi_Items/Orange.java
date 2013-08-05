package bi.bi_Items;

import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import bi.bi_BasePackage.BaseClass;
import bi.bi_Config.Strings;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


public class Orange extends ItemFood{

	@SideOnly(Side.CLIENT)
	private Icon[] icons;
	
	public Orange(int par1, int par2, boolean par3) {
		super(par1, par2, par3);
		this.setCreativeTab(BaseClass.BITab);
		this.setAlwaysEdible();
		this.setHasSubtypes(true);
		
	}
	
	@Override
	public String getUnlocalizedName(ItemStack itemstack){
		return Strings.ORANGE + itemstack.getItemDamage();
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register)
    {
        icons = new Icon[Strings.ORANGE_ICONS.length];
        for (int i = 0; i < icons.length; i++){
        	icons[i] = register.registerIcon("minecraft" + ":" + Strings.ORANGE_ICONS[i]);
        }
    }
	
	@Override
	@SideOnly(Side.CLIENT)
	public Icon getIconFromDamage(int dmg){
		return icons[dmg];
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void getSubItems(int id, CreativeTabs tab, List list){
		for(int i = 0; i < Strings.ORANGE_NAMES.length; i++){
			ItemStack stack = new ItemStack(id, 1, i);
			list.add(stack);
		}
		
	}
	
	protected void onFoodEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
		if (par1ItemStack.getItemDamage() == 0)
        {
            if (!par2World.isRemote)
            {
                par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.regeneration.id, 60, 1));
                par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 150, 0));
            }
        }
        if (par1ItemStack.getItemDamage() == 1)
        {
            if (!par2World.isRemote)
            {
                par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.heal.id, 60, 3));
                par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 200, 2));
            }
        }
        if (par1ItemStack.getItemDamage() == 2)
        {
            if (!par2World.isRemote)
            {
                par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.heal.id, 200, 5));
                par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 300, 4));
            }   
        }
        if (par1ItemStack.getItemDamage() == 3)
        {
            if (!par2World.isRemote)
            {
                par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.regeneration.id, 50, 1));
                par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 50, 0));
                par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.poison.id, 200, 1));
            }
        }
        else
        {
            super.onFoodEaten(par1ItemStack, par2World, par3EntityPlayer);
        }
    }

}
