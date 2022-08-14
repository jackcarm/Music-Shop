package items;

import org.junit.Before;
import org.junit.Test;
import shop.items.Strings;

import static org.junit.Assert.assertEquals;

public class StringsTest {

    Strings strings;

    @Before
    public void before() {
        strings = new Strings("Gibson", "Premium");
    }

    @Test
    public void getStringMake(){
        assertEquals("Gibson", strings.getMake());
    }

    @Test
    public void getStringModel(){
        assertEquals("Premium", strings.getModel());
    }

    @Test
    public void canGetPurchasePrice(){
        assertEquals(0, strings.getPurchasePrice(), 00.1);
    }

    @Test
    public void canSetPurchasePrice(){
        strings.setPurchasePrice(30.00);
        assertEquals(30, strings.getPurchasePrice(), 00.1);
    }

    @Test
    public void canGetSellPrice(){
        assertEquals(0, strings.getSellPrice(), 00.1);
    }

    @Test
    public void canSetSellPrice(){
        strings.setSellPrice(40);
        assertEquals(40, strings.getSellPrice(),00.1);
    }

    @Test
    public void canCalculateMarkup(){
        strings.setPurchasePrice(30);
        strings.setSellPrice(40);
        assertEquals(0.33, strings.calculateMarkup(), 0.01);
    }
}
