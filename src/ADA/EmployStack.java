package ADA;

import java.util.Scanner;

class Node{
    private Node n = null;
    private String Name;
    private int id;
    private String position;
    private double salary;
    private String phoneNo;
    private String email;

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Node getN() {
        return n;
    }

    public void setN(Node n) {
        this.n = n;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

public class EmployStack {
    Node head = null;
    void push(String n, int i, String pos, double s, String ph, String mail){
        if(head == null){
            Node emp = new Node();
            emp.setId(i);
            emp.setName(n);
            emp.setPosition(pos);
            emp.setSalary(s);
            emp.setPhoneNo(ph);
            emp.setEmail(mail);
            head = emp;
        }
        else {
            Node emp = new Node();
            emp.setId(i);
            emp.setName(n);
            emp.setN(head);
            emp.setPosition(pos);
            emp.setSalary(s);
            emp.setPhoneNo(ph);
            emp.setEmail(mail);
            head = emp;
        }
    }
    void pop(){
        if(head != null){
            System.out.println("Employee: "+head.getName()+" Id: "+head.getId());
            System.out.println("Employee Salary: "+head.getSalary()+" Position: "+head.getPosition());
            System.out.println("Employee Email: "+ head.getEmail()+" Employee ph: "+head.getPhoneNo());
            head = head.getN();
        }
        else{
            System.out.println("Stack is empty");
        }
    }
    void peek(){
        if(head != null){
            System.out.println("Employee: "+head.getName()+" Id: "+head.getId());
            System.out.println("Employee Salary: "+head.getSalary()+" Position: "+head.getPosition());
            System.out.println("Employee Email: "+ head.getEmail()+" Employee ph: "+head.getPhoneNo());
        }
        else{
            System.out.println("Stack is empty");
        }
    }
    void display(){
        Node itr = head;
        while(itr != null){
            System.out.println("Employee: "+itr.getName()+" Id: "+itr.getId());
            System.out.println("Employee Salary: "+itr.getSalary()+" Position: "+itr.getPosition());
            System.out.println("Employee Email: "+ itr.getEmail()+" Employee ph: "+itr.getPhoneNo());
            itr = itr.getN();
        }
    }

    void test(EmployStack e){
        e.push("Jakie",25,"Assistant",50000.68,"799997867","kartikey@gmail.com");
        e.push("sam",25,"Manager",50000.68,"799997867","kartikey@gmail.com");
        e.push("Dean",25,"Dev",50000.68,"799997867","kartikey@gmail.com");
        e.push("Castial",25,"HR",50000.68,"799997867","kartikey@gmail.com");
        e.push("John",25,"gard",50000.68,"799997867","kartikey@gmail.com");
        e.push("Mark",25,"Assistant",50000.68,"799997867","kartikey@gmail.com");
        e.display();
        e.pop();
        e.pop();
        e.peek();
        e.pop();
        e.pop();
        e.pop();
        e.pop();
    }

    public static void main(String[] args) {
        EmployStack e = new EmployStack();
        Scanner sc = new Scanner(System.in);
//        e.test(e);
        boolean quit = false;
        while(!quit){
            System.out.println("-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x");
            System.out.println("Insert New Employee: 1");
            System.out.println("Remove a Employee: 2");
            System.out.println("Top Employee: 3");
            System.out.println("Display all Employees: 4");
            System.out.println("Exit: 5");
            System.out.print("Enter a option: ");
            switch (sc.nextInt()){
                case 1:
                    sc.nextLine();
                    System.out.println("Enter Employee Name: ");
                    String n = sc.nextLine();

                    System.out.println("Enter Employee position: ");
                    String pos = sc.nextLine();

                    System.out.println("Enter Employee ID: ");
                    int i = sc.nextInt();
                    System.out.println("Enter Employee Salary: ");
                    double s = sc.nextDouble();
                    System.out.println("Enter Employee Email: ");
                    sc.nextLine();
                    String mail = sc.nextLine();

                    System.out.println("Enter Employee phone no: ");
                    String ph = sc.nextLine();
                    e.push(n,i,pos,s,ph,mail);
                    break;

                case 2:
                    e.pop();
                    break;

                case 3:
                    e.peek();
                    break;

                case 4:
                    e.display();
                    break;

                case 5:
                    quit = true;
                    break;
            }
        }
    }
}
