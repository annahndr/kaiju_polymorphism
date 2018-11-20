import Vehicles.VehicleLandAttack;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VehicleLandAttackTest {

    VehicleLandAttack landAttack;

    @Before
    public void before(){
        landAttack = new VehicleLandAttack("Destroyer", 6, 10);
    }

    @Test
    public void canMove(){
        assertEquals("Destroyer is moving!", landAttack.move());
    }


}
