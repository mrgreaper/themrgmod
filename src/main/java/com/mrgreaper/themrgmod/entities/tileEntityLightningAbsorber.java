package com.mrgreaper.themrgmod.entities;

import cofh.api.energy.IEnergyHandler;
import cofh.api.energy.IEnergyProvider;
import com.mrgreaper.themrgmod.lib.constants;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

import java.util.Random;

/**
 * Created by david on 12/01/2015.
 */
public class tileEntityLightningAbsorber extends TileEntity implements IEnergyProvider{
    private int countera = 0;
    private Random rand = new Random();
    private int soundtimer;


    @Override
    public void updateEntity() {
        String soundName = null;
        //System.out.println("test");

        /*
        TODO check if the weather is stormy
        TODO if stormy randomly generate a lightning stike on this location
        TODO on strike add power to this blocks storage
         */

        countera = countera + 1;


        if (countera == 20) {// 20 would equal 1 second ...lets have it at 20 for now
            countera = 0; //lets reset the counter
            //**************nos the code to check the weather
            if (this.worldObj.getWorldInfo().isRaining()) {
                soundName= "laugh";


            } else {
                System.out.println("nope");
                //soundName = null;
            }


        }
        //so if we have a sound file loaded we play it...but it will only loop as were playing it for 1/2 second
        if (soundtimer > 0) soundtimer--;
        if (soundName != null && worldObj.isRemote && soundtimer == 0) {
            worldObj.playSound(xCoord + 0.5, yCoord + 0.5, zCoord + 0.5, constants.modid+":"+soundName, 0.1F, 1.0F, true);
            soundtimer = 40;
        }
    }




    //*******************energy stuff below***************************************




    /**
     * Remove energy from an IEnergyProvider, internal distribution is left entirely to the IEnergyProvider.
     *
     * @param //from
     * Orientation the energy is extracted from.
     * @param //maxExtract
     * Maximum amount of energy to extract.
     * @param //simulate
     * If TRUE, the extraction will only be simulated.
     * @return Amount of energy that was (or would have been, if simulated) extracted.
     */

    @Override
    public int extractEnergy(ForgeDirection forgeDirection, int i, boolean b) {
        return 0;
    }


    /**
     * Returns the amount of energy currently stored.
     */
    @Override
    public int getEnergyStored(ForgeDirection forgeDirection) {
        return 0;
    }

    /**
     * Returns the maximum amount of energy that can be stored.
     */
    @Override
    public int getMaxEnergyStored(ForgeDirection forgeDirection) {
        return 0;
    }

    //not mentioned in the github class but seems pretty clear...they all kinda do :)
    @Override
    public boolean canConnectEnergy(ForgeDirection forgeDirection) {
        return true;
    }
}
//notes taken from the api
