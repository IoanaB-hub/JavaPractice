package OOP.ConceptPractice.HospitalSystem;

public class Doctor extends Employee {


    private String specialization;
    private String diagnosis;


    public Doctor(String name, int id, double salary, String specialization, String diagnosis) {
        super(name, id, salary);
        this.specialization = specialization;
        this.diagnosis = diagnosis;
    }

    public String getSpecialization() {
        return specialization;
    }

    @Override
    public void performDuties() {
        System.out.println("Doctor " + getName() + " diagnoses the patients.");
        System.out.println("Specialization: " + getSpecialization());
    }


    public void prescribeMedication() {
        switch (diagnosis) {
            case "flu":
                System.out.println("Prescription: Paracetamol 500mg");
                break;
            case "infection":
                System.out.println("Prescription: Ampicillin 500mg");
                break;
            default:
                System.out.println("Additional consultation required.");
                break;

        }
    }




}
