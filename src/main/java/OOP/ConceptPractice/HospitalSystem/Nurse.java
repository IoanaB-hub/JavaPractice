package OOP.ConceptPractice.HospitalSystem;

public class Nurse extends Employee {

    String department;

    public Nurse(String name, int id, double salary, String department) {
        super(name, id, salary);
        this.department = department;
    }

    public void checkVitals() {
        System.out.println("Nurse " + getName() + " is checking patient's vitals: temperature, blood pressure, pulse.");
    }


    @Override
    public void performDuties() {
        System.out.println("Nurse " + getName() + " assists doctors and monitors patients.");
    }
}
