package com.mrgreaper.themrgmod.blocks;

import com.mrgreaper.themrgmod.entities.tileEntityLightningAbsorber;
import com.mrgreaper.themrgmod.entities.tileEntitySpeakyBlock;
import com.mrgreaper.themrgmod.lib.constants;
import com.mrgreaper.themrgmod.lib.creativeTabs;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

/**
 * Created by david on 12/01/2015.
 */
public class blockSparky extends BlockContainer {
    private String name = "blockSparky";

    public blockSparky() {
        super(Material.iron);
        this.setBlockName(constants.modid + "_" + name);
        GameRegistry.registerBlock(this, name);
        setBlockTextureName(constants.modid + ":" + name);
        this.setCreativeTab(creativeTabs.theMrGModTabBlocks);
    }


    @Override
    public TileEntity createNewTileEntity(World world, int i) {
        return new tileEntityLightningAbsorber();
    }
}
