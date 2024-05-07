// Write a class Account containing acc_no, balance as data members and two
// methods as input() for taking input from user and disp() method to display the
// details. Create a subclass Person which has name and aadhar_no as extra data
// members and override disp() function. Write the complete program to take and
// print details of three persons.

import java.util.Scanner;

class Account{
    int acc_num;
    double balance;

    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter account number: ");
        acc_num=sc.nextInt();
        System.out.print("Enter account balance: ");
        balance=sc.nextDouble();
    }

    void display(){
        System.out.println("Account number: "+acc_num);
        System.out.println("Account balance: "+balance);
    }
}

class Person extends Account{
    Scanner sc=new Scanner(System.in);
    String name;
    long adh_num;
    
    void display(){
        super.display();
        System.out.print("Enter your name: ");
        name=sc.nextLine();
        System.out.print("Enter adhar card nummber: ");
        adh_num=sc.nextLong();

        System.out.println("Name: "+name);
        System.out.println("Adhar Number: "+adh_num);
    }
}

public class Lab4_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter total number of Account Holder: ");
        int size=sc.nextInt();
        Person [] Holder=new Person[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter details for Account holder: "+(i+1));
            Holder[i]=new Person();
            Holder[i].input();
            Holder[i].display();
        }
    }
}
