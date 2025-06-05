package OOP.Abstract.University;

public class Professor extends Employee {

    private String courseTaught;

    boolean isClassMaster;


    public Professor(int id, String name, double salary, String courseTaught, boolean isClassMaster) {
        super(id, name, salary);
        this.courseTaught = courseTaught;
        this.isClassMaster = isClassMaster;


    }

    public String getCourseTaught() {
        return courseTaught;
    }

    @Override
    public double calculateAnnualSalary() {
        double monthlySalary = getSalary();
        if (isClassMaster) {
            monthlySalary += getSalary() * 0.10;
        }
        return monthlySalary * 12;
    }


    @Override
    public String describeRole() {
        if (isClassMaster) {
            return "I am a professor and also a class master. I teach " + courseTaught + ".";
        } else {
            return "I am a professor. I teach " + courseTaught + ".";
        }
    }

}
