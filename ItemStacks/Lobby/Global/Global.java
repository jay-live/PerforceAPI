package net.perforce.perforceapi.ItemStacks.Lobby.Global;

import net.perforce.jayapi.JayAPI;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;


public class Global {


    // Game Compass
    public ItemStack AllGames() {

        return null;

    }
    public ItemStack Duels(boolean isNew) {

        String NEW = "";
        if (isNew) NEW = NEW + "§d(New) ";

        int activePlayers = 0;
        for (Player onlinePlayer : Bukkit.getOnlinePlayers()) {
            if (onlinePlayer.getWorld().getName().contains("Duels")) activePlayers++;
        }

        ArrayList<String> lore = new ArrayList<>();
        lore.add("§8Single Combat");
        lore.add("");
        lore.add("§7Fight against another player");
        lore.add("§7in an intense 1v1!");
        lore.add("§7Gain §2ranked titles §7by winning games");
        lore.add("§7to show off your §2skill§7!");
        lore.add("");
        lore.add("§3Click to Join!");
        lore.add("§b➥ Currently playing: " + activePlayers);

        return JayAPI.itemStack_manager.createItemStack(Material.GOLD_SWORD, 1, 0, NEW + "§aDuels", lore);

    }

    // Profile
    public ItemStack Profile(Player player) {

        return JayAPI.itemStack_manager.createSkullItemStack(player.getName(), 1, "§aYour Profile §7(Right Click)");

    }

    // Hide Players
    public ItemStack HidePlayers(boolean hidden) {

        if (hidden)
            return JayAPI.itemStack_manager.createItemStack(Material.INK_SACK, 1, 8, "§aHide Players - §cHidden §7(Right Click)");

        else
            return JayAPI.itemStack_manager.createItemStack(Material.INK_SACK, 1, 10, "§aHide Players - Visible §7(Right Click)");

    }

    // Lobby Compass
    public ItemStack LobbyCompass() {

        return JayAPI.itemStack_manager.createItemStack(Material.EMPTY_MAP, 1, 0, "§aLobby Compass §7(Right Click)");

    }

    // Close
    public ItemStack Close() {

        ArrayList<String> lore = new ArrayList<>();
        lore.add("");
        lore.add("§3Click to Close!");

        return JayAPI.itemStack_manager.createItemStack(Material.BARRIER, 1, 0, "§cClose", lore);

    }


}
