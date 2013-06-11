package bi.bi_Registers;

import net.minecraft.src.ModLoader;
import net.minecraftforge.common.MinecraftForge;
import bi.bi_BasePackage.CommonProxy;
import bi.bi_Blocks.ModBlocks;
import bi.bi_Helper.BFuelHandler;
import bi.bi_Helper.BIWorldGenerator;
import bi.bi_Helper.BlockHandler;
import bi.bi_Helper.EntityLaserMunition;
import bi.bi_Helper.TileEntityGlowNuggetChest;
import bi.bi_Helper.WorldGenTree;
import bi.bi_Items.ModItems;
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
		LanguageRegistry.addName(ModBlocks.Fence, "GlowNugget Fence");
		GameRegistry.registerBlock(ModBlocks.FenceGate, "Mod_FenceGate");
		LanguageRegistry.addName(ModBlocks.FenceGate, "GlowNugget FenceGate");
		GameRegistry.registerBlock(ModBlocks.Stair, "Mod_Stair");
		LanguageRegistry.addName(ModBlocks.Stair, "GlowNugget Stair");
		GameRegistry.registerBlock(ModBlocks.GlowNuggetBlock, "Mod_GlowNuggetBlock");
		LanguageRegistry.addName(ModBlocks.GlowNuggetBlock, "GlowNugget Block");
		GameRegistry.registerBlock(ModBlocks.GlowNuggetChest, "Mod_GlowNuggetChest");
		LanguageRegistry.addName(ModBlocks.GlowNuggetChest, "GlowNuggetChest");
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
		//Items
		LanguageRegistry.addName(ModItems.GlowstoneNugget, "Glowstone Nugget"); 
		LanguageRegistry.addName(ModItems.NuggetSword, "Glowing Nugget Sword"); 
		LanguageRegistry.addName(ModItems.NuggetPickaxe, "Nugget Pickaxe");
		LanguageRegistry.addName(ModItems.NuggetShovel, "Nugget Shovel");
		LanguageRegistry.addName(ModItems.NuggetAxe, "Nugget Axe");
		LanguageRegistry.addName(ModItems.NuggetHoe, "Nugget Hoe");
		LanguageRegistry.addName(ModItems.InfusedCoal, "Infused Coal");
		LanguageRegistry.addName(ModItems.Flour, "Flour");
		LanguageRegistry.addName(ModItems.Turky, "Turky");
		LanguageRegistry.addName(ModItems.BeaconLaser, "BeaconLaser");
		LanguageRegistry.addName(ModItems.NuggetHelmet, "Nugget Helmet");
		LanguageRegistry.addName(ModItems.NuggetChestPlate, "Nugget Chestplate");
		LanguageRegistry.addName(ModItems.NuggetLeggings, "Nugget Leggings");
		LanguageRegistry.addName(ModItems.NuggetBoots, "Nugget Boots");
		LanguageRegistry.addName(ModItems.LaserMunition, "Laser Munition");
		LanguageRegistry.addName(ModItems.NuggetRawDust, "Nugget Raw Dust");
		LanguageRegistry.addName(ModItems.NuggetDust, "Nugget Dust");
		//Others
		LanguageRegistry.instance().addStringLocalization("entity.B&I.LaserMunition.naem", "Laser Munition");
		GameRegistry.registerWorldGenerator(new BIWorldGenerator());
		GameRegistry.registerWorldGenerator(new WorldGenTree());
		GameRegistry.registerFuelHandler(new BFuelHandler());
		RenderingRegistry.instance().registerBlockHandler(new BlockHandler());
		GameRegistry.registerTileEntity(TileEntityGlowNuggetChest.class, "tileentitychest");
		LanguageRegistry.instance().addStringLocalization("multifurnace.container.multifurnace", "Multi-Furnace");
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
	}
}
