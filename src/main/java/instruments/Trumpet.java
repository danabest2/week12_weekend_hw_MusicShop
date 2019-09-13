package instruments;

public class Trumpet extends Instrument {
   private int noOfValves;
    public Trumpet(String name, String material, String colour, int noOfValves){
        super(name, material, colour);
        this.noOfValves = noOfValves;
    }

    public int getNoOfValves() {
        return noOfValves;
    }
}
