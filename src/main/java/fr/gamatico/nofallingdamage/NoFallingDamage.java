package fr.gamatico.nofallingdamage;

import fr.gamatico.nofallingdamage.event.EntityDamageListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class NoFallingDamage extends JavaPlugin {

    @Override
    public void onEnable(){
        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents(new EntityDamageListener(), this);
    }

}
