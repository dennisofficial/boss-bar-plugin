package me.dennis.bossbar.enums;

import java.io.File;
import java.util.concurrent.Callable;

import me.dennis.bossbar.core.BossBarPlugin;
import me.dennis.bossbar.utils.Console;

public enum FileEnum {

    CONFIG(new Callable<Void>() {
        @Override
        public Void call() throws Exception {
            if (!new File(BossBarPlugin.PLUGIN.getDataFolder(), "config.yml").exists()) {
            	BossBarPlugin.PLUGIN.saveResource("config.yml", false);
            }
            return null;
        }
    });
    
    public Callable<Void> func;
    
    private FileEnum(Callable<Void> func) {
        this.func = func;
    }
    
    public void setup() {
        try {
            func.call();
        }
        catch (Exception e) {
        	Console.catchError(e, "FileEnum.setup()");
        }
    }
    
}
