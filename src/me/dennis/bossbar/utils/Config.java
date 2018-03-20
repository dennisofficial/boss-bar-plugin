package me.dennis.bossbar.utils;

import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;

public class Config {

    private static FileConfiguration config = null;
    
    public static void setConfig(FileConfiguration config) {
        Config.config = config;
    }
    
    public static FileConfiguration getConfig() {
        return config;
    }

    public static String getString(String node, String defaultValue) {
		return ChatColor.translateAlternateColorCodes('&', getConfig().getString(node, defaultValue));
	}
    
    public static Integer getInteger(String node, Integer defaultValue) {
		return getConfig().getInt(node, defaultValue);
	}
    
    public static Double getDouble(String node, Double defaultValue) {
		return getConfig().getDouble(node, defaultValue);
	}
    
    public static Boolean getBoolean(String node, Boolean defaultValue) {
		return getConfig().getBoolean(node, defaultValue);
	}
    
    public static List<Integer> getIntegerList(String node) {
		return getConfig().getIntegerList(node);
	}
    
    public static List<String> getStringList(String node) {
    	List<String> raw = getConfig().getStringList(node);
    	for (int i = 0; i < raw.size(); i++) {
    		raw.set(i, ChatColor.translateAlternateColorCodes('&', raw.get(i)));
    	}
		return raw;
	}
    
    public static class MAIN {
    	
    	public static List<String> MESSAGE() {
    		return getStringList("main.message");
    	}
    	
    	public static Integer TICKS() {
    		return getInteger("main.ticks", 30);
    	}
    	
    	public static String COLOR() {
    		return getString("main.color", "WHITE");
    	}
    	
    	public static String STYLE() {
    		return getString("main.style", "SOLID");
    	}
    	
    }
    
}
