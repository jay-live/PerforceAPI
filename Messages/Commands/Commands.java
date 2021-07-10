package net.perforce.perforceapi.Messages.Commands;


import net.perforce.perforceapi.Messages.Commands.Chat.Chat;
import net.perforce.perforceapi.Messages.Commands.CommandList.CommandList;
import net.perforce.perforceapi.Messages.Commands.Friend.Friend;
import net.perforce.perforceapi.Messages.Commands.Gamemode.Gamemode;
import net.perforce.perforceapi.Messages.Commands.Global.Global;
import net.perforce.perforceapi.Messages.Commands.Message.Message;
import net.perforce.perforceapi.Messages.Commands.Party.Party;
import net.perforce.perforceapi.Messages.Commands.Play.Play;
import net.perforce.perforceapi.Messages.Commands.Spectate.Spectate;

public class Commands {


    public Chat Chat = new Chat();
    public CommandList CommandList = new CommandList();
    public Friend Friend = new Friend();
    public Gamemode Gamemode = new Gamemode();
    public Global Global = new Global();
    public Message Message = new Message();
    //public Party Party = new Party();
    public Play Play = new Play();
    public Spectate Spectate = new Spectate();


}
