import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
@DisplayName("The Bike class")
class BikeTest {
    Bike bike;

    @BeforeEach
    void bike(){
        bike = new Bike();
    }

    @Test
    @DisplayName("Test that bike is working")
    void bikeIsWorking(){
        Boolean result = bike.working();
        assertTrue(result);
    }

}