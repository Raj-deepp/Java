// In the Marketing package, define a class ‘sales’ which extends from ‘employee’
// class and has a method “tallowance()” that calculates Travelling Allowance as
// 5% of total earning.

package Marketing;

import General.Employee;

public class Sales extends Employee {
    public double earnings;

    public Sales(double basic) {
        super(basic);
    }

    public double tallowance(){
        return 0.05*earnings();
    }
}