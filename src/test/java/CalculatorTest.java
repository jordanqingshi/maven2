import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test

    public void testAdd() {
        Calculator c = new Calculator();
        int result = c.add(1, 3);
        assertEquals(result, 3);
    }

    @Test

    public void testSub() {
        Calculator c = new Calculator();
        int result = c.sub(2, 1);
        assertEquals(result, 1);
    }

}