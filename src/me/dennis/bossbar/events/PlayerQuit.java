package me.dennis.bossbar.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

import me.dennis.bossbar.utils.BarManager;

public class PlayerQuit implements Listener {

	@EventHandler
	public void onPlayerQuit(PlayerQuitEvent event) {
		BarManager.GLOBAL_BAR.removePlayer(event.getPlayer());
	}
	
}
