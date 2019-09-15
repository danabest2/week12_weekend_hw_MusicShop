package instruments;

import behaviours.IPlay;

public abstract class Instrument implements IPlay {
    private String name;
    private String material;
    private String colour;
    private String sound;

    public Instrument(String name, String material, String colour, String sound){
        this.name = name;
        this.material = material;
        this.colour = colour;
        this.sound = sound;
    }

    public String getName() {
        return name;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public String getSound() {
        return sound;
    }


    public String play(String Sound) {
        final String sound = getSound();
        return sound;
    }
}
//not sure I was suppose to include the sound property in Instrument abstract class and an then
//to implement IPlay;