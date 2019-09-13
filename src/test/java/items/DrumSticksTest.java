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



}
