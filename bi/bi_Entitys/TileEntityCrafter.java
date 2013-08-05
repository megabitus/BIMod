package bi.bi_Entitys;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;

public class TileEntityCrafter extends TileEntity implements IInventory {

	private ItemStack[] inventory;

	 
    public TileEntityCrafter(){
            this.inventory = new ItemStack[9];//number of slots - without product slot
            this.canUpdate();
           
    }
   
    @Override
    public int getSizeInventory(){
            return this.inventory.length;
    }
   
    
    @Override
    public ItemStack getStackInSlot(int slotIndex){
            return this.inventory[slotIndex];
    }
   
    
    @Override
    public void setInventorySlotContents(int slot, ItemStack stack){
            this.inventory[slot] = stack;
           
            if(stack != null && stack.stackSize > getInventoryStackLimit()){
                    stack.stackSize = getInventoryStackLimit();
            }
    }
   
   
    @Override
    public ItemStack decrStackSize(int slotIndex, int amount){
   
            ItemStack stack = getStackInSlot(slotIndex);
           
           
            if(stack != null){
           
                    if(stack.stackSize <= amount){
                            setInventorySlotContents(slotIndex, null);
                    }
                    else{
                            stack = stack.splitStack(amount);
                            if(stack.stackSize == 0){
                                    setInventorySlotContents(slotIndex, null);
                            }
                    }
            }
   
   
            return stack;
    }
   
   
    @Override
    public ItemStack getStackInSlotOnClosing(int slotIndex){
   
            ItemStack stack = getStackInSlot(slotIndex);
           
           
            if(stack != null){
                    setInventorySlotContents(slotIndex, null);
            }
           
           
            return stack;
    }
   
   
    @Override
    public int getInventoryStackLimit(){
            return 64;
    }
   
   
    @Override
    public boolean isUseableByPlayer(EntityPlayer player){
            return worldObj.getBlockTileEntity(xCoord, yCoord, zCoord) == this && player.getDistanceSq(xCoord + 0.5, yCoord + 0.5, zCoord + 0.5) < 64;
    }
  
   
    @Override
    public void openChest() {}
   
    
    @Override
    public void closeChest() {}
   
   
    @Override
    public String getInvName(){
    return "TileCrafter";
    }

	@Override
	public boolean isInvNameLocalized() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isItemValidForSlot(int i, ItemStack itemstack) {
		// TODO Auto-generated method stub
		return false;
	}
}