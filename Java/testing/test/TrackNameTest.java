import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TrackNameTest {
    @Test
    public void itHasAddNameMethod(){
        TrackName trackNewName = new TrackName();
        trackNewName.addName(("chris"));
        ArrayList<String> container  = trackNewName.container;
        assertEquals(container.size(),1);
        assertEquals(container.contains("chris"), true);
    }

    @Test
    public  void showNames(){
        TrackName trackAnotherName = new TrackName();
        trackAnotherName.addName("chris");
        trackAnotherName.addName("ben");
        ArrayList<String>showStoredNames = trackAnotherName.showNames();
    }
}