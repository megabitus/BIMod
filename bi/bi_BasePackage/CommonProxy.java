package bi.bi_BasePackage;

import bi.bi_Helper.TileEntityMultiFurnaceCore;
import bi.bi_Helper.TileEntityMultiFurnaceDummy;
import bi.bi_gui.ContainerMultiFurnace;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.registry.GameRegistry;

public class CommonProxy implements IGuiHandler
{
	public void registerRenderers () {
		
	}
	
	public void registerTileEntities()
	{
		GameRegistry.registerTileEntity(TileEntityMultiFurnaceCore.class, "tileEntityMultiFurnaceCore");
		GameRegistry.registerTileEntity(TileEntityMultiFurnaceDummy.class, "tileEntityMultiFurnaceDummy");
	}
	
	@Override
	public Object getServerGuiElement(int guiID, EntityPlayer player, World world, int x, int y, int z)
	{
		TileEntityMultiFurnaceCore tileEntity = (TileEntityMultiFurnaceCore)world.getBlockTileEntity(x, y, z);
		if(tileEntity != null)
			return new ContainerMultiFurnace(player.inventory, tileEntity);
		
		return null;
	}
	
	@Override
	public Object getClientGuiElement(int guiID, EntityPlayer player, World world, int x, int y, int z)
	{
		return null;
	}
}