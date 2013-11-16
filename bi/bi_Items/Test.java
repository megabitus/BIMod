package bi.bi_Items;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import org.lwjgl.input.Keyboard;

import bi.bi_BasePackage.BaseClass;
import bi.bi_Config.Strings;
import bi.bi_Sounds.Sounds;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Test extends Item 
{
	int NeedBlock = 0;
	public Test(int par1) 
	{
		super(par1);
		this.setCreativeTab(BaseClass.BITab);
		this.setUnlocalizedName(Strings.TEST);
		this.maxStackSize = 1;
		this.setMaxDamage(50);
	}

	@Override
	public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int x, int y, int z, int par7, float par8, float par9, float par10){
		//		if (Keyboard.isKeyDown(Keyboard.KEY_RSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_LSHIFT))
		//		{
		//			if (!par3World.isRemote)
		//			{
		//				NeedBlock = par3World.getBlockId(x, y, z);
		//				par2EntityPlayer.addChatMessage("Selected Block Id is:" + NeedBlock);
		//				try {
		//					PrintWriter out = new PrintWriter("Int.txt");
		//					out.println(new Integer(NeedBlock).toString());
		//					out.close();
		//				} catch (FileNotFoundException e) {
		//					e.printStackTrace();
		//				}
		//				return true;
		//			}
		//			return false;
		//		}
		//		if(par3World.blockExists(x, y, z)){
		//			if(par2EntityPlayer.inventory.hasItem(NeedBlock)) {
		//				par2EntityPlayer.inventory.addItemStackToInventory(new ItemStack(Block.blocksList[par3World.getBlockId(x, y, z)]));
		//				par3World.setBlock(x, y, z,NeedBlock);
		//				par2EntityPlayer.inventory.consumeInventoryItem(NeedBlock);
						Sounds.Magic_Wand.play(x, y, z, 1, 1);
		//			}else if(! par2EntityPlayer.inventory.hasItem(NeedBlock)) {{
		//				par2EntityPlayer.addChatMessage("You don't have the folowing block in you're inventory: " + new Integer(NeedBlock).toString());
		//			}
		//			}
		//
		//		}
		return bFull3D;
	}
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
	{
		this.itemIcon = par1IconRegister.registerIcon(Strings.TEST);
	}

}
