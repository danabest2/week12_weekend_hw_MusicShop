package items;

import behaviours.ISell;

public abstract class Item implements ISell {
    private String name;

    protected Item(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
