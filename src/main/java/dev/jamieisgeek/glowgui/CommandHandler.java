package dev.jamieisgeek.glowgui;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandHandler implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player) {
            Player player = (Player) sender;
            if(player.hasPermission("glowgui.glow")) {
                Tools tools = Tools.getTools();
                tools.openGUI(player);
            } else {
                player.sendMessage(ChatColor.RED + "Insufficient permissions!");
            }
        } else {
            Bukkit.getLogger().info("This command can only be used by players!");
        }

        return true;
    }
}
