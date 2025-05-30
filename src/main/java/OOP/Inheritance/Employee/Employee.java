package OOP.Inheritance.Employee;

public class Employee {

    private String name;
    private int emp_id;
    private double salary;


    public Employee(String name, int emp_id, double salary) {
        this.name = name;
        this.emp_id = emp_id;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    // check for each employee if the salary is >= that 2000 euro, return a message
    public static void salaryBiggerThan(Employee employee) {
        if (employee.getSalary() >= 2000) {
            System.out.println(employee.getName() + " has a salary bigger than 2000 euro.");
        } else {
            System.out.println(employee.getName() + " has a salary less than 2000 euro.");
        }
    }

    public void displayDetails() {
        System.out.println("The employee with name: " + name + " with id: " + emp_id + " has salary equal with " + salary + " euro.");
    }


}
