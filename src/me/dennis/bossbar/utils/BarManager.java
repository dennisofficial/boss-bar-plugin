package me.dennis.bossbar.utils;

import org.bukkit.Bukkit;
import org.bukkit.boss.BarColor;
import org.bukkit.boss.BarStyle;
import org.bukkit.boss.BossBar;

public class BarManager {

	public static BossBar GLOBAL_BAR;
	
	public static void setup() {
		GLOBAL_BAR = Bukkit.createBossBar(Config.MAIN.MESSAGE(), BarColor.valueOf(Config.MAIN.COLOR()), BarStyle.valueOf(Config.MAIN.STYLE()));
		GLOBAL_BAR.setProgress(0d);
	}
	
}
