package OOP.Abstract.University;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {


        List<Employee> employee = new ArrayList<>();
        employee.add(new Professor(101, "Daniel", 7000, "Mathematics",true));
        employee.add(new Professor(102, "Selma", 6000.00, "Graphics",false));
        employee.add(new Researcher(101, "Sonia", 7000.99, "Security and Privacy", 1500));
        employee.add(new AdministrativeStaff(101, "Paul", 6000.77, "HR", "Manager"));

        for (Employee e : employee) {
            System.out.println(e.describeRole());
            System.out.println("Annual salary: " + e.calculateAnnualSalary());
        }


    }
}
