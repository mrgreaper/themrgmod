package com.mrgreaper.themrgmod.proxies;

/**
 * Created by david on 10/01/2015.
 */
public class ServerProxy extends CommonProxy  {
    @Override
    public void registerRenderThings() {
        //no BAD MOD you dont render things on the server do you! bad bad mod *sound of rolled up newspaper hitting a jar file*
    }

    @Override
    public void speechCreate(String message,double voice,float pitch, float pitchRange, float pitchShift) {
        //IT DONT HAPPEN SERVER SIDE (imagine the confused faces on creeperhost employees as one by one thier servers begin to talk! we must not do that to them!)
    }
}
