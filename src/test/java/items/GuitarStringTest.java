package items;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringTest {

    GuitarString guitarString;

    @Before
    public void setUp(){
        guitarString = new GuitarString("ClassA");
    }

    @Test
    public void hasName(){
        assertEquals("ClassA", guitarString.getName());
    }

}
