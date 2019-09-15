package items;

public class MusicSheet extends Item {
    public MusicSheet(String name){
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
