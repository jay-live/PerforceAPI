package net.perforce.perforceapi.Messages.Commands.CommandList.Errors;

import org.bukkit.entity.Player;

public class Errors {


    public void CorrectUsage(Player player) {

        player.sendMessage("§cCorrect Usage: /commandlist");

    }


}
