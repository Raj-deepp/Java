// Write a program in java to create a class called Box with three data members
// (length, width, height) and a method volume(). Also, implement the
// application class Demo, where an object of the box class is created with
// user-entered dimensions and prints the volume.

import java.util.Scanner;

class box{
    float length;
    float width;
    float height;

    float volume(){
        return length*width*height;
    }
}
public class Lab3_1 {
    public static void main(String[] args) {
        box myBox=new box();
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the lenght: ");
        myBox.length=sc.nextFloat();
        System.out.print("Enter the width: ");
        myBox.width=sc.nextFloat();
        System.out.print("Enter the height: ");
        myBox.height=sc.nextFloat();

        float result=myBox.volume();
        System.out.println("The volume of the box is: " + result);
    }
}
