// Write a program in java to ask the user to enter three numbers.
// a. Next, write conditions to check whether the entered numbers are
// integers.
// i. If any of the input numbers are not integers, then the program
// should print “Enter valid integer inputs,”
// ii. Else the program needs to find out the largest among the three
// numbers and print the output: “The largest number among the
// input integers is: <the_number_returned_by_the_program>”

import java.util.Scanner;

public class Lab2_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1=sc.nextInt();
        System.out.print("Enter number 2: ");
        int num2=sc.nextInt();
        System.out.print("Enter number 3: ");
        int num3=sc.nextInt();

        int largest=Math.max(Math.max(num1,num2), num3);
        System.out.println("The largest number among the input integer is: "+largest);
    }
}
