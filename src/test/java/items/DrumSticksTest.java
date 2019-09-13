package items;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class DrumSticksTest {

    DrumSticks drumSticks;

    @Before
    public void setUp(){
        drumSticks = new DrumSticks("Yamaha");
    }

    @Test
    public void hasName(){
        assertEquals("Yamaha", drumSticks.getName());
    }

    @Test
    public void hasDefaultBuyingPrice(){
        assertEquals(10, drumSticks.defaultBuyingPrice(), 0.01);
    }

    @Test
    public void hasPriceForSelling(){
        assertEquals(12, drumSticks.priceForSelling(), 0.01);
    }

}
