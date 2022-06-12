package dev.jamieisgeek.glowgui;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.inventivetalent.glow.GlowAPI;

public class EventListener implements Listener {

    @EventHandler
    public void onInventoryClick(InventoryClickEvent e) {
        if (e.getView().getTitle().equals(ChatColor.GOLD + "Choose a Glow Colour!")) {
            e.setCancelled(true);
            Player player = (Player) e.getWhoClicked();
            String precolour = e.getCurrentItem().getType().toString();
            String colour = precolour.replace("_WOOL", "");

            GlowAPI.setGlowing(player, GlowAPI.Color.valueOf(colour), Bukkit.getOnlinePlayers());
        } else {
            return;
        }
    }
}
