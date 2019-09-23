import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Airport")
class AirportTest {
    Airport airport;

    @BeforeEach
    public void createAirportInstance(){
        airport = new Airport();
    }

    @Test
    @DisplayName("When passed a plane, it can land that plane")
    void landPlane(){
        Plane plane = new Plane();
        Boolean result = airport.lands(plane);
        assertTrue(result);
    }

    @Nested
    @DisplayName("The airpot")
    class planeTakeOff{
        @Test
        @DisplayName("allows a landed plane to take off")
        void takeOff(){
            Plane plane = new Plane();
            airport.lands(plane);
            Boolean result = airport.takeOff(plane);
            assertTrue(result);
        }
    }
}