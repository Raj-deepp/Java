// Illustrate the usage of abstract class with following Java classes:
// a. An abstract class ‘student’ with two data members roll no, reg no, a method
// getinput() and an abstract method course()
// b. A subclass ‘kiitian’ with course() method implementation
// Write the driver class to print the all details of a kiitian object.
// Input: Rollno - 2205180
// Registration no - 1234567890
// Output: Rollno - 2205180
// Registration no - 1234567890
// Course - B.Tech. (Computer Science & Engg)

import java.util.Scanner;

abstract class student{
    int roll;
    long regno;

    abstract void course();

    void getInput(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter roll no.: ");
        int roll=sc.nextInt();
        System.out.print("Enter registration no.: ");
        long regno=sc.nextLong();
        this.roll=roll;
        this.regno=regno;
    }
}

class Kittian extends student{
    void course(){
        System.out.println("Course - B.Tech. (Computer Science & Engg.)");
    }
}

public class Lab5_1 {
    public static void main(String[] args) {
        Kittian k=new Kittian();
        k.getInput();

        System.out.println("Roll No.: "+k.roll);
        System.out.println("Registration No.: "+k.regno);
        k.course();
    }
}
