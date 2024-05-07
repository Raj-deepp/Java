// Define two packages as – General and Marketing. In General package define a
// class ‘employee’ with data members as empid(protected), ename(private) and a
// public method as earnings() which calculates the total earnings as:
// earnings = basic + DA (80% of basic) + HRA (15% of basic)

package General;

public class Employee {
    protected int empid;
    private String ename;
    protected double basic;
    protected double da;
    protected double hra;

    public Employee(double basic){
        this.basic=basic;
        da=0.8*basic;
        hra=0.15*basic;
    }
    protected double earnings(){
        return basic+da+hra;
    }
}
