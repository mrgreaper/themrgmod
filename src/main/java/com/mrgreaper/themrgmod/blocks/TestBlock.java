package com.mrgreaper.themrgmod.blocks;

import com.mrgreaper.themrgmod.lib.constants;
import com.mrgreaper.themrgmod.lib.logHelper;
import com.mrgreaper.themrgmod.network.speechPacket;
import com.mrgreaper.themrgmod.themrgmod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.world.World;

/**
 * Created by david on 06/01/2015.
 */
public class TestBlock extends Block {
    private String name = "TestBlock";

    public TestBlock() {
        super(Material.rock);
        this.setCreativeTab(CreativeTabs.tabBlock); //hmmm need to make my own tab
        this.setBlockName(constants.modid + "_" + name); //new way of doing it but should work ok
        GameRegistry.registerBlock(this, name); //also a new way of doing it but easier to remember then the old method
        setBlockTextureName(constants.modid + ":" + name);
    }

    /*public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayerMP player, int side, float hitX, float hitY, float hitZ) {
        logHelper.info("placed test block");
        //themrgmod.network.sendToAllAround(new speechPacket("testblock is placed", 2, 12, 24, 1), null);
       // themrgmod.network.sendTo(new speechPacket("testblock is placed", 2, 12, 24, 1),player);
        return true;
    }*/
}
