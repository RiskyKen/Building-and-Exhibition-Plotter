package moe.plushie.building_and_exhibition_plotter;

import java.util.Map;

import org.apache.logging.log4j.Logger;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkCheckHandler;
import cpw.mods.fml.relauncher.Side;
import moe.plushie.building_and_exhibition_plotter.common.handler.PlayerHandler;
import moe.plushie.building_and_exhibition_plotter.common.libs.LibModInfo;

@Mod(modid = LibModInfo.ID, version = LibModInfo.VERSION)
public class BuildingAndExhibitionPlotter {
    
    public static Logger logger;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        logger.info(String.format("Loading %s version %s.", LibModInfo.NAME, LibModInfo.VERSION));
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event) {
        new PlayerHandler();
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    }
    
    @NetworkCheckHandler
    public boolean onNetworkCheck(Map<String, String> versions, Side side) {
        return true;
    }
}
