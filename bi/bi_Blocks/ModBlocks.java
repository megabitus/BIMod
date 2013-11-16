package bi.bi_Blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import bi.bi_BasePackage.BaseClass;
import bi.bi_Config.BiIds;
import bi.bi_Items.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.block.material.Material;

public class ModBlocks{
	public static Block StarSky;
	public static Block StormmStone;
	public static Block ReinforcedStone;
	public static Block StormmSand;
	public static Block StormmGlass;
	public static Block LittleGlowstone;
	public static Block Crafter;
	public static Block Fence;
	public static Block Stair;
	public static Block GlowNuggetBlock;
	public static Block GlowNuggetChest;
	public static Block GlowingLog;
	public static Block GlowingSapling;
	public static Block GlowingLeaves;
	public static Block GlowingPlank;
	public static Block NuggetOre;
	public static Block PoC;
	public static Block GlowingSpeeder;
	public static Block ClearGlass;
	public static Block Grower;
	public static Block Test;
	
	public static void init() {

		StarSky = new StarSky(BiIds.StarSkyID, 1);
		StormmStone = new StormmStone(BiIds.StormmStoneID, 2);
		ReinforcedStone = new ReinforcedStone(BiIds.ReinforcedStoneID, 3);
		StormmSand = new StormmSand(BiIds.StormmSandID, 4);
		StormmGlass = new StormmGlass(BiIds.StormmGlassID, Material.glass, false);
		LittleGlowstone = new LittleGlowstone(BiIds.LittleGlowstoneID, 6);
		Crafter = new Crafter(BiIds.CrafterID);
		Fence = new BlockFence(BiIds.FenceID, "GlowNugget Fence", Material.wood).setCreativeTab(BaseClass.BITab).setHardness(1F);;
		GlowNuggetBlock = new GlowNuggetBlock(BiIds.GlowNuggetBlockID, 0);
		Stair = new Stair(BiIds.StairID, ModBlocks.GlowNuggetBlock, 8);
		GlowNuggetChest = new GlowNuggetChest(BiIds.GlowNuggetChestID, 0);
		GlowingLog = new GlowingLog(BiIds.GlowingLogID, 1);
		GlowingSapling = new GlowingSapling(BiIds.GlowingSaplingID, 1);
		GlowingLeaves = new GlowingLeaves(BiIds.GlowingLeavesID);
		GlowingPlank = new GlowingPlank(BiIds.GlowingPlankID, 1);
		NuggetOre = new NuggetOre(BiIds.NuggetOreID, 1);
		PoC = new PoC(BiIds.PoCID, 9);
		GlowingSpeeder = new GlowingSpeeder(BiIds.GlowingSpeederID, 9);
		ClearGlass = new ClearGlass(BiIds.ClearGlassID, Material.glass, false);
		Grower = new Grower(BiIds.GrowerID);
		Test = new Test(3986);
	}
}
