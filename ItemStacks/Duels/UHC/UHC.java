package net.perforce.perforceapi.ItemStacks.Duels.UHC;

import net.perforce.jayapi.JayAPI;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.HashMap;

public class UHC {


    public ItemStack GoldenHead() {

        return JayAPI.itemStack_manager.createSkullItemStack("GoldenCat", 1, "§6Golden Head");

    }


    public ArrayList<ItemStack> Armor() {

        ArrayList<ItemStack> armor = new ArrayList<>();

        // Helmet
        {
            ItemStack helmet = JayAPI.itemStack_manager.createItemStack(Material.CHAINMAIL_HELMET, 1, 0);
            HashMap<Enchantment, Integer> enchantments = new HashMap<>();
            enchantments.put(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
            helmet = JayAPI.itemStack_manager.addEnchantments(helmet, enchantments, false);
            armor.add(helmet);
        }

        // Chestplate
        {
            ItemStack chestplate = JayAPI.itemStack_manager.createItemStack(Material.DIAMOND_CHESTPLATE, 1, 0);
            HashMap<Enchantment, Integer> enchantments = new HashMap<>();
            enchantments.put(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
            chestplate = JayAPI.itemStack_manager.addEnchantments(chestplate, enchantments, false);
            armor.add(chestplate);
        }

        // Leggings
        {
            ItemStack leggings = JayAPI.itemStack_manager.createItemStack(Material.DIAMOND_LEGGINGS, 1, 0);
            HashMap<Enchantment, Integer> enchantments = new HashMap<>();
            enchantments.put(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
            leggings = JayAPI.itemStack_manager.addEnchantments(leggings, enchantments, false);
            armor.add(leggings);
        }

        // Boots
        {
            ItemStack boots = JayAPI.itemStack_manager.createItemStack(Material.DIAMOND_BOOTS, 1, 0);
            HashMap<Enchantment, Integer> enchantments = new HashMap<>();
            enchantments.put(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
            boots = JayAPI.itemStack_manager.addEnchantments(boots, enchantments, false);
            armor.add(boots);
        }

        return armor;

    }


}
