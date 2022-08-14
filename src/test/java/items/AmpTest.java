package items;

import org.junit.Before;
import org.junit.Test;
import shop.items.Amp;

import static org.junit.Assert.assertEquals;

public class AmpTest {

    Amp amp;

    @Before
    public void before(){
        amp = new Amp("Marshall", "MG15G");
    }

    @Test
    public void getItemMake(){
        assertEquals("Marshall", amp.getMake());
    }

    @Test
    public void getItemModel(){
        assertEquals("MG15G", amp.getModel());
    }

    @Test
    public void canGetPurchasePrice(){
        assertEquals(0, amp.getPurchasePrice(), 00.1);
    }

    @Test
    public void canSetPurchasePrice(){
        amp.setPurchasePrice(300.00);
        assertEquals(300, amp.getPurchasePrice(), 00.1);
    }

    @Test
    public void canGetSellPrice(){
        assertEquals(0, amp.getSellPrice(), 00.1);
    }

    @Test
    public void canSetSellPrice(){
        amp.setSellPrice(500);
        assertEquals(500, amp.getSellPrice(),00.1);
    }

    @Test
    public void canCalculateMarkup(){
        amp.setPurchasePrice(300);
        amp.setSellPrice(500);
        assertEquals(0.66, amp.calculateMarkup(), 0.01);
    }
}
