import java.util.Scanner;

public class StringEncryptorDecryptor {
    public static String encrypt(String input) {
        StringBuilder encrypted = new StringBuilder();
        for (int i=0; i<input.length(); i++) {
            char ch = input.charAt(i);
            char encryptedChar;
            if (Character.isLowerCase(ch)) {
                encryptedChar = (char)('a'+((ch-'a'+2)%26));
            } else if (Character.isUpperCase(ch)) {
                encryptedChar = (char)('A'+((ch-'A'+2)%26));
            } else {
                encryptedChar= ch;
            }
            encrypted.append(encryptedChar);
        }
        return encrypted.toString();
    }

    public static String decrypt(String encrypted) {
        StringBuilder decrypted = new StringBuilder();
        for (int i = 0; i < encrypted.length(); i++) {
            char ch = encrypted.charAt(i);
            char decryptedChar;
            if (Character.isLowerCase(ch)) {
                decryptedChar= (char)('a'+((ch-'a'+24)%26));
            } else if (Character.isUpperCase(ch)) {
                decryptedChar= (char) ('A'+((ch-'A'+24)%26));
            } else {
                decryptedChar= ch;
            }
            decrypted.append(decryptedChar);
        }
        return decrypted.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to be encrypted:");
        String inputString = sc.nextLine();
        String encryptedString = encrypt(inputString);
        System.out.println("Encrypted string: " + encryptedString);
        String decryptedString = decrypt(encryptedString);
        System.out.println("Decrypted string: " + decryptedString);
    }
}