package com.mrgreaper.themrgmod.proxies;

/**
 * Created by david on 10/01/2015.
 */
public interface IProxy  {

    public abstract void registerRenderThings();
    public abstract void speechCreate(String message,double voice,float pitch, float pitchRange, float pitchShift ); // hmmmmm not so sure this will work!

}
