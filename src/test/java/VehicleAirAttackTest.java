import Vehicles.VehicleAirAttack;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VehicleAirAttackTest {

    VehicleAirAttack airAttack;

    @Before
    public void before(){
        airAttack = new VehicleAirAttack("Stealth", 8, 4);
    }

    @Test
    public void canMove(){
        assertEquals("Stealth is flying!", airAttack.move());
    }

}
