package com.gmail.iamthedarkline.yoloplugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public final class YoloPlugin extends JavaPlugin {
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player player = (Player) sender;
		player.hasPermission("YoloPlugin.YOLO");
		if(cmd.getName().equalsIgnoreCase("yolo")) { //If the player executes the command /yolo, do
			player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 600, 100)); //Adds heal effect to player.
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 600, 100)); //All following lines until "End" add potion effect lvl 100 for 30 seconds to player.
			player.addPotionEffect(new PotionEffect(PotionEffectType.HARM, 1, 100));
			player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 1, 100));
			player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 600, 100));
			player.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 600, 100));
			player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 600, 100));
			player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 600, 100));
			player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 600, 100));
			player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 600, 100));
			player.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 600, 100));
			player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 600, 100));
			player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 600, 100));
			player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 600, 100));
			player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 600, 100));
			player.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 600, 100));
			player.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, 600, 100));
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, 600, 100));
			player.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, 600, 100));
			player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 600, 100));
			player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 600, 100));
			player.addPotionEffect(new PotionEffect(PotionEffectType.SATURATION, 600, 100)); //End
			return true;
		} else {
			return false;
		
		}
	}
}
	

