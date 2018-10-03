package xyz.wildseries.wildstacker.api.events;

import org.bukkit.event.HandlerList;
import xyz.wildseries.wildstacker.api.objects.StackedBarrel;

public class BarrelUnstackEvent extends UnstackEvent {

    private static final HandlerList HANDLERS = new HandlerList();

    public BarrelUnstackEvent(StackedBarrel barrel){
        super(barrel);
    }

    public StackedBarrel getBarrel() {
        return (StackedBarrel) object;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

}
