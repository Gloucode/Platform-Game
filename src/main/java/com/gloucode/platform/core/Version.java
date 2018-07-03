package com.gloucode.platform.core;

import java.io.IOException;
import java.util.Properties;

public class Version {

    public static final String VERSION;

    static {
        Properties properties = new Properties();

        try {
            properties.load(Version.class.getResourceAsStream("/version.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        VERSION = properties.getProperty("version");
    }
}
