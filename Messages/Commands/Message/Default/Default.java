package net.perforce.perforceapi.Messages.Commands.Message.Default;

import org.bukkit.entity.Player;

public class Default {


    // TODO - Show Ranks
    public void SendMessage(Player playerFrom, Player playerTo, String message) {

        playerFrom.sendMessage("§6To " + playerTo + "§6:§7" + message);
        playerTo.sendMessage("§6From " + playerFrom + "§6:§7" + message);

    }


}
