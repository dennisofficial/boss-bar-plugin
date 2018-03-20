package me.dennis.bossbar.core;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import me.dennis.bossbar.enums.FileEnum;
import me.dennis.bossbar.events.PlayerJoin;
import me.dennis.bossbar.events.PlayerQuit;
import me.dennis.bossbar.utils.Config;
import me.dennis.bossbar.utils.Console;

public class BossBarPlugin extends JavaPlugin {

	public static BossBarPlugin PLUGIN;
	
	@Override
	public void onEnable() {
		// Plugin declaration
		PLUGIN = this;

		// Setup plugin folder if does not exist
		getDataFolder().mkdirs();

		// Setup files
		for (FileEnum file : FileEnum.values()) {
			file.setup();
		}

		// Configuration file
		Config.setConfig(getConfig());
		
		// Register Plugin Events
		Bukkit.getPluginManager().registerEvents(new PlayerJoin(), PLUGIN);
		Bukkit.getPluginManager().registerEvents(new PlayerQuit(), PLUGIN);
		
		// Finished
		Console.info("Loaded!");
	}
	
}
