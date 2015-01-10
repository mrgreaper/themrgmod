package com.mrgreaper.themrgmod.items;

import com.mrgreaper.themrgmod.lib.recordHandler;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

/**
 * Created by david on 08/01/2015.
 */
public class records {

    public static Item record_VPBehold_the_Machine;
    public static Item record_VPSomethingWicked;
    public static Item record_VWhenYourEvil;
    public static Item record_JCSkullcrusherMountain;
    public static Item record_VBeastofPiratesBay;
    public static Item record_VHellinaHandBasket;

    public static void init(){
        //here we reference all the records we have :)
        //each will need 2 lines, and a static, the creation of it artist, song name, unlocalised name and then the registering
        //template (to save retyping)
        // = new Record("","","");
        //GameRegistry.registerItem(,"");

        record_VPBehold_the_Machine = new recordHandler("Vernian Process","Behold the Machine","vpBeholdtheMachine");
        GameRegistry.registerItem(record_VPBehold_the_Machine,"vpBeholdtheMachine");
        record_VPSomethingWicked = new recordHandler("Vernian Process","Something Wicked","cpSomethingWicked");
        GameRegistry.registerItem(record_VPSomethingWicked,"cpSomethingWicked");

        record_VWhenYourEvil = new recordHandler("Voltaire","When Your Evil","vWhenYourEvil");
        GameRegistry.registerItem(record_VWhenYourEvil,"vWhenYourEvil");
        record_VBeastofPiratesBay= new recordHandler("Voltaire","Beast of Pirates Bay","vBeastofPiratesBay");
        GameRegistry.registerItem(record_VBeastofPiratesBay,"vBeastofPiratesBay");
        record_VHellinaHandBasket = new recordHandler("Voltaire","Hell in a Hand Basket","vHellinaHandBasket");
        GameRegistry.registerItem(record_VHellinaHandBasket,"vHellinaHandBasket");


        record_JCSkullcrusherMountain = new recordHandler("Jonathan Coulton","Skullcrusher Mountain","jcSkullcrusherMountain");
        GameRegistry.registerItem(record_JCSkullcrusherMountain,"jcSkullcrusherMountain");
    }
}
