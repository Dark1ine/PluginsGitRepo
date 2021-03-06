/*

Author of plugin: Dark1ine | coolguy34526

Special thanks to: externo6 for helping me with a severe bug.

Plugin made for: WeeSkilz, HeadAdmin on the server mcsurvivalisland.com

Plugin made using: Eclipse

This plugin creates an explosion equivalent to 1 TNT at the location of the user, at the cost of 5 TNT
with a 5 minute cooldown.


**/
package me.coolguy34526.bombplugin;
 
import java.util.ArrayList;
 
 
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
 
public class BombPlugin extends JavaPlugin {
 
        ArrayList<String> cooldown = new ArrayList<String>(); //Creates the cooldown array.
       
        @SuppressWarnings("deprecation")
                public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
                if(args.length > 1) {
                        sender.sendMessage("Too many arguments!");
                        return true; // Checks for correct number of arguments.
                }
                if(sender instanceof Player) { //Checks the sender is a player.
                        if(cmd.getName().equalsIgnoreCase("bomb")) { //Checks for the command.
                                final Player player = (Player) sender; //Assigns the player variable as the command executor.
                                if(cooldown.contains(player.getName())) { //Checks to see if the player is on cooldown.
                                        player.sendMessage(ChatColor.RED + "Your 5 minute cooldown on this command has not yet expired.");
                                        return true;
                                } else {
                                        PlayerInventory inventory = player.getInventory(); //Assigns the player's inventory.
                                        if(inventory.contains(Material.TNT, 5)) {
                                                inventory.removeItem(new ItemStack (46, 5));
                        player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 4, 100)); //Adds resistance 100 for 4 ticks.
                        player.getWorld().createExplosion(player.getLocation(), 4); //Creates the explosion at the player's location.
                        cooldown.add(player.getName()); //Adds the player to the cooldown array.
                        Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(this, new Runnable() { //Creates a delayed task to remove the player from the cooldown array after 5 minutes.
                                public void run() {
                                        cooldown.remove(player.getName());
                                }
                        }, 6000);
                        return true;
                                        } else {
                                                player.sendMessage("You need 5 TNT to perform this command!"); //If the player doesn't have 5 TNT sends them a message telling them so.
                                                return true;
                                        }
                                }
                        } else {
                                return true;
                        }
                } else {
                        return false;
                }
        }
}