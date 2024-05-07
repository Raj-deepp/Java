// Write a program in java to ask three different users to enter their:
// a. Name
// b. roll no
// c. section,
// d. and branch
// Followed by printing the details of each user in separate lines.

import java.util.Scanner;

public class Lab1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        for(int i=1;i<=3;i++){

            System.out.println("Enter details for User " + i + ":-");

            System.out.print("Enter your name: ");
            String name = sc.nextLine();
            System.out.print("Enter your roll no.: ");
            int roll = sc.nextInt();
            System.out.print("Enter your section: ");
            int sec = sc.nextInt();
            // System.out.println("Enter your xy: ");
            String xy = sc.nextLine();
            System.out.print("Enter your branch: ");
            String branch = sc.nextLine();
 
            System.out.println("\nDetails of User" +i );
            System.out.println("Name: "+name);
            System.out.println("Roll no.: "+roll);
            System.out.println("Section: "+sec);
            System.out.println("Branch: "+branch+"\n");
    }
}
}