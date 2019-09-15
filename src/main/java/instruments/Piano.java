package instruments;

import enums.PianoType;

public class Piano extends Instrument{
    private int prodYear;
    private PianoType pianoType;

    public Piano(String name, String material, String colour,String sound, int prodYear, PianoType pianoType){
        super(name, material, colour, sound);
        this.prodYear = prodYear;
        this.pianoType = pianoType;

    }

    public int getProdYear() {
        return prodYear;
    }

    public PianoType getPianoType() {
        return pianoType;
    }

    public String play(String Sound) {
        return getSound();
    }
}
