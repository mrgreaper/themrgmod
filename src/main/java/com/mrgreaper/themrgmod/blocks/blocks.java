package com.mrgreaper.themrgmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

/**
 * Created by david on 06/01/2015.
 */
public final class blocks {

    public static Block testBlock;
    public static Block blockSpeaky;

    public static void init(){
        testBlock = new TestBlock();
        blockSpeaky = new blockSpeaky();


    }
}
