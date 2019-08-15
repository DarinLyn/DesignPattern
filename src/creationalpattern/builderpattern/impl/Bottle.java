package creationalpattern.builderpattern.impl;

import creationalpattern.builderpattern.Packing;

public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
