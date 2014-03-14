package eu.mcmania.pvpplugin.PvPPlugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

import com.mewin.WGRegionEvents.events.RegionEnterEvent;

import java.util.Map;
import java.util.Map.Entry;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.ChatColor;

public class StarterCMD extends PvPPlugin {

	public void onRegionEnter(RegionEnterEvent e) { // Detects player entering a region.
	final Player player = e.getPlayer(); // Defines who the player is.
	
		if (e.getRegion().getId().equals("starter")) { // If the region entered is starter...
		
			if player.!hasPermission("pvp.bypass") { // If the player cannot bypass kit issue...
				
				if (player.hasPermission("pvp.starter")) { // If the player is allowed in...
					getLogger().info(player + "has entered that starter arena."); 
					final String InventoryToString(Inventory invInventory) {
					String serialization = invInventory.getSize() + ";"; // Stores inv as string.
					for (int i = 0; i < invInventory.getSize(); i++)
					{
						ItemStack is = invInventory.getItem(i);
						if (is != null)
						{
							String serializedItemStack = new String();

							String isType = String.valueOf(is.getType().getId());
							serializedItemStack += "t@" + isType;

							if (is.getDurability() != 0)
							{
								String isDurability = String.valueOf(is.getDurability());
								serializedItemStack += ":d@" + isDurability;
							}

							if (is.getAmount() != 1)
							{
								String isAmount = String.valueOf(is.getAmount());
								serializedItemStack += ":a@" + isAmount;
							}

							Map<Enchantment,Integer> isEnch = is.getEnchantments();
							if (isEnch.size() > 0)
							{
								for (Entry<Enchantment,Integer> ench : isEnch.entrySet())
								{
									serializedItemStack += ":e@" + ench.getKey().getId() + "@" + ench.getValue();
								}
							}

							serialization += i + "#" + serializedItemStack + ";";
			
			
							ItemStack sword = new ItemStack(Material.STONE_SWORD, 1);
							ItemStack food = new ItemStack(Material.COOKED_BEEF, 192);
							PlayerInventory inventory = player.getInventory();
							
							inventory.clear();

							inventory.addItem(sword);
							inventory.addItem(food);
				
				
				} else { // If the player is banned from the region...
					String cmd = "/spawn"; // Defines the command to take them to spawn...
					Bukkit.getServer().dispatchCommand(player.getServer().getConsoleSender(), cmd + player); // Forces the player to execute the command.
					player.sendMessage("&4You are not permitted to enter the starter arena."); // Informs them that they are not allowed to enter the arena.
				}
			
			
			
				
			} else { // If the player has kit bypass permissions...
			
			player.sendMessage("You have kept your items. Welcome to the starter arena " + player + "."); // Informs them that they have kept their items.
			
			}
			
		}
		
		
		
		
	}


