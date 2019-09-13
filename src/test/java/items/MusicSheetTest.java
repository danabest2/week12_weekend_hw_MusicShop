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
}
