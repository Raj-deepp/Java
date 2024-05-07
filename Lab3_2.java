// Write a program to overload subtract method with various parameters in a
// class in Java. Write the driver class to use the different subtract methods using
// objects.
class subtract{
    int sub(int x, int ...arr){
        int result=x;
        for (int i : arr) {
            result-=i;
        }
        return result;
    }
    float sub(float x, float ...arr){
        float result=x;
        for (float i : arr) {
            result-=i;
        }
        return result;
    }
    double sub(double x, double ...arr){
        double result=x;
        for (double i : arr) {
            result-=i;
        }
        return result;
    }
}

public class Lab3_2 {
    public static void main(String[] args) {
        subtract mysub=new subtract();
        System.out.println("The subtraction of the given inputs is: "+mysub.sub(9.35,3.452,1.36,1.63,0.632));
        System.out.println("The subtraction of the given inputs is: "+mysub.sub(19.623545,5.6254345,-4.86323));
    }
}
