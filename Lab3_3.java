// Write a java program that will overload the area() method and display the area
// of a circle, triangle, and square as per user choice and user-entered
// dimensions.

class area{
   float aOS(float side){
    return side*side;
   }

   float aOC(float radius){
    return ((22/7.0f)*radius*radius);
   }

   float aOT(float base, float height){
    return (0.5f)*base*height;
   }
}
public class Lab3_3 {
    public static void main(String[] args) {
        area myarea=new area();
        System.out.println("Area of Square with side 5 is: "+myarea.aOS(9.123f));
        System.out.println("Area of Circle with radius 5 is: "+myarea.aOC(8.32454f));
        System.out.println("Area of Triangle with base 5 and height 5 is: "+myarea.aOT(10.7523f,9.35799f));
    }
}
