/*Define an interface Employee with a method getDetails() to get employee details
as Empid and Ename. Also define a derived interface Manager with a method
getDeptDetails() to get department details such as Deptid and Deptname.Then
define a class Head which implements Manager interface and also prints all
details of the employee. Write the complete program to display all details of one
head of the department.*/

interface employee{
    void getDetails();
}

interface manager extends employee{
    void getDeptDetails();
}

class head implements manager{
    int empId;
    String empName;
    int deptId;
    String deptName;

    head(int empId, String empName, int deptId, String deptName) {
        this.empId = empId;
        this.empName = empName;
        this.deptId = deptId;
        this.deptName = deptName;
    }

    public void getDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
    }

    public void getDeptDetails() {
        System.out.println("Department ID: " + deptId);
        System.out.println("Department Name: " + deptName);
    }

    public void displayDetails() {
        System.out.println("Head details:");
        getDetails();
        getDeptDetails();
    }
}

public class Lab5_4 {
    public static void main(String[] args) {
        head hod = new head(101, "John Doe", 1001, "Engineering");
        hod.displayDetails();
    }
}
