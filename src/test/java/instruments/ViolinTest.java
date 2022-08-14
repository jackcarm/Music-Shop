package instruments;

import org.junit.Before;
import org.junit.Test;
import shop.instruments.InstrumentType;

import shop.instruments.Violin;

import static org.junit.Assert.assertEquals;

public class ViolinTest {

    Violin violin;

    @Before
    public void before(){
        violin = new Violin("Scala Vilagio", "brown", InstrumentType.STRINGS, 4);


    }

    @Test
    public void getViolinMake(){
        assertEquals("Scala Vilagio", violin.getMake());

    }

    @Test
    public void getViolinColour(){
        assertEquals("brown", violin.getColour());
    }

    @Test
    public void getInstrumentType(){
        assertEquals(InstrumentType.STRINGS, violin.getType());
    }

    @Test
    public void getNumberOfStrings(){
        assertEquals(4, violin.getNumStrings());
    }

    @Test
    public void canPlaySong(){
        assertEquals("Plink Plonk", violin.play());
    }
}

