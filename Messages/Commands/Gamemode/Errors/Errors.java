package net.perforce.perforceapi.Messages.Commands.Gamemode.Errors;

import org.bukkit.entity.Player;

public class Errors {


    public void AlreadyInAdventure(Player player) {

        player.sendMessage("§cYou are already in §2Adventure§c mode!");

    }
    public void AlreadyInCreative(Player player) {

        player.sendMessage("§cYou are already in §2Creative§c mode!");

    }
    public void AlreadyInSpectator(Player player) {

        player.sendMessage("§cYou are already in §2Spectator§c mode!");

    }
    public void AlreadyInSurvival(Player player) {

        player.sendMessage("§cYou are already in §2Survival§c mode!");

    }


    public void CorrectUsage(Player player) {

        player.sendMessage("§cCorrect Usage: /gamemode <gamemode>");

    }


    public void GamemodeDoesNotExist(Player player) {

        player.sendMessage("§cThat gamemode does not exist!");
        player.sendMessage("§cPossible gamemodes: §2Adventure§c, §2Creative§c, §2Spectator§c, §2Survival");

    }


    public void SpecifyGamemode(Player player) {

        player.sendMessage("§cPlease specify a gamemode!");

    }


}
