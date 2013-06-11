package bi.bi_Blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import bi.bi_BasePackage.BaseClass;
import bi.bi_Helper.BiIds;
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
	public static Block FenceGate;
	public static Block Stair;
	public static Block GlowNuggetBlock;
	public static Block GlowNuggetChest;
	public static Block GlowingLog;
	public static Block GlowingSapling;
	public static Block GlowingLeaves;
	public static Block GlowingPlank;
	public static Block NuggetOre;
	public static Block multiFurnaceCore = null;
	public static Block multiFurnaceDummy = null;

	public static void init() {
		StarSky = new StarSky(BiIds.StarSkyID, 1).setUnlocalizedName("StarSky");
		StormmStone = new BlockStormm(BiIds.StormmStoneID, 2).setUnlocalizedName("StormmStone");
		ReinforcedStone = new ReinforcedStone(BiIds.ReinforcedStoneID, 3).setResistance(20000.0F).setUnlocalizedName("ReinforcedStone");
		StormmSand = new StormmSand(BiIds.StormmSandID, 4).setUnlocalizedName("StormmSand").setResistance(2.0F).setLightValue(0.0F).setStepSound(Block.soundGravelFootstep);
		StormmGlass = new StormmGlass(BiIds.StormmGlassID, 3894).setUnlocalizedName("StormmGlass");
		LittleGlowstone = new LittleGlowstone(BiIds.LittleGlowstoneID, 6).setUnlocalizedName("LittleGlowstone").setLightValue(1F);
		Crafter = new Crafter(BiIds.CrafterID).setUnlocalizedName("Crafter").setResistance(2.0F).setStepSound(Block.soundWoodFootstep);
		Fence = new BlockFence (BiIds.FenceID, "GlowNugget Fence", Material.wood).setUnlocalizedName("GlowNuggetFence").setCreativeTab(BaseClass.BITab).setLightValue(1F);
		FenceGate = new FenceGate(BiIds.FenceGateID).setUnlocalizedName("FenceGate").setResistance(2.0F).setStepSound(Block.soundWoodFootstep).setLightValue(1F);
		GlowNuggetBlock = new GlowNuggetBlock(BiIds.GlowNuggetBlockID, 0).setUnlocalizedName("GlowNuggetBlock").setLightValue(1F);
		Stair = new Stair(BiIds.StairID, ModBlocks.GlowNuggetBlock, 8).setHardness(1.5F).setResistance(3.5F).setUnlocalizedName("GlowNugget Stair").setLightValue(1F);
		GlowNuggetChest = new GlowNuggetChest(BiIds.GlowNuggetChestID, 0).setUnlocalizedName("GlowNuggetChest").setResistance(2.0F).setLightValue(1F);
		GlowingLog = new GlowingLog(BiIds.GlowingLogID, 1).setUnlocalizedName("GlowingLog").setLightValue(1F);
		GlowingSapling = new GlowingSapling(BiIds.GlowingSaplingID, 1).setUnlocalizedName("GlowingSapling").setLightValue(1F);
		GlowingLeaves = new GlowingLeaves(BiIds.GlowingLeavesID).setUnlocalizedName("GlowingLeaves").setLightValue(1F);
		GlowingPlank = new GlowingPlank(BiIds.GlowingPlankID, 1).setUnlocalizedName("GlowingPlank").setLightValue(1F);
		NuggetOre = new NuggetOre(BiIds.NuggetOreID, 1).setUnlocalizedName("NuggetOre").setLightValue(1F);
		
		
		multiFurnaceCore = new BlockMultiFurnaceCore(3975);
		multiFurnaceDummy = new BlockMultiFurnaceDummy(3976);
		
		GameRegistry.registerBlock(multiFurnaceCore, "blockMultiFurnaceCore");
		GameRegistry.registerBlock(multiFurnaceDummy, "blockMultiFurnaceDummy");
		
		LanguageRegistry.addName(multiFurnaceCore, "Multi-Furnace Core");
		LanguageRegistry.addName(multiFurnaceDummy, "Multi-Furnace Dummy");
	}

}
