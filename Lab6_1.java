/*Define two packages as – General and Marketing. In General package define a
class ‘employee’ with data members as empid(protected), ename(private) and a
public method as earnings() which calculates the total earnings as:
earnings = basic + DA (80% of basic) + HRA (15% of basic)

In the Marketing package, define a class ‘sales’ which extends from ‘employee’
class and has a method “tallowance()” that calculates Travelling Allowance as
5% of total earning. Write a java program to find out total earnings of a sales
person for the given basic salary amount and print along with the emp id.*/

import General.*;
import Marketing.*;

public class Lab6_1 {
    public static void main(String[] args) {
        Sales x=new Sales(50000);
        double totalEarning=x.earnings;
        double travel=x.tallowance();

        System.out.println("Total earning: "+"Rs. "+totalEarning);
        System.out.println("Travel allowance: "+"Rs. "+travel);
    }
}
