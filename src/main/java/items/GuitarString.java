package items;

public class GuitarString extends Item {

    public GuitarString(String name){
        super(name);
    }

    public double defaultBuyingPrice() {
        return 10;
    }

    public double priceForSelling() {
        return defaultBuyingPrice() * 1.2;
    }
}
