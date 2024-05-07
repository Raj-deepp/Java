// Write a program in Java having three classes Apple, Banana and Cherry. Class
// Banana and Cherry are inherited from class Apple and each class has their own
// member function show() . Using the Dynamic Method Dispatch concept displays
// all the show() method of each class.

class Apple{
    void show(){
        System.out.println("This is Apple class.");
    }
}

class Banana extends Apple{
    void show(){
        System.out.println("This is Banana class.");
    }
}

class Cherry extends Apple{
    void show(){
        System.out.println("This is Cherry class.");
    }
}
public class Lab4_3 {
    public static void main(String[] args) {
        Apple a=new Apple();
        Banana b=new Banana();
        Cherry c=new Cherry();

        a.show();
        b.show();
        c.show(); 
    }
}