package com.gmail.iamthedarkline.Plugin;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;


@SuppressWarnings("deprecation")
public class GenerateCube extends Plugin{

	public void onCommand(CommandSender sender, Command cmd, String label, String[] args, int length, Location loc) {
		
		int x1 = 0;
		
		if(cmd.getName().equalsIgnoreCase("cube"))
			
			//Set one corner of the cube to the given location.
			//Uses getBlockN() instead of getN() to avoid casting to an int later.
			
			x1 = loc.getBlockX();
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
