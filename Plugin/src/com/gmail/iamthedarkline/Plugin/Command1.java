package com.gmail.iamthedarkline.Plugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Command1 {

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("basic")) { //If the player typed "/basic" do the following...
			//doSomething
			return true;
		} else if (cmd.getName().equalsIgnoreCase("basic2")) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("This command can only be run by a player.");
		} else {
			Player player = (Player) sender;
			//Do Something.
		}
		return true;
	}
	return false;
}
}
