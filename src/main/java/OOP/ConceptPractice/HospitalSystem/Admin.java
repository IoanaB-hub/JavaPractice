package OOP.ConceptPractice.HospitalSystem;

public class Admin extends Employee {

    public Admin(String name, int id, double salary) {
        super(name, id, salary);
    }


    public void manageSchedule(String day) {
        System.out.println("Admin " + getName() + " is organizing the schedule for " + day + ".");
    }


    @Override
    public void performDuties() {
        System.out.println("Admin " + getName() + " manages appointments, patient records, and hospital schedules.");
    }
}
