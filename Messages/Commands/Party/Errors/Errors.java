package net.perforce.perforceapi.Messages.Commands.Party.Errors;

import org.bukkit.entity.Player;

public class Errors {


    public void CorrectUsage(Player player) {

        // Send /Party Help Message

    }


    public void MutedFromParty(Player player) {

        player.sendMessage("§cYou are currently muted from your §9Party§c!");

    }


    public void MutedParty(Player player) {

        player.sendMessage("§cYour §9Party §cis currently muted!");

    }


}
