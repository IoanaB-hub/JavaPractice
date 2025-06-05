package OOP.ConceptPractice.ShoppingSystem;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private List<Product> productList = new ArrayList<>();


    public void addProductToCart(Product product) {
        productList.add(product);
    }

    public double calculateTotalPrice() {
        double totalPrice = 0.0;

        for (Product currentProduct : productList) {
            totalPrice += currentProduct.getDiscountedPrice();
        }
        return totalPrice;

    }




}
