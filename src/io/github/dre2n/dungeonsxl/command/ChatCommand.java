package io.github.dre2n.dungeonsxl.command;

import io.github.dre2n.dungeonsxl.file.DMessages.Messages;
import io.github.dre2n.dungeonsxl.player.DPlayer;
import io.github.dre2n.dungeonsxl.util.MessageUtil;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ChatCommand extends DCommand {
	
	public ChatCommand() {
		setCommand("chat");
		setMinArgs(0);
		setMaxArgs(0);
		setHelp(dMessages.getMessage(Messages.HELP_CMD_CHAT));
		setPermission("dxl.chat");
		setPlayerCommand(true);
	}
	
	@Override
	public void onExecute(String[] args, CommandSender sender) {
		Player player = (Player) sender;
		DPlayer dplayer = DPlayer.getByPlayer(player);
		
		if (dplayer == null) {
			MessageUtil.sendMessage(player, dMessages.getMessage(Messages.ERROR_NOT_IN_GROUP));
			return;
		}
		
		if (dplayer.isInDungeonChat()) {
			dplayer.setInDungeonChat(false);
			MessageUtil.sendMessage(player, dMessages.getMessage(Messages.CMD_CHAT_NORMAL_CHAT));
			
		} else {
			dplayer.setInDungeonChat(true);
			MessageUtil.sendMessage(player, dMessages.getMessage(Messages.CMD_CHAT_DUNGEON_CHAT));
		}
	}
	
}
