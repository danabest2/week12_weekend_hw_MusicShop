import behaviours.ISell;
import items.MusicSheet;

import java.util.ArrayList;
import behaviours.ISell;
import instruments.Guitar;
import items.Item;

public class MusicShop {

    private ArrayList<Item> stock1;
    private ArrayList<Guitar> stock2;

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
}

