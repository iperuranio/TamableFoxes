package net.seanomik.tamablefoxes.versions;

//import net.minecraft.server.v1_15_R1.EntityFox;
import net.seanomik.tamablefoxes.TamableFoxes;
import org.bukkit.Location;

public interface NMSInterface {
    enum FoxType {
        RED,
        SNOW
    }

    void registerCustomFoxEntity();
    void spawnTamableFox(Location loc, FoxType type);
}