import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        double result = calculator.add(2, 3);
        Assertions.assertEquals(5, result);
    }

    @Test
    public void testSubtract() {
        double result = calculator.subtract(5, 3);
        Assertions.assertEquals(2, result);
    }

    @Test
    public void testMultiply() {
        double result = calculator.multiply(2, 3);
        Assertions.assertEquals(6, result);
    }

    @Test
    public void testDivide() {
        double result = calculator.divide(6, 3);
        Assertions.assertEquals(2, result);
        Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.divide(6, 0));
    }

    @Test
    public void testIsPositive() {
        boolean result = calculator.isPositive(5);
        Assertions.assertTrue(result);

        result = calculator.isPositive(0);
        Assertions.assertFalse(result);

        result = calculator.isPositive(-5);
        Assertions.assertFalse(result);
    }

    @Test
    public void testIsNegative() {
        boolean result = calculator.isNegative(-5);
        Assertions.assertTrue(result);

        result = calculator.isNegative(0);
        Assertions.assertFalse(result);

        result = calculator.isNegative(5);
        Assertions.assertFalse(result);
    }
}
