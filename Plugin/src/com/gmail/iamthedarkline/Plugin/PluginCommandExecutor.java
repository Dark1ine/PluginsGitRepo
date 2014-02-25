package com.gmail.iamthedarkline.Plugin;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerMoveEvent;

public class PluginCommandExecutor implements CommandExecutor {
	
	private Plugin plugin;
	
	public PluginCommandExecutor(Plugin plugin) {
		this.plugin = plugin;
		
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (sender instanceof Player)
			Player player = (Player) sender;
		//do something
	} else {
		sender.sendMessage("You must be a player");
		return false;
	}
	//do something
	return false
			
	if (args.length > 4) {
		return false;
	}
	if (args.length < 2) {
		sender.sendMessage("Not enough arguments!")
		return false
	}
	Player target = (Bukkit.getServer().getPlayer(args[0]));
	if (target = null) {
		sender.sendMessage(args[0] + "is not online!");
		return false;
	}
	return false;
}
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

public void onPlayerMove(PlayerMoveEvent event) {
	//get the player's location.
	Location loc = event.getPlayer().getLocation();
	//Sets loc to five above where is used to be. Note that this doesn't change the player's position.
	loc.setY(loc.getY() + 5);
	World w = loc.getWorld();
	//Gets the block at the new location.
	Block b = w.getBlockAt(loc);
	//Sets the block to type is 1 (stone).
	b.setTypeId(1);
	}

public void generateCube(Location loc, int length) {

	//Set one corner of the cube to the given location.
	//Uses getBlockN() instead of getN() to avoid casting to an int later.
	int x1 = loc.getBlockX();
	int y1 = loc.getBlockY();
	int z1 = loc.getBlockZ();
	
	//Figure out the opposite corner of the cube by adding length to all sides.
	int x2 = x1 + length;
	int y2 = y1 + length;
	int z2 = z1 + length;
	
	World world = loc.getWorld();
	
	//Loop over the cube in the x dimension.
	for (int xPoint = x1; xPoint <= x2; xPoint++) {
		//Loop over the cube in the y dimension.
		for (int yPoint = y1; yPoint <= y2; yPoint++) {
			//Loop over the cube in the z dimension.
			for (int zPoint = z1; zPoint <= z2; zPoint++) {
				//Get the block that we are currently looping over.
				Block currentBlock = world.getBlockAt(xPoint, yPoint, zPoint);
				//Set the block to type 57 (Diamond Block)
				currentBlock.setTypeId(57);
				
			}
		}
}

}
}

