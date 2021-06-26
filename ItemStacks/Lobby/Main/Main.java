package net.perforce.perforceapi.ItemStacks.Lobby.Main;

import net.perforce.jayapi.JayAPI;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class Main {


    // Game Compass
    public ItemStack GameCompass() {

        return JayAPI.itemStack_manager.createItemStack(Material.COMPASS, 1, 0, "§aGame Compass §7(Right Click)");

    }


}
