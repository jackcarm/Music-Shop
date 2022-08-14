package instruments;

import org.junit.Before;
import org.junit.Test;
import shop.Shop;
import shop.instruments.Guitar;
import shop.instruments.InstrumentType;
import shop.instruments.Saxophone;
import shop.items.Amp;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Guitar guitar;
    Saxophone saxophone;
    Amp amp;

    @Before
    public void before(){
        shop = new Shop("JCMusic");
        guitar = new Guitar("Gibson", "blue", InstrumentType.STRINGS, 6);
        saxophone = new Saxophone("Yamaha", "gold", InstrumentType.BRASS, 20);
        amp = new Amp("Marshall", "MG15G");
    }

    @Test
    public void getShopName(){
        assertEquals("JCMusic", shop.getName());
    }

    @Test
    public void getShopStock(){
        assertEquals(0, shop.getStock());
    }

    @Test
    public void canAddItemsToStock(){
        shop.addToStock(guitar, saxophone);
        assertEquals(2, shop.getStock());
    }

    @Test
    public void canRemoveItemsFromStock(){
        shop.addToStock(guitar, saxophone);
        shop.removeFromStock(guitar);
        assertEquals(1, shop.getStock());
    }
}
