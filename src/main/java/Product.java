public class Product {

    // final - CONSTANT, the value cannot be changed
    private static final String ERROR_MESSAGE_OUT_OF_STOCK = "This product is currently out of stock.";

    public static void main(String[] args) {

        String name = "Watch";
        String description = "Samsung Galaxy";

        double priceProduct1 = 1923.23;
        int quantityProduct1 = 5;


        double priceProduct2 = 1567.30;
        int quantityProduct2 = 3;

        double totalProducts = priceProduct1 * quantityProduct1;
        System.out.println("The total price is: " + totalProducts + " RON");

        System.out.println("The total price for products in stock is: " + totalPriceForProductsInStock(priceProduct1, quantityProduct1));
        System.out.println("The total price for products in stock is: " + totalPriceForProductsInStock(priceProduct2, quantityProduct2));

        System.out.println("The product details: " + productDetails(name, description, priceProduct1));

    }

    public static double totalPriceForProductsInStock(double productPrice, int productQuantity) {
        return productPrice * productQuantity;
    }

    public static String productDetails(String productName, String productDescription, double productPrice) {
        return productName + "," + productDescription + ", " + productPrice;
    }
}
