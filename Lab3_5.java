// Write a program in java using roll, name, and cgpa as data members to input
// the details of n students, followed by displaying their values. Next, display the
// name of the student having the lowest cgpa.

import java.util.Scanner;

class student{
    int roll;
    String name;
    float cgpa;

    void read(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter total number of students: ");
        int total=sc.nextInt();
        sc.nextLine();
        
        student[] students = new student[total];
        
        for(int i=0;i<total;i++){
            students[i] = new student();
            System.out.println("Enter detail for student "+(i+1)+": ");
            System.out.print("Enter roll number of student: ");
            students[i].roll=sc.nextInt();
            sc.nextLine();
            System.out.print("Enter name of student: ");
            students[i].name=sc.nextLine();
            System.out.print("Enter CGPA of student: ");
            students[i].cgpa=sc.nextFloat();
            System.out.println();
        }

        System.out.println("Details of all the students:");
        for (int i = 0; i < total; i++) {
            System.out.println("Student " + (i+1) + " details:");
            System.out.println("Roll Number: " + students[i].roll);
            System.out.println("Name: " + students[i].name);
            System.out.println("CGPA: " + students[i].cgpa);
            System.out.println();
        }

        float lowest=students[0].cgpa;
        String lowstudName=students[0].name;
        for(int i=1;i<total;i++){
            if (students[i].cgpa<lowest) {
                lowest=students[i].cgpa;
                lowstudName=students[i].name;
            }
        }
        System.out.println("");
        System.out.println("Student with lowest CGPA:");
        System.out.println("Name: "+lowstudName);
        System.out.println("CGPA: "+lowest);
    }

}

public class Lab3_5 {
    public static void main(String[] args) {
        student stud=new student();
        stud.read();
    }
}

