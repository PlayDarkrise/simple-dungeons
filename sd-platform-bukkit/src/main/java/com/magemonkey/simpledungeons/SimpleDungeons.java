package com.magemonkey.simpledungeons;

import org.bukkit.plugin.java.JavaPlugin;

public class SimpleDungeons extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("SimpleDungeons has been enabled!");
        // We will add more logic here in the future.
    }

    @Override
    public void onDisable() {
        getLogger().info("SimpleDungeons has been disabled!");
        // We will add cleanup logic here in the future.
    }
}