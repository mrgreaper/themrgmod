package com.mrgreaper.themrgmod.client;

import com.mrgreaper.themrgmod.lib.configHandler;
import com.mrgreaper.themrgmod.lib.constants;
import cpw.mods.fml.client.config.GuiConfig;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

/**
 * Created by david on 10/01/2015.
 */
public class ModGuiConfig extends GuiConfig {
    public ModGuiConfig(GuiScreen guiScreen) {
        super(guiScreen,
                new ConfigElement(configHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
                constants.modid,
                false,
                false,
                GuiConfig.getAbridgedConfigPath(configHandler.configuration.toString()));
    }
}
