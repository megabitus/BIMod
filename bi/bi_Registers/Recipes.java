package bi.bi_Registers;

import bi.bi_Blocks.ModBlocks;
import bi.bi_Blocks.StormmSand;
import bi.bi_Items.ModItems;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes {
	public static void init() {

		GameRegistry.addRecipe(new ItemStack(ModItems.GlowstoneNugget, 1), new Object[] {"GRG", "RIR", "GRG", Character.valueOf('I'), Item.goldNugget, Character.valueOf('R'), Item.glowstone, Character.valueOf('G'), Item.ghastTear});
		GameRegistry.addRecipe(new ItemStack(Item.glowstone, 1), new Object []{"LLL", "LLL", "LLL", Character.valueOf('L'), ModBlocks.LittleGlowstone});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.LittleGlowstone, 2), new Object []{"TTT", "TTT", "TTT", Character.valueOf('T'), Block.torchWood});
		GameRegistry.addSmelting(ModBlocks.StormmSand.blockID, new ItemStack(ModBlocks.StormmGlass, 1), 0.5F);
		GameRegistry.addSmelting(Item.seeds.itemID, new ItemStack(ModItems.Flour, 1), 0.5F);
		GameRegistry.addSmelting(ModItems.Flour.itemID, new ItemStack(Item.bread, 1), 0.5F);
		GameRegistry.addSmelting(ModItems.NuggetRawDust.itemID, new ItemStack(ModItems.NuggetDust, 1), 5F);
		GameRegistry.addSmelting(Item.rottenFlesh.itemID, new ItemStack(Item.leather, 1), 0.2F);
		GameRegistry.addSmelting(ModBlocks.StormmGlass.blockID, new ItemStack(ModBlocks.ClearGlass, 1), 0.5F);
		GameRegistry.addSmelting(Item.spiderEye.itemID, new ItemStack(Item.dyePowder,1,13), 0.1F);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.Crafter, 1), new Object []{"LCL", "IWI", "LIL", Character.valueOf('L'), Block.planks, Character.valueOf('I'), ModItems.GlowstoneNugget, Character.valueOf('W'), Block.wood, Character.valueOf('C'), Block.workbench});
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.GlowingLog, 1), new ItemStack(Block.wood,OreDictionary.WILDCARD_VALUE), new ItemStack(ModItems.GlowstoneNugget));
		GameRegistry.addRecipe(new ItemStack(ModItems.GlowstoneNugget, 1), new Object []{"NNN", "NNN", "NNN", Character.valueOf('N'), ModItems.NuggetDust});
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.GlowingPlank, 4), new ItemStack(ModBlocks.GlowingLog));
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.PoC, 2), new ItemStack(ModBlocks.GlowingLog),new ItemStack(Item.dyePowder,1,2));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.Crafter, 1), new Object []{"LCL", "IWI", "LIL", Character.valueOf('L'), Block.planks, Character.valueOf('I'), ModItems.GlowstoneNugget, Character.valueOf('W'), Block.wood, Character.valueOf('C'), Block.workbench});
		GameRegistry.addShapelessRecipe(new ItemStack(Block.obsidian, 1), new ItemStack(Item.bucketWater), new ItemStack(Item.bucketLava));
		GameRegistry.addRecipe(new ItemStack(ModItems.InfusedCoal, 1), new Object []{"NNN", "NCN", "NNN", Character.valueOf('N'), ModItems.NetherFuel, Character.valueOf('C'), Item.redstone});
		GameRegistry.addRecipe(new ItemStack(ModItems.NetherFuel, 1), new Object []{"NNN", "NCN", "NNN", Character.valueOf('N'), Block.netherrack, Character.valueOf('C'), Item.coal});
		GameRegistry.addRecipe(new ItemStack(ModItems.GlowstoneNugget, 1), new Object[] {"GRG", "RIR", "GRG", Character.valueOf('I'), Item.goldNugget, Character.valueOf('R'), Item.glowstone, Character.valueOf('G'), Item.ghastTear});
		GameRegistry.addRecipe(new ItemStack(ModItems.NuggetSword, 1), new Object []{"XGX", "XGX", "XSX", Character.valueOf('G'), ModItems.GlowstoneNugget, Character.valueOf('S'), Item.stick});
		GameRegistry.addRecipe(new ItemStack(ModItems.NuggetPickaxe, 1), new Object []{"GGG", "XSX", "XSX", Character.valueOf('G'), ModItems.GlowstoneNugget, Character.valueOf('S'), Item.stick});
		GameRegistry.addRecipe(new ItemStack(ModItems.NuggetShovel, 1), new Object []{"XGX", "XSX", "XSX", Character.valueOf('G'), ModItems.GlowstoneNugget, Character.valueOf('S'), Item.stick});
		GameRegistry.addRecipe(new ItemStack(ModItems.NuggetAxe, 1), new Object []{"GGX", "GSX", "XSX", Character.valueOf('G'), ModItems.GlowstoneNugget, Character.valueOf('S'), Item.stick});
		GameRegistry.addRecipe(new ItemStack(ModItems.Turky, 3), new Object []{"WWW", "SCW", "WSW", Character.valueOf('W'), Item.wheat, Character.valueOf('C'), Item.chickenCooked, Character.valueOf('S'), Item.beefCooked});
		GameRegistry.addRecipe(new ItemStack(ModItems.Turky, 3), new Object []{"WWW", "PCW", "WPW", Character.valueOf('W'), Item.wheat, Character.valueOf('C'), Item.chickenCooked, Character.valueOf('P'), Item.porkCooked});
		GameRegistry.addRecipe(new ItemStack(ModItems.BeaconLaser, 1), new Object []{"BOO", "ONO", "RLU", Character.valueOf('B'), Block.beacon, Character.valueOf('O'), Block.obsidian, Character.valueOf('N'), Item.netherStar, Character.valueOf('R'), Item.redstone, Character.valueOf('L'), Item.leather, Character.valueOf('U'), Block.stoneButton});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.StarSky, 2), new Object []{"XRX", "XOX", "XRX", Character.valueOf('R'), ModItems.GlowstoneNugget, Character.valueOf('O'), Block.obsidian});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.StormmStone, 4), new Object []{"XMX", "XSX", "XIX", Character.valueOf('M'), Block.mushroomBrown, Character.valueOf('S'), Block.stone, Character.valueOf('I'), Item.ingotIron});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.StormmSand, 4),new Object[]{"XMX", "XSX", "XIX",Character.valueOf('M'), Block.mushroomBrown, Character.valueOf('S'), Block.slowSand, Character.valueOf('I'), Item.ingotIron, Character.valueOf('X'), Block.sand});
		GameRegistry.addShapelessRecipe(new ItemStack(Item.netherStalkSeeds, 1), new ItemStack(Item.seeds), new ItemStack(Block.slowSand), new ItemStack(Item.redstone));
		GameRegistry.addRecipe(new ItemStack(Item.glowstone, 1), new Object []{"LLL", "LLL", "LLL", Character.valueOf('L'), ModBlocks.LittleGlowstone});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.LittleGlowstone, 2), new Object []{"TTT", "TTT", "TTT", Character.valueOf('T'), Block.torchWood});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.ReinforcedStone, 32), new Object []{"SSS", "SDS", "SSS", Character.valueOf('S'), Block.stone, Character.valueOf('D'), Item.diamond});
		GameRegistry.addRecipe(new ItemStack(Block.ice, 4),new Object[]{"SSS", "SBS", "SSS",Character.valueOf('S'), Item.snowball, Character.valueOf('B'), Item.bucketWater});
		GameRegistry.addRecipe(new ItemStack(ModItems.LaserMunition, 16), new Object[] {"GND", "NAN", "DNS", Character.valueOf('G'), ModItems.GlowstoneNugget, Character.valueOf('A'), Item.arrow, Character.valueOf('S'), Item.stick});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.GlowNuggetBlock, 1), new Object []{"GGG", "GGG", "GGG", Character.valueOf('G'), ModItems.GlowstoneNugget});
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.GlowstoneNugget, 9), new ItemStack(ModBlocks.GlowNuggetBlock));
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.GlowingPlank, 4), new ItemStack(ModBlocks.GlowingLog));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.GlowNuggetChest, 1), new Object []{"PPP", "POP", "PPP", Character.valueOf('P'), ModBlocks.GlowingPlank});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.Crafter, 1), new Object []{"PPP", "PGP", "PPP", Character.valueOf('P'), ModBlocks.GlowingPlank,  Character.valueOf('G'), ModItems.GlowstoneNugget});
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.GlowingLog, 4), new ItemStack(Block.wood,OreDictionary.WILDCARD_VALUE), new ItemStack(ModItems.GlowstoneNugget));
		GameRegistry.addRecipe(new ItemStack(ModItems.GlowstoneNugget, 1), new Object []{"NNN", "NNN", "NNN", Character.valueOf('N'), ModItems.NuggetDust});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.Stair, 4), new Object []{"NOO", "NNO", "NNN", Character.valueOf('N'), ModBlocks.GlowingPlank});
		GameRegistry.addShapelessRecipe(new ItemStack(Item.blazeRod, 2), new ItemStack(Item.blazePowder), new ItemStack(Item.stick));
	    GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.PoC, 3), new ItemStack(ModBlocks.GlowingLog),new ItemStack(Item.dyePowder,1,2));
	    GameRegistry.addShapelessRecipe(new ItemStack(ModItems.GlowingStick, 4), new ItemStack(ModBlocks.GlowingPlank), new ItemStack(ModBlocks.GlowingPlank));
	    GameRegistry.addRecipe(new ItemStack(ModBlocks.Fence, 4), new Object []{"NNN", "SSS", "SSS", Character.valueOf('S'), ModItems.GlowingStick});
	    GameRegistry.addRecipe(new ItemStack(ModBlocks.GlowingSpeeder, 2), new Object []{"GGG", "GPG", "GGG", Character.valueOf('G'), ModBlocks.GlowingPlank,  Character.valueOf('P'), ModBlocks.PoC});
	    GameRegistry.addRecipe(new ItemStack(ModItems.Orange, 1, 3), new Object []{"SAS", "AOA", "SAS", Character.valueOf('A'), Item.appleRed,  Character.valueOf('O'), new ItemStack(Item.dyePowder,1,14),Character.valueOf('S'), Item.sugar});
	    FurnaceRecipes.smelting().addSmelting(ModItems.Orange.itemID, 3, new ItemStack(ModItems.Orange), 0.5f);
	    GameRegistry.addRecipe(new ItemStack(ModItems.Orange, 1, 1), new Object []{"SGS", "GOG", "SGS", Character.valueOf('G'), Item.ingotGold,  Character.valueOf('O'), new ItemStack(ModItems.Orange,1,0),Character.valueOf('S'), Item.sugar});
	    GameRegistry.addRecipe(new ItemStack(ModItems.Orange, 2, 2), new Object []{"SOS", "ODO", "SOS", Character.valueOf('D'), Item.diamond,  Character.valueOf('O'), new ItemStack(ModItems.Orange,1,1),Character.valueOf('S'), Item.sugar});
	}

}
