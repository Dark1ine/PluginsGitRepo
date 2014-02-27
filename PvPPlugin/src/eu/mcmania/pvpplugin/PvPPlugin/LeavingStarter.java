package eu.mcmania.pvpplugin.PvPPlugin;

import org.bukkit.Bukkit;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.Material;
import com.mewin.WGRegionEvents.events.RegionLeaveEvent;

public class LeavingStarter extends PvPPlugin {
	
	public Inventory onRegionLeave(RegionLeaveEvent e) {
		
		if (e.getRegion().getId().equals("starter")) {
			
			e.getPlayer.getInventory().clear();
	
	final Inventory StringToInventory(String invString) {
        String[] serializedBlocks = invString.split(";");
        String invInfo = serializedBlocks[0];
        Inventory deserializedInventory = Bukkit.getServer().createInventory(null, Integer.valueOf(invInfo));
       
        	for (int i = 1; i < serializedBlocks.length; i++) {
        		String[] serializedBlock = serializedBlocks[i].split("#");
        		int stackPosition = Integer.valueOf(serializedBlock[0]);
           
        		if (stackPosition >= deserializedInventory.getSize()) {
        			continue;
        		}
           
            ItemStack is = null;
            Boolean createdItemStack = false;
           
            String[] serializedItemStack = serializedBlock[1].split(":");
            for (String itemInfo : serializedItemStack)
            {
                String[] itemAttribute = itemInfo.split("@");
                if (itemAttribute[0].equals("t"))
                {
                    is = new ItemStack(Material.getMaterial(Integer.valueOf(itemAttribute[1])));
                    createdItemStack = true;
                }
                else if (itemAttribute[0].equals("d") && createdItemStack)
                {
                    is.setDurability(Short.valueOf(itemAttribute[1]));
                }
                else if (itemAttribute[0].equals("a") && createdItemStack)
                {
                    is.setAmount(Integer.valueOf(itemAttribute[1]));
                }
                else if (itemAttribute[0].equals("e") && createdItemStack)
                {
                    is.addEnchantment(Enchantment.getById(Integer.valueOf(itemAttribute[1])), Integer.valueOf(itemAttribute[2]));
                }
            }
            deserializedInventory.setItem(stackPosition, is);
        	}
       
        return deserializedInventory;
		}
    }
}
	
}
