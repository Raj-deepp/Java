// Write a java program that asks the user to enter the size of an array. Next,
// create an array of specific size input by the user, followed by asking the user
// to input the array’s contents through the command line. Finally, the program
// must sort the user-entered list of numbers and output the sorted array entries.

import java.util.Scanner;
import java.util.Arrays;

public class Lab2_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size=sc.nextInt();
        float arr[]=new float[size];
        System.out.print("Enter "+size+" numbers: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextFloat();
        }     
        Arrays.sort(arr);
        System.out.print("The sorted array is: ");
        for (float f : arr) {
            System.out.print(f+"  ");
        }  
    }
}
