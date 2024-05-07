// Write Define an interface Motor with a data member–”capacity” and two
// methods such as run() and consume(). Define a Java class ‘Washing machine’
// which implements this interface and write the code to check the value of the
// interface data member through an object of the class.

interface Motor{
    float capacity=9.9f;

    void run();
    void consume();
}

class washingMachine implements Motor{
    public void run(){
        System.out.println("Washing Machine is running.");
    }

    public void consume(){
        System.out.println("Washing Machine is consuming electricity.");
    }
}

public class Lab5_2 {
    public static void main(String[] args) {
        washingMachine wm=new washingMachine();
        System.out.println("Capacity of the Washing Machine: "+ Motor.capacity);

        wm.run();
        wm.consume();
    }
}
