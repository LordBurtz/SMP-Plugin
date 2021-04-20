package me.fingolfin.smp;

import me.fingolfin.smp.meditation.meditation;
import me.fingolfin.smp.necro.*;
import me.fingolfin.smp.helloworld.*;
import me.fingolfin.smp.horse.*;
import me.fingolfin.smp.plotarmor.*;
import org.bukkit.plugin.java.JavaPlugin;

public final class main extends JavaPlugin {

    @Override
    public void onEnable() {
        new helloworldcmd(this);
        new horse_spwn_cmd(this);
        new armor(this);
        new damageEvent(this);
        new meditation(this);
        new necromancer(this);

    }

    @Override
    public void onDisable() {
        meditation.onShutdown();
    }
}
