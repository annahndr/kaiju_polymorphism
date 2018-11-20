import Kaiju.KaijuLarge;
import Kaiju.KaijuSmall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KaijuLargeTest {

    KaijuLarge mabel;

    @Before
    public void before(){
        mabel = new KaijuLarge("Mabel", 8, 20);
    }

    @Test
    public void canGetName() {
        assertEquals("Mabel", mabel.getName());
    }

    @Test
    public void canGetAttackValue() {
        assertEquals(20, mabel.getAttackValue());
    }

    @Test
    public void canGetHealthValue() {
        assertEquals(8, mabel.getHealthValue());
    }

    @Test
    public void canRoar() {
        assertEquals("ROOOAARR!", mabel.roar());
    }

}
