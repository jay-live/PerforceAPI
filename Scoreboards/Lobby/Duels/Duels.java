package net.perforce.perforceapi.Scoreboards.Lobby.Duels;

import net.perforce.jayapi.JayAPI;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Scoreboard;

import java.util.HashMap;

public class Duels {


    // TODO - Show Wins
    // TODO - Show Kills
    // TODO - Show Winstreak
    // TODO - Show Coins
    public Scoreboard Default(Player player) {

        HashMap<Integer, String> scoreInfo = new HashMap<>();
        scoreInfo.put(9, "§e§m                        §r§e ");
        scoreInfo.put(8, "§3Coins: " + "§eCurrently not available.");
        scoreInfo.put(7, " ");
        scoreInfo.put(6, "§3Total Wins: " + "§eCurrently not available.");
        scoreInfo.put(5, "§3Total Kills: " + "§eCurrently not available.");
        scoreInfo.put(4, "§3Current Winstreak: " + "§eCurrently not available.");
        scoreInfo.put(3, "  ");
        scoreInfo.put(2, "§6perforce.us.to");
        scoreInfo.put(1, "§e§m                        ");

        return JayAPI.scoreboard_manager.createScoreboard("§6§lDuels", scoreInfo);

    }


}
