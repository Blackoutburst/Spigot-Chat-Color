package com.blackoutburst.chatcolor.main;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onPlayerChat(AsyncPlayerChatEvent event) {
        if (event.getPlayer().hasPermission("chatcolor.use"))
            event.setMessage(event.getMessage().replace("&", "§"));
    }
}
