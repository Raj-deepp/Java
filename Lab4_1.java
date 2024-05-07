// A plastic manufacturer sells plastic in different shapes like 2D sheet and 3D
// box. The cost of a sheet is Rs 40/- per square ft. and the cost of a box is Rs
// 60/- per cubic ft. Implement it in Java to calculate the cost of plastic as per the
// dimensions given by the user where 3D inherits from 2D.

import java.util.Scanner;

class D2{
    float area(float l, float b){
        return (l*b);
    }
}

class D3 extends D2{
    float area(float l, float b, float h){
        return area(l, b)*h;
    }
}

public class Lab4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        D3 a = new D3();

        System.out.print("Enter the length and breadth of the SHEET required: ");
        float l = sc.nextFloat();
        float b = sc.nextFloat();

        float sheetArea = a.area(l, b);
        float sheetCost = sheetArea * 40;

        System.out.print("Enter the height of BOX of the  required: ");
        float h = sc.nextFloat();

        float boxVolume = a.area(l, b, h);
        float boxCost = boxVolume * 60;

        System.out.println("\nCost of the plastic:");
        System.out.println("For 2D Sheet: Rs " + sheetCost);
        System.out.println("For 3D Box: Rs " + boxCost);
    }
}
