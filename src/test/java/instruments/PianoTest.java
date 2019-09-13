package instruments;

import enums.PianoType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {


    Piano piano;

    @Before
    public void setUp(){
        piano = new Piano("James","fiber","black",
                1970, PianoType.Grand );
    }

    @Test

    public void hasName(){
        assertEquals("James", piano.getName());
    }

    @Test
    public void hasMaterial(){
        assertEquals("fiber", piano.getMaterial());
    }

    @Test
    public void hasColour(){
        assertEquals("black", piano.getColour());
    }

    @Test
    public void hasProdYear(){
        assertEquals(1970, piano.getProdYear());
    }

    @Test
    public void hasPianoType(){
        assertEquals(PianoType.Grand, piano.getPianoType());
    }

}
