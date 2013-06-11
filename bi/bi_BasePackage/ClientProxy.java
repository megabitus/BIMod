package bi.bi_BasePackage;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.client.MinecraftForgeClient;
import bi.bi_Blocks.ModBlocks;
import bi.bi_Helper.EntityLaserMunition;
import bi.bi_Helper.ItemGlowNuggetChestRender;
import bi.bi_Helper.RenderLaserMunition;
import bi.bi_Helper.TileEntityGlowNuggetChest;
import bi.bi_Helper.TileEntityGlowNuggetChestRender;
import bi.bi_Helper.TileEntityMultiFurnaceCore;
import bi.bi_gui.GuiMultiFurnace;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {
	public void registerRenderers () 
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityLaserMunition.class, new RenderLaserMunition());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGlowNuggetChest.class, new TileEntityGlowNuggetChestRender());
		MinecraftForgeClient.registerItemRenderer(ModBlocks.GlowNuggetChest.blockID, new ItemGlowNuggetChestRender());
	}
	public void registerSoundHandler() 
	{


	}
	@Override
	public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z)
	{
		TileEntityMultiFurnaceCore tileEntity = (TileEntityMultiFurnaceCore)world.getBlockTileEntity(x, y, z);
		
		if(tileEntity != null)
			return new GuiMultiFurnace(player.inventory, tileEntity);
		
		return null;
	}
}



