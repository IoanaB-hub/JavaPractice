package OOP.Abstract.University;

public class AdministrativeStaff extends Employee {

    private String department;
    private String positionTitle;


    public AdministrativeStaff(int id, String name, double salary, String department, String positionTitle) {
        super(id, name, salary);
        this.department = department;
        this.positionTitle = positionTitle;
    }


    public String getDepartment() {
        return department;
    }

    public String getPositionTitle() {
        return positionTitle;
    }

    @Override
    public double calculateAnnualSalary() {
        return getSalary() * 12;
    }

    @Override
    public String describeRole() {
        return "I am an administrative staff member working as " + positionTitle +
                " in the " + department + " department.";
    }
}
