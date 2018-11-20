import Kaiju.KaijuSmall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KaijuSmallTest {

    KaijuSmall elspeth;

    @Before
    public void before(){
        elspeth = new KaijuSmall("Elspeth", 10, 5);
    }

    @Test
    public void canGetName() {
        assertEquals("Elspeth", elspeth.getName());
    }

    @Test
    public void canGetAttackValue() {
        assertEquals(5, elspeth.getAttackValue());
    }

    @Test
    public void canGetHealthValue() {
        assertEquals(10, elspeth.getHealthValue());
    }

    @Test
    public void canRoar() {
        assertEquals("Rooarrrrr!", elspeth.roar());
    }
}
