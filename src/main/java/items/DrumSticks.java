package items;

public class DrumSticks extends Item {

    public DrumSticks(String name){
        super(name);
    }

    public double defaultBuyingPrice() {
        return 10;
    }

    public double priceForSelling() {

        return defaultBuyingPrice() * 1.2;
    }

    public double getProfit(){
        return this.priceForSelling() - this.defaultBuyingPrice();
    };
}
