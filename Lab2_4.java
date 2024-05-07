// Write a java program that asks the user to fill an integer array's size and its
// entries through the command line. Next, the program must find out the no. of
// occurrences of each element in the user-entered array, followed by printing
// each array entry along with the number of its occurrences in the array.

import java.util.Scanner;

public class Lab2_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the sizze of the array: ");
        int size=sc.nextInt();
        float arr[]=new float[size];
        
        System.out.print("Enter the elements of the array: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextFloat();
        }
        
        int occurrence[]= new int[size];
        boolean visited[]=new boolean[size];
        
        for(int i=0;i<size;i++){
            if(visited[i]){
                continue;
            }
            int count=1;
            for(int j=i+1;j<size;j++){
                if(arr[i]==arr[j]){
                    count++;
                    visited[j]=true;
                }
            }
            occurrence[i]=count;
        }

        System.out.println("\nNumber of occurance of each elements:-");
        for(int i=0;i<size;i++){
            if(!visited[i]){
                System.out.println(arr[i]+" occurs "+occurrence[i]+" times.");
            }
        }
    }
}

