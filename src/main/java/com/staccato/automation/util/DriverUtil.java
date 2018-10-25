package com.staccato.automation.util;

import java.io.File;
import java.net.URLDecoder;

/**
 * Loads browser driver
 */
public class DriverUtil {

    public static void loadChromeDriver(){
        File jarPath=new File(DriverUtil.class.getProtectionDomain().getCodeSource().getLocation().getPath());
        String prop=jarPath.getParentFile().getAbsolutePath();
        try {
            prop = URLDecoder.decode(prop, "UTF-8");
        }catch(Exception e ){}
        System.out.println(" propertiesPath-"+prop);

        System.setProperty("webdriver.chrome.driver", prop + "/chromedriver");
    }
}
