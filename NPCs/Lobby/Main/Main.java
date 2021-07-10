package net.perforce.perforceapi.NPCs.Lobby.Main;

import net.perforce.jayapi.JayAPI;
import net.perforce.perforceapi.PerforceAPI;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.OfflinePlayer;

import java.util.UUID;

public class Main {


    public void CreateDuelsNPC() {

        String uuid = "6b5540ba-993c-4463-b9ad-5aaa14a64c93";

        Location location = new Location(PerforceAPI.Worlds.Lobby.Main(), 0.5, 49, 18.5, 180, 0);
        OfflinePlayer offlinePlayer = Bukkit.getOfflinePlayer(UUID.fromString(uuid));
        String name = "§eDuels";

        JayAPI.npc_manager.createNPC(location, offlinePlayer, name);

    }


    public void CreateVeteranNPC() {

        String uuid = "9a5f7bc0-16fa-4e03-9d83-ff1d3106dd96";

        Location location = new Location(PerforceAPI.Worlds.Lobby.Main(), -3.5, 50, 4.5, -135, 0);
        OfflinePlayer offlinePlayer = Bukkit.getOfflinePlayer(UUID.fromString(uuid));
        String name = "§fVeteran";

        JayAPI.npc_manager.createNPC(location, offlinePlayer, name);

    }


}
