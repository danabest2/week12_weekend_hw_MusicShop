package instruments;

import enums.SaxophoneType;

public class Saxophone extends Instrument{
    private SaxophoneType saxophoneType;

    public Saxophone(String name, String material, String colour, SaxophoneType saxophoneType){
        super(name, material, colour);
        this.saxophoneType = saxophoneType;
    }

    public SaxophoneType getSaxophoneType() {
        return saxophoneType;
    }
}
