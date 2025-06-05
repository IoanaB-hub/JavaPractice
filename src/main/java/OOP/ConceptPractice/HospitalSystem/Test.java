package OOP.ConceptPractice.HospitalSystem;

public class Test {
    public static void main(String[] args) {

        Doctor doctor = new Doctor("John", 1, 9000.00, "Family Medicine", "flu");
        Nurse nurse = new Nurse("Emily", 2, 5000.00, "Pediatrics");
        Admin admin = new Admin("Sony", 3, 4000.00);

        doctor.displayDetails();
        nurse.displayDetails();
        admin.displayDetails();

        doctor.performDuties();
        nurse.performDuties();
        admin.performDuties();

        doctor.prescribeMedication();
        nurse.checkVitals();
        admin.manageSchedule("Monday");

        //Static method = class method
        //Non-static method = object method

        System.out.println("The total number of employees is: " + Employee.getTotalEmployee());
        System.out.println("Average salary: " + Employee.getAverageSalary());

        System.out.println(doctor.getSalary());
        System.out.println(doctor.getSalary(0.25));


    }
}
