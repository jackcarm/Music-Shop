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

    @Test
    public void canGetPurchasePrice(){
        assertEquals(0, violin.getPurchasePrice(), 00.1);
    }

    @Test
    public void canSetPurchasePrice(){
        violin.setPurchasePrice(3000.00);
        assertEquals(3000, violin.getPurchasePrice(), 00.1);
    }

    @Test
    public void canGetSellPrice(){
        assertEquals(0, violin.getSellPrice(), 00.1);
    }

    @Test
    public void canSetSellPrice(){
        violin.setSellPrice(4500);
        assertEquals(4500, violin.getSellPrice(),00.1);
    }

    @Test
    public void canCalculateMarkup(){
        violin.setPurchasePrice(3000);
        violin.setSellPrice(4500);
        assertEquals(0.5, violin.calculateMarkup(), 0.01);
    }
}

