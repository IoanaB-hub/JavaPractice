package AccommodationsBooking;

import java.util.*;

public class AccommodationRegistry {

    public static int categoriesCount(List<Accommodation> accommodations) {
        Set<Category> categories = new HashSet<>(); // doesn't allow duplicates for categories

        for (Accommodation acc : accommodations) {
            categories.add(acc.getCategory());
        }
        return categories.size();
    }


    public static Collection<String> cityList(Collection<Accommodation> accommodations) {
        Set<String> cities = new TreeSet<>();

        for (Accommodation acc : accommodations) {
            cities.add(acc.getCity());
        }
        return cities;
    }


    public static double averagePriceForOneCategory(List<Accommodation> accommodations, Category selectedCategory) {

        int accNumber = 0;
        double totalPrice = 0.00;

        for (Accommodation acc : accommodations) {
            if (acc.getCategory().equals(selectedCategory)) {
                accNumber++;
                totalPrice += acc.getPrice();
            }

        }
        return totalPrice / accNumber;

    }


}
