import java.util.Scanner;

public class OverloadedMethods {

    // Method to calculate factorial of a number
    public static int factorial(int n) {
        if (n <= 1)
            return 1;
        else
            return n * factorial(n - 1);
    }

    // Method to calculate factorial of each digit and return sum
    public static int sumOfFactorials(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }
        return sum;
    }

    // Overloaded method to calculate and print sum of factorials
    public static void calculateAndPrintSumOfFactorials(int num) {
        int sum = sumOfFactorials(num);
        System.out.println("Sum of factorials of digits: " + sum);
    }

    // Overloaded method to generate and print Fibonacci series
    public static void calculateAndPrintFibonacciSeries(int num1, int num2, int count) {
        int n1 = num1, n2 = num2;
        System.out.print("Fibonacci Series: ");
        System.out.print(n1 + " " + n2); // printing first two numbers
        for (int i = 2; i < count; i++) {
            int n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
        System.out.println();
    }

    // Overloaded method to generate and print geometric progression
    public static void calculateAndPrintGeometricProgression(int num, int ratio, int count) {
        System.out.print("Geometric Progression: ");
        int term = num;
        System.out.print(term);
        for (int i = 1; i < count; i++) {
            term *= ratio;
            System.out.print(" " + term);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a number: ");
        int inputNum = scanner.nextInt();

        // A. Calculate and print sum of factorials
        calculateAndPrintSumOfFactorials(inputNum);

        // B. Generate and print Fibonacci series
        calculateAndPrintFibonacciSeries(inputNum, inputNum + 1, inputNum);

        // C. Generate and print geometric progression
        calculateAndPrintGeometricProgression(inputNum, 3, inputNum);

        scanner.close();
    }
}
