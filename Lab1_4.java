// Write a program in Java that first asks the user to input any number, followed by
// checking if the number entered by the user is a palindrome or not. If the number is
// a palindrome, then output the message “Palindrome successfully detected” or else
// “The input number is not a palindrome” on the console.

import java.util.Scanner;

public class Lab1_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        int oglNum=num;
        int revNum=0;
        while(num!=0){
            int dig=num%10;
            revNum=revNum*10+dig;
            num=num/10;
        }
        if(oglNum==revNum){
            System.out.println("Palindrome successfully detected.");
        }
        else{
            System.out.println("The input number is not a palindrome.");
        }
    }
}
