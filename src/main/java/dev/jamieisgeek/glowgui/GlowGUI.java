package dev.jamieisgeek.glowgui;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public final class GlowGUI extends JavaPlugin {
    
    Logger log = Bukkit.getLogger();
    
    @Override
    public void onEnable() {
        new Tools();
        getCommand("glow").setExecutor(new CommandHandler());
        getCommand("glowremove").setExecutor(new GlowRemove());
        getServer().getPluginManager().registerEvents(new EventListener(), this);
        log.info("");
        log.info("=+=+=+=+=+=+=+=+=+=+=+=");
        log.info("GlowGUI is now enabled!");
        log.info("Made by: JamieIsGeek");
        log.info("=+=+=+=+=+=+=+=+=+=+=+=");
        log.info("");
    }

    @Override
    public void onDisable() {
        log.info("");
        log.info("=+=+=+=+=+=+=+=+=+=+=+=");
        log.info("GlowGUI is now disabled!");
        log.info("Made by: JamieIsGeek");
        log.info("=+=+=+=+=+=+=+=+=+=+=+=");
        log.info("");
    }
}
