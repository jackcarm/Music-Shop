package instruments;

import org.junit.Before;
import org.junit.Test;

import shop.instruments.InstrumentType;
import shop.instruments.Saxophone;

import static org.junit.Assert.assertEquals;

public class SaxophoneTest {
    Saxophone saxophone;

    @Before
    public void before(){
        saxophone = new Saxophone("Yamaha", "gold", InstrumentType.BRASS, 20);


    }

    @Test
    public void getSaxMake(){
        assertEquals("Yamaha", saxophone.getMake());
    }

    @Test
    public void getSaxColour(){
        assertEquals("gold", saxophone.getColour());
    }

    @Test
    public void getInstrumentType(){
        assertEquals(InstrumentType.BRASS, saxophone.getType());
    }

    @Test
    public void getNumberOfValves(){
        assertEquals(20, saxophone.getNumValves());
    }

    @Test
    public void canPlaySong(){
        assertEquals("Jazzy Jazz", saxophone.play());
    }
}
