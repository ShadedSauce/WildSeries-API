package xyz.wildseries.wildstacker.api.events;

import org.bukkit.event.HandlerList;

import xyz.wildseries.wildstacker.api.objects.StackedSpawner;

public class SpawnerUnstackEvent extends UnstackEvent {

    private static final HandlerList HANDLERS = new HandlerList();

    public SpawnerUnstackEvent(StackedSpawner spawner){
        super(spawner);
    }

    public StackedSpawner getSpawner() {
        return (StackedSpawner) object;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

}
