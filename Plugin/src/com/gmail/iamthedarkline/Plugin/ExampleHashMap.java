package com.gmail.iamthedarkline.Plugin;

import org.bukkit.entity.Player;

public class ExampleHashMap extends Plugin {
	
	Player player = (Player) sender;
	togglePluginState(player);
	
	public void togglePluginState(Player player) {
		if(pluginEnable.containsKey(player)) {
			if(pluginEnabled.get(player)) {
				pluginEnabled.put(player, false);
				player.sendMessage("Plugin disabled.");
			} else {
				pluginEnabled.put(player, true);
				player.sendMessage("Plugin enabled.");
			}
		} else {
			pluginEnabled.put(player, true);
			player.sendMessage("Plugin enabled.");
			}
		}
	}
