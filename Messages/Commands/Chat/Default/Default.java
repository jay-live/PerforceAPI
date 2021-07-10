package net.perforce.perforceapi.Messages.Commands.Chat.Default;

import org.bukkit.entity.Player;

public class Default {


    public void NowInAllChat(Player player) {

        player.sendMessage("§aYou are now in §fAll §achat!");

    }
    public void NowInPartyChat(Player player) {

        player.sendMessage("§aYou are now in §2Party §achat!");

    }


}
