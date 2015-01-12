package com.mrgreaper.themrgmod.items;

import net.minecraft.item.Item;

/**
 * Created by david on 11/01/2015.
 */
public class bunnys {

    public static Item livingBunny;
    public static Item deadBunny;
    public static Item energizedBunny;

    public static void init(){
        //all bunnys are registered here
        livingBunny = new livingBunny();
        deadBunny = new deadBunny();
        energizedBunny = new energizedBunny();
    }
}
