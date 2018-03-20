package me.dennis.bossbar.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import me.dennis.bossbar.utils.BarManager;

public class PlayerJoin implements Listener {

	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event) {
		BarManager.GLOBAL_BAR.addPlayer(event.getPlayer());
	}
	
}
