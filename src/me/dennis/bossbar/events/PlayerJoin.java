package me.dennis.bossbar.events;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.boss.BarColor;
import org.bukkit.boss.BarStyle;
import org.bukkit.boss.BossBar;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import me.dennis.bossbar.core.BossBarPlugin;

public class PlayerJoin implements Listener {

	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event) {
		Player player = event.getPlayer();
		BossBar bar = Bukkit.createBossBar(ChatColor.AQUA + "Welcome " + ChatColor.DARK_AQUA, BarColor.GREEN, BarStyle.SOLID);
		bar.addPlayer(player);
		Bukkit.getScheduler().scheduleSyncDelayedTask(BossBarPlugin.PLUGIN, () -> {
			bar.removePlayer(player);
		}, 200L);
	}
	
}
