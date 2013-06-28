package bi.bi_BasePackage;

import java.io.File;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityEggInfo;
import net.minecraft.entity.EntityList;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.oredict.OreDictionary;
import bi.bi_Blocks.ModBlocks;
import bi.bi_Config.ConfigurationHandler;
import bi.bi_Entitys.EntityLaserMunition;
import bi.bi_Entitys.EntityOana;
import bi.bi_Helper.BiIds;
import bi.bi_Helper.Reference;
import bi.bi_Items.ModItems;
import bi.bi_Registers.Recipes;
import bi.bi_Registers.Registry;
import bi.bi_gui.GuiHandlerC;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;


@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME2, version = Reference.VERSION_NUMBER)
@NetworkMod(clientSideRequired = true, 
serverSideRequired = false, 
channels = { "B&I" }, 
packetHandler = PacketHandler.class)
public class BaseClass
{
	@Instance
	public static BaseClass instance;
	private GuiHandlerC guiHandler = new GuiHandlerC();
	@SidedProxy(clientSide = "bi.bi_BasePackage.ClientProxy", 
			serverSide = "bi.bi_BasePackage.CommonProxy")
	public static CommonProxy proxy;
	public static CreativeTabs BITab = new TutTab(CreativeTabs.getNextID(), "B&I Mod");
	@PreInit
	public void initialize(FMLPreInitializationEvent evt)
	{
		ConfigurationHandler.init(new File(evt.getModConfigurationDirectory().getAbsolutePath() + "\\B&I\\" + "B&I" + ".cfg"));
		ModItems.init();
		ModBlocks.init();
	}
	@Init
	public void load(FMLInitializationEvent evt)
	{
		Registry.init();
		Recipes.init();
		NetworkRegistry.instance().registerGuiHandler(this, guiHandler);
		EntityRegistry.registerModEntity(EntityLaserMunition.class, "LaserMunition", 0, this, 128, 1, true);
		proxy.registerRenderers();
		EntityRegistry.registerModEntity(EntityOana.class, "Oana", 1, this, 80, 3, true);
		EntityEgg(EntityOana.class, 0xE01B1B, 0x2FE01B);
		OreDictionary.registerOre("logWood", ModBlocks.GlowingLog);
		OreDictionary.registerOre("plankWood", ModBlocks.GlowingPlank);
		OreDictionary.registerOre("treeSapling", ModBlocks.GlowingSapling);
		OreDictionary.registerOre("treeLeaves", ModBlocks.GlowingLeaves);
	}
	@PostInit
	public static void postInit(FMLPostInitializationEvent event)
	{
		FMLLog.info("Blocks and Items: Looks like everything ran correctly, you are good to go!!!");
	}


	private void oreRegistration() 
	{
		OreDictionary.registerOre("StormmSand", new ItemStack(ModBlocks.StormmSand));
	}
	public static int getUniqueID(){
		int EntityId = 300;
		do{
			EntityId++;
		} while(EntityList.getStringFromID(EntityId) != null);
		return EntityId;
	}
	
	public static void EntityEgg(Class<? extends Entity > entity, int primaryColor, int secondaryColor){
		int id = getUniqueID();
		EntityList.IDtoClassMapping.put(id, entity);
		EntityList.entityEggs.put(id, new EntityEggInfo(id, primaryColor, secondaryColor));
	}
}



