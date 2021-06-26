package net.perforce.perforceapi.Messages.Commands.Global.Errors;

import org.bukkit.entity.Player;

public class Errors {


    public void NoPermission(Player player) {

        player.sendMessage("§cYou don't have the permission to use this command!");

    }


    public void OnlyUseInLobby(Player player) {

        player.sendMessage("§cYou may only use this command in a lobby!");

    }


    public void PlayerCurrentlyOffline(Player player) {

        player.sendMessage("§cThat player is currently offline!");

    }


    public void PlayerDoesNotExist(Player player) {

        player.sendMessage("§cThat player does not exist!");

    }


    public void TooManyArguments(Player player) {

        player.sendMessage("§cToo many arguments!");

    }


}
