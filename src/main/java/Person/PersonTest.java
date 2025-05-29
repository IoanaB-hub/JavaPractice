package Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PersonTest {
    public static void main(String[] args) {

        List<Person> personList = Arrays.asList(
                new Person("Mary", 1992, 33, "blonde"),
                new Person("John", 2000, 25),
                new Person("Emily", 1990, 31, "red"),
                new Person("Daniel", 1980, 45),
                new Person("John", 2000, 25)
        );

        List<Person> emptyList = new ArrayList<>();

        System.out.println(personList);
        System.out.println(personList.get(1));
        System.out.println(PersonMethods.isOlderThan(personList.get(0), personList.get(1)));
        System.out.println("The list of unique names is: " + PersonMethods.uniquePersonName(personList));
        System.out.println("The average age: " + PersonMethods.averageAge(personList));
        System.out.println("The average age for the empty list: " + PersonMethods.averageAge(emptyList));

        personList.get(4).setHairColor("blue");
        System.out.println("John's new hair color: " + personList.get(4));


        System.out.println(PersonMethods.pinkHairColorForEveryone(personList,"pink"));
        System.out.println("Updated hair color: " + personList);

        System.out.println(PersonMethods.pinkHairColorForEveryone(personList,"purple"));
        System.out.println("Updated hair color: " + personList);
    }
}
