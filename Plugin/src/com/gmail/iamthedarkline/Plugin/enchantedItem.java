package com.gmail.iamthedarkline.Plugin;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.enchantments.EnchantmentWrapper;
import org.bukkit.inventory.ItemStack;

public class enchantedItem extends Plugin {
	int itemCode = 280; //Use item code you want here.
	int effectId = 20; //Use enchantment code you want here.
	int enchantmentLevel = 100; //Enchantment level.
	
	ItemStack myItem = new ItemStack(itemCode); //New item of item code.
	Enchantment myEnchantment = new EnchantmentWrapper(effectId); //New enchantment of effect ID.
	myItem.addEnchantment(myEnchantment, enchantmentLevel); //Enchants the item.

}
