package OOP.Abstract.University;

public class Researcher extends Employee {

    String researchField;
    private double researchBonus;

    public Researcher(int id, String name, double salary, String researchField, double researchBonus) {
        super(id, name, salary);
        this.researchField = researchField;
        this.researchBonus = researchBonus;
    }


    public String getResearchField() {
        return researchField;
    }

    public double getResearchBonus() {
        return researchBonus;
    }

    @Override
    public double calculateAnnualSalary() {
        return (getSalary() * 12) + researchBonus;
    }

    @Override
    public String describeRole() {
        return "I am a researcher. I conduct studies in the field of " + researchField + ".";
    }
}
