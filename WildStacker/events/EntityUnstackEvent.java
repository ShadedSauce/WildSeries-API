package xyz.wildseries.wildstacker.api.events;

import org.bukkit.event.HandlerList;

import xyz.wildseries.wildstacker.api.objects.StackedEntity;

public class EntityUnstackEvent extends UnstackEvent {

    private static final HandlerList HANDLERS = new HandlerList();

    public EntityUnstackEvent(StackedEntity entity){
        super(entity);
    }

    public StackedEntity getEntity() {
        return (StackedEntity) object;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

}
