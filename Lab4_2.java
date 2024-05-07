// Write a program to Illustrate the execution of constructors in multilevel
// inheritance with three Java classes – plate (length, width), box (length, width,
// height), woodbox (length, width, height, thick) where box inherits from plate
// and woodbox inherits from box class. Each class has a constructor where
// dimensions are taken from the user.

import java.util.Scanner;

class Plate{
    Scanner sc = new Scanner(System.in);
    double length;
    double width;
    void display(){
        System.out.println("Length: "+length);
        System.out.println("Width: "+width);
    }
    Plate(){
        System.out.print("Enter length and width: ");
        length = sc.nextDouble();
        width = sc.nextDouble();
    }
}

class Box extends Plate{
    double height;
    Box(){
        System.out.print("Enter height: ");
        height = sc.nextDouble();
    }
    void display(){
        super.display();
        System.out.println("Height: " +height);
    }
}

class Woodbox extends Box{
    double thick;
    Woodbox(){
        System.out.print("Enter thickness: ");
        thick = sc.nextDouble();
    }
    void display(){
        super.display();
        System.out.println("Thickness: " +thick);
    }
}

public class Lab4_2 {
    public static void main(String[] args) {    
        System.out.println("For Plate:- ");
        Plate pl = new Plate();
        System.out.println();
        
        System.out.println("For Box:- ");
        Box bo = new Box();
        System.out.println();
        
        System.out.println("For woodbox:- ");
        Woodbox wb = new Woodbox();
        System.out.println();
        
        System.out.println("Details for Plate : ");
        pl.display();
        System.out.println();
        
        System.out.println("Details for Box : ");
        bo.display();
        System.out.println();
        
        System.out.println("Details for woodbox : ");
        wb.display();
        System.out.println();
    }
}
