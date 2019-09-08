import org.junit.Test;

import static org.junit.Assert.*;

public class DockingStationTest {
    private  DockingStation newDockingStation = new DockingStation();

    @Test
    public void respondsToReleaseBike(){
        Bikes bike = newDockingStation.releaseBike();
        boolean result  = bike instanceof Bikes;
        assertEquals(result, true);
    }
}