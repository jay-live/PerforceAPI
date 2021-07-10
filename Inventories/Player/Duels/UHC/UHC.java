package net.perforce.perforceapi.Inventories.Player.Duels.UHC;

import net.perforce.jayapi.JayAPI;
import net.perforce.perforceapi.PerforceAPI;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

import java.util.ArrayList;

public class UHC {


    // TODO - Make Inventory Customizable
    public void SetInventory(Player player) {

        PlayerInventory inventory = player.getInventory();

        inventory.clear();

        // Hotbar
        inventory.setItem(0, JayAPI.itemStack_manager.createItemStack(Material.DIAMOND_SWORD, 1, 0));
        inventory.setItem(1, JayAPI.itemStack_manager.createItemStack(Material.FISHING_ROD, 1, 0));
        inventory.setItem(2, JayAPI.itemStack_manager.createItemStack(Material.BOW, 1, 0));
        inventory.setItem(3, JayAPI.itemStack_manager.createItemStack(Material.COBBLESTONE, 64, 0));
        inventory.setItem(4, PerforceAPI.ItemStacks.Duels.UHC.GoldenHead());
        inventory.setItem(5, JayAPI.itemStack_manager.createItemStack(Material.WATER_BUCKET, 1, 0));
        inventory.setItem(6, JayAPI.itemStack_manager.createItemStack(Material.LAVA_BUCKET, 1, 0));
        inventory.setItem(7, JayAPI.itemStack_manager.createItemStack(Material.GOLDEN_APPLE, 6, 0));
        inventory.setItem(8, JayAPI.itemStack_manager.createItemStack(Material.WATER_BUCKET, 1, 0));

        // Top Inventory
        inventory.setItem(27, JayAPI.itemStack_manager.createItemStack(Material.ARROW, 16, 0));
        inventory.setItem(28, JayAPI.itemStack_manager.createItemStack(Material.DIAMOND_PICKAXE, 1, 0));
        inventory.setItem(29, JayAPI.itemStack_manager.createItemStack(Material.LAVA_BUCKET, 1, 0));
        inventory.setItem(30, JayAPI.itemStack_manager.createItemStack(Material.COBBLESTONE, 64, 0));

        // Armor
        ArrayList<ItemStack> armor = PerforceAPI.ItemStacks.Duels.UHC.Armor();
        inventory.setHelmet(armor.get(0));
        inventory.setChestplate(armor.get(1));
        inventory.setLeggings(armor.get(2));
        inventory.setBoots(armor.get(3));

        player.updateInventory();

    }


}
