package com.mrgreaper.themrgmod.entities;

import cofh.api.energy.IEnergyHandler;
import cofh.api.energy.IEnergyProvider;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.util.ForgeDirection;

/**
 * Created by david on 12/01/2015.
 */
public class tileEntityLightningAbsorber extends TileEntity implements IEnergyProvider{


    @Override
    public void updateEntity() {
        //System.out.println("test");

        /*
        TODO check if the weather is stormy
        TODO if stormy randomly generate a lightning stike on this location
        TODO on strike add power to this blocks storage


         */
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
