package xyz.wildseries.wildstacker.api.objects;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.material.MaterialData;

public interface StackedBlock extends StackedObject<Block>{

    Block getBlock();

    Material getType();

    MaterialData getMaterialData();

    Location getLocation();

}
