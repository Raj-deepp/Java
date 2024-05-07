// Define an interface with three methods – earnings(), deductions() and bonus() and
// define a Java class ‘Manager’ which uses this interface without implementing
// bonus() method. Also define another Java class ‘Substaff’ which extends from
// ‘Manager’ class and implements bonus() method. Write the complete program to
// find out earnings, deduction and bonus of a sbstaff with basic salary amount
// entered by the user as per the following guidelines –
// earnings = basic + DA (80% of basic) + HRA (15% of basic)
// deduction PF = 12% of basic
// bonus = 50% of basic

import java.util.Scanner;

interface Employee{
    double earnings(double basic);
    double deductions(double basic);
    double bonus(double basic);
}

class Manager implements Employee{
    public double earnings(double basic){
        double da=0.8*basic;
        double hra=0.15*basic;
        return basic+da+hra;
    }

    public double deduction(double basic){
        return 0.12*basic;
    }

    class Substaff extends Manager {
        public double bonus(double basic) {
            return 0.5 * basic;
        }
    }

    @Override
    public double deductions(double basic) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deductions'");
    }

    @Override
    public double bonus(double basic) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'bonus'");
    }
}

public class Lab5_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the basic salary: ");
        double basicSal=sc.nextDouble();

        Manager.Substaff sf=new Manager().new Substaff();
        double earnings = sf.earnings(basicSal);
        double deductions = sf.deductions(basicSal);
        double bonus = sf.bonus(basicSal);

        System.out.println("Earnings: " + earnings);
        System.out.println("Deductions: " + deductions);
        System.out.println("Bonus: " + bonus);
    }
}
