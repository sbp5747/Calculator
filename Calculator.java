import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Calculator {
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }

    public boolean isPositive(int a) {
        return a > 0;
    }

    public boolean isNegative(int a) {
        return a < 0;
    }
}
