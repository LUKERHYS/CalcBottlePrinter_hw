import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calc;

    @Before
    public void before(){
        calc = new Calculator();
    }

    @Test
    public void canAdd(){
        assertEquals(6, calc.add(3, 3));
    }

    @Test
    public void canSubtract(){
        assertEquals(3, calc.subtract(6, 3));
    }

    @Test
    public void canMultiply(){
        assertEquals(10, calc.multiply(2, 5));
    }

    @Test
    public void canDivide(){
        assertEquals(2.5, calc.divide(5.0, 2.0), 0.01);
    }

}
