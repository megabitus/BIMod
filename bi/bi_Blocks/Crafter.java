package bi.bi_Blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ChatMessageComponent;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import bi.bi_BasePackage.BaseClass;
import bi.bi_Config.Strings;
import bi.bi_Entitys.TileEntityCrafter;
import bi.bi_Helper.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Crafter extends BlockContainer
{
	public static final int META_ISACTIVE = 0x00000008;
	public static final int MASK_DIR = 0x00000007;
	public static final int META_DIR_NORTH = 0x00000001;
	public static final int META_DIR_SOUTH = 0x00000002;
	public static final int META_DIR_EAST = 0x00000003;
	public static final int META_DIR_WEST = 0x00000000;
	@SideOnly(Side.CLIENT)
	private Icon field_94393_a;
	@SideOnly(Side.CLIENT)
	private Icon field_94392_b;	
	public Crafter(int blockId)
	{
		super(blockId, Material.wood);
		setStepSound(Block.soundStoneFootstep);
		setHardness(3.5f);
		setCreativeTab(BaseClass.BITab);
		setResistance(2.0F);
		setStepSound(Block.soundWoodFootstep);
		setUnlocalizedName(Strings.CRAFTER);
	}
	public Icon getIcon(int par1, int par2) {
		return par1 == 0 ? this.field_94392_b : (par1 == 1 ? this.field_94393_a : this.blockIcon);
	}
	@Override
	public int getLightValue(IBlockAccess world, int x, int y, int z)
	{
		return ((world.getBlockMetadata(x, y, z) >> 3) == 0 ? 0 : 15); 
	}
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
	{
		this.blockIcon = par1IconRegister.registerIcon("crafter_front");
		this.field_94393_a = par1IconRegister.registerIcon("crafter_top");
		this.field_94392_b = par1IconRegister.registerIcon("crafter_side");
	}
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int i, float f, float g, float t)
	{

		TileEntity tile_entity = world.getBlockTileEntity(x, y, z);

		if(tile_entity == null || player.isSneaking()){
			return false;
		}
		player.openGui(BaseClass.instance, 1, world, x, y, z);
		return true;
	}

	@Override
	public TileEntity createNewTileEntity(World world)
	{
		return new TileEntityCrafter();
	}
}
