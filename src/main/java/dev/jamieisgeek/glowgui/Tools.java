package dev.jamieisgeek.glowgui;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffectType;

public class Tools {
    public static Tools tools;
    private Inventory inv;

    public void openGUI(Player player) {
        player.openInventory(createInventory(player));
        player.sendMessage(ChatColor.GOLD + "Select your glow colour!");
    }

    public void removeGlow(Player player) {
        player.removePotionEffect(PotionEffectType.GLOWING);
        player.sendMessage(ChatColor.GREEN + "Removed Glow!");
    }

    private Inventory createInventory(Player player) {
        inv = Bukkit.createInventory(player, 9, ChatColor.GOLD + "Choose a Glow Colour!");

        inv.addItem(createWhiteWool());
        inv.addItem(createBlueWool());
        inv.addItem(createGreenWool());
        inv.addItem(createRedWool());
        inv.addItem(createYellowWool());
        inv.addItem(createPinkWool());
        inv.addItem(createBlackWool());
        inv.addItem(createLightBlueWool());
        inv.addItem(createGoldWool());

        return inv;
    }

    private ItemStack createWhiteWool() {
        ItemStack wool = new ItemStack(Material.WHITE_WOOL, 1 );
        ItemMeta woolMeta = wool.getItemMeta();
        woolMeta.setDisplayName(ChatColor.BOLD + "" + ChatColor.WHITE + "White");
        wool.setItemMeta(woolMeta);
        return wool;
    }

    private ItemStack createBlueWool() {
        ItemStack wool = new ItemStack(Material.BLUE_WOOL, 1 );
        ItemMeta woolMeta = wool.getItemMeta();
        woolMeta.setDisplayName(ChatColor.BOLD + "" + ChatColor.BLUE + "Blue");
        wool.setItemMeta(woolMeta);
        return wool;
    }

    private ItemStack createRedWool() {
        ItemStack wool = new ItemStack(Material.RED_WOOL, 1 );
        ItemMeta woolMeta = wool.getItemMeta();
        woolMeta.setDisplayName(ChatColor.BOLD + "" + ChatColor.RED + "Red");
        wool.setItemMeta(woolMeta);
        return wool;
    }

    private ItemStack createPinkWool() {
        ItemStack wool = new ItemStack(Material.PINK_WOOL, 1 );
        ItemMeta woolMeta = wool.getItemMeta();
        woolMeta.setDisplayName(ChatColor.BOLD + "" + ChatColor.LIGHT_PURPLE + "Pink");
        wool.setItemMeta(woolMeta);
        return wool;
    }

    private ItemStack createYellowWool() {
        ItemStack wool = new ItemStack(Material.YELLOW_WOOL, 1 );
        ItemMeta woolMeta = wool.getItemMeta();
        woolMeta.setDisplayName(ChatColor.BOLD + "" + ChatColor.YELLOW + "Yellow");
        wool.setItemMeta(woolMeta);
        return wool;
    }

    private ItemStack createGreenWool() {
        ItemStack wool = new ItemStack(Material.GREEN_WOOL, 1 );
        ItemMeta woolMeta = wool.getItemMeta();
        woolMeta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GREEN + "Green");
        wool.setItemMeta(woolMeta);
        return wool;
    }

    private ItemStack createLightBlueWool() {
        ItemStack wool = new ItemStack(Material.LIGHT_BLUE_WOOL, 1 );
        ItemMeta woolMeta = wool.getItemMeta();
        woolMeta.setDisplayName(ChatColor.BOLD + "" + ChatColor.AQUA + "Light Blue");
        wool.setItemMeta(woolMeta);
        return wool;
    }

    private ItemStack createGoldWool() {
        ItemStack wool = new ItemStack(Material.ORANGE_WOOL, 1 );
        ItemMeta woolMeta = wool.getItemMeta();
        woolMeta.setDisplayName(ChatColor.BOLD + "" + ChatColor.GOLD + "Gold");
        wool.setItemMeta(woolMeta);
        return wool;
    }

    private ItemStack createBlackWool() {
        ItemStack wool = new ItemStack(Material.BLACK_WOOL, 1 );
        ItemMeta woolMeta = wool.getItemMeta();
        woolMeta.setDisplayName(ChatColor.BOLD + "" + ChatColor.BLACK + "Black");
        wool.setItemMeta(woolMeta);
        return wool;
    }

    public void setTools() {
        tools = this;
    }
    public static Tools getTools() {
        return tools;
    }
}
