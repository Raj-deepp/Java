// Write a program in java using constructor overloading concept to calculate the
// area of a rectangle having data members as length and breadth. Use default
// constructor to initialize the value of the data member to zero and parameterized
// constructor to initialize the value of data member according to the user input.


import java.util.Scanner;

public class Lab3_6 {
    float lenght;
    float breadth;
    float a_rec;

    Lab3_6(){
        System.out.println("\nThis is Default Constructor\n");
    }

    Lab3_6(float l, float b){
        lenght=l;
        breadth=b;
        a_rec=l*b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("\nEnter the length of the rectangle: ");
        float x=sc.nextFloat();
        System.out.print("Enter the breadth of the rectangle: ");
        float y=sc.nextFloat();

        Lab3_6 areaD=new Lab3_6();
        System.out.println("Default Constructor values:-");
        System.out.println("Length: "+areaD.lenght+"\nBreadth: "+areaD.breadth+"\nArea: "+areaD.a_rec);
        System.out.println("");

        System.out.println("Parameterized Constructor values:-");
        Lab3_6 areaP=new Lab3_6(x,y);
        System.out.println("Length: "+areaP.lenght+"\nBreadth: "+areaP.breadth+"\nArea: "+areaP.a_rec);
    }
}