package instruments;

import org.junit.Before;
import org.junit.Test;
import shop.Shop;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;

    @Before
    public void before(){
        shop = new Shop("JCMusic");
    }

    @Test
    public void getShopName(){
        assertEquals("JCMusic", shop.getName());
    }

    @Test
    public void getShopStock(){
        assertEquals(0, shop.getStock());
    }
}
