package AccommodationsBooking;

public class Accommodation {

    Category category;
    double price;
    String city;

    public Accommodation(Category category, double price, String city) {
        this.category = category;
        this.price = price;
        this.city = city;
    }

    public Category getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Accommodation{" +
                "category=" + category +
                ", price=" + price +
                ", city='" + city + '\'' +
                '}';
    }
}
