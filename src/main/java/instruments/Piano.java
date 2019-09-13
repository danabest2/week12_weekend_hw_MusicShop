package instruments;

import enums.PianoType;

public class Piano extends Instrument{
    private int prodYear;
    private PianoType pianoType;

    public Piano(String name, String material, String colour, int prodYear, PianoType pianoType){
        super(name, material, colour);
        this.prodYear = prodYear;
        this.pianoType = pianoType;

    }

    public int getProdYear() {
        return prodYear;
    }

    public PianoType getPianoType() {
        return pianoType;
    }
}
