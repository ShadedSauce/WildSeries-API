package xyz.wildseries.wildtools.api.objects;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.BlockState;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.List;

public interface Block {

    Location getLocation();

    Material getType();

    BlockState getState();

    void setType(Material type);

    void setData(byte data);

    byte getData();

    boolean canInteract(Player pl);

    boolean canBreak(Player pl);

    void breakNaturally(Player pl);

    void update();

    List<ItemStack> getDrops(Player pl);

}
