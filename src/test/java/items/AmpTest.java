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
}
