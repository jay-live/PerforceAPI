package net.perforce.perforceapi;

import net.perforce.perforceapi.Inventories.Inventories;
import net.perforce.perforceapi.ItemStacks.ItemStacks;
import net.perforce.perforceapi.Messages.Messages;
import net.perforce.perforceapi.NPCs.NPCs;
import net.perforce.perforceapi.Scoreboards.Scoreboards;
import net.perforce.perforceapi.TabLists.TabLists;
import net.perforce.perforceapi.Worlds.Worlds;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;


public final class PerforceAPI extends JavaPlugin implements Listener {


    public static ItemStacks ItemStacks;
    public static Inventories Inventories;
    public static Messages Messages;
    public static NPCs NPCs;
    public static Scoreboards Scoreboards;
    public static TabLists TabLists;
    public static Worlds Worlds;


    @Override
    public void onEnable() {

        ItemStacks = new ItemStacks();
        Inventories = new Inventories();
        Messages = new Messages();
        NPCs = new NPCs();
        Scoreboards = new Scoreboards();
        TabLists = new TabLists();
        Worlds = new Worlds();

    }


}
