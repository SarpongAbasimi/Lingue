import org.junit.Test;

import static org.junit.Assert.*;

public class BikesTest {
    private Bikes bike = new Bikes();

    @Test
    public void isBikeWorking(){
        boolean result = bike.working();
        assertEquals(result, true);
    }
}