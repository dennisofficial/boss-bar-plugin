package me.dennis.bossbar.core;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import me.dennis.bossbar.events.PlayerJoin;
import me.dennis.bossbar.utils.Console;

public class BossBarPlugin extends JavaPlugin {

	public static BossBarPlugin PLUGIN;
	
	@Override
	public void onEnable() {
		PLUGIN = this;
		
		Bukkit.getPluginManager().registerEvents(new PlayerJoin(), PLUGIN);
		

		Console.info("Loaded!");
	}
	
}
