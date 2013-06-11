package bi.bi_Items;

import bi.bi_BasePackage.BaseClass;
import bi.bi_Helper.EntityLaserMunition;
import bi.bi_Helper.Reference;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ArrowLooseEvent;
import net.minecraftforge.event.entity.player.ArrowNockEvent;

public class BeaconLaser extends Item
{
	public static final String[] bowPullIconNameArray = new String[] {"bow_pull_0", "bow_pull_1", "bow_pull_2"};
	public BeaconLaser(int par1) 
	{
		super(par1);
		this.maxStackSize = 1;
		this.setCreativeTab(BaseClass.BITab);
	}
	public void updateIcons(IconRegister par1IconRegister)
	{
		this.itemIcon = par1IconRegister.registerIcon(Reference.MOD_NAME + ":" + this.getUnlocalizedName());
	}
	
	public void onPlayerStoppedUsing(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer, int par4)
	{
		int j = this.getMaxItemUseDuration(par1ItemStack) - par4;

		ArrowLooseEvent event = new ArrowLooseEvent(par3EntityPlayer, par1ItemStack, j);
		MinecraftForge.EVENT_BUS.post(event);
		if (event.isCanceled())
		{
			return;
		}
		j = event.charge;

		boolean flag = par3EntityPlayer.capabilities.isCreativeMode || EnchantmentHelper.getEnchantmentLevel(Enchantment.infinity.effectId, par1ItemStack) > 0;

		if (flag || par3EntityPlayer.inventory.hasItem(ModItems.LaserMunition.itemID))
		{
			float f = (float)j / 20.0F;
			f = (f * f + f * 2.0F) / 3.0F;

			if ((double)f < 0.1D)
			{
				return;
			}

			if (f > 1.0F)
			{
				f = 1.0F;
			}

			EntityLaserMunition EntityProjectiles = new EntityLaserMunition(par2World, par3EntityPlayer, f * 2.0F);

			if (f == 1.0F)
			{
				EntityProjectiles.setIsCritical(true);
			}

			int k = EnchantmentHelper.getEnchantmentLevel(Enchantment.power.effectId, par1ItemStack);

			if (k > 0)
			{
				EntityProjectiles.setDamage(EntityProjectiles.getDamage() + (double)k * 0.5D + 0.5D);
			}

			int l = EnchantmentHelper.getEnchantmentLevel(Enchantment.punch.effectId, par1ItemStack);

			if (l > 0)
			{
				EntityProjectiles.setKnockbackStrength(l);
			}

			if (EnchantmentHelper.getEnchantmentLevel(Enchantment.flame.effectId, par1ItemStack) < 0)
			{
				EntityProjectiles.setFire(100);
			}

			par1ItemStack.damageItem(1, par3EntityPlayer);
			par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + f * 0.5F);

			if (flag)
			{
				EntityProjectiles.canBePickedUp = 2;
			}
			else
			{
				par3EntityPlayer.inventory.consumeInventoryItem(ModItems.LaserMunition.itemID);
			}

			if (!par2World.isRemote)
			{
				par2World.spawnEntityInWorld(EntityProjectiles);
			}
		}
	}

	public ItemStack onEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	{
		return par1ItemStack;
	}
	public int getMaxItemUseDuration(ItemStack par1ItemStack)
	{
		return 120000;
	}
	public EnumAction getItemUseAction(ItemStack par1ItemStack)
	{
		return EnumAction.bow;
	}
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	{
		ArrowNockEvent event = new ArrowNockEvent(par3EntityPlayer, par1ItemStack);
		MinecraftForge.EVENT_BUS.post(event);
		if (event.isCanceled())
		{
			return event.result;
		}

		if (par3EntityPlayer.capabilities.isCreativeMode || par3EntityPlayer.inventory.hasItem(ModItems.LaserMunition.itemID))
		{
			par3EntityPlayer.setItemInUse(par1ItemStack, this.getMaxItemUseDuration(par1ItemStack));
		}

		return par1ItemStack;
	}
	public int getItemEnchantability()
	{
		return 1;
	}
}
