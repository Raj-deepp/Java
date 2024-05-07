// Write a java program that asks the user to enter the cell values of a 3 x 3
// matrix through the command line, followed by printing the sum of each
// diagonal (left & right) element separately.

import java.util.Scanner;

public class Lab2_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrix = new int[3][3];

        System.out.print("Enter the values for the 3x3 matrix(row wise manner): ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int leftDiagonalSum = 0;
        for (int i = 0; i < 3; i++) {
            leftDiagonalSum += matrix[i][i];
        }

        int rightDiagonalSum = 0;
        for (int i = 0; i < 3; i++) {
            rightDiagonalSum += matrix[i][2 - i];
        }

        System.out.println("\nSum of the left diagonal: " + leftDiagonalSum);
        System.out.println("Sum of the right diagonal: " + rightDiagonalSum);
}
}