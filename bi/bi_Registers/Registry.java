package bi.bi_Registers;

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.common.MinecraftForge;
import bi.bi_BasePackage.BaseClass;
import bi.bi_Blocks.ModBlocks;
import bi.bi_Config.Strings;
import bi.bi_Entitys.EntityOana;
import bi.bi_Entitys.GrowerTileEntity;
import bi.bi_Entitys.TileEntityGlowNuggetChest;
import bi.bi_Entitys.TileEntityLittleGlowstone;
import bi.bi_Helper.BFuelHandler;
import bi.bi_Helper.BIWorldGenerator;
import bi.bi_Helper.BlockHandler;
import bi.bi_Helper.WorldGenTree;
import bi.bi_Items.ModItems;
import bi.bi_Renders.LittleGlowstoneRender;
import bi.bi_Renders.RenderGrower;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Registry {
	public static void init()
	{
		//Blocks
		GameRegistry.registerBlock(ModBlocks.StarSky, "Mod_Starsky");
		LanguageRegistry.addName(ModBlocks.StarSky, "StarSky");
		GameRegistry.registerBlock(ModBlocks.StormmStone, "Mod_StormmStone");
		LanguageRegistry.addName(ModBlocks.StormmStone, "Stormm Stone");
		GameRegistry.registerBlock(ModBlocks.ReinforcedStone, "Mod_ReinforcedStone");
		LanguageRegistry.addName(ModBlocks.ReinforcedStone, "Reinforced Stone");
		GameRegistry.registerBlock(ModBlocks.StormmSand, "Mod_StormmSand");
		LanguageRegistry.addName(ModBlocks.StormmSand, "Stormm Sand");
		GameRegistry.registerBlock(ModBlocks.StormmGlass, "Mod_StormmGlass");
		LanguageRegistry.addName(ModBlocks.StormmGlass, "Stormm Glass");
		LanguageRegistry.addName(ModBlocks.LittleGlowstone, "Little Glowstone");
		GameRegistry.registerBlock(ModBlocks.LittleGlowstone, "Mod_LittleGlowstone");
		GameRegistry.registerBlock(ModBlocks.Crafter, "Mod_Crafter");
		LanguageRegistry.addName(ModBlocks.Crafter, "Crafter");
		GameRegistry.registerBlock(ModBlocks.Fence, "Mod_Fence");
		LanguageRegistry.addName(ModBlocks.Fence, "Glowing Fence");
		GameRegistry.registerBlock(ModBlocks.Stair, "Mod_Stair");
		LanguageRegistry.addName(ModBlocks.Stair, "Glowing Stair");
		GameRegistry.registerBlock(ModBlocks.GlowNuggetBlock, "Mod_GlowNuggetBlock");
		LanguageRegistry.addName(ModBlocks.GlowNuggetBlock, "GlowstoneNugget Block");
		GameRegistry.registerBlock(ModBlocks.GlowNuggetChest, "Mod_GlowNuggetChest");
		LanguageRegistry.addName(ModBlocks.GlowNuggetChest, "Glowing Chest");
		GameRegistry.registerBlock(ModBlocks.GlowingLog, "Mod_GlowingLog");
		LanguageRegistry.addName(ModBlocks.GlowingLog, "Glowing Wood");
		GameRegistry.registerBlock(ModBlocks.GlowingSapling, "Mod_GlowingSapling");
		LanguageRegistry.addName(ModBlocks.GlowingSapling, "Glowing Sapling");
		GameRegistry.registerBlock(ModBlocks.GlowingLeaves, "Mod_GlowingLeaves");
		LanguageRegistry.addName(ModBlocks.GlowingLeaves, "Glowing Leaves");
		GameRegistry.registerBlock(ModBlocks.GlowingPlank, "Mod_GlowingPlank");
		LanguageRegistry.addName(ModBlocks.GlowingPlank, "Glowing Plank");
		GameRegistry.registerBlock(ModBlocks.NuggetOre, "Mod_NuggetOre");
		LanguageRegistry.addName(ModBlocks.NuggetOre, "Nugget Ore");
		GameRegistry.registerBlock(ModBlocks.PoC, "Mod_PoC");
		LanguageRegistry.addName(ModBlocks.PoC, "Metrix Block");
		GameRegistry.registerBlock(ModBlocks.GlowingSpeeder, "Mod_GlowingSpeeder");
		LanguageRegistry.addName(ModBlocks.GlowingSpeeder, "Glowing Speeder");
		GameRegistry.registerBlock(ModBlocks.ClearGlass, "Mod_ClearGlass");
		LanguageRegistry.addName(ModBlocks.ClearGlass, "Clean Glass");
		GameRegistry.registerBlock(ModBlocks.Grower, "Mod_Grower");
		LanguageRegistry.addName(ModBlocks.Grower, "Grower");
		GameRegistry.registerBlock(ModBlocks.Test, "Mod_Test");
		LanguageRegistry.addName(ModBlocks.Test, "Test Block");
		//Items
		LanguageRegistry.addName(ModItems.GlowstoneNugget, "Glowstone Nugget"); 
		LanguageRegistry.addName(ModItems.NuggetSword, "Nugget Sword"); 
		LanguageRegistry.addName(ModItems.NuggetPickaxe, "Nugget Pickaxe");
		LanguageRegistry.addName(ModItems.NuggetShovel, "Nugget Shovel");
		LanguageRegistry.addName(ModItems.NuggetAxe, "Nugget Axe");
		LanguageRegistry.addName(ModItems.InfusedCoal, "Infused Coal");
		LanguageRegistry.addName(ModItems.Flour, "Flour");
		LanguageRegistry.addName(ModItems.Turky, "Turkey");
		LanguageRegistry.addName(ModItems.BeaconLaser, "BeaconLaser");
		LanguageRegistry.addName(ModItems.LaserMunition, "Laser Munition");
		LanguageRegistry.addName(ModItems.NuggetRawDust, "Nugget Raw Dust");
		LanguageRegistry.addName(ModItems.NuggetDust, "Nugget Dust");
		LanguageRegistry.addName(ModItems.CrazyIngot, "Crazy Ingot");
		LanguageRegistry.addName(ModItems.CrazyBar, "Crazy Bar");
		LanguageRegistry.addName(ModItems.CrazySword, "Crazy Sword"); 
		LanguageRegistry.addName(ModItems.CrazyPickaxe, "Crazy Pickaxe");
		LanguageRegistry.addName(ModItems.CrazyShovel, "Crazy Shovel");
		LanguageRegistry.addName(ModItems.CrazyAxe, "Crazy Axe");
		LanguageRegistry.addName(ModItems.NetherFuel, "Nether Fuel");
		LanguageRegistry.addName(ModItems.GlowingStick, "Glowing Stick");
		LanguageRegistry.addName(ModItems.Banana, "Banana");
		LanguageRegistry.addName(ModItems.Test, "Test Tool");
		for(int i = 0; i < Strings.ORANGE_NAMES.length; i++){
			LanguageRegistry.addName(new ItemStack(ModItems.Orange, 1, i), Strings.ORANGE_NAMES[i]);
		}
		LanguageRegistry.addName(ModItems.Cleaner, "Cutter");
		LanguageRegistry.addName(ModItems.GlowingRubber, "Glowing Rubber");
		//Hooks
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(ModItems.InfusedCoal),1,15,100));
		ChestGenHooks.getInfo(ChestGenHooks.BONUS_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(ModItems.InfusedCoal),1,10,100));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(ModItems.InfusedCoal),1,10,100));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(ModItems.InfusedCoal),1,10,100));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(ModItems.InfusedCoal),1,10,100));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(ModItems.InfusedCoal),1,10,100));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(ModItems.InfusedCoal),1,10,100));
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(ModBlocks.LittleGlowstone),1,30,100));
		ChestGenHooks.getInfo(ChestGenHooks.BONUS_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(ModBlocks.LittleGlowstone),1,30,100));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(ModBlocks.LittleGlowstone),1,30,100));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(ModBlocks.LittleGlowstone),1,30,100));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(ModBlocks.LittleGlowstone),1,30,100));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(ModBlocks.LittleGlowstone),1,30,100));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(ModBlocks.LittleGlowstone),1,30,100));
		//Others
		LanguageRegistry.instance().addStringLocalization("entity.B&I.LaserMunition.name", "Laser Munition");
		LanguageRegistry.instance().addStringLocalization("entity.B&I.Oana.name", "Oana");
		GameRegistry.registerWorldGenerator(new BIWorldGenerator());
		GameRegistry.registerWorldGenerator(new WorldGenTree());
		GameRegistry.registerFuelHandler(new BFuelHandler());
		RenderingRegistry.instance().registerBlockHandler(new BlockHandler());
		GameRegistry.registerTileEntity(TileEntityGlowNuggetChest.class, "tileentitychest");
		GameRegistry.registerTileEntity(TileEntityLittleGlowstone.class, Strings.LITTLE_GLOWSTONE_TE_KEY);
		GameRegistry.registerTileEntity(GrowerTileEntity.class, Strings.GROWER_KEY);
		EntityRegistry.addSpawn(EntityOana.class, 10, 2, 4, EnumCreatureType.ambient, BiomeGenBase.beach, BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.jungleHills, BiomeGenBase.mushroomIsland, BiomeGenBase.mushroomIslandShore, BiomeGenBase.ocean, BiomeGenBase.plains, BiomeGenBase.river, BiomeGenBase.swampland);
		
		//BlocksHarvestLevel
		MinecraftForge.setBlockHarvestLevel(ModBlocks.StormmSand, "shovel", 0);
		MinecraftForge.setBlockHarvestLevel(ModBlocks.Crafter, "axe", 1);
		MinecraftForge.setBlockHarvestLevel(ModBlocks.ReinforcedStone, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(ModBlocks.StarSky, "axe", 1);
		MinecraftForge.setBlockHarvestLevel(ModBlocks.StormmGlass, "pickaxe", 0);
		MinecraftForge.setBlockHarvestLevel(ModBlocks.StormmStone, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(ModBlocks.Fence, "axe", 1);
		MinecraftForge.setBlockHarvestLevel(ModBlocks.GlowingLog, "axe", 1);
		MinecraftForge.setBlockHarvestLevel(ModBlocks.GlowingPlank, "axe", 1);
		MinecraftForge.setBlockHarvestLevel(ModBlocks.GlowNuggetChest, "axe", 1);
		MinecraftForge.setBlockHarvestLevel(ModBlocks.GlowNuggetBlock, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(ModBlocks.NuggetOre, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(ModBlocks.Stair, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(ModBlocks.Grower, "pickaxe", 1);
	}
	
}
