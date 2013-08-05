package bi.bi_Blocks;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import bi.bi_BasePackage.BaseClass;
import bi.bi_Config.Strings;
import bi.bi_Entitys.EntityLittleGlowstone;
import bi.bi_Entitys.TileEntityLittleGlowstone;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class LittleGlowstone extends BlockContainer
{
	public LittleGlowstone(int par1, int i)
	{
		super(par1, Material.coral);
		this.setCreativeTab(BaseClass.BITab);
		this.setHardness(1F);
		this.setUnlocalizedName(Strings.LITTLE_GLOWSTONE);
		this.setLightValue(1F);
	}
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon(Strings.LITTLE_GLOWSTONE);
    }
	@SideOnly(Side.CLIENT)
	public Icon getIcon(int side, int meta) {
		return this.blockIcon;
	}
	@Override
	public TileEntity createNewTileEntity(World world) {
		return new TileEntityLittleGlowstone();
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
}
