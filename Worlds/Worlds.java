package net.perforce.perforceapi.Worlds;

import net.perforce.perforceapi.PerforceAPI;
import net.perforce.perforceapi.Worlds.Lobby.Lobby;
import org.bukkit.World;

import java.util.ArrayList;
import java.util.HashMap;


public class Worlds {


    public Lobby Lobby = new Lobby();


    // Get all lobbies
    public static ArrayList<World> getLobbies() {

        ArrayList<World> lobbies = new ArrayList<>();

        lobbies.add(PerforceAPI.Worlds.Lobby.Main());
        lobbies.add(PerforceAPI.Worlds.Lobby.Duels());

        return lobbies;

    }


    // Get names of all corresponding lobbies
    public static HashMap<World, String> getWorldNames() {

        HashMap<World, String> worldNames = new HashMap<>();

        worldNames.put(PerforceAPI.Worlds.Lobby.Duels(), "Duels Lobby");
        worldNames.put(PerforceAPI.Worlds.Lobby.Main(), "Main Lobby");

        return worldNames;

    }


}
