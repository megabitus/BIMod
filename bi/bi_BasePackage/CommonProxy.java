package bi.bi_BasePackage;

import bi.bi_Entitys.TileEntityCrafter;
import bi.bi_Gui.ContainerC;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

public class CommonProxy
{
	public void registerRenderers () {}
	public void registerTileEntities()
	{
		GameRegistry.registerTileEntity(TileEntityCrafter.class, "tileEntityCrafter");
		TileEntity.addMapping(TileEntityCrafter.class, "tileEntityCrafter");
	}
	public Object getServerGuiElement(int guiID, EntityPlayer player, World world, int x, int y, int z)
	{
		TileEntityCrafter tileEntity = (TileEntityCrafter)world.getBlockTileEntity(x, y, z);
		if(tileEntity != null)
			return new ContainerC(player.inventory, tileEntity);
		
		return null;
	}
	public void initSounds() {
	}

}