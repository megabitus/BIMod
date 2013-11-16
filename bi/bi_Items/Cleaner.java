package bi.bi_Items;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.BlockLeaves;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.IPlantable;
import bi.bi_BasePackage.BaseClass;
import bi.bi_Config.Strings;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Cleaner extends Item 
{

	public Cleaner(int par1) 
	{
		super(par1);
		this.setCreativeTab(BaseClass.BITab);
		this.setUnlocalizedName(Strings.CLEANER);
		this.maxStackSize = 1;
		this.setHasSubtypes(false);
		this.setMaxDamage(50);
	}

	int radiusCrops = 5;
	int radiusLeaves = 2;


	public boolean recurseLeaves(ItemStack stack, World w, int x, int y, int z, EntityPlayer player) {
		boolean used = false;
		for (int i = -radiusLeaves; i <= radiusLeaves; i++) {
			for (int j = -radiusLeaves; j <= radiusLeaves; j++) {
				for (int k = -radiusLeaves; k <= radiusLeaves; k++) {
					int localX = x + i;
					int localY = y + j;
					int localZ = z + k;
					int id = w.getBlockId(localX, localY, localZ);
					int meta = w.getBlockMetadata(localX, localY, localZ);
					Block localBlock = Block.blocksList[id];
					if (localBlock != null && (localBlock.isLeaves(w, localX, localY, localZ) || localBlock instanceof BlockLeaves)) {
						if (localBlock.canHarvestBlock(player, meta)) {
							localBlock.harvestBlock(w, player, localX, localY, localZ, meta);
						}
						w.setBlock(localX, localY, localZ, 0, 0, 3);
						used = true;
					}
				}
			}
		}
		if (used) {
			stack.damageItem(1, player);
		}
		return used;
	}

	public boolean recurseCrops(ItemStack stack, World w, int x, int y, int z, EntityPlayer player) {
		boolean used = false;
		for (int i = -radiusCrops; i <= radiusCrops; i++) {
			for (int j = -radiusCrops; j <= radiusCrops; j++) {
				int localX = x + i;
				int localY = y;
				int localZ = z + j;
				int id = w.getBlockId(localX, localY, localZ);
				int meta = w.getBlockMetadata(localX, localY, localZ);
				Block localBlock = Block.blocksList[id];
				if (localBlock != null && (localBlock instanceof BlockFlower || localBlock instanceof IPlantable)) {
					if (localBlock.canHarvestBlock(player, meta)) {
						localBlock.harvestBlock(w, player, localX, localY, localZ, meta);
					}
					w.setBlock(localX, localY, localZ, 0, 0, 3);
					used = true;
				}
			}
		}
		if (used) {
			stack.damageItem(1, player);
		}
		return used;
	}

	public boolean onBlockDestroyed(ItemStack stack, World world, int blockID, int x, int y, int z, EntityLivingBase entity) {
		EntityPlayer player;
		if (entity instanceof EntityPlayer) {
			player = (EntityPlayer) entity;
		} else {
			return false;
		}

		Block b = Block.blocksList[blockID];
		if (b != null) {
			if (b.isLeaves(world, x, y, z)) {
				return recurseLeaves(stack, world, x, y, z, player);
			}
			if (b instanceof BlockFlower) {
				return recurseCrops(stack, world, x, y, z, player);
			}
		}
		return super.onBlockDestroyed(stack, world, blockID, x, y, z, entity);
	}
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
	{
		this.itemIcon = par1IconRegister.registerIcon(Strings.CLEANER);
	}

}
