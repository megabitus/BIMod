package bi.bi_Config;

import static net.minecraftforge.common.Configuration.CATEGORY_GENERAL;

import java.io.File;
import java.util.logging.Level;

import bi.bi_BasePackage.BaseClass;
import bi.bi_Helper.BiIds;
import bi.bi_Helper.Reference;
import bi.bi_Helper.Strings;
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
			BiIds.StormmStoneID = configuration.getBlock(Strings.STORMM_STONE, BiIds.StormmStoneID).getInt(BiIds.StormmStoneID);
			BiIds.ReinforcedStoneID = configuration.getBlock(Strings.REINFORCED_STONE, BiIds.ReinforcedStoneID).getInt(BiIds.ReinforcedStoneID);
			BiIds.StormmSandID = configuration.getBlock(Strings.STORMM_SAND, BiIds.StormmSandID).getInt(BiIds.StormmSandID);
			BiIds.StormmGlassID = configuration.getBlock(Strings.STORMM_GLASS, BiIds.StormmGlassID).getInt(BiIds.StormmGlassID);
			BiIds.LittleGlowstoneID = configuration.getBlock(Strings.LITTLE_GLOWSTONE, BiIds.LittleGlowstoneID).getInt(BiIds.LittleGlowstoneID);
			BiIds.ZuChestID = configuration.getBlock(Strings.ZU_CHEST, BiIds.ZuChestID).getInt(BiIds.ZuChestID);
			BiIds.FenceID = configuration.getBlock(Strings.FENCE, BiIds.FenceID).getInt(BiIds.FenceID);
			BiIds.FenceGateID = configuration.getBlock(Strings.FENCE_GATE, BiIds.FenceGateID).getInt(BiIds.FenceGateID);
			BiIds.GlowNuggetChestID = configuration.getBlock(Strings.GLOW_NUGGET_CHEST, BiIds.GlowNuggetChestID).getInt(BiIds.GlowNuggetChestID);
			BiIds.GlowingLogID = configuration.getBlock(Strings.GLOWING_LOG, BiIds.GlowingLogID).getInt(BiIds.StarSkyID);
			BiIds.GlowingSaplingID = configuration.getBlock(Strings.GLOWING_SAPLING, BiIds.GlowingSaplingID).getInt(BiIds.GlowingSaplingID);
			BiIds.GlowingLeavesID = configuration.getBlock(Strings.GLOWING_LEAVES, BiIds.GlowingLeavesID).getInt(BiIds.GlowingLeavesID);
			BiIds.GlowingPlankID = configuration.getBlock(Strings.GLOWING_PLANK, BiIds.GlowingPlankID).getInt(BiIds.GlowingPlankID);
			BiIds.NuggetOreID = configuration.getBlock(Strings.GLOWING_ORE, BiIds.NuggetOreID).getInt(BiIds.NuggetOreID);
			BiIds.PoCID = configuration.getBlock(Strings.P_O_C, BiIds.PoCID).getInt(BiIds.PoCID);
			BiIds.MultiPartID = configuration.getBlock(Strings.MULTI_PART, BiIds.MultiPartID).getInt(BiIds.MultiPartID);
			/* Item configs */
			BiIds.GlowstoneNuggetID = configuration.getItem(Strings.GLOWSTONE_NUGGET, BiIds.GlowstoneNuggetID).getInt(BiIds.GlowstoneNuggetID);
			BiIds.NuggetSwordID = configuration.getItem(Strings.NUGGET_SWORD, BiIds.NuggetSwordID).getInt(BiIds.NuggetSwordID);
			BiIds.NuggetPickaxeID = configuration.getItem(Strings.NUGGET_PICKAXE, BiIds.NuggetPickaxeID).getInt(BiIds.NuggetPickaxeID);
			BiIds.NuggetShovelID = configuration.getItem(Strings.NUGGET_SHOVEL, BiIds.NuggetShovelID).getInt(BiIds.NuggetShovelID);
			BiIds.NuggetAxeID = configuration.getItem(Strings.NUGGET_AXE, BiIds.NuggetAxeID).getInt(BiIds.NuggetAxeID);
			BiIds.NuggetHoeID = configuration.getItem(Strings.NUGGET_HOE, BiIds.NuggetHoeID).getInt(BiIds.NuggetHoeID);
			BiIds.InfusedCoalID = configuration.getItem(Strings.INFUSED_COAL, BiIds.InfusedCoalID).getInt(BiIds.InfusedCoalID);
			BiIds.FlourID = configuration.getItem(Strings.FLOUR, BiIds.FlourID).getInt(BiIds.FlourID);
			BiIds.BeaconLaserID = configuration.getItem(Strings.BEACON_LASER, BiIds.BeaconLaserID).getInt(BiIds.BeaconLaserID);
			BiIds.TurkyID = configuration.getItem(Strings.TURKY, BiIds.TurkyID).getInt(BiIds.TurkyID);
			BiIds.NuggetHelmetID = configuration.getItem(Strings.NUGGET_HELMET, BiIds.NuggetHelmetID).getInt(BiIds.NuggetHelmetID);
			BiIds.NuggetChestPlateID = configuration.getItem(Strings.NUGGET_CHESTPLATE, BiIds.NuggetChestPlateID).getInt(BiIds.NuggetChestPlateID);
			BiIds.NuggetLeggingsID = configuration.getItem(Strings.NUGGET_LEGGINGS, BiIds.NuggetLeggingsID).getInt(BiIds.NuggetLeggingsID);
			BiIds.NuggetBootsID = configuration.getItem(Strings.NUGGET_BOOTS, BiIds.NuggetBootsID).getInt(BiIds.NuggetBootsID);
			BiIds.GlowNuggetBlockID = configuration.getItem(Strings.GLOW_NUGGET_BLOCK, BiIds.GlowNuggetBlockID).getInt(BiIds.GlowNuggetBlockID);
			BiIds.NuggetRawDustID = configuration.getItem(Strings.NUGGET_RAW_DUST, BiIds.NuggetRawDustID).getInt(BiIds.NuggetRawDustID);
			BiIds.NuggetDustID = configuration.getItem(Strings.NUGGET_DUST, BiIds.NuggetDustID).getInt(BiIds.NuggetDustID);


		}
		catch (Exception e) {
			FMLLog.log(Level.SEVERE, e, Reference.MOD_NAME + " has had a problem loading its configuration");
		}
		finally {
			configuration.save();
		}
	}

	public static void set(String categoryName, String propertyName, String newValue) {

		configuration.load();
		if (configuration.getCategoryNames().contains(categoryName)) {
			if (configuration.getCategory(categoryName).containsKey(propertyName)) {
				configuration.getCategory(categoryName).get(propertyName).set(newValue);
			}		}
		configuration.save();
	}
}
