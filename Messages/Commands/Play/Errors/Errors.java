package net.perforce.perforceapi.Messages.Commands.Play.Errors;

import org.bukkit.entity.Player;

public class Errors {


    public void CorrectUsage(Player player) {

        player.sendMessage("§cCorrect Usage: /play <game>");

    }


    public void GameDoesNotExist(Player player) {

        player.sendMessage("§cThat game does not exist!");
        player.sendMessage("§cPossible games: §fDuels");

    }


    public void SpecifyGame(Player player) {

        player.sendMessage("§cPlease specify a game!");

    }


}
