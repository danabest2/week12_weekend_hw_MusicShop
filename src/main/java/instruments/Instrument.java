package instruments;

public class Instrument {
    private String name;
    private String material;
    private String colour;

    public Instrument(String name, String material, String colour){
        this.name = name;
        this.material = material;
        this.colour = colour;
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
}
