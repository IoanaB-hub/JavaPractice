package OOP.Inheritance.Employee;

public class Manager extends Employee {

    String department;

    public Manager(String name, int emp_id, double salary, String department) {
        super(name, emp_id, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println(getName() + " is the Manager of " + getDepartment() + " department.");
    }


}
