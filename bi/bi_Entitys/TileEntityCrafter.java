package bi.bi_Entitys;

import bi.bi_Blocks.Crafter;
import bi.bi_Blocks.ModBlocks;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityComparator;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.world.EnumSkyBlock;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TileEntityCrafter extends TileEntity implements ISidedInventory
{
	private static final int[] sidedSlotSides = new int[] { 0 };
	private static final int[] sidedSlotBottom = new int[] { 2, 1 };
	private static final int[] sidedSlotTop = new int[] { 1 };

	private ItemStack[] furnaceItems = new ItemStack[3];
	public int furnaceBurnTime = 0;
	public int currentItemBurnTime = 0;
	public int furnaceCookTime = 0;

	private boolean isValidMultiblock = false;

	public TileEntityCrafter()
	{
	}

	public boolean getIsValid()
	{
		return isValidMultiblock;
	}

	public void invalidateMultiblock()
	{
		isValidMultiblock = false;

		int metadata = worldObj.getBlockMetadata(xCoord, yCoord, zCoord);
		metadata = metadata & Crafter.MASK_DIR;
		worldObj.setBlockMetadataWithNotify(xCoord, yCoord, zCoord, metadata, 2);

		furnaceBurnTime = 0;
		currentItemBurnTime = 0;
		furnaceCookTime = 0;

		revertDummies();
	}

	public boolean checkIfProperlyFormed()
	{
		int dir = (getBlockMetadata() & Crafter.MASK_DIR);

		int depthMultiplier = ((dir == Crafter.META_DIR_NORTH || dir == Crafter.META_DIR_WEST) ? 1 : -1);
		boolean forwardZ = ((dir == Crafter.META_DIR_NORTH) || (dir == Crafter.META_DIR_SOUTH));

		/*
		 * FORWARD BACKWARD
		 * North: -z +z
		 * South: +z -z
		 * East: +x -x
		 * West: -x +x
		 *
		 * Should move BACKWARD for depth (facing = direction of block face, not direction of player looking at face)
		 */

		for(int horiz = -1; horiz <= 1; horiz++)	// Horizontal (X or Z)
		{
			for(int vert = -1; vert <= 1; vert++)	// Vertical (Y)
			{
				for(int depth = 0; depth <= 2; depth++)	// Depth (Z or X)
				{
					int x = xCoord + (forwardZ ? horiz : (depth * depthMultiplier));
					int y = yCoord + vert;
					int z = zCoord + (forwardZ ? (depth * depthMultiplier) : horiz);

					int blockId = worldObj.getBlockId(x, y, z);

					if(horiz == 0 && vert == 0)
					{
						if(depth == 0)	// Looking at self, move on!
							continue;

						if(depth == 1)	// Center must be air!
						{
							if(blockId != 0)
								return false;
							else
								continue;
						}
					}

					if(blockId != ModBlocks.PoC.blockID)
						return false;
				}
			}
		}

		return true;
	}

	public void convertDummies()
	{
		int dir = (getBlockMetadata() & Crafter.MASK_DIR);

		int depthMultiplier = ((dir == Crafter.META_DIR_NORTH || dir == Crafter.META_DIR_WEST) ? 1 : -1);
		boolean forwardZ = ((dir == Crafter.META_DIR_NORTH) || (dir == Crafter.META_DIR_SOUTH));

		/*
		 * FORWARD BACKWARD
		 * North: -z +z
		 * South: +z -z
		 * East: +x -x
		 * West: -x +x
		 *
		 * Should move BACKWARD for depth (facing = direction of block face, not direction of player looking at face)
		 */

		for(int horiz = -1; horiz <= 1; horiz++)	// Horizontal (X or Z)
		{
			for(int vert = -1; vert <= 1; vert++)	// Vertical (Y)
			{
				for(int depth = 0; depth <= 2; depth++)	// Depth (Z or X)
				{
					int x = xCoord + (forwardZ ? horiz : (depth * depthMultiplier));
					int y = yCoord + vert;
					int z = zCoord + (forwardZ ? (depth * depthMultiplier) : horiz);

					if(horiz == 0 && vert == 0 && (depth == 0 || depth == 1))
						continue;

					worldObj.setBlock(x, y, z, ModBlocks.PoC.blockID);
					worldObj.markBlockForUpdate(x, y, z);
//					TileEntityMultiPart dummyTE = (TileEntityMultiPart)worldObj.getBlockTileEntity(x, y, z);
//					dummyTE.setCore(this);
				}
			}
		}

		isValidMultiblock = true;
	}

	private void revertDummies()
	{
		int dir = (getBlockMetadata() & Crafter.MASK_DIR);

		int depthMultiplier = ((dir == Crafter.META_DIR_NORTH || dir == Crafter.META_DIR_WEST) ? 1 : -1);
		boolean forwardZ = ((dir == Crafter.META_DIR_NORTH) || (dir == Crafter.META_DIR_SOUTH));

		/*
		 * FORWARD BACKWARD
		 * North: -z +z
		 * South: +z -z
		 * East: +x -x
		 * West: -x +x
		 *
		 * Should move BACKWARD for depth (facing = direction of block face, not direction of player looking at face)
		 */

		for(int horiz = -1; horiz <= 1; horiz++)	// Horizontal (X or Z)
		{
			for(int vert = -1; vert <= 1; vert++)	// Vertical (Y)
			{
				for(int depth = 0; depth <= 2; depth++)	// Depth (Z or X)
				{
					int x = xCoord + (forwardZ ? horiz : (depth * depthMultiplier));
					int y = yCoord + vert;
					int z = zCoord + (forwardZ ? (depth * depthMultiplier) : horiz);

					int blockId = worldObj.getBlockId(x, y, z);

					if(horiz == 0 && vert == 0 && (depth == 0 || depth == 1))
						continue;

					if(blockId != ModBlocks.PoC.blockID)
						continue;

					worldObj.setBlock(x, y, z, ModBlocks.PoC.blockID);
					worldObj.markBlockForUpdate(x, y, z);
				}
			}
		}

		isValidMultiblock = false;
	}

	@Override
	public int getSizeInventory()
	{
		return furnaceItems.length;
	}

	@Override
	public ItemStack getStackInSlot(int slot)
	{
		return furnaceItems[slot];
	}

	@Override
	public ItemStack decrStackSize(int slot, int count)
	{	
		if(this.furnaceItems[slot] != null)
		{
			ItemStack itemStack;

			itemStack = furnaceItems[slot].splitStack(count);

			if(furnaceItems[slot].stackSize <= 0)
				furnaceItems[slot] = null;

			return itemStack;
		}

		return null;
	}

	@Override
	public ItemStack getStackInSlotOnClosing(int slot)
	{
		if(furnaceItems[slot] != null)
		{
			ItemStack stack = furnaceItems[slot];
			furnaceItems[slot] = null;
			return stack;
		}

		return null;
	}

	@Override
	public void setInventorySlotContents(int slot, ItemStack itemStack)
	{
		furnaceItems[slot] = itemStack;

		if(itemStack != null && itemStack.stackSize > getInventoryStackLimit())
			itemStack.stackSize = getInventoryStackLimit();
	}

	@Override
	public String getInvName()
	{
		return "multifurnace.container.multifurnacecore";
	}

	@Override
	public boolean isInvNameLocalized()
	{
		return false;
	}

	@Override
	public int getInventoryStackLimit()
	{
		return 64;
	}

	@Override
	public boolean isUseableByPlayer(EntityPlayer entityPlayer)
	{
		return worldObj.getBlockTileEntity(xCoord, yCoord, zCoord) != this ? false : entityPlayer.getDistanceSq((double)xCoord + 0.5, (double)yCoord + 0.5, (double)zCoord + 0.5) <= 64.0;
	}

	@Override
	public void openChest() { }

	@Override
	public void closeChest() { }

	@Override
	public boolean isStackValidForSlot(int slot, ItemStack itemStack)
	{
		return slot == 2 ? false : (slot == 1 ? TileEntityFurnace.isItemFuel(itemStack) : true);
	}

	public int[] getSizeInventorySide(int par1)
	{
		return par1 == 0 ? sidedSlotBottom : (par1 == 1 ? sidedSlotTop : sidedSlotSides);
	}

	public boolean func_102007_a(int par1, ItemStack par2ItemStack, int j)
	{
		return this.isStackValidForSlot(par1, par2ItemStack);
	}

	public boolean func_102008_b(int par1, ItemStack par2ItemStack, int par3)
	{
		return par3 != 0 || par1 != 1 || par2ItemStack.itemID == Item.bucketEmpty.itemID;
	}

	@Override
	public void readFromNBT(NBTTagCompound tagCompound)
	{
		super.readFromNBT(tagCompound);

		int md = tagCompound.getInteger("BlockMeta");
		isValidMultiblock = tagCompound.getBoolean("isValidMultiblock");
	}

	@Override
	public void writeToNBT(NBTTagCompound tagCompound)
	{
		super.writeToNBT(tagCompound);
		tagCompound.setBoolean("isValidMultiblock", isValidMultiblock);
		System.out.println("Is valid? " + (isValidMultiblock ? "Yes" : "No"));
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