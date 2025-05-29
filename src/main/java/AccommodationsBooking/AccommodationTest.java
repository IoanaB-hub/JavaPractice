package AccommodationsBooking;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static AccommodationsBooking.AccommodationRegistry.*;

public class AccommodationTest {
    public static void main(String[] args) {

        List<Accommodation> accommodations = Arrays.asList(new Accommodation(Category.HOTEL, 350.00, "Bucuresti"),
                new Accommodation(Category.HOTEL, 255.50, "Iasi"),
                new Accommodation(Category.STUDIO, 200.00, "Cluj"),
                new Accommodation(Category.STUDIO, 150.00, "Cluj"),
                new Accommodation(Category.STUDIO, 190.00, "Bacau"));


        System.out.println("The categories number for the Accommodation list is: " + categoriesCount(accommodations));
        System.out.println("The list of unique city names: " + cityList(accommodations));
        System.out.println("Average price for " + Category.HOTEL + ": " + averagePriceForOneCategory(accommodations, Category.HOTEL) + " RON");
        System.out.println("Average price for " + Category.STUDIO + ": " + averagePriceForOneCategory(accommodations, Category.STUDIO) + " RON");

        System.out.println(accommodations);

    }


}
