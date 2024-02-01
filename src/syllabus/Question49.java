package syllabus;

public class Question49 {
    static class ContractEmployee extends Employee{
        String department;
        String designation;
        double salary;

        public ContractEmployee(String firstName, String lastName) {
            super(firstName, lastName,50000.00);
        }

        public String getDepartment() {
            return department;
        }

        public String getDesig() {
            return designation;
        }

        public String displayFullName(){
            return getFirstName()+getLastName();
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        public void setDesignation(String designation) {
            this.designation = designation;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }
    }

    class RegularEmployee extends Employee{
        String department;
        String designation;
        double salary;

        public RegularEmployee(String firstName, String lastName) {
            super(firstName, lastName,50000.0);
        }

        public String getDepartment() {
            return department;
        }

        public String getDesig() {
            return designation;
        }

        public String displayFullName(){
            return getFirstName()+getLastName();
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        public void setDesignation(String designation) {
            this.designation = designation;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }
    }

    void opp(){
        Question49.RegularEmployee emp2 = new Question49.RegularEmployee("Nathkhat","Kothari ex");
    }

    public static void main(String[] args) {
        ContractEmployee emp1 = new ContractEmployee("Nathkhat","Kothari");
        Question49 e = new Question49();
        e.opp();
    }

}
