package com.mrgreaper.themrgmod.lib;

/**
 * Created by david on 09/01/2015.
 */

//if done right i should NEVER need to edit this file again :) well untill 1.8 completly changes everything lol

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.block.BlockJukebox;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemRecord;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class recordHandler
        extends ItemRecord
{
    private String songName;
    private String artistName;
    private String soundFileName; //the same name that is used for the texture and the soundfile :)


    public recordHandler(String artist, String song, String unlocalized)
    {
        super(song);
        this.songName = song;
        this.artistName = artist;
        this.maxStackSize = 1;
        this.setUnlocalizedName(unlocalized);
        this.setCreativeTab(creativeTabs.theMrGModTabRecords);
        this.soundFileName = unlocalized;
    }

    @Override //for the tool tip...hmmm should i add a link here? maybe under holding shift
    public void addInformation(ItemStack stack, EntityPlayer thePlayer,List list,boolean notUsed1){
        list.add("Song: "+songName);
        list.add("Artist: "+artistName);
        list.add(constants.modname); //never hurts to say what mod added something :)
    }

    public ResourceLocation getRecordResource(String name)
    {
        return new ResourceLocation(constants.modid+ ":" + soundFileName);
    }
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister)
    {
        this.itemIcon = iconRegister.registerIcon(constants.modid+ ":" + artistName);//record textures will be based on artist
    }
}
