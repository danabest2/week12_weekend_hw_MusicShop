package items;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MusicSheetTest {
    MusicSheet musicSheet;

    @Before
    public void setUp(){
        musicSheet = new MusicSheet("ClassB");
    }

    @Test
    public void hasName(){
        assertEquals("ClassB", musicSheet.getName());
    }

    @Test
    public void hasDefaultBuyingPrice(){
        assertEquals(10, musicSheet.defaultBuyingPrice(), 0.01);
    }

    @Test
    public void hasPriceForSelling(){
        assertEquals(12, musicSheet.priceForSelling(), 0.01);
    }
    @Test

    public void calcMusicScheetPofit() {
        assertEquals(2, musicSheet.getProfit(), 0.01);
    }
}
