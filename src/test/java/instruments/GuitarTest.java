package instruments;

import enums.GuitarType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void setUp(){
        guitar = new Guitar("Maria","plastic","red", "brumbrum",
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
    public void hasSound(){
        assertEquals("brumbrum", guitar.getSound());
    }

    @Test
    public void hasNoOfStrings(){
        assertEquals(7, guitar.getNoOfStrings());
    }

    @Test
    public void hasGuitarType(){
        assertEquals(GuitarType.YAMAHA, guitar.getGuitarType());
    }

    @Test
    public void hasDefaultBuyingPrice(){
        assertEquals(20, guitar.defaultBuyingPrice(),0.01);
    }

    @Test
    public void hasPriceForSelling(){
        assertEquals(26, guitar.priceForSelling(), 0.01);
    }
}
