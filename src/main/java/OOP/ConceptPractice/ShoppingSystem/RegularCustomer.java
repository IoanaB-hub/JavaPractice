package OOP.ConceptPractice.ShoppingSystem;

public class RegularCustomer extends Customer{
    public RegularCustomer(String name, String address) {
        super(name, address);
    }

    @Override
    public double calculateDiscount(Order order) {
        return order.calculateTotalPrice();
    }


}
