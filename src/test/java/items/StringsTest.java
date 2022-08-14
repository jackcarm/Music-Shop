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
}
