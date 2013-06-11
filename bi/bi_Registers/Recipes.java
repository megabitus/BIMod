package bi.bi_Registers;

import bi.bi_Blocks.ModBlocks;
import bi.bi_Blocks.StormmSand;
import bi.bi_Items.ModItems;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes {
	public static void init() {

		GameRegistry.addRecipe(new ItemStack(ModItems.GlowstoneNugget, 1), new Object[] {"GRG", "RIR", "GRG", Character.valueOf('I'), Item.goldNugget, Character.valueOf('R'), Item.lightStoneDust, Character.valueOf('G'), Item.ghastTear});
		GameRegistry.addRecipe(new ItemStack(Item.lightStoneDust, 1), new Object []{"LLL", "LLL", "LLL", Character.valueOf('L'), ModBlocks.LittleGlowstone});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.LittleGlowstone, 2), new Object []{"TTT", "TTT", "TTT", Character.valueOf('T'), Block.torchWood});
		GameRegistry.addSmelting(ModBlocks.StormmSand.blockID, new ItemStack(ModBlocks.StormmGlass, 1), 0.5F);
		GameRegistry.addSmelting(Item.seeds.itemID, new ItemStack(ModItems.Flour, 1), 0.5F);
		GameRegistry.addSmelting(ModItems.Flour.itemID, new ItemStack(Item.bread, 1), 0.5F);
		GameRegistry.addSmelting(ModItems.NuggetRawDust.itemID, new ItemStack(ModItems.NuggetDust, 1), 5F);
		GameRegistry.addSmelting(Item.rottenFlesh.itemID, new ItemStack(Item.leather, 1), 0.2F);
		GameRegistry.addSmelting(Item.spiderEye.itemID, new ItemStack(Item.dyePowder,1,13), 0.1F);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.Crafter, 1), new Object []{"LCL", "IWI", "LIL", Character.valueOf('L'), Block.planks, Character.valueOf('I'), ModItems.GlowstoneNugget, Character.valueOf('W'), Block.wood, Character.valueOf('C'), Block.workbench});
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.GlowingLog, 1), new ItemStack(Block.wood,OreDictionary.WILDCARD_VALUE), new ItemStack(ModItems.GlowstoneNugget));
		GameRegistry.addRecipe(new ItemStack(ModItems.GlowstoneNugget, 1), new Object []{"NNN", "NNN", "NNN", Character.valueOf('N'), ModItems.NuggetDust});
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.GlowingPlank, 4), new ItemStack(ModBlocks.GlowingLog));
	}

}
