package bi.bi_Config;

import static net.minecraftforge.common.Configuration.CATEGORY_GENERAL;

import java.io.File;
import java.util.logging.Level;

import bi.bi_BasePackage.BaseClass;
import bi.bi_Helper.Reference;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.FMLLog;

public class ConfigurationHandler {

	public static Configuration configuration;
	public static void init(File configFile) {

		configuration = new Configuration(configFile);

		try {
			configuration.load();
			/* Block configs */
			BiIds.StarSkyID = configuration.getBlock(Strings.STAR_SKY, BiIds.StarSkyID).getInt(BiIds.StarSkyID);
			BiIds.StormmStoneID = configuration.getBlock(Strings.STORMM_STONE, BiIds.StormmStoneID).getInt(BiIds.StormmStoneID) ;
			BiIds.ReinforcedStoneID = configuration.getBlock(Strings.REINFORCED_STONE, BiIds.ReinforcedStoneID).getInt(BiIds.ReinforcedStoneID) ;
			BiIds.StormmSandID = configuration.getBlock(Strings.STORMM_SAND, BiIds.StormmSandID).getInt(BiIds.StormmSandID) ;
			BiIds.StormmGlassID = configuration.getBlock(Strings.STORMM_GLASS, BiIds.StormmGlassID).getInt(BiIds.StormmGlassID) ;
			BiIds.LittleGlowstoneID = configuration.getBlock(Strings.LITTLE_GLOWSTONE, BiIds.LittleGlowstoneID).getInt(BiIds.LittleGlowstoneID) ;
			BiIds.FenceID = configuration.getBlock(Strings.FENCE, BiIds.FenceID).getInt(BiIds.FenceID) ;
			BiIds.GlowNuggetChestID = configuration.getBlock(Strings.GLOW_NUGGET_CHEST, BiIds.GlowNuggetChestID).getInt(BiIds.GlowNuggetChestID) ;
			BiIds.GlowingLogID = configuration.getBlock(Strings.GLOWING_LOG, BiIds.GlowingLogID).getInt(BiIds.StarSkyID) ;
			BiIds.GlowingSaplingID = configuration.getBlock(Strings.GLOWING_SAPLING, BiIds.GlowingSaplingID).getInt(BiIds.GlowingSaplingID) ;
			BiIds.GlowingLeavesID = configuration.getBlock(Strings.GLOWING_LEAVES, BiIds.GlowingLeavesID).getInt(BiIds.GlowingLeavesID) ;
			BiIds.GlowingPlankID = configuration.getBlock(Strings.GLOWING_PLANK, BiIds.GlowingPlankID).getInt(BiIds.GlowingPlankID) ;
			BiIds.NuggetOreID = configuration.getBlock(Strings.NUGGET_ORE, BiIds.NuggetOreID).getInt(BiIds.NuggetOreID) ;
			BiIds.PoCID = configuration.getBlock(Strings.P_O_C, BiIds.PoCID).getInt(BiIds.PoCID) ;
			BiIds.GlowingSpeederID = configuration.getBlock(Strings.GLOWING_SPEEDER, BiIds.GlowingSpeederID).getInt(BiIds.GlowingSpeederID) ;
			BiIds.ClearGlassID = configuration.getBlock(Strings.CLEAR_GLASS, BiIds.ClearGlassID).getInt(BiIds.ClearGlassID);
			BiIds.GrowerID = configuration.getBlock(Strings.GROWER, BiIds.GrowerID).getInt(BiIds.GrowerID);
			/* Item configs */
			BiIds.GlowstoneNuggetID = configuration.getItem(Strings.GLOWSTONE_NUGGET, BiIds.GlowstoneNuggetID).getInt(BiIds.GlowstoneNuggetID) - 256;
			BiIds.NuggetSwordID = configuration.getItem(Strings.NUGGET_SWORD, BiIds.NuggetSwordID).getInt(BiIds.NuggetSwordID) - 256;
			BiIds.NuggetPickaxeID = configuration.getItem(Strings.NUGGET_PICKAXE, BiIds.NuggetPickaxeID).getInt(BiIds.NuggetPickaxeID) - 256;
			BiIds.NuggetShovelID = configuration.getItem(Strings.NUGGET_SHOVEL, BiIds.NuggetShovelID).getInt(BiIds.NuggetShovelID) - 256;
			BiIds.NuggetAxeID = configuration.getItem(Strings.NUGGET_AXE, BiIds.NuggetAxeID).getInt(BiIds.NuggetAxeID) - 256;
			BiIds.InfusedCoalID = configuration.getItem(Strings.INFUSED_COAL, BiIds.InfusedCoalID).getInt(BiIds.InfusedCoalID) - 256;
			BiIds.FlourID = configuration.getItem(Strings.FLOUR, BiIds.FlourID).getInt(BiIds.FlourID) - 256;
			BiIds.BeaconLaserID = configuration.getItem(Strings.BEACON_LASER, BiIds.BeaconLaserID).getInt(BiIds.BeaconLaserID) - 256;
			BiIds.TurkyID = configuration.getItem(Strings.TURKY, BiIds.TurkyID).getInt(BiIds.TurkyID) - 256;
			BiIds.GlowNuggetBlockID = configuration.getItem(Strings.GLOW_NUGGET_BLOCK, BiIds.GlowNuggetBlockID).getInt(BiIds.GlowNuggetBlockID) - 256;
			BiIds.NuggetRawDustID = configuration.getItem(Strings.NUGGET_RAW_DUST, BiIds.NuggetRawDustID).getInt(BiIds.NuggetRawDustID) - 256;
			BiIds.NuggetDustID = configuration.getItem(Strings.NUGGET_DUST, BiIds.NuggetDustID).getInt(BiIds.NuggetDustID) - 256;
			BiIds.CrazyIngotID = configuration.getItem(Strings.CRAZY_INGOT, BiIds.CrazyIngotID).getInt(BiIds.CrazyIngotID) - 256;
			BiIds.CrazyBarID = configuration.getItem(Strings.CRAZY_BAR, BiIds.CrazyBarID).getInt(BiIds.CrazyBarID) - 256;
			BiIds.CrazySwordID = configuration.getItem(Strings.CRAZY_SWORD, BiIds.CrazySwordID).getInt(BiIds.CrazySwordID) - 256;
			BiIds.CrazyPickaxeID = configuration.getItem(Strings.CRAZY_PICKAXE, BiIds.CrazyPickaxeID).getInt(BiIds.CrazyPickaxeID - 256);
			BiIds.CrazyShovelID = configuration.getItem(Strings.CRAZY_SHOVEL, BiIds.CrazyShovelID).getInt(BiIds.CrazyShovelID) - 256;
			BiIds.CrazyAxeID = configuration.getItem(Strings.CRAZY_AXE, BiIds.CrazyAxeID).getInt(BiIds.CrazyAxeID) - 256;
			BiIds.LaserMunitionID = configuration.getItem(Strings.LASER_MUNITIONS, BiIds.LaserMunitionID).getInt(BiIds.LaserMunitionID) - 256;
			BiIds.GlowingStickID = configuration.getItem(Strings.GLOWING_STICK, BiIds.GlowingStickID).getInt(BiIds.GlowingStickID) - 256;
			BiIds.BananaID = configuration.getItem(Strings.BANANA, BiIds.BananaID).getInt(BiIds.BananaID) - 256;
			BiIds.OrangeID = configuration.getItem(Strings.ORANGE, BiIds.OrangeID).getInt(BiIds.OrangeID) - 256;
			BiIds.GlowingRubberID = configuration.getItem(Strings.GLOWING_RUBBER, BiIds.GlowingRubberID).getInt(BiIds.GlowingRubberID) - 256;
			BiIds.CleanerID = configuration.getItem(Strings.CLEANER, BiIds.CleanerID).getInt(BiIds.CleanerID) - 256;

		}
		catch (Exception e) {
			FMLLog.log(Level.SEVERE, e, Reference.MOD_NAME + " has had a problem loading its configuration");
		}
		finally {
			configuration.save();
		}
		configuration.save();
	}
}
