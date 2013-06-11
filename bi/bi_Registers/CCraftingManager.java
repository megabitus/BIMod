package bi.bi_Registers;

import java.util.ArrayList;
import java.util.HashMap;

import cpw.mods.fml.common.registry.GameRegistry;

import bi.bi_Blocks.ModBlocks;
import bi.bi_Items.ModItems;
import net.minecraft.block.Block;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.ShapedRecipes;
import net.minecraft.item.crafting.ShapelessRecipes;
import net.minecraft.world.World;
import net.minecraftforge.oredict.OreDictionary;

public class CCraftingManager
{
	private static final CCraftingManager instance = new CCraftingManager();
	private ArrayList recipes = new ArrayList();
	public static final CCraftingManager getInstance()
	{
		return instance;
	}
	private CCraftingManager()
	{

		//Other
		this.addRecipe(new ItemStack(ModBlocks.Crafter, 1), new Object []{"LCL", "IWI", "LIL", Character.valueOf('L'), Block.planks, Character.valueOf('I'), ModItems.GlowstoneNugget, Character.valueOf('W'), Block.wood, Character.valueOf('C'), Block.workbench});
		this.addShapelessRecipe(new ItemStack(Block.obsidian, 1), new ItemStack(Item.bucketWater), new ItemStack(Item.bucketLava));
		this.addRecipe(new ItemStack(ModItems.InfusedCoal, 1), new Object []{"NNN", "NCN", "NNN", Character.valueOf('N'), Block.netherrack, Character.valueOf('C'), Item.coal});
		this.addRecipe(new ItemStack(ModItems.GlowstoneNugget, 1), new Object[] {"GRG", "RIR", "GRG", Character.valueOf('I'), Item.goldNugget, Character.valueOf('R'), Item.lightStoneDust, Character.valueOf('G'), Item.ghastTear});
		this.addRecipe(new ItemStack(ModItems.NuggetSword, 1), new Object []{"XGX", "XGX", "XSX", Character.valueOf('G'), ModItems.GlowstoneNugget, Character.valueOf('S'), Item.stick});
		this.addRecipe(new ItemStack(ModItems.NuggetPickaxe, 1), new Object []{"GGG", "XSX", "XSX", Character.valueOf('G'), ModItems.GlowstoneNugget, Character.valueOf('S'), Item.stick});
		this.addRecipe(new ItemStack(ModItems.NuggetShovel, 1), new Object []{"XGX", "XSX", "XSX", Character.valueOf('G'), ModItems.GlowstoneNugget, Character.valueOf('S'), Item.stick});
		this.addRecipe(new ItemStack(ModItems.NuggetAxe, 1), new Object []{"GGX", "GSX", "XSX", Character.valueOf('G'), ModItems.GlowstoneNugget, Character.valueOf('S'), Item.stick});
		this.addRecipe(new ItemStack(ModItems.NuggetHoe, 1), new Object []{"GGX", "XSX", "XSX", Character.valueOf('G'), ModItems.GlowstoneNugget, Character.valueOf('S'), Item.stick});
		this.addRecipe(new ItemStack(ModItems.Turky, 3), new Object []{"WWW", "SCW", "WSW", Character.valueOf('W'), Item.wheat, Character.valueOf('C'), Item.chickenCooked, Character.valueOf('S'), Item.beefCooked});
		this.addRecipe(new ItemStack(ModItems.Turky, 3), new Object []{"WWW", "PCW", "WPW", Character.valueOf('W'), Item.wheat, Character.valueOf('C'), Item.chickenCooked, Character.valueOf('P'), Item.porkCooked});
		this.addRecipe(new ItemStack(ModItems.BeaconLaser, 1), new Object []{"BOO", "ONO", "RLU", Character.valueOf('B'), Block.beacon, Character.valueOf('O'), Block.obsidian, Character.valueOf('N'), Item.netherStar, Character.valueOf('R'), Item.redstone, Character.valueOf('L'), Item.leather, Character.valueOf('U'), Block.stoneButton});
		this.addRecipe(new ItemStack(ModItems.NuggetHelmet, 1), new Object []{"NNN", "NCN", "CCC", Character.valueOf('N'), ModItems.GlowstoneNugget});
		this.addRecipe(new ItemStack(ModItems.NuggetChestPlate, 1), new Object []{"NCN", "NNN", "NNN", Character.valueOf('N'), ModItems.GlowstoneNugget});
		this.addRecipe(new ItemStack(ModItems.NuggetLeggings, 1), new Object []{"NNN", "NCN", "NCN", Character.valueOf('N'), ModItems.GlowstoneNugget});
		this.addRecipe(new ItemStack(ModItems.NuggetBoots, 1), new Object []{"CCC", "NCN", "NCN", Character.valueOf('N'), ModItems.GlowstoneNugget});
		this.addRecipe(new ItemStack(ModBlocks.StarSky, 2), new Object []{"XRX", "XOX", "XRX", Character.valueOf('R'), ModItems.GlowstoneNugget, Character.valueOf('O'), Block.obsidian});
		this.addRecipe(new ItemStack(ModBlocks.StormmStone, 4), new Object []{"XMX", "XSX", "XIX", Character.valueOf('M'), Block.mushroomBrown, Character.valueOf('S'), Block.stone, Character.valueOf('I'), Item.ingotIron});
		this.addRecipe(new ItemStack(ModBlocks.StormmSand, 4),new Object[]{"XMX", "XSX", "XIX",Character.valueOf('M'), Block.mushroomBrown, Character.valueOf('S'), Block.slowSand, Character.valueOf('I'), Item.ingotIron, Character.valueOf('X'), Block.sand});
		this.addShapelessRecipe(new ItemStack(Item.netherStalkSeeds, 1), new ItemStack(Item.seeds), new ItemStack(Block.slowSand), new ItemStack(Item.redstone));
		this.addRecipe(new ItemStack(Item.lightStoneDust, 1), new Object []{"LLL", "LLL", "LLL", Character.valueOf('L'), ModBlocks.LittleGlowstone});
		this.addRecipe(new ItemStack(ModBlocks.LittleGlowstone, 2), new Object []{"TTT", "TTT", "TTT", Character.valueOf('T'), Block.torchWood});
		this.addRecipe(new ItemStack(ModBlocks.ReinforcedStone, 32), new Object []{"SSS", "SDS", "SSS", Character.valueOf('S'), Block.stone, Character.valueOf('D'), Item.diamond});
		this.addRecipe(new ItemStack(Block.ice, 4),new Object[]{"SSS", "SBS", "SSS",Character.valueOf('S'), Item.snowball, Character.valueOf('B'), Item.bucketWater});
		this.addRecipe(new ItemStack(ModItems.LaserMunition, 16), new Object[] {"GND", "NAN", "DNS", Character.valueOf('G'), ModItems.GlowstoneNugget, Character.valueOf('A'), Item.arrow, Character.valueOf('S'), Item.stick});
		this.addRecipe(new ItemStack(ModBlocks.GlowNuggetBlock, 1), new Object []{"GGG", "GGG", "GGG", Character.valueOf('G'), ModItems.GlowstoneNugget});
		this.addShapelessRecipe(new ItemStack(ModItems.GlowstoneNugget, 9), new ItemStack(ModBlocks.GlowNuggetBlock));
		this.addShapelessRecipe(new ItemStack(ModBlocks.GlowingPlank, 4), new ItemStack(ModBlocks.GlowingLog));
		this.addRecipe(new ItemStack(ModBlocks.GlowNuggetChest, 1), new Object []{"PPP", "POP", "PPP", Character.valueOf('P'), ModBlocks.GlowingPlank});
		this.addRecipe(new ItemStack(ModBlocks.Crafter, 1), new Object []{"PPP", "PGP", "PPP", Character.valueOf('P'), ModBlocks.GlowingPlank,  Character.valueOf('G'), ModItems.GlowstoneNugget});
		this.addRecipe(new ItemStack(ModBlocks.Fence, 2), new Object []{"OOO", "PPP", "PPP", Character.valueOf('P'), ModBlocks.GlowingPlank});
		this.addShapelessRecipe(new ItemStack(ModBlocks.GlowingLog, 4), new ItemStack(Block.wood,OreDictionary.WILDCARD_VALUE), new ItemStack(ModItems.GlowstoneNugget));
		this.addRecipe(new ItemStack(ModItems.GlowstoneNugget, 1), new Object []{"NNN", "NNN", "NNN", Character.valueOf('N'), ModItems.NuggetDust});
		this.addRecipe(new ItemStack(ModBlocks.Stair, 4), new Object []{"NOO", "NNO", "NNN", Character.valueOf('N'), ModBlocks.GlowingPlank});
		this.addShapelessRecipe(new ItemStack(Item.blazeRod, 2), new ItemStack(Item.blazePowder), new ItemStack(Item.stick));



		System.out.println(this.recipes.size() + " recipes");

	}

	public ShapedRecipes addRecipe(ItemStack par1ItemStack, Object ... par2ArrayOfObj)
	{
		String var3 = "";
		int var4 = 0;
		int var5 = 0;
		int var6 = 0;

		if (par2ArrayOfObj[var4] instanceof String[])
		{
			String[] var7 = (String[])((String[])par2ArrayOfObj[var4++]);

			for (int var8 = 0; var8 < var7.length; ++var8)
			{
				String var9 = var7[var8];
				++var6;
				var5 = var9.length();
				var3 = var3 + var9;
			}
		}
		else
		{
			while (par2ArrayOfObj[var4] instanceof String)
			{
				String var11 = (String)par2ArrayOfObj[var4++];
				++var6;
				var5 = var11.length();
				var3 = var3 + var11;
			}
		}

		HashMap var12;

		for (var12 = new HashMap(); var4 < par2ArrayOfObj.length; var4 += 2)
		{
			Character var13 = (Character)par2ArrayOfObj[var4];
			ItemStack var14 = null;

			if (par2ArrayOfObj[var4 + 1] instanceof Item)
			{
				var14 = new ItemStack((Item)par2ArrayOfObj[var4 + 1]);
			}
			else if (par2ArrayOfObj[var4 + 1] instanceof Block)
			{
				var14 = new ItemStack((Block)par2ArrayOfObj[var4 + 1], 1, -1);
			}
			else if (par2ArrayOfObj[var4 + 1] instanceof ItemStack)
			{
				var14 = (ItemStack)par2ArrayOfObj[var4 + 1];
			}

			var12.put(var13, var14);
		}

		ItemStack[] var15 = new ItemStack[var5 * var6];

		for (int var16 = 0; var16 < var5 * var6; ++var16)
		{
			char var10 = var3.charAt(var16);

			if (var12.containsKey(Character.valueOf(var10)))
			{
				var15[var16] = ((ItemStack)var12.get(Character.valueOf(var10))).copy();
			}
			else
			{
				var15[var16] = null;
			}
		}

		ShapedRecipes var17 = new ShapedRecipes(var5, var6, var15, par1ItemStack);
		this.recipes.add(var17);
		return var17;
	}

	public void addShapelessRecipe(ItemStack par1ItemStack, Object ... par2ArrayOfObj)
	{
		ArrayList var3 = new ArrayList();
		Object[] var4 = par2ArrayOfObj;
		int var5 = par2ArrayOfObj.length;

		for (int var6 = 0; var6 < var5; ++var6)
		{
			Object var7 = var4[var6];

			if (var7 instanceof ItemStack)
			{
				var3.add(((ItemStack)var7).copy());
			}
			else if (var7 instanceof Item)
			{
				var3.add(new ItemStack((Item)var7));
			}
			else
			{
				if (!(var7 instanceof Block))
				{
					throw new RuntimeException("Invalid shapeless recipy!");
				}

				var3.add(new ItemStack((Block)var7));
			}
		}

		this.recipes.add(new ShapelessRecipes(par1ItemStack, var3));
	}

	public ItemStack findMatchingRecipe(InventoryCrafting par1InventoryCrafting, World par2World)
	{
		int var3 = 0;
		ItemStack var4 = null;
		ItemStack var5 = null;
		int var6;

		for (var6 = 0; var6 < par1InventoryCrafting.getSizeInventory(); ++var6)
		{
			ItemStack var7 = par1InventoryCrafting.getStackInSlot(var6);

			if (var7 != null)
			{
				if (var3 == 0)
				{
					var4 = var7;
				}

				if (var3 == 1)
				{
					var5 = var7;
				}

				++var3;
			}
		}

		if (var3 == 2 && var4.itemID == var5.itemID && var4.stackSize == 1 && var5.stackSize == 1 && Item.itemsList[var4.itemID].isRepairable())
		{
			Item var11 = Item.itemsList[var4.itemID];
			int var13 = var11.getMaxDamage() - var4.getItemDamageForDisplay();
			int var8 = var11.getMaxDamage() - var5.getItemDamageForDisplay();
			int var9 = var13 + var8 + var11.getMaxDamage() * 5 / 100;
			int var10 = var11.getMaxDamage() - var9;

			if (var10 < 0)
			{
				var10 = 0;
			}

			return new ItemStack(var4.itemID, 1, var10);
		}
		else
		{
			for (var6 = 0; var6 < this.recipes.size(); ++var6)
			{
				IRecipe var12 = (IRecipe)this.recipes.get(var6);

				if (var12.matches(par1InventoryCrafting, par2World))
				{
					return var12.getCraftingResult(par1InventoryCrafting);
				}
			}

			return null;
		}
	}

	public ArrayList getRecipeList()
	{
		return this.recipes;
	}
}