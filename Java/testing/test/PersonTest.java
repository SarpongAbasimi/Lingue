import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {
    @Test
    public  void  canCreateInstanceOfPerson(){
        Person person = new Person("chris");
        String getUserName = person.getName();
        assertEquals(getUserName,"chris" );
    }
}