package com.mrgreaper.themrgmod.lib;

import com.mrgreaper.themrgmod.network.speechPacket;
import com.mrgreaper.themrgmod.themrgmod;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;

/**
 * Created by david on 11/01/2015.
 */
public class eventHandler {


    @SubscribeEvent
    public void onConfigurationChangeEvent(ConfigChangedEvent.OnConfigChangedEvent event) {
        if (event.modID.equalsIgnoreCase(constants.modid)) {
            configHandler.loadConfiguration();
        }
    }



    @SubscribeEvent//test event
    public void TwistedPickupEvent(PlayerEvent.ItemPickupEvent event) {
        logHelper.info("if i can read this then the event handler is working" + event.pickedUp);
        themrgmod.network.sendToAll(new speechPacket("hello i think im working",12,23,12,3));

    }
}
