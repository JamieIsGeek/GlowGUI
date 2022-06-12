package dev.jamieisgeek.glowgui;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.inventivetalent.glow.GlowAPI;

public class GlowRemove implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player) {
            Player player = (Player) sender;
            if(player.hasPermission("glowgui.remove")) {
                GlowAPI.setGlowing(player, GlowAPI.Color.NONE, Bukkit.getOnlinePlayers());
            } else {
                player.sendMessage(ChatColor.RED + "Insufficient permissions!");
            }
        } else {
            Bukkit.getLogger().info("This command can only be used by players!");
        }

        return true;
    }
}
