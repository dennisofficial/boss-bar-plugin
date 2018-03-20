package me.dennis.bossbar.utils;

import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.boss.BarColor;
import org.bukkit.boss.BarStyle;
import org.bukkit.boss.BossBar;

import me.dennis.bossbar.core.BossBarPlugin;

public class BarManager {

	public static BossBar GLOBAL_BAR;
	
	private static Integer INDEX = 0;
	
	public static void setup() {
		List<String> list = Config.MAIN.MESSAGE();
		
		GLOBAL_BAR = Bukkit.createBossBar(list.get(INDEX), BarColor.valueOf(Config.MAIN.COLOR()), BarStyle.valueOf(Config.MAIN.STYLE()));
		GLOBAL_BAR.setProgress(0d);
		
		Bukkit.getScheduler().scheduleSyncRepeatingTask(BossBarPlugin.PLUGIN, () -> {
			if (INDEX < list.size() - 1) {
				INDEX++;
			}
			else {
				INDEX = 0;
			}
			GLOBAL_BAR.setTitle(list.get(INDEX));
		}, 0L, (long) Config.MAIN.TICKS());
	}
	
}
