package xyz.wildseries.wildstacker.api.handlers;

import org.bukkit.Location;
import org.bukkit.block.CreatureSpawner;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Item;
import org.bukkit.entity.LivingEntity;
import xyz.wildseries.wildstacker.api.objects.StackedEntity;
import xyz.wildseries.wildstacker.api.objects.StackedItem;
import xyz.wildseries.wildstacker.api.objects.StackedObject;
import xyz.wildseries.wildstacker.api.objects.StackedSpawner;

import java.util.List;

public interface SystemManager {

    int getStackAmount(StackedObject stackedObject);

    void setStackAmount(StackedObject stackedObject, int stackAmount);

    void removeStackAmount(StackedObject stackedObject);

    StackedEntity getStackedEntity(LivingEntity livingEntity);

    StackedItem getStackedItem(Item item);

    StackedSpawner getStackedSpawner(CreatureSpawner spawner);

    List<StackedSpawner> getStackedSpawners();

    void performSpawnerClear();

    ArmorStand getHologram(StackedSpawner stackedSpawner);

    void removeHologram(StackedSpawner stackedSpawner);

    void performHologramClear();

    LivingEntity getLinkedEntity(StackedSpawner stackedSpawner);

    void setLinkedEntity(StackedSpawner stackedSpawner, LivingEntity livingEntity);

    void removeLinkedEntity(StackedSpawner stackedSpawner);

    void updateLinkedEntity(LivingEntity oldEntity, LivingEntity newEntity);

    void performLinkedEntitiesClear();

    <T extends Entity> T spawnEntityWithoutStacking(Location location, Class<T> type);

    void performKillAll();

    void saveDatabase();



}
