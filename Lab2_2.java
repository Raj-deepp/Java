// Write a program in Java that asks the user to enter ten numbers from the
// command line and print both the count and corresponding numbers from each
// bracket (even and odd) among the input numbers. The program should handle
// the conditions where the user may input any non-integer input.

import java.util.Scanner;

public class Lab2_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float arr[]=new float[10];
        int o_count=0;
        int e_count=0;
        System.out.print("Enter 10 numbers: ");
        for(int i=0;i<10;i++){
            arr[i]=sc.nextFloat();
            if(arr[i]%2==1){
                o_count=o_count+1;
            }
            else if (arr[i]%2==0) {
                e_count+=1;
            }
        }
        System.out.println("Total even numbers: "+e_count);
        System.out.println("Total odd numbers: "+o_count);
    }
}
