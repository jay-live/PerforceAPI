package net.perforce.perforceapi.Messages.Commands.Friend.Errors;

import org.bukkit.entity.Player;

public class Errors {


    // TODO - Show Ranks
    public void AlreadyFriends(Player player, String playerToAdd) {

        player.sendMessage("§cYou are already friends with" + playerToAdd + "!");

    }


    // TODO - Show Ranks
    public void FriendRequestsDisabled(Player player, String playerToAdd) {

        player.sendMessage("§c" + playerToAdd + " has friend requests disabled!");

    }


    // TODO - Show Ranks
    public void NotOnFriendList(Player player, String playerToRemove) {

        player.sendMessage("§c" + playerToRemove + " is not on your friend list!");

    }


}
