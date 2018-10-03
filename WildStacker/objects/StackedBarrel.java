package xyz.wildseries.wildstacker.api.objects;

import org.bukkit.Location;
import org.bukkit.Material;

public interface StackedBarrel extends StackedObject<Barrel> {

    Barrel getBarrel();

    Material getType();

    short getData();

    Location getLocation();

}
