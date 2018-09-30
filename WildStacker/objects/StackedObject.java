package xyz.wildseries.wildstacker.api.objects;

public interface StackedObject<T> {

    int getStackAmount();

    void setStackAmount(int stackAmount, boolean updateName);

    void remove();

    void updateName();

    T tryStack();

    boolean canStackInto(StackedObject stackedObject);

    boolean tryStackInto(StackedObject stackedObject);

    boolean tryUnstackByOne();

    boolean isSimilar(StackedObject stackedObject);

}
