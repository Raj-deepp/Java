import java.util.Scanner;
public class Lab7_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String inputString = scanner.nextLine();
        String caseChangedString = changeCase(inputString);
        System.out.println("The string after changing the case is " + caseChangedString);
        String reversedString = new StringBuilder(inputString).reverse().toString();
        System.out.println("The string after reversing is " + reversedString);
        System.out.print("Enter the second string for comparison: ");
        String secondString = scanner.nextLine();
        System.out.println("The difference between ASCII value is " +
                (inputString.charAt(0) - secondString.charAt(0)));
        System.out.print("Enter the string to be inserted into first string: ");
        String stringToInsert = scanner.nextLine();
        System.out.println("The string after insertion is: " + inputString + " " + stringToInsert);
        System.out.println("Uppercase: " + inputString.toUpperCase());
        System.out.println("Lowercase: " + inputString.toLowerCase());
        System.out.print("Enter a character: ");
        char character = scanner.next().charAt(0);
        int position = inputString.indexOf(character);
        if (position != -1) {
            System.out.println("Position of entered character: " + (position + 1));
        } else {
            System.out.println("Entered character is not present");
        }
        if (inputString.equals(reversedString)) {
            System.out.println("Entered string is palindrome");
        } else {
            System.out.println("Entered string is not a palindrome");
        }
        int words = inputString.split("\\s+").length;
        int vowels = countVowels(inputString);
        int consonants = inputString.length() - vowels - (words - 1);
        System.out.println("No. of words: " + words);
        System.out.println("No. of vowels: " + vowels);
        System.out.println("No. of consonants: " + consonants);
        scanner.close();
    }
    private static String changeCase(String input) {
        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] = Character.isUpperCase(chars[i]) ?
                    Character.toLowerCase(chars[i]) :
                    Character.toUpperCase(chars[i]);
        }
        return new String(chars);
    }
    private static int countVowels(String input) {
        int count = 0;
        for (char c : input.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }
}