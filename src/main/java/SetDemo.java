import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {


        Set<String> names = new HashSet<>(); // random order(not index concept) - doesn't allow duplicates
        names.add("Alina");
        names.add("Ioana");
        names.add("Georgiana");
        //mySet.add("Alina");

        System.out.println("The names on the list are: " + names);


        Set<String> cities = new LinkedHashSet<>(); // preserved order
        cities.add("Iasi");
        cities.add("Bacau");
        cities.add("Bucuresti");
        cities.add("Cluj");

        System.out.println("The list of cities is: " + cities);

        Set<String> colors = new TreeSet<>(); // ascending-alphabetic order
        colors.add("pink");
        colors.add("blue");
        colors.add("purple");
        colors.add("white");
        colors.add("brown");

        System.out.println("The list of colors is: " + colors);


        Set<Object> personDetails = new LinkedHashSet<>();
        personDetails.add("Alina Dima");
        personDetails.add(20);
        personDetails.add(false);
        personDetails.add("Iasi");
        personDetails.add(5000.99);

        System.out.println("Personal details: " + personDetails);

        for (Object currentValue : personDetails) {
            System.out.println(currentValue);
        }


    }


}
