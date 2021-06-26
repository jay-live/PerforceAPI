package net.perforce.perforceapi.Messages.Commands.Friend.Default;

import net.md_5.bungee.api.chat.TextComponent;
import net.perforce.jayapi.JayAPI;
import net.perforce.perforceapi.PerforceAPI;
import net.perforce.perforceapi.Worlds.Lobby.Lobby;
import net.perforce.perforceapi.Worlds.Worlds;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Default {


    // TODO - Show Ranks
    public void AcceptedFriendRequest(String playerFrom, Player playerTo) {

        // Send Message to Player that sent the friend request
        if (Bukkit.getPlayer(playerFrom) != null) {

            // Get Player
            Player player = Bukkit.getPlayer(playerFrom);

            // Send Message to Player that sent the friend request
            player.sendMessage("§2━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
            player.sendMessage("§b" + playerTo.getName() + " §aaccepted your friend request!");
            player.sendMessage("§2━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");

        }

        // Send Message to Player that accepted the friend request
        playerTo.sendMessage("§2━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        playerTo.sendMessage("§aYou accepted §b" + playerFrom + "§a's friend request!");
        playerTo.sendMessage("§2━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");

    }


    public void CommandList(Player player) {

        // Send list of commands to Player
        player.sendMessage("§2━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        player.sendMessage(JayAPI.message_manager.centerMessage("§6§lFriend Commands"));
        player.sendMessage(" ");
        player.sendMessage("§a• /friend accept <player>: §fAccepts the friend request of a player");
        player.sendMessage("§a• /friend (add) <player>: §fSends a friend request to a player");
        player.sendMessage("§a• /friend decline <player>: §fDeclines the friend request of a player");
        player.sendMessage("§a• /friend help: §fShows this list containing all /friend commands");
        player.sendMessage("§a• /friend list: §fShows a list of all your friends");
        player.sendMessage("§a• /friend remove <player>: §fRemoves a player from your friend list");
        player.sendMessage("§2━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");

    }


    // TODO - Show Ranks
    public void DeclinedFriendRequest(String playerFrom, Player playerTo) {

        // Send Message to Player that sent the friend request
        if (Bukkit.getPlayer(playerFrom) != null) {

            // Get Player
            Player player = Bukkit.getPlayer(playerFrom);

            // Send Message to Player that sent the friend request
            player.sendMessage("§2━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
            player.sendMessage("§b" + playerTo.getName() + " §cdeclined §ayour friend request!");
            player.sendMessage("§2━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");

        }

        // Send Message to Player that declined the friend request
        playerTo.sendMessage("§2━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        playerTo.sendMessage("§aYou §cdeclined §b" + playerFrom + "§a's friend request!");
        playerTo.sendMessage("§2━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");

    }


    // TODO - Add Games to the list (currently only lobbies)
    // TODO - Show Ranks
    public void FriendList(Player player, ArrayList<String> friends, Integer page) {

        // Initiate friends Lists
        ArrayList<String> onlineFriends = new ArrayList<>();
        ArrayList<String> offlineFriends = new ArrayList<>();

        // Differentiate online and offline friends
        for (String friend : friends) {

            if (Bukkit.getPlayer(friend) != null) onlineFriends.add(friend);
            else offlineFriends.add(friend);

        }

        // Sort friends Lists
        {
            Collections.sort(onlineFriends);
            Collections.sort(offlineFriends);
        }

        // Get full List of sorted friends
        onlineFriends.addAll(offlineFriends);

        // Save all Messages to send
        ArrayList<String> messages = new ArrayList<>();
        messages.add("§2━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        for (int friend = 7 * (page-1) + 1; friend < 7 * page + 1; friend++) {

            if (onlineFriends.get(friend) == null) break;

            String currentGame;

            // Get current game
            {
                // Case friend is in a Lobby
                if (Worlds.getLobbies().contains(player.getWorld())) {
                    currentGame = "the ";
                    currentGame += Worlds.getWorldNames().get(player.getWorld());
                }

                // TODO - Specify Game the Player is in
                // Case friend is in a Game
                else {
                    currentGame = "a game";
                }
            }

            messages.add("§f" + onlineFriends.get(friend) + " is in " + currentGame);

        }
        messages.add("§2━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");

        // Send Messages to Player
        for (String message : messages) {

            player.sendMessage(message);

        }

    }


    // TODO- Show Ranks
    public void RemovedFromFriendList(Player player, String playerRemoved) {

        player.sendMessage("§2━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        player.sendMessage("§cYou removed §b" + playerRemoved + " §cfrom your friend list!");
        player.sendMessage("§2━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");

        if (Bukkit.getPlayer(playerRemoved) != null) {

            Player removedPlayer = Bukkit.getPlayer(playerRemoved);

            removedPlayer.sendMessage("§2━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
            removedPlayer.sendMessage("§b" + player.getName() + " §cremoved you from their friend list!");
            removedPlayer.sendMessage("§2━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");

        }

    }


    // TODO - Show Ranks
    public void SendFriendRequest(Player playerFrom, String playerTo) {

        // Send Message to Player sending the friend request
        playerFrom.sendMessage("§aSent a friend request to §f" + playerTo + "§a!");

        // Send Message to Player receiving the friend request
        if (Bukkit.getPlayer(playerTo) != null) {

            // Get Player
            Player player = Bukkit.getPlayer(playerTo);

            // Create Accept Text
            TextComponent accept = JayAPI.message_manager.createClickableCommandMessage(
                    "§a[Accept] ",
                    "§fClick to §aaccept §f" + playerFrom.getName() + "'s friend request!",
                    "friend accept " + playerFrom.getName()
            );

            // Create Deny Text
            TextComponent decline = JayAPI.message_manager.createClickableCommandMessage(
                    "§c[Decline] ",
                    "§fClick to §cdeclined §f" + playerFrom.getName() + "'s friend request!",
                    "friend decline " + playerFrom.getName()
            );
            accept.addExtra(decline);

            // Send Messages
            player.sendMessage("§f" + playerTo + " §ahas sent you a friend request!");
            player.spigot().sendMessage(accept);

        }

    }


}
