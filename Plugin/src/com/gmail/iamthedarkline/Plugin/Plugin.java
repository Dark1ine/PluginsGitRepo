package com.gmail.iamthedarkline.Plugin;

import org.bukkit.plugin.java.JavaPlugin;

public class Plugin extends JavaPlugin{

	@Override
	public void onEnable() {
		getLogger().info("onEnable has been invoked!");
		getCommand("basic").setExecutor(new PluginCommandExecutor(this));
		
	}
	
	@Override
	public void onDisable() {
		getLogger().info("onDisable has been invoked!");
	}
	
}
