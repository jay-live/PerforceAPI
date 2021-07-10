package net.perforce.perforceapi.ItemStacks.Lobby.Duels;

import net.perforce.jayapi.JayAPI;
import net.perforce.perforceapi.ItemStacks.Lobby.Duels.PlayDuels.PlayDuels;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;


public class Duels {


    // Play Duels
    public ItemStack PlayDuels() {

        return JayAPI.itemStack_manager.createItemStack(Material.COMPASS, 1, 0, "§aPlay Duels §7(Right Click)");

    }
    public PlayDuels PlayDuels = new PlayDuels();


}
