// Write a program in Java to define a class Rectangle having data members:
// length & breadth, and three methods called read(), calculate() and display() to
// read the values of length & breadth, calculate the area and perimeter of the
// rectangle and display the result respectively. Finally, create two objects of the
// Rectangle class, ask and input the respective dimensions (length,breadth) from
// the user, and then calculate and display their respective areas and perimeters.

import java.util.Scanner;

class rectangle{
    float lenght;
    float breadth;
    float perimeter;
    float area;

    void read(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        lenght=sc.nextFloat();
        System.out.print("Enter the breadth of the rectangle: ");
        breadth=sc.nextFloat();
    }

    void calculate(){
        perimeter=2.0f*(lenght+breadth);
        area=lenght*breadth;
    }

    void display(){
        System.out.println("The perimter of the rectangle is: "+perimeter);
        System.out.println("The area of the rectangle is: "+area);
    }
}
public class Lab3_4 {
    public static void main(String[] args) {
        rectangle rec=new rectangle();
        
        rec.read();
        rec.calculate();
        rec.display();
    }
}
