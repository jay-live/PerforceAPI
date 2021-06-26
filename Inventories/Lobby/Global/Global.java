package net.perforce.perforceapi.Inventories.Lobby.Global;

import net.perforce.jayapi.JayAPI;
import net.perforce.perforceapi.PerforceAPI;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;

public class Global {


    public Inventory GameCompass() {

        HashMap<Integer, ItemStack> inventoryContent = new HashMap<>();

        ItemStack slot10 = PerforceAPI.ItemStacks.Lobby.Global.Duels(true);
            inventoryContent.put(10, slot10);
        ItemStack slot40 = PerforceAPI.ItemStacks.Lobby.Global.Close();
            inventoryContent.put(40, slot40);

        return JayAPI.inventory_manager.createInventory(5, "§3Game Compass", inventoryContent);

    }


}
