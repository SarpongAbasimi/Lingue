import org.junit.Test;

import static org.junit.Assert.*;

public class DockingStationTest {
    private static final DockingStation newDockingStation = new DockingStation();

    @Test
    public void respondsToReleaseBike(){
        boolean result = newDockingStation.release_bike();
        assertEquals(result, true);
    }
}