package bi.bi_Helper;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

public class TileEntityMultiFurnaceDummy extends TileEntity implements ISidedInventory
{
	TileEntityMultiFurnaceCore tileEntityCore;
	int coreX;
	int coreY;
	int coreZ;
	
	public TileEntityMultiFurnaceDummy()
	{
	}
	
	public void setCore(TileEntityMultiFurnaceCore core)
	{
		coreX = core.xCoord;
		coreY = core.yCoord;
		coreZ = core.zCoord;
		tileEntityCore = core;
	}
	
	public TileEntityMultiFurnaceCore getCore()
	{
		if(tileEntityCore == null)
			tileEntityCore = (TileEntityMultiFurnaceCore)worldObj.getBlockTileEntity(coreX, coreY, coreZ);
		
		return tileEntityCore;
	}
	
	@Override
	public void readFromNBT(NBTTagCompound tagCompound)
	{
		super.readFromNBT(tagCompound);
		
		coreX = tagCompound.getInteger("CoreX");
		coreY = tagCompound.getInteger("CoreY");
		coreZ = tagCompound.getInteger("CoreZ");
	}
	
	@Override
	public void writeToNBT(NBTTagCompound tagCompound)
	{
		super.writeToNBT(tagCompound);
		
		tagCompound.setInteger("CoreX", coreX);
		tagCompound.setInteger("CoreY", coreY);
		tagCompound.setInteger("CoreZ", coreZ);
	}
	
	@Override
	public int getSizeInventory() {
		// TODO Auto-generated method stub
		return tileEntityCore.getSizeInventory();
	}

	@Override
	public ItemStack getStackInSlot(int i) {
		// TODO Auto-generated method stub
		return tileEntityCore.getStackInSlot(i);
	}

	@Override
	public ItemStack decrStackSize(int i, int j) {
		// TODO Auto-generated method stub
		return tileEntityCore.decrStackSize(i, j);
	}

	@Override
	public ItemStack getStackInSlotOnClosing(int i) {
		// TODO Auto-generated method stub
		return tileEntityCore.getStackInSlotOnClosing(i);
	}

	@Override
	public void setInventorySlotContents(int i, ItemStack itemstack) {
		// TODO Auto-generated method stub
		tileEntityCore.setInventorySlotContents(i, itemstack);
	}

	@Override
	public String getInvName() {
		// TODO Auto-generated method stub
		return tileEntityCore.getInvName();
	}

	@Override
	public boolean isInvNameLocalized() {
		// TODO Auto-generated method stub
		return tileEntityCore.isInvNameLocalized();
	}

	@Override
	public int getInventoryStackLimit() {
		// TODO Auto-generated method stub
		return tileEntityCore.getInventoryStackLimit();
	}

	@Override
	public boolean isUseableByPlayer(EntityPlayer entityplayer) {
		// TODO Auto-generated method stub
		return worldObj.getBlockTileEntity(xCoord, yCoord, zCoord) != this ? false : entityplayer.getDistanceSq((double)xCoord + 0.5, (double)yCoord + 0.5, (double)zCoord + 0.5) <= 64.0;
	}

	@Override
	public void openChest() { }

	@Override
	public void closeChest() { }

	@Override
	public boolean isStackValidForSlot(int i, ItemStack itemstack) {
		// TODO Auto-generated method stub
		return tileEntityCore.isStackValidForSlot(i, itemstack);
	}

	public int[] getSizeInventorySide(int var1) {
		// TODO Auto-generated method stub
		return tileEntityCore.getSizeInventorySide(var1);
	}

	public boolean func_102007_a(int i, ItemStack itemstack, int j) {
		// TODO Auto-generated method stub
		return tileEntityCore.func_102007_a(i, itemstack, j);
	}

	public boolean func_102008_b(int i, ItemStack itemstack, int j) {
		// TODO Auto-generated method stub
		return tileEntityCore.func_102008_b(i, itemstack, j);
	}

	@Override
	public int[] getAccessibleSlotsFromSide(int var1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean canInsertItem(int i, ItemStack itemstack, int j) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean canExtractItem(int i, ItemStack itemstack, int j) {
		// TODO Auto-generated method stub
		return false;
	}
}
