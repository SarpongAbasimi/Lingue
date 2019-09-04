import org.junit.Test;

import static org.junit.Assert.*;

public class TrackNameTest {
    @Test
    public void itHasAddNameMethod(){
        TrackName trackNewName = new TrackName();
        assertEquals(trackNewName.addName("Chris"), true);
    }
}