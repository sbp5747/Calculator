import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private Calculator calculator = new Calculator();

    public CalculatorTest() {
    }

    @Test
    public void testAdd() {
        double result = this.calculator.add(2.0, 3.0);
        Assertions.assertEquals(5.0, result);
    }

    @Test
    public void testSubtract() {
        double result = this.calculator.subtract(5.0, 3.0);
        Assertions.assertEquals(2.0, result);
    }

    @Test
    public void testMultiply() {
        double result = this.calculator.multiply(2.0, 3.0);
        Assertions.assertEquals(6.0, result);
    }

    @Test
    public void testDivide() {
        double result = this.calculator.divide(6.0, 3.0);
        Assertions.assertEquals(2.0, result);
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            this.calculator.divide(6.0, 0.0);
        });
    }

    @Test
    public void testIsPositive() {
        boolean result = this.calculator.isPositive(5);
        Assertions.assertTrue(result);
        result = this.calculator.isPositive(0);
        Assertions.assertFalse(result);
        result = this.calculator.isPositive(-5);
        Assertions.assertFalse(result);
    }

    @Test
    public void testIsNegative() {
        boolean result = this.calculator.isNegative(-5);
        Assertions.assertTrue(result);
        result = this.calculator.isNegative(0);
        Assertions.assertFalse(result);
        result = this.calculator.isNegative(5);
        Assertions.assertFalse(result);
    }
}
