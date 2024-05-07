// Write a Java class which has a method called ProcessInput(). This method checks
// the number entered by the user. If the entered number is negative then throw an
// user defined exception called NegativeNumberException, otherwise it displays
// the double value of the entered number.

import java.util.Scanner;

// Define custom exception for negative numbers
class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class NumberProcessor {
    public void ProcessInput(int number) throws NegativeNumberException {
        if (number < 0) {
            throw new NegativeNumberException("Number should be positive");
        } else {
            System.out.println("Double value: " + ((double) number));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumberProcessor processor = new NumberProcessor();

        try {
            System.out.print("Enter a number: ");
            int userInput = scanner.nextInt();
            processor.ProcessInput(userInput);
        } catch (NegativeNumberException e) {
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: " + e.getClass().getSimpleName() + ": " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
