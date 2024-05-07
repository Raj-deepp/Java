// Write a program in Java that asks as input the marks secured by him/her in
// chemistry out of 100. Next, using the marks entered by the user, generate the
// corresponding grade of the student using the following chart with the help of
// if..else statements in Java.

import java.util.Scanner;

public class Lab1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks obtained in Chemistry: ");
        float marks = sc.nextFloat();
        String S="Grade obtaine: "; 

        if(marks>=90 && marks<=100){
            System.out.println(S +"A - Excellent");
        }
        else if(marks>=80){
            System.out.println(S +"B - Very Good");
        }
        else if(marks>=70){
            System.out.println(S +"C - Good");
        }
        else if(marks>=60){
            System.out.println(S +"D - Satisfactory");
        }
        else if(marks>=50){
            System.out.println(S +"E - Work Hard");
        }
        else if (marks>=40){
            System.out.println(S +"F - Just Passed");
        }
        else if(marks<=40 && marks>=0){
            System.out.println("Fail");
        }
    }
}
