import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void testAddition(){
        Calculator addCalculator = new Calculator();
        int result = addCalculator.add(3,5);
        assertEquals(result, 8);
    }

    @Test
    public void testSubtraction(){
        Calculator subCalculator = new Calculator();
        int result = subCalculator.subtract(5, 2);
        assertEquals(result, 3);
    }
}