package instruments;

import enums.SaxophoneType;

public class Saxophone extends Instrument{
    private SaxophoneType saxophoneType;

    public Saxophone(String name, String material, String colour, String sound, SaxophoneType saxophoneType){
        super(name, material, colour, sound);
        this.saxophoneType = saxophoneType;
    }

    public SaxophoneType getSaxophoneType() {
        return saxophoneType;
    }

    public String play(String Sound) {
        return getSound();
    }
}
