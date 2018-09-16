package xyz.wildseries.wildstacker.api.holograms;

import xyz.wildseries.wildstacker.api.objects.StackedSpawner;

public interface Hologram {

    StackedSpawner getStackedSpawner();

    void update();

    void despawn();

}
