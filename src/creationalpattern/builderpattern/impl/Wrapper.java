package creationalpattern.builderpattern.impl;

import creationalpattern.builderpattern.Packing;

public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "Wrapper";
    }
}
