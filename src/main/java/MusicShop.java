import java.util.ArrayList;

import instruments.Guitar;
import items.Item;

public class MusicShop {

    private ArrayList<Item> stock1;
    public ArrayList<Guitar> stock2;

    public MusicShop(){
        stock1 = new ArrayList<Item>();
        stock2 = new ArrayList<Guitar>();
    }

    public void addItem(Item item) {

        this.stock1.add(item);
    }

    public void addInstrument(Guitar guitar) {
        
        this.stock2.add(guitar);
    }


    public int getItemCount() {
        return this.stock1.size();
    }

    public int getInstrumentCount() {
        
        return this.stock2.size();
    }
//not sure if the below is fully correct// not sure they were expecting one single stock//

    public Guitar RemoveInstrument(Guitar guitar) {
        return this.stock2.remove(0);
    }


   // public int itemsStockProfit() {
   // }
}

