// Write a Java program to handle an ArithmeticException using try, catch, and
// finally block

public class Lab6_3 {
    public static void main(String[] args) {
        try {
            int numerator = 10;
            int denominator = 0;
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception occurred: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed successfully.");
        }
    }
}
