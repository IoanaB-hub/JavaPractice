package OOP.ConceptPractice.HospitalSystem;

public abstract class Employee {

    private String name;
    private int id;
    private double salary;

    private static int countEmployee = 0;

    private static double totalSalary = 0.0;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        countEmployee++;
        totalSalary += salary;
    }


    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee Id: " + id + " Name:" + name + " Salary: " + salary);
    }

    public static int getTotalEmployee() {
        return countEmployee;
    }

    public static double getAverageSalary() {
        return totalSalary / countEmployee;
    }

    public double getSalary(double performanceBonus) {
        return salary + (salary * performanceBonus);
    }

    public abstract void performDuties();


}
