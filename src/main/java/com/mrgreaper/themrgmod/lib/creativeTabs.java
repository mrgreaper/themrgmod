package com.mrgreaper.themrgmod.lib;

import com.mrgreaper.themrgmod.items.bunnys;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

/**
 * Created by david on 09/01/2015.
 */
public class creativeTabs{

    public static CreativeTabs theMrGModTabRecords = new CreativeTabs("theMrGModTabRecords"){@Override public Item getTabIconItem(){return (Items.record_cat);}};
    public static CreativeTabs theMrGModTabBunnys = new CreativeTabs("theMrgModTabBunnys") {@Override public Item getTabIconItem() {return (bunnys.livingBunny);}};



    public static void init(){



    }
}
