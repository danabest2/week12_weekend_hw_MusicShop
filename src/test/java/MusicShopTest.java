import enums.GuitarType;
import instruments.Guitar;
import items.DrumSticks;
import items.GuitarString;
import items.Item;
import items.MusicSheet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MusicShopTest {

    MusicShop musicShop;
    Guitar guitar;
    DrumSticks drumSticks;
    GuitarString guitarString;
    MusicSheet musicSheet;
    Item item;

    @Before
    public void setUp() throws Exception {
        musicShop = new MusicShop();
        guitar = new Guitar("CoolWave","fiber","brown",
                9, GuitarType.FENDER);
        drumSticks = new DrumSticks("YAMAHA");
        guitarString = new GuitarString("ClassC");
        musicSheet = new MusicSheet("ClassD");
        musicShop.addItem(drumSticks);
        musicShop.addItem(guitarString);
        musicShop.addItem(musicSheet);
        musicShop.addInstrument(guitar);
    }

    @Test
    public void canAddItem(){
        musicShop.addItem(musicSheet);
        assertEquals(4, musicShop.getItemCount());

    }
    //Q&A do we include the abstract class in count? they should be 3//
    //same question for the below//

    @Test
    public void canAddInstrument(){
        musicShop.addInstrument(guitar);
        assertEquals(2, musicShop.getInstrumentCount());

    }
}
