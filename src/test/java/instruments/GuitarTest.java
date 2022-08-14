package instruments;

import org.junit.Before;
import org.junit.Test;
import shop.instruments.Guitar;
import shop.instruments.InstrumentType;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Gibson", "blue", InstrumentType.STRINGS, 6);


    }

    @Test
    public void getGuitarMake(){
        assertEquals("Gibson", guitar.getMake());
    }

    @Test
    public void getGuitarColour(){
        assertEquals("blue", guitar.getColour());
    }

    @Test
    public void getInstrumentType(){
        assertEquals(InstrumentType.STRINGS, guitar.getType());
    }

    @Test
    public void getNumberOfStrings(){
        assertEquals(6, guitar.getNumStrings());
    }

    @Test
    public void canPlaySong(){
        assertEquals("Strum strum", guitar.play());
    }
}
