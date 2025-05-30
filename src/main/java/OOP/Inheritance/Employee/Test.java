package OOP.Inheritance.Employee;

public class Test {
    public static void main(String[] args) {

        Employee emp1 = new Employee("Sarah", 101, 2000.55);

        Employee.salaryBiggerThan(emp1);
        emp1.displayDetails();


        Manager manager = new Manager("Sony", 101, 3000.00, "Quality Assurance");
        System.out.println("Department name: " + manager.getDepartment());
        manager.displayDetails();


        Developer developer = new Developer("John", 101, 3000.00, "Java");
        System.out.println("The Programming language known by " + developer.getName() + " is " + developer.getProgrammingLanguage());
        developer.displayDetails();




    }
}
