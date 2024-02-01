package syllabus;
public class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public static void main(String[] args) {
        Employee e = new Employee("aniken","skywalker", 500000.00);
        System.out.println("Name: "+e.getLastName()+" "+e.getLastName()+" Salary: "+e.getMonthlySalary());
    }
}
