import java.util.Scanner;

public class Main1 {

    static class InvalidInputNumberException extends Exception {
        InvalidInputNumberException(String message) {
            super(message);
        }
    }

    static void handleInvalidInputNumberException(int n) {
        String message = "Caught InvalidInputNumberException: ";
        String numString = String.valueOf(n);
        for (int i = 0; i < numString.length(); i++) {
            if (i % 2 == 0)
                message += Character.toLowerCase(numString.charAt(i));
            else
                message += Character.toUpperCase(numString.charAt(i));
        }
        System.out.println(message);
    }

    static boolean isPalindrome(int n) {
        int reversed = 0, original = n;
        while (n > 0) {
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }
        return reversed == original;
    }

    static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    static int factorial(int n) {
        if (n == 0)
            return 1;
        return n * factorial(n - 1);
    }

    static int fibonacci(int n) {
        if (n <= 1)
            return n;
        int a = 0, b = 1, temp;
        for (int i = 2; i <= n; i++) {
            temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        System.out.println("Choose operation:");
        System.out.println("1. Factorial Sum");
        System.out.println("2. Fibonacci Series");
        System.out.println("3. Geometric Progression");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1: {
                try {
                    if (n < 0)
                        throw new InvalidInputNumberException("");
                    int fact = factorial(n);
                    System.out.println("Factorial Sum: " + fact);
                    if (isPalindrome(fact))
                        System.out.println("Palindrome spotted: " + fact);
                    if (isPrime(fact))
                        System.out.println("Prime number spotted: " + fact);
                } catch (InvalidInputNumberException e) {
                    handleInvalidInputNumberException(n);
                }
                break;
            }
            case 2: {
                try {
                    if (n < 0)
                        throw new InvalidInputNumberException("");
                    System.out.println("Fibonacci Series:");
                    for (int i = 0; i < n; i++) {
                        int fib = fibonacci(i);
                        System.out.print(fib + " ");
                        if (isPalindrome(fib))
                            System.out.print("(Palindrome spotted: " + fib + ") ");
                        if (isPrime(fib))
                            System.out.print("(Prime number spotted: " + fib + ") ");
                    }
                    System.out.println();
                } catch (InvalidInputNumberException e) {
                    handleInvalidInputNumberException(n);
                }
                break;
            }
            case 3: {
                // Implement geometric progression here
                break;
            }
            default:
                System.out.println("Invalid choice");
        }
    }
}
