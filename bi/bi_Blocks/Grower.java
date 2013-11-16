package bi.bi_Blocks;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityBoat;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import net.minecraftforge.common.IPlantable;
import bi.bi_BasePackage.BaseClass;
import bi.bi_Config.Strings;
import bi.bi_Entitys.GrowerTileEntity;
import bi.bi_Sounds.Sounds;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Grower extends BlockContainer{
	protected Grower(int par1) {
		super(par1, Material.plants);
		this.setTickRandomly(true);
		this.setUnlocalizedName(Strings.GROWER);
		this.setCreativeTab(BaseClass.BITab);
		this.setHardness(2F);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) {
		blockIcon = iconRegister.registerIcon(Strings.GROWER);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Icon getIcon(int side, int meta) {
		return blockIcon;
	}

	@Override
	public void updateTick(World par1World, int x, int y, int z, Random par5Random) {
		this.growCrops(par1World, x, y, z);
//		Sounds.Magic_Grow.play(x, y, z, 1, 1);
	}

	@Override
	public void randomDisplayTick(World world, int x, int y, int z, Random rand) {
		world.spawnParticle("heart", (double)((float)x + rand.nextFloat()), (double)((float)y + 1.1F), (double)((float)z + rand.nextFloat()), 0.0D, 0.0D, 0.0D);
	}

	public void growCrops(World world, int xO, int yO, int zO) {
		for (int xDin = -4; xDin <= 4; xDin++) {
			for (int yDin = -1; yDin <= 4; yDin++) {
				for (int zDin = -4; zDin <= 5; zDin++) {
					int x = xO + xDin;
					int y = yO + yDin;
					int z = zO + zDin;
					int id = world.getBlockId(x, y, z);
					Block block = Block.blocksList[id];
					if (id == blockID) {
						continue;
					}
					if (block instanceof IPlantable) {
						block.updateTick(world, x, y, z, world.rand);
					}
				}
			}
		}
	}

	@Override
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4) {
		return AxisAlignedBB.getAABBPool().getAABB(par2 + minX, par3 + minY, par4 + minZ, par2 + maxX, par3 + maxY, par4 + maxZ);
	}

	@Override
	public TileEntity createNewTileEntity(World world) {
		return new GrowerTileEntity();
	}
	@Override
	public boolean renderAsNormalBlock() {
		return false;
	}

	@Override
	public boolean isOpaqueCube() {
		return false;
	}

	@Override
	public int getRenderType() {
		return -1;
	}
	@Override
	public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, Entity par5Entity)
	{
		par5Entity.attackEntityFrom(DamageSource.cactus, 1.0F);
	}
}