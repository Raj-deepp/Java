// Write a Java program to generate an ArrayIndexOutofBoundsException and
// handle it using a catch block

public class Lab6_2 {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            int element = arr[10];
            System.out.println(element);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds exception occurred."+ e.getMessage());
            // e.printStackTrace();
        }
        // int b=6;
        // int c=7;
        // int a=b++ + ++c + c++;
        // System.out.println(a);
    }
}
