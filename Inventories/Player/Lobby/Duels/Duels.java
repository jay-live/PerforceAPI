package net.perforce.perforceapi.Inventories.Player.Lobby.Duels;

import net.perforce.perforceapi.PerforceAPI;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class Duels {


    public void SetInventory(Player player, boolean playersHidden) {

        Inventory inventory = player.getInventory();

        inventory.clear();

        inventory.setItem(0, PerforceAPI.ItemStacks.Lobby.Duels.PlayDuels());
        inventory.setItem(1, PerforceAPI.ItemStacks.Lobby.Global.MyProfile(player));
        inventory.setItem(7, PerforceAPI.ItemStacks.Lobby.Global.HidePlayers(playersHidden));
        inventory.setItem(8, PerforceAPI.ItemStacks.Lobby.Global.LobbyMap());

        player.updateInventory();

    }


}
