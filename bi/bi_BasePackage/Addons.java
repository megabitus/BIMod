package bi.bi_BasePackage;

import java.util.logging.Level;

import bi.bi_Helper.LogHelper;
import net.minecraft.block.Block;
import cpw.mods.fml.common.Loader;

public class Addons {

    public static Block rp2Stone = null;

    public static void initWorld() {

    	if (Loader.isModLoaded("RedPowerWorld")) {
            try {
                rp2Stone = (Block) Class.forName("com.eloraam.redpower.RedPowerWorld").getField("blockStone").get(null);

                 {
                	
                }

                LogHelper.log(Level.INFO, "Loaded RP2 World addon");
            }
            catch (Exception e) {
                LogHelper.log(Level.SEVERE, "Could not load RP2 World addon");
                e.printStackTrace(System.err);
            }
        }
    }

}