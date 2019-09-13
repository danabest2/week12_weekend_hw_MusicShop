package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {


    Trumpet trumpet;

    @Before
    public void setUp(){
        trumpet = new Trumpet("Mona","fiber","silver",5);
    }

    @Test

    public void hasName(){
        assertEquals("Mona", trumpet.getName());
    }

    @Test
    public void hasMaterial(){
        assertEquals("fiber", trumpet.getMaterial());
    }

    @Test
    public void hasColour(){
        assertEquals("black", trumpet.getColour());
    }
    @Test
    public void hasNoOfValves(){
        assertEquals(5, trumpet.getNoOfValves());
    }
}
