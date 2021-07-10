package net.perforce.perforceapi.Messages.Commands.Spectate.Errors;

import org.bukkit.entity.Player;

public class Errors {


    public void CanNotSpectate(Player player) {

        player.sendMessage("§cYou can't spectate the game this player is in!");

    }


    public void CorrectUsage(Player player) {

        player.sendMessage("§cCorrect usage: /spectate <player>");

    }


    public void NotInGame(Player player) {

        player.sendMessage("§cThis player is currently not in a game!");

    }


}
