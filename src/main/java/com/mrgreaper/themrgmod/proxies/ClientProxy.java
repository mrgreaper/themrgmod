package com.mrgreaper.themrgmod.proxies;

import com.mrgreaper.themrgmod.lib.speechHandler;

/**
 * Created by david on 10/01/2015.
 */
public class ClientProxy extends CommonProxy {
    //public static speechHandler speech;

    @Override
    public void registerRenderThings() {
        //render code will go here
    }

    @Override
    public void speechCreate(String message,double voice,float pitch, float pitchRange, float pitchShift) {
        //this is where speech will happen, at this stage we have checked to see if the player is near the event or its a server wide event
        //going to need to bring in more values
        //may need to make this triggered only by a packet too! ...need to learn packets :(
        Thread speech = new speechHandler(message,voice,pitch,pitchRange,pitchShift);
        speech.start();
    }
}
