package main.java.com.meggawatts.NoSnow;

import java.util.logging.Logger;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class NoSnow extends JavaPlugin {

    public static final Logger log = Logger.getLogger("Minecraft");

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new NoSnowBlockListener(), this);
    }

    @Override
    public void onDisable() {
    }
}