package com.brokencapodevelopment;

import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid = ZadeForgeMod.MODID, version = ZadeForgeMod.VERSION)
public class ZadeForgeMod
{
    public static final String MODID = "zadeforgemod";
    public static final String VERSION = "1.0";
    
    public static final String KEY_INFO = "info";
    public static final String KEY_POS_X = "pos_x";
    public static final String KEY_POS_Y = "pos_y";
    public static final String KEY_POS_Z = "pos_z";
    public static final String KEY_DIM = "dim";
    public static final String KEY_TIME = "time";
    public static final String KEY_ITEMS = "items";
    public static final String KEY_NAME = "name";
    public static final String KEY_UUID = "uuid";
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		// some example code
        System.out.println("DIRT BLOCK >> "+Blocks.dirt.getUnlocalizedName());
    }
}
