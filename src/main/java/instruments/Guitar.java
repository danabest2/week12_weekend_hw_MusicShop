package instruments;

import behaviours.IPlay;
import behaviours.ISell;
import enums.GuitarType;

public class Guitar extends Instrument implements ISell, IPlay {
    private int noOfStrings;
    private GuitarType guitarType;

    public Guitar(String name, String material, String colour, String sound, int noOfStrings, GuitarType guitarType){
        super(name, material, colour, sound);
                this.noOfStrings = noOfStrings;
                this.guitarType = guitarType;

    }

    public int getNoOfStrings() {
        return noOfStrings;
    }

    public GuitarType getGuitarType() {
        return guitarType;
    }

    public double defaultBuyingPrice() {
        return 20;
    }

    public double priceForSelling() {
        return defaultBuyingPrice() * 1.3;
    }

    public String getPlaySound() {
        return getSound();
    }


    //public String play() {
        //return this.sound;
    //}

    public String play(String Sound) {
        return getSound();
    }
}
