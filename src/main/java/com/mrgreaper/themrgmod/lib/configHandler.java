package com.mrgreaper.themrgmod.lib;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Created by david on 09/01/2015.
 */
public class configHandler {

    public static Configuration configuration;
    public static boolean RecordsEnabled = true;

    public static void init(File configFile) {
        if (configuration == null) {
            configuration = new Configuration(configFile);
            loadConfiguration();
        }
    }

    public static void loadConfiguration() {
        RecordsEnabled = configuration.getBoolean("Are music records enabled? ",configuration.CATEGORY_GENERAL,RecordsEnabled," Enabling this option will mean that music from real artists will be added as records to the game (the artists have given me permission to do this), restart required");
        if (configuration.hasChanged()) {
            configuration.save();
        }
    }
}
