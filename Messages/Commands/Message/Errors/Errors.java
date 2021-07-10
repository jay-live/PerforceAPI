package net.perforce.perforceapi.Messages.Commands.Message.Errors;

import org.bukkit.entity.Player;

public class Errors {


    public void AlreadyMessaging(Player player) {

        player.sendMessage("§cYou are already messaging that player!");

    }


    public void CorrectUsage(Player player) {

        player.sendMessage("§cCorrect Usage: /message <player> <message>");

    }


    public void SameMessage(Player player) {

        player.sendMessage("§cYou can't say the same message twice!");

    }


    public void SpecifyMessage(Player player) {

        player.sendMessage("§cPlease specify a message!");
        CorrectUsage(player);

    }
    public void SpecifyPlayer(Player player) {

        player.sendMessage("§cPlease specify a player!");
        CorrectUsage(player);

    }


}
