package syllabus;
public class Question40 {
    Employee emp;
    public Question40(String fName, String lName, double salary) {
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
        System.out.println("Name: "+emp1.getName()+" Salary after 10% raise: "+
                (emp1.getYearlySalary()+emp1.getYearlySalary()/10));
        System.out.println("Name: "+emp2.getName()+" Salary after 10% raise: "+
                (emp2.getYearlySalary()+emp2.getYearlySalary()/10));
    }
}
