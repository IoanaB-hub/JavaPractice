package Person;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PersonMethods {

    public static boolean isOlderThan(Person person1, Person person2) {
        return person1.getAge() > person2.getAge();
    }

    public static Set<String> uniquePersonName(List<Person> personList) {
        Set<String> uniqueNames = new TreeSet<>();

        for (Person currentPerson : personList) {
            uniqueNames.add(currentPerson.getName());
        }
        return uniqueNames;
    }

    public static double averageAge(List<Person> personList) {
        int sum = 0;
        int numberOfPersons = 0;

        if (personList.isEmpty()) {
            return 0;
        }

        for (Person currentPerson : personList) {

            sum += currentPerson.getAge();
            numberOfPersons++;
        }

        return (double) sum / numberOfPersons; // return (double) sum / personList.size();

    }

    public static String pinkHairColorForEveryone(List<Person> personList, String newColor) {

        for (Person person : personList) {
            person.setHairColor(newColor);
        }
        return "All persons have new hair color.";

    }


}
