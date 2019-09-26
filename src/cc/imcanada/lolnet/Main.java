package cc.imcanada.lolnet;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor;

public final class Main extends JavaPlugin {
    @Override
    public void onEnable() {
    	getLogger().info("lolnet core has been enabled.");
    }
    
    @Override
    public void onDisable() {
    	getLogger().info("lolnet core has been disabled.");
    }

@Override
public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
	if (cmd.getName().equalsIgnoreCase("lolnet")) { // If the player typed /basic then do the following, note: If you only registered this executor for one command, you don't need this
		// doSomething
		sender.sendMessage(ChatColor.RED+ "" +ChatColor.BOLD+"Running lolnet core v.1.0");
		return true;
	} //If this has happened the function will return true. 
        // If this hasn't happened the value of false will be returned.
	return false;
	}
}
