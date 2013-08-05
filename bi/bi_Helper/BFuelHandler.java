package bi.bi_Helper;

import bi.bi_Items.ModItems;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;

public class BFuelHandler implements IFuelHandler {
	@Override
	public int getBurnTime(ItemStack fuel) {
		int var1 = fuel.itemID;
		
		if(var1 == Item.book.itemID){
			return 300;
		}else if(var1 == ModItems.InfusedCoal.itemID){
			return 23900;
		}else{
			return 0;
		}
	}
}