package moe.plushie.building_and_exhibition_plotter.common.handler;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import moe.plushie.building_and_exhibition_plotter.BuildingAndExhibitionPlotter;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.world.ExplosionEvent;

public class PlayerHandler {
    
    public PlayerHandler() {
        MinecraftForge.EVENT_BUS.register(this);
    }
    
    @SubscribeEvent
    public void onPlayerInteract(PlayerInteractEvent event) {
        BuildingAndExhibitionPlotter.logger.info("player event");
    }
    
    @SubscribeEvent
    public void onExplosion(ExplosionEvent.Start event) {
        event.setCanceled(true);
    }
}
