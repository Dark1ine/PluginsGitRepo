package com.gmail.iamthedarkline.Plugin;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.event.EventPriority;

public final class Events1 extends Plugin implements Listener {
	@EventHandler
	public void onLogin(PlayerLoginEvent event) {
		//Code here
	}
	
	@EventHandler(priority = EventPriority.HIGH)
	public void normalLogin(PlayerLoginEvent event) {
	getLogger().info("A player has joined");	
	}
}
