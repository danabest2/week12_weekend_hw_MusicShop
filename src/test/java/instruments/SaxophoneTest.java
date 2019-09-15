package instruments;

import enums.SaxophoneType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxophoneTest {

    Saxophone saxophone;

    @Before
    public void setUp(){
        saxophone = new Saxophone(
                "Ben","fiber","yellow", "truptrup", SaxophoneType.Alto);
    }

    @Test

    public void hasName(){
        assertEquals("Ben", saxophone.getName());
    }

    @Test
    public void hasMaterial(){
        assertEquals("fiber", saxophone.getMaterial());
    }

    @Test
    public void hasColour(){
        assertEquals("yellow", saxophone.getColour());
    }

    @Test
    public void hasSound(){
        assertEquals("truptrup", saxophone.getSound());
    }

    @Test
    public void hasType(){
        assertEquals(SaxophoneType.Alto, saxophone.getSaxophoneType());
    }
}
