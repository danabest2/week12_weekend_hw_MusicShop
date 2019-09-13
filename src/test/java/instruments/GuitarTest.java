package instruments;

import enums.GuitarType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void setUp(){
        guitar = new Guitar("Maria","plastic","red",
                7, GuitarType.YAMAHA );
    }

    @Test

    public void hasName(){
        assertEquals("Maria", guitar.getName());
    }

    @Test
    public void hasMaterial(){
        assertEquals("plastic", guitar.getMaterial());
    }

    @Test
    public void hasColour(){
        assertEquals("red", guitar.getColour());
    }

    @Test
    public void hasNoOfStrings(){
        assertEquals(7, guitar.getNoOfStrings());
    }

    @Test
    public void hasGuitarType(){
        assertEquals(GuitarType.YAMAHA, guitar.getGuitarType());
    }
}
