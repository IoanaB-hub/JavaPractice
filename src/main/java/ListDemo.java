import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ListDemo {
    public static void main(String[] args) {

        //create new list
        List<String> cities = new ArrayList<>();  //List<String> cities = new LinkedList<>();

        System.out.println("The list is: " + cities);

        // add values to the list
        cities.add("Iasi");
        cities.add("Bucuresti");
        cities.add("Cluj");
        cities.add("Sibiu");
        cities.add("Timisoara");
        cities.add("Iasi");

        cities.add("Bucuresti");

        System.out.println("The new list is: " + cities);
        System.out.println("Number of cities: " + cities.size());

        int lastIndex = cities.size() - 1;
        System.out.println("Last index in list: " + lastIndex);

        System.out.println("Last city in the list: " + cities.get(lastIndex));

        // remove data from list
        cities.remove("Bucuresti");
        System.out.println("List after removing first 'Bucuresti' " + cities);
        cities.remove("Bucuresti");
        System.out.println("List after trying to remove 'Bucuresti' again: " + cities);

        // get a specific value from the List - first position
        // cities[0] - arrays
        System.out.println("The first value is: " + cities.getFirst());

        /*
         delete the entire list
         cities.clear();
         System.out.println("The list after delete is: " + cities);
         */

        // sorting a list
        Collections.sort(cities);
        System.out.println("The sorted list is " + cities);

        // check the list and return only Sibiu city
        // equals() --> String
        // == --> int,double.....
        for (String city : cities) {
            if (city.equals("Cluj")) {
                System.out.println("The city displayed is: " + city);
            }
        }

        // check the list and return only the cities that start with I

        for (String cty : cities) {
            if (cty.startsWith("I")) {
                System.out.println("The city that starts with 'I' is: " + cty);
            }
        }

        // add code in order to compare 2 ArrayLists

        List<Integer> agesGroup1 = new ArrayList<>();
        List<Integer> agesGroup2 = new ArrayList<>();

        agesGroup1.add(18);
        agesGroup1.add(27);
        agesGroup1.add(39);
        agesGroup1.add(50);

        agesGroup2.add(18);
        agesGroup2.add(27);
        agesGroup2.add(41);
        agesGroup2.add(59);

        List<Integer> commonAges = new ArrayList<>();

        for (int age : agesGroup1) {
            if (agesGroup2.contains(age)) {
                commonAges.add(age);
            }
        }
        System.out.println("The common ages are: " + commonAges);


    }
}
