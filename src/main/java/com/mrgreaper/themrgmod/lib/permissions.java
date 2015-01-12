package com.mrgreaper.themrgmod.lib;


/**
 * Created by david on 09/01/2015.
 */
public class permissions {
    // the artists were kind enough to give permission for thier songs, lets make sure that they are linked to via the log (and confirm i have thier permission)

    public static void init(){
        logHelper.info("************************************************************************************");
        logHelper.info("* The Mr G Mod Features real music, with kind permission from the artists.         *");
        logHelper.info("* Featuring :                                                                      *");
        logHelper.info("*             Vernian Process - http://www.vernianprocess.com/                     *");
        logHelper.info("*             Jonathan Coulton - http://www.jonathancoulton.com/                   *");
        logHelper.info("*             voltaire - http://www.voltaire.net/                                  *");
        logHelper.info("* Thank you for allowing me to use your music, you are all awesome!                *");
        if (!configHandler.RecordsEnabled){logHelper.info("*      BUT YOU HAVE THEM DISABLED...WHY?                                           *");}
        logHelper.info("************************************************************************************");
    }
}
