// Using switch..case statement in Java, write a program to print the corresponding
// weekday after asking the user first to enter a valid day number of the current
// month.

import java.util.Scanner;

public class Lab1_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the day number of the week: ");
        int dayNum=sc.nextInt();
        switch(dayNum){
            case 1->System.out.println("SUNDAY");
            case 2->System.out.println("MONDAY");
            case 3->System.out.println("TUESDAY");
            case 4->System.out.println("WEDNESDAY");
            case 5->System.out.println("THURSDAY");
            case 6->System.out.println("FRIDAY");
            case 7->System.out.println("SATURDAY");
            default->System.out.println("Enter a valid day number.");
        }
    }
}
