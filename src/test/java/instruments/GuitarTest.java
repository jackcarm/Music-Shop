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

    @Test
    public void canGetPurchasePrice(){
        assertEquals(0, guitar.getPurchasePrice(), 00.1);
    }

    @Test
    public void canSetPurchasePrice(){
        guitar.setPurchasePrice(1000.00);
        assertEquals(1000.00, guitar.getPurchasePrice(), 00.1);
    }

    @Test
    public void canGetSellPrice(){
        assertEquals(0, guitar.getSellPrice(), 00.1);
    }

    @Test
    public void canSetSellPrice(){
        guitar.setSellPrice(1200);
        assertEquals(1200, guitar.getSellPrice(),00.1);
    }

    @Test
    public void canCalculateMarkup(){
        guitar.setPurchasePrice(1000);
        guitar.setSellPrice(1200);
        assertEquals(0.2, guitar.calculateMarkup(), 0.01);
    }
}
