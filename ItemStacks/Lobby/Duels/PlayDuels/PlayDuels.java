package net.perforce.perforceapi.ItemStacks.Lobby.Duels.PlayDuels;

import net.perforce.jayapi.JayAPI;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;

public class PlayDuels {


    // UHC Duel - Solo
    public ItemStack UHCDuel_1v1() {

        int activePlayers = 0;
        for (Player onlinePlayer : Bukkit.getOnlinePlayers()) {
            if (onlinePlayer.getWorld().getName().contains("Duels_UHC_Solo")) activePlayers++;
        }

        ArrayList<String> lore = new ArrayList<>();
        lore.add("§81v1 Duel");
        lore.add("");
        lore.add("§7Fight against another player");
        lore.add("§7in a §6UHC §71v1!");
        lore.add("§7No natural regeneration, heal through");
        lore.add("§6Golden Apples §7& §6Golden Heads§7!");
        lore.add("");
        lore.add("§3Click to Join!");
        lore.add("§b➥ Currently playing: " + activePlayers);

        return JayAPI.itemStack_manager.createSkullItemStack("GoldenCat", 1, "§6UHC Duel §f- §61v1", lore);

    }


}
