package zxc.framework.strikeLightningEffect;

import org.bukkit.plugin.java.JavaPlugin;

public final class StrikeLightningEffect extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new Events(), this);
    }
}
