package creationalpattern.builderpattern.impl;

import creationalpattern.builderpattern.Item;
import creationalpattern.builderpattern.Packing;

public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
