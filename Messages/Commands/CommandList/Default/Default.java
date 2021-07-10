package net.perforce.perforceapi.Messages.Commands.CommandList.Default;

import net.perforce.jayapi.JayAPI;
import org.bukkit.entity.Player;

public class Default {


    public void CommandList(Player player, Integer page) {

        String rank = JayAPI.player_manager.getRank(player);

        // Player is Staff
        if (JayAPI.rank_manager.isStaff(rank)) {

            // Page 1
            if (page == 1) {
                player.sendMessage("§2━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
                player.sendMessage(JayAPI.message_manager.centerMessage("§6§lCommands"));
                player.sendMessage(" ");
                player.sendMessage("§a• /chat: §fChange the chat you're currently speaking in");
                player.sendMessage("§a• /commandlist: §fShows this list of commands");
                player.sendMessage("§a• /friend: §fManage your friends list");
                player.sendMessage("§a• /gamemode: §fChange your current gamemode");
                player.sendMessage("§a• /message: §fMessage your friends");
                player.sendMessage("§a• /play: §fPlay a game on the server");
                player.sendMessage("§a• /spectate: §fSpectate another player's current game");
                player.sendMessage("§2━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
            }

        }

        // Player isn't Staff
        else {

            // Page 1
            if (page == 1) {
                player.sendMessage("§2━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
                player.sendMessage(JayAPI.message_manager.centerMessage("§6§lCommands"));
                player.sendMessage(" ");
                player.sendMessage("§a• /chat: §fChange the chat you're currently speaking in");
                player.sendMessage("§a• /commandlist: §fShows this list of commands");
                player.sendMessage("§a• /friend: §fManage your friends list");
                player.sendMessage("§a• /message: §fMessage your friends");
                player.sendMessage("§a• /play: §fPlay a game on the server");
                player.sendMessage("§a• /spectate: §fSpectate another player's current game");
                player.sendMessage("§2━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
            }

        }


    }


}
