package main.java.com.meggawatts.NoSnow;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockFormEvent;

public class NoSnowBlockListener implements Listener {

    @EventHandler(priority = EventPriority.HIGH)
    public void onBlockForm(BlockFormEvent event) {
        if (event.isCancelled()) {
            return;
        }
        if (event.getNewState().getTypeId() == 78) {
            event.setCancelled(true);
            return;
        }
    }
}