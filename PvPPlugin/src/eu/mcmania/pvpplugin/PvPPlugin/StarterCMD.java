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
import org.bukkit.ChatColor

public class StarterCMD extends PvPPlugin {
		
	public void onRegionEnter(RegionEnterEvent e) {
		
		if (e.getPlayer().!hasPermission("pvp.starter") {
			
			Player player = e.getPlayer();
			Command cmd = "/spawn";
			Bukkit.getServer().dispatchCommand(player.getServer().getConsoleSender(), cmd + player);
			player.sendMessage(COLOR.RED + "You are not permitted to enter the starter arena.")
		} else {
		
		if (e.getRegion().getId().equals("starter")) {
		    public static String InventoryToString(Inventory invInventory) {
		        String serialization = invInventory.getSize() + ";";
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
		            }
		        }

		    }

		}
		
		Player player = e.getPlayer();
		ItemStack sword = new ItemStack((this.getConfig().getString(sword)));
		ItemStack food = new ItemStack(this.getConfig().getString(food));
		PlayerInventory inventory = player.getInventory();
		
		inventory.addItem(sword);
		inventory.addItem(food);
		
	}

}
}
