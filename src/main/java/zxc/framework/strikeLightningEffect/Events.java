package zxc.framework.strikeLightningEffect;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class Events implements Listener {
    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent event) {
        event.getEntity().getWorld().strikeLightningEffect(event.getEntity().getLocation());
    }
}