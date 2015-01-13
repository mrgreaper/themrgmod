package com.mrgreaper.themrgmod.entities;

import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by david on 12/01/2015.
 */
public class tileEntityHandler
{
    public static void init(){
        GameRegistry.registerTileEntity(tileEntityLightningAbsorber.class,"tileEntityLightningAbsorber");
        GameRegistry.registerTileEntity(tileEntitySpeakyBlock.class,"tileEntitySpeakyBlock");
    }

}
