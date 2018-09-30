package xyz.wildseries.wildstacker.api.events;

import org.bukkit.event.HandlerList;
import xyz.wildseries.wildstacker.api.objects.StackedBlock;
import xyz.wildseries.wildstacker.api.objects.StackedEntity;

public class BlockUnstackEvent extends UnstackEvent {

    private static final HandlerList HANDLERS = new HandlerList();

    public BlockUnstackEvent(StackedBlock block){
        super(block);
    }

    public StackedBlock getBlock() {
        return (StackedBlock) object;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

}
