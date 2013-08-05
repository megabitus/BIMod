package bi.bi_BasePackage;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import bi.bi_Blocks.ModBlocks;
import bi.bi_Gui.ContainerC;
import bi.bi_Gui.GuiC;
import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandlerC implements IGuiHandler
{

	@Override
	public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z)
	{

		TileEntity tile_entity = world.getBlockTileEntity(x, y, z);

		switch(id)
		{

		case 1: return id == 1 && world.getBlockId(x, y, z) == ModBlocks.Crafter.blockID ? new ContainerC(player.inventory, world, x, y, z) : null;

		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z)
	{

		TileEntity tile_entity = world.getBlockTileEntity(x, y, z);

		switch(id)
		{

		case 1: return id == 1 && world.getBlockId(x, y, z) == ModBlocks.Crafter.blockID ? new GuiC(player.inventory, world, x, y, z) : null;

		}

		return null;

	}
}