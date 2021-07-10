package net.perforce.perforceapi.Scoreboards.Lobby.Main;

import net.perforce.jayapi.JayAPI;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Scoreboard;

import java.util.HashMap;

public class Main {


    // TODO - Add Perforce Level
    public Scoreboard Default(Player player) {

        String onlinePlayers = "1 player";
        if (Bukkit.getOnlinePlayers().size() > 1) onlinePlayers = Bukkit.getOnlinePlayers() + " players";

        String rank = JayAPI.player_manager.getRank(player);
        String rankPrefix = JayAPI.rank_manager.getPrefix(rank);

        HashMap<Integer, String> scoreInfo = new HashMap<>();
        scoreInfo.put(9, "§e§m                        §r§e ");
        scoreInfo.put(8, rankPrefix + player.getName());
        scoreInfo.put(7, "§3Perforce Level: " + "§eCurrently not available.");
        scoreInfo.put(6, " ");
        scoreInfo.put(5, "§3Online: " + onlinePlayers);
        scoreInfo.put(4, "  ");
        scoreInfo.put(3, "§3Server-ip:");
        scoreInfo.put(2, "§fperforce.us.to");
        scoreInfo.put(1, "§e§m                        ");

        return JayAPI.scoreboard_manager.createScoreboard("§6§lPerforce", scoreInfo);

    }


}
