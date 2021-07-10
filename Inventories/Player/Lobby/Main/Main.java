package net.perforce.perforceapi.Inventories.Player.Lobby.Main;

import net.perforce.perforceapi.PerforceAPI;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class Main {


    public void SetInventory(Player player, boolean playersHidden) {

        Inventory inventory = player.getInventory();

        inventory.clear();

        inventory.setItem(0, PerforceAPI.ItemStacks.Lobby.Main.GameCompass());
        inventory.setItem(1, PerforceAPI.ItemStacks.Lobby.Global.MyProfile(player));
        inventory.setItem(7, PerforceAPI.ItemStacks.Lobby.Global.HidePlayers(playersHidden));
        inventory.setItem(8, PerforceAPI.ItemStacks.Lobby.Global.LobbyMap());

        player.updateInventory();

    }


}
