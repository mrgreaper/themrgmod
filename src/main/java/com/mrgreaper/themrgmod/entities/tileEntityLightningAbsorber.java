package com.mrgreaper.themrgmod.entities;

import cofh.api.energy.IEnergyHandler;
import net.minecraftforge.common.util.ForgeDirection;

/**
 * Created by david on 12/01/2015.
 */
public class tileEntityLightningAbsorber implements IEnergyHandler{
    @Override
    public int receiveEnergy(ForgeDirection forgeDirection, int i, boolean b) {
        return 0;
    }

    @Override
    public int extractEnergy(ForgeDirection forgeDirection, int i, boolean b) {
        return 0;
    }

    @Override
    public int getEnergyStored(ForgeDirection forgeDirection) {
        return 0;
    }

    @Override
    public int getMaxEnergyStored(ForgeDirection forgeDirection) {
        return 0;
    }

    @Override
    public boolean canConnectEnergy(ForgeDirection forgeDirection) {
        return false;
    }
}
