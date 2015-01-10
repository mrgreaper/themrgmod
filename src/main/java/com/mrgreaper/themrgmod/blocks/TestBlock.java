package com.mrgreaper.themrgmod.blocks;

import com.mrgreaper.themrgmod.lib.constants;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Created by david on 06/01/2015.
 */
public class TestBlock extends Block {
    private String name = "TestBlock";

    public TestBlock(){
        super (Material.rock);
        this.setCreativeTab(CreativeTabs.tabBlock); //hmmm need to make my own tab
        this.setBlockName(constants.modid+"_"+ name); //new way of doing it but should work ok
        GameRegistry.registerBlock(this,name); //also a new way of doing it but easier to remember then the old method
        setBlockTextureName(constants.modid +":"+name);

    }
}
