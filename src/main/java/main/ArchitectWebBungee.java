package main;

import handler.Web;
import net.md_5.bungee.api.plugin.Plugin;

public class ArchitectWebBungee extends Plugin {
    
	private Web Web;
	
	public ArchitectWebBungee() {
		Web = new Web();
	}
	
	@Override
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

