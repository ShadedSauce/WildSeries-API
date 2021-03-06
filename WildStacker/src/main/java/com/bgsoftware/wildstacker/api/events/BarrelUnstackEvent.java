package com.bgsoftware.wildstacker.api.events;

import com.bgsoftware.wildstacker.api.objects.StackedBarrel;
import org.bukkit.event.HandlerList;

@SuppressWarnings("unused")
public class BarrelUnstackEvent extends UnstackEvent {

    private static final HandlerList HANDLERS = new HandlerList();

    public BarrelUnstackEvent(StackedBarrel barrel, int unstackAmount){
        super(barrel, unstackAmount);
    }

    public StackedBarrel getBarrel() {
        return (StackedBarrel) object;
    }

    public int getAmount(){
        return unstackAmount;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

}
