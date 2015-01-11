package com.mrgreaper.themrgmod.items;

import com.mrgreaper.themrgmod.lib.constants;
import com.mrgreaper.themrgmod.lib.creativeTabs;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

/**
 * Created by david on 11/01/2015.
 */
public class livingBunny extends Item{
    private String name = "livingBunny";

    public livingBunny(){
        this.setCreativeTab(creativeTabs.theMrGModTabBunnys);
        this.setUnlocalizedName(name);
        GameRegistry.registerItem(this,name);
    }

    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon(constants.modid + ":LivingBunny");
    }
}
