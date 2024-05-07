class A{
    void m1(String x){
        System.out.println("One");
    }
}
class B extends A{
    public void m1(String x){
        System.out.println("Two");
        super.m1("Three");
    }
}

public class ABC {
    public static void main(String[] args) {
        A obj=new B();
        obj.m1("Four");
    }
}
