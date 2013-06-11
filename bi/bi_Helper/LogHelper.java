package bi.bi_Helper;

import java.util.logging.Level;
import java.util.logging.Logger;


import cpw.mods.fml.common.FMLLog;

public class LogHelper {

    private static Logger BILogger = Logger.getLogger(Reference.MOD_NAME);

    public static void init() {

        BILogger.setParent(FMLLog.getLogger());
    }

    public static void log(Level logLevel, String message) {

        BILogger.log(logLevel, message);
    }

}