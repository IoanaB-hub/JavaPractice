package OOP.ConceptPractice.ShoppingSystem;

public class PremiumCustomer extends Customer{




    public PremiumCustomer(String name, String address) {
        super(name, address);
    }

    @Override
    public double calculateDiscount(Order order) {
        return order.calculateTotalPrice() * 0.90;
    }
}
