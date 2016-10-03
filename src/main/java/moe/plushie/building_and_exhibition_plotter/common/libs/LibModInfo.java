package moe.plushie.building_and_exhibition_plotter.common.libs;

public final class LibModInfo {
    
    private LibModInfo() {}
    
    public static final String ID = "BuildingAndExhibitionPlotter";
    public static final String NAME = "Building & Exhibition Plotter";
    public static final String VERSION = "@VERSION@";
    public static final String CHANNEL = "buildExhibPlot";

    public static final String PROXY_CLIENT_CLASS = "moe.plushie.building_and_exhibition_plotter.proxies.ClientProxy";
    public static final String PROXY_COMMNON_CLASS = "moe.plushie.building_and_exhibition_plotter.proxies.CommonProxy";
    public static final String GUI_FACTORY_CLASS = "moe.plushie.building_and_exhibition_plotter.client.gui.ModGuiFactory";
}
