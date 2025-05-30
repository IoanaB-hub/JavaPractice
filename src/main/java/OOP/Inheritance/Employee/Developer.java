package OOP.Inheritance.Employee;

public class Developer extends Employee {

    String programmingLanguage;


    public Developer(String name, int emp_id, double salary, String programmingLanguage) {
        super(name, emp_id, salary);
        this.programmingLanguage = programmingLanguage;
    }


    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("The programming language is: " + getProgrammingLanguage());

    }
}
