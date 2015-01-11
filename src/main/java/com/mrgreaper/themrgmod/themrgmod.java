package com.mrgreaper.themrgmod;

import com.mrgreaper.themrgmod.blocks.blocks;
import com.mrgreaper.themrgmod.items.bunnys;
import com.mrgreaper.themrgmod.items.records;
import com.mrgreaper.themrgmod.lib.*;
import com.mrgreaper.themrgmod.proxies.IProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by david on 06/01/2015.
 */

@Mod(modid = constants.modid , name = constants.modname, version = constants.version, guiFactory = constants.GUI_FACTORY_CLASS)





public class themrgmod {

    @SidedProxy(clientSide = constants.clientProxyClass, serverSide = constants.serverProxyClass)
    public static IProxy proxy;

    //creative tabs


    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        configHandler.init(event.getSuggestedConfigurationFile());
        permissions.init();//lets give the artists thier well deserved credit!
        creativeTabs.init();//set up the creative tabs
        blocks.init(); //lets load our blocks
        if (configHandler.RecordsEnabled){
            records.init();} //load the records
        if (configHandler.BunnysEnabled){
            bunnys.init();} // if bunnys are enabled we load them (this modular stuff is gonna kill me lol)
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }

}
