package syllabus;

public class EmployeeTest {
    Employee emp;
    public EmployeeTest(String fName, String lName, double salary) {
        emp = new Employee(fName, lName, salary);
    }
    String getName(){
        return emp.getFirstName()+" "+emp.getLastName();
    }
    double getYearlySalary(){
        return emp.getMonthlySalary()*12;
    }
    public static void main(String[] args) {
        EmployeeTest emp1 = new EmployeeTest("darth","sedius",55000.00);
        EmployeeTest emp2 = new EmployeeTest("darth","vader",50000.00);

        System.out.println("Name: "+emp1.getName()+" Salary: "+emp1.getYearlySalary());
        System.out.println("Name: "+emp2.getName()+" Salary: "+emp2.getYearlySalary());
    }
}
