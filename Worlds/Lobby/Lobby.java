package net.perforce.perforceapi.Worlds.Lobby;


import org.bukkit.Bukkit;
import org.bukkit.World;

public class Lobby {


    public World Main() {
        return Bukkit.getWorld("Lobby_Main");
    }

    public World Duels() {
        return Bukkit.getWorld("Lobby_Duels");
    }


}
