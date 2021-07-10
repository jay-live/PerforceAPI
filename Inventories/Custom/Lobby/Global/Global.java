package net.perforce.perforceapi.Inventories.Custom.Lobby.Global;

import net.perforce.jayapi.JayAPI;
import net.perforce.perforceapi.PerforceAPI;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;

public class Global {


    public void OpenGameCompass(Player player) {

        HashMap<Integer, ItemStack> inventoryContent = new HashMap<>();

        ItemStack slot10 = PerforceAPI.ItemStacks.Lobby.Global.Duels(true);
            inventoryContent.put(10, slot10);
        ItemStack slot40 = PerforceAPI.ItemStacks.Lobby.Global.Close();
            inventoryContent.put(40, slot40);

        Inventory inventory = JayAPI.inventory_manager.createInventory(5, "§3Game Compass", inventoryContent);
        player.openInventory(inventory);

    }


}
