package net.perforce.perforceapi.Messages.Commands.Chat.Errors;

import org.bukkit.entity.Player;

public class Errors {


    public void AlreadyInAllChat(Player player) {

        player.sendMessage("§cYou are already in §fAll §cchat!");

    }
    public void AlreadyInPartyChat(Player player) {

        player.sendMessage("§cYou are already in §9Party §cchat!");

    }


    public void ChatDoesNotExist(Player player) {

        player.sendMessage("§cThat chat does not exist!");
        player.sendMessage("§cPossible chats: §fAll§c, §2Party");

    }


    public void Cooldown(Player player) {

        player.sendMessage("§cYou can only send a message every 3 seconds!");

    }


    public void CorrectUsage(Player player) {

        player.sendMessage("§cCorrect Usage: /chat <chat>");

    }


    public void NotInParty(Player player) {

        player.sendMessage("§cYou are currently not in a party!");

    }


    public void SameMessage(Player player) {

        player.sendMessage("§cYou can't say the same message twice!");

    }


    public void SpecifyChat(Player player) {

        player.sendMessage("§cPlease specify a chat!");

    }


}
