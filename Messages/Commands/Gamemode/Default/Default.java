package net.perforce.perforceapi.Messages.Commands.Gamemode.Default;

import org.bukkit.entity.Player;

public class Default {


    public void SetGamemodeAdventure(Player player) {

        player.sendMessage("§aYour gamemode has been set to §2Adventure §amode");

    }
    public void SetGamemodeCreative(Player player) {

        player.sendMessage("§aYour gamemode has been set to §2Creative §amode");

    }
    public void SetGamemodeSpectator(Player player) {

        player.sendMessage("§aYour gamemode has been set to §2Spectator §amode");

    }
    public void SetGamemodeSurvival(Player player) {

        player.sendMessage("§aYour gamemode has been set to §2Survival §amode");

    }


}
