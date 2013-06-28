package bi.bi_BasePackage;

import bi.bi_Entitys.TileEntityCrafter;
import bi.bi_Entitys.TileEntityMultiPart;
import bi.bi_gui.ContainerC;
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
		GameRegistry.registerTileEntity(TileEntityMultiPart.class, "tileEntityMultiPart");
		TileEntity.addMapping(TileEntityCrafter.class, "tileEntityCrafter");
		TileEntity.addMapping(TileEntityMultiPart.class, "tileEntityMultiPart");
	}
        
   
	public Object getServerGuiElement(int guiID, EntityPlayer player, World world, int x, int y, int z)
	{
		TileEntityCrafter tileEntity = (TileEntityCrafter)world.getBlockTileEntity(x, y, z);
		if(tileEntity != null)
			return new ContainerC(player.inventory, tileEntity);
		
		return null;
	}
	public Object getClientGuiElement(int guiID, EntityPlayer player, World world, int x, int y, int z)
	{
		return null;
	}
	public int addArmor(String armorName){
		return 0;
		}

}