package main;

import handler.Web;
import org.bukkit.plugin.java.JavaPlugin;

public class ArchitectWebSpigot extends JavaPlugin {
	
	private Web Web;
	
	public ArchitectWebSpigot() {
		Web = new Web();
	}
	
	public void onEnable() {
		try {
			Web.start(8454);
		} catch (Exception e) {
			e.printStackTrace();
		}
		getLogger().info("Plugin enabled");
	}
	
	public void onDisable() {
		getLogger().info("Plugin disabled");
	}
	
}
