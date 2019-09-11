import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
@DisplayName("Docking Station class")
class DockingStationTest {
    DockingStation dockingStation;

    @BeforeEach
    @DisplayName("Before each test create a docking station instance")
    public void dockingStation(){
        dockingStation = new DockingStation();
    }

    @Nested
    @DisplayName("When docking a bike at the docking station")
    class DockingAtDockingStation{

        @Test
        @DisplayName("Error is thrown when capacity is full")
        void  checkError(){
            Bike bike = new Bike();
            byte max_capacity = dockingStation.getCapacity();
            String errorMessage = "Maximum capacity of: " + max_capacity + " Reached";
            for(int number = 0; number <= 20; number++){
                dockingStation.dockBike(bike);
            }
           RuntimeException error =  assertThrows(RuntimeException.class, ()->{
               dockingStation.dockBike(bike);
           });
            assertEquals(error.getMessage(),errorMessage );
        }

        @Test
        @DisplayName("Error is thrown when there is no bike  at the docking station")
        void itThrownErrorIfNoBike(){
            String OutErrorMessage = "There are no bikes available";
            RuntimeException errorMessage = assertThrows(RuntimeException.class, ()->{
                dockingStation.releaseBike();
            });
            assertEquals(errorMessage.getMessage(),OutErrorMessage);
        }
    }

    @Test
    @DisplayName("When a bike is docked it is added to available bikes")
    void testingForDockingBike(){
        Bike newBike = new Bike();
        dockingStation.dockBike(newBike);
        assertTrue(dockingStation.bikesAvailable.contains(newBike));
    }
}