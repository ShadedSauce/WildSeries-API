package xyz.wildseries.wildstacker.api.events;

import org.bukkit.event.HandlerList;

import xyz.wildseries.wildstacker.api.objects.StackedBlock;

public class BlockStackEvent extends StackEvent {

    private static final HandlerList HANDLERS = new HandlerList();

    public BlockStackEvent(StackedBlock block, StackedBlock target){
        super(block, target);
    }

    public StackedBlock getBlock() {
        return (StackedBlock) object;
    }

    public StackedBlock getTarget() {
        return (StackedBlock) target;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

}
