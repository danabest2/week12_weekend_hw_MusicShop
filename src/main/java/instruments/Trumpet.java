package instruments;

public class Trumpet extends Instrument {
   private int noOfValves;
    public Trumpet(String name, String material, String colour, String sound,int noOfValves){
        super(name, material, colour, sound);
        this.noOfValves = noOfValves;
    }

    public int getNoOfValves() {

        return noOfValves;
    }

    public String play(String Sound) {
        return getSound();
    }
}
