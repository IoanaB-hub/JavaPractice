package OOP.ConceptPractice.ShoppingSystem;

public class Test {
    public static void main(String[] args) {


        Product laptop = new Electronics("Lenovo V15 G4 IRU", 2364.99, "electronics", true);
        Product dress = new Clothes("Blue Denim", 200.00, "clothes", "S");

        //Order PremiumCustomer
        PremiumCustomer premiumCustomer = new PremiumCustomer("Amelie", "Iasi,Romania");

        Order premiumOrder = new Order();
        premiumOrder.addProductToCart(laptop);
        premiumOrder.addProductToCart(dress);

        double totalPremium = premiumOrder.calculateTotalPrice();
        double finalPremium = premiumCustomer.calculateDiscount(premiumOrder);

        System.out.println("Total price for Premium Customer (before customer discount): " + totalPremium);
        System.out.println("Final price for Premium Customer: " + finalPremium);



        //Order RegularCustomer
        RegularCustomer regularCustomer = new RegularCustomer("Alma", "Bacau,Romania");
        Order regularOrder = new Order();

        regularOrder.addProductToCart(laptop);
        regularOrder.addProductToCart(dress);

        double finalRegular = regularCustomer.calculateDiscount(regularOrder);

        System.out.println("Total price for Regular Customer: " + finalRegular);

    }
}
