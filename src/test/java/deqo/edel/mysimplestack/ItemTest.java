package deqo.edel.mysimplestack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {

    Item it;

    @Before
    public void setUp() throws Exception {
        it = new Item(10);
    }

    @Test
    public void getEntier() {
        Assert.assertEquals(10, it.getEntier());
    }

    @Test
    public void setEntier() {
        Assert.assertEquals(10, it.getEntier());
        it.setEntier(9);
        Assert.assertEquals(9, it.getEntier());
    }
}