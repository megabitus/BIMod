package bi.bi_BasePackage;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.MinecraftForge;
import bi.bi_Blocks.ModBlocks;
import bi.bi_Config.BiIds;
import bi.bi_Entitys.EntityLaserMunition;
import bi.bi_Entitys.EntityOana;
import bi.bi_Entitys.GrowerTileEntity;
import bi.bi_Entitys.TileEntityCrafter;
import bi.bi_Entitys.TileEntityGlowNuggetChest;
import bi.bi_Entitys.TileEntityGlowNuggetChestRender;
import bi.bi_Entitys.TileEntityLittleGlowstone;
import bi.bi_Gui.GuiC;
import bi.bi_Helper.ItemGlowNuggetChestRender;
import bi.bi_Models.LittleGlowstoneModel;
import bi.bi_Models.ModelOana;
import bi.bi_Renders.LittleGlowstoneRender;
import bi.bi_Renders.RenderGrower;
import bi.bi_Renders.RenderLaserMunition;
import bi.bi_Renders.RenderOana;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ClientProxy extends CommonProxy {
	
	public void registerRenderers () 
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityLaserMunition.class, new RenderLaserMunition());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGlowNuggetChest.class, new TileEntityGlowNuggetChestRender());
		MinecraftForgeClient.registerItemRenderer(ModBlocks.GlowNuggetChest.blockID, new ItemGlowNuggetChestRender());
		RenderingRegistry.registerEntityRenderingHandler(EntityOana.class, new RenderOana(new ModelOana(), 1.5F,1.5F));
		LittleGlowstoneModel model = new LittleGlowstoneModel();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityLittleGlowstone.class, new LittleGlowstoneRender());
		ClientRegistry.bindTileEntitySpecialRenderer(GrowerTileEntity.class, new RenderGrower());
		
	}
	public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z)
	{
		TileEntityCrafter tileEntity = (TileEntityCrafter)world.getBlockTileEntity(x, y, z);

		if(tileEntity != null)
			return new GuiC(player.inventory, tileEntity);

		return null;
	}
	@Override
	public void initSounds() {
		MinecraftForge.EVENT_BUS.register(new bi.bi_Sounds.SoundHandler());
	}
	

}



