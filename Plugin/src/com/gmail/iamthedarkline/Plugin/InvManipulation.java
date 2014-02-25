package com.gmail.iamthedarkline.Plugin;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

public class InvManipulation extends Plugin {

public void onPlayerJoin(PlayerJoinEvent evt) {
	Player player = evt.getPlayer(); //The player who joined.
	PlayerInventory inventory = player.getInventory(); //The player's inventory.
	ItemStack itemstack = new ItemStack(Material.DIAMOND, 64); //A stack of diamonds.
	
	if (inventory.contains(itemstack)) {
		inventory.addItem(itemstack); //Adds a stack of diamonds to the players inventory.
		player.sendMessage("Welcome! You seem to be reeeeally rich, so we gave you some more diamonds!");
	}
}
	
}
