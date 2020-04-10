package com.github.kdm1jkm.useless_pvp

import org.bukkit.plugin.java.JavaPlugin

class main : JavaPlugin(){
    override fun onEnable() {
        logger.info("Plugin Enabled!")
    }

    override fun onDisable() {
        logger.info("Plugin Disabled!")
    }
}