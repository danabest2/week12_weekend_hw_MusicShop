package instruments;

import enums.GuitarType;

public class Guitar extends Instrument{
    private int noOfStrings;
    private GuitarType guitarType;

    public Guitar(String name, String material, String colour, int noOfStrings, GuitarType guitarType){
        super(name, material, colour);
                this.noOfStrings = noOfStrings;
                this.guitarType = guitarType;

    }

    public int getNoOfStrings() {
        return noOfStrings;
    }

    public GuitarType getGuitarType() {
        return guitarType;
    }
}
