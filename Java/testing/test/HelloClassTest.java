import org.junit.Test;

import static org.junit.Assert.*;

public class HelloClassTest {
    @Test
    public void itSaysHello(){
        HelloClass sayHello = new HelloClass();
        String results = sayHello.sayHello("Chris");
        String expectedOutput = "Hello Chris";
        assertEquals(results,expectedOutput);
    }
}