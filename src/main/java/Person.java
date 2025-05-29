import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Person {

    private String name;
    private int age;
    private String address;
    int startHour;
    int endHour;

    private final static String COUNTRY = "Romania";

    static int numberOfPersons = 0;


    public Person(String name, int age, String address, int startHour, int endHour) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.startHour = startHour;
        this.endHour = endHour;
        //this.endHour=17; default

        numberOfPersons++;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String displayPersonDetails() {
        return name + ", " + age + ", " + address + ", " + startHour + ", " + endHour;
    }

    public static int getNumberOfPersons() {
        return numberOfPersons;
    }


    public static int workedHours(int startHour, int finishHour) {
        return finishHour - startHour;

    }

    private int getStartHour() {
        return startHour;
    }

    private int getEndHour() {
        return endHour;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", startHour=" + startHour +
                ", endHour=" + endHour +
                '}';
    }

    public static void main(String[] args) {

        Person person1 = new Person("Ioana Dima", 29, "Iasi", 9, 17);
        Person person2 = new Person("Alex Matei", 17, "Bacau", 8, 12);
        Person person3 = new Person("Elena Pop", 35, "Roman", 8, 18);


        List<Person> persons = new ArrayList<>(); //empty list
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        System.out.println(persons);

        for (Person theCurrentPerson : persons) {
            if (theCurrentPerson.getAge() >= 18) {
                System.out.println("Full-time contract for: " + theCurrentPerson.getName());
            } else {
                System.out.println("Part-time contract for: " + theCurrentPerson.getName());
            }
        }


        for (Person personWithSpecificAddress : persons) {
            if (personWithSpecificAddress.getAddress().equals("Iasi")) {
                System.out.println("Found someone from Iasi " + personWithSpecificAddress.getName());
            }
        }
        System.out.println("Info:" + person1.displayPersonDetails());

        for (Person person : persons) {
            int hours = workedHours(person.getStartHour(), person.getEndHour());

            if (hours == 8) {
                System.out.println(person.getName() + " has worked " + hours + " hours. Full shift like a Pro!");
            } else if (hours == 4) {
                System.out.println(person.getName() + " has worked " + hours + " hours. Short day, huh?");
            } else if (hours < 8) {
                System.out.println(person.getName() + " has worked " + hours + " hours. Almost there - next time go full power");
            } else {
                System.out.println(person.getName() + " has worked " + hours + " hours?! Overtime alert! Take a break!");
            }
        }

        for (Person p : persons) {
            if (p.getStartHour() == 8) {
                System.out.println("Good morning, " + p.getName() + "!");
            }
        }

        System.out.println("Total number of people: " + getNumberOfPersons());


    }
}
