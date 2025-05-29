package Person;

public class Person {
    private String name;
    private int birthYear;
    private int age;
    private String hairColor;


    public Person(String name, int birthYear, int age, String hairColor) {
        this.name = name;
        this.birthYear = birthYear;
        this.age = age;
        this.hairColor = hairColor;
    }

    public Person(String name, int birthYear, int age) {
        this(name, birthYear, age, "brown"); //hairColor by default
    }


    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getAge() {
        return age;
    }

    public String getHairColor() {
        return hairColor;
    }


    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    @Override
    public String toString() {  // show list information
        return "Person{" +
                "name='" + name + '\'' +
                ", birthYear=" + birthYear +
                ", age=" + age +
                ", hairColor='" + hairColor + '\'' +
                '}';
    }
}
