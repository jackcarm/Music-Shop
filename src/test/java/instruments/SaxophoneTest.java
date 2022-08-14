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

    @Test
    public void canGetPurchasePrice(){
        assertEquals(0, saxophone.getPurchasePrice(), 00.1);
    }

    @Test
    public void canSetPurchasePrice(){
        saxophone.setPurchasePrice(1500.00);
        assertEquals(1500.00, saxophone.getPurchasePrice(), 00.1);
    }

    @Test
    public void canGetSellPrice(){
        assertEquals(0, saxophone.getSellPrice(), 00.1);
    }

    @Test
    public void canSetSellPrice(){
        saxophone.setSellPrice(2000);
        assertEquals(2000, saxophone.getSellPrice(),00.1);
    }

    @Test
    public void canCalculateMarkup(){
        saxophone.setPurchasePrice(1500);
        saxophone.setSellPrice(2000);
        assertEquals(0.33, saxophone.calculateMarkup(), 0.01);
    }
}
