package com.mrgreaper.themrgmod;

import com.mrgreaper.themrgmod.blocks.blocks;
import com.mrgreaper.themrgmod.entities.tileEntityHandler;
import com.mrgreaper.themrgmod.items.bunnys;
import com.mrgreaper.themrgmod.items.records;
import com.mrgreaper.themrgmod.lib.*;
import com.mrgreaper.themrgmod.network.speechPacket;
import com.mrgreaper.themrgmod.proxies.IProxy;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.relauncher.Side;
import net.minecraftforge.common.MinecraftForge;

/**
 * Created by david on 06/01/2015.
 */

@Mod(modid = constants.modid , name = constants.modname, version = constants.version, guiFactory = constants.GUI_FACTORY_CLASS)





public class themrgmod {

    @SidedProxy(clientSide = constants.clientProxyClass, serverSide = constants.serverProxyClass)
    public static IProxy proxy;
    public static SimpleNetworkWrapper network; //ok so we are told to use packers and told those are "simple" gulp

    //creative tabs


    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        configHandler.init(event.getSuggestedConfigurationFile());
        network = NetworkRegistry.INSTANCE.newSimpleChannel("messengerBunny"); //so we create the channel
        //here is where we add the pacets...registering one packet per class
        network.registerMessage(speechPacket.speechPacketHandler.class,speechPacket.class,0, Side.CLIENT);//so we are registering a packet called speechpacket to channel one of our network (the messenger bunny) hmmm ok can understand that
        permissions.init();//lets give the artists thier well deserved credit!
        creativeTabs.init();//set up the creative tabs
        blocks.init(); //lets load our blocks
        tileEntityHandler.init();//and register our tile entitys or they wont save lol
        if (configHandler.RecordsEnabled){
            records.init();} //load the records
        if (configHandler.BunnysEnabled){
            bunnys.init();} // if bunnys are enabled we load them (this modular stuff is gonna kill me lol)
        FMLCommonHandler.instance().bus().register(new eventHandler());// load the event handlers
        MinecraftForge.EVENT_BUS.register(new eventHandler());

        //test code
        /* logHelper.info("Started talking");
        proxy.speechCreate("Warning i contain bunnys, Warning i contain bunnys, Warning i contain bunnys, Warning i contain bunnys, Warning i contain bunnys, Warning i contain bunnys, Warning i contain bunnys, Warning i contain bunnys, Warning i contain bunnys, Warning i contain bunnys, Warning i contain bunnys, Warning i contain bunnys",2,25,35,2);
        proxy.speechCreate("and i can sing with a beutiful voice at the same time",2,10,50,2);
        logHelper.info("finished");
        */

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }

}
