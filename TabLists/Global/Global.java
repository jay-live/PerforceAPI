package net.perforce.perforceapi.TabLists.Global;

import net.perforce.jayapi.JayAPI;
import org.bukkit.entity.Player;

public class Global {


    public void setTabList(Player player) {

        JayAPI.tablist_manager.updateTabList(   player,
                                                net.md_5.bungee.api.ChatColor.GREEN + "" + net.md_5.bungee.api.ChatColor.BOLD + net.md_5.bungee.api.ChatColor.MAGIC + "um" + net.md_5.bungee.api.ChatColor.RESET + "" + net.md_5.bungee.api.ChatColor.GREEN + "" + net.md_5.bungee.api.ChatColor.BOLD + " Perforce Network " + net.md_5.bungee.api.ChatColor.MAGIC + "mu",
                                                "red",
                                                net.md_5.bungee.api.ChatColor.GOLD + "perforce.us.to",
                                                "red");

    }


}
