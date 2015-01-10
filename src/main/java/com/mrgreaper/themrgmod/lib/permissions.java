package com.mrgreaper.themrgmod.lib;


/**
 * Created by david on 09/01/2015.
 */
public class permissions {
    // the artists were kind enough to give permission for thier songs, lets make sure that they are linked to via the log (and confirm i have thier permission)

    public static void init(){
        System.out.println("************************************************************************************");
        System.out.println("* The Mr G Mod Features real music, with kind permission from the artists.         *");
        System.out.println("* Featuring :                                                                      *");
        System.out.println("*             Vernian Process - http://www.vernianprocess.com/                     *");
        System.out.println("*             Jonathan Coulton - http://www.jonathancoulton.com/                   *");
        System.out.println("*             voltaire - http://www.voltaire.net/                                  *");
        System.out.println("* Thank you for allowing me to use your music, you are all awesome!                *");
        if (!configInfo.RecordsEnabled){System.out.println("*      BUT YOU HAVE THEM DISABLED...WHY?                                           *");}
        System.out.println("************************************************************************************");
    }
}
