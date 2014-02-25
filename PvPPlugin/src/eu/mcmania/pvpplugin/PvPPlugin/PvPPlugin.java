package eu.mcmania.pvpplugin.PvPPlugin;

/**
 * Plugin made by Dark1ine/coolguy34526
 * Thanks to Phil2812 for so kindly publishing his code for storing an inventory as a string.
 */





import org.bukkit.plugin.java.JavaPlugin;

public class PvPPlugin extends JavaPlugin {
	
	
	public void onEnable() {
		getLogger().info("PvP Plugin booting up.");
		this.saveDefaultConfig(); //Creates default config.
	}
	public void onDisable() {
		getLogger().info("PvP Plugin shutting down.");
	}
}
