package net.perforce.perforceapi.Messages.Commands.Spectate.Default;

import org.bukkit.entity.Player;

public class Default {


    public void NowSpectating(Player playerSpectating, Player playerPlaying) {

        playerSpectating.sendMessage("§bYou are now spectating §e" + playerPlaying.getName() + "§b!");

    }


}
