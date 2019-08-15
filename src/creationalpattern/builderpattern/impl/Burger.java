package creationalpattern.builderpattern.impl;

import creationalpattern.builderpattern.Item;
import creationalpattern.builderpattern.Packing;

public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
