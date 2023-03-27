public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");

        Calculator calc = new Calculator();

        System.out.println("Sum of 5 and 6 is " + calc.add(5,6));
        System.out.println("Difference of 5 and 6 is " + calc.subtract(5,6));
        System.out.println("Multiple of 5 and 6 is " + calc.multiply(5,6));
        System.out.println("Division of 5 and 6 is " + calc.divide(5,6));
        System.out.println("Is 5 a positive number: " + calc.isPositive(5));
        System.out.println("Is -5 a  number: " + calc.isNegative(-5));


    }
}