package com.staccato.automation.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URLDecoder;
import java.util.Properties;

//loads properties file and adds them as System variables.
public class PropertyLoader {

    private static final String PROP_FILE = "/application.properties";

    private PropertyLoader() {}

    public static void loadProperties() {
        Properties properties = new Properties();
        try {
            File jarPath=new File(DriverUtil.class.getProtectionDomain().getCodeSource().getLocation().getPath());
            String propsDirectory=jarPath.getParentFile().getAbsolutePath();
            propsDirectory = URLDecoder.decode(propsDirectory, "UTF-8");
            System.out.println(propsDirectory + PROP_FILE);
            System.out.println("some test: " + System.getProperty("user.dir"));
            InputStreamReader in = new InputStreamReader(new FileInputStream(propsDirectory + PROP_FILE));
            properties.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (String name : properties.stringPropertyNames()) {
            String value = properties.getProperty(name);
            System.out.println("properties: " + name + " - " + value);
            System.setProperty(name, value);
        }
    }

}
