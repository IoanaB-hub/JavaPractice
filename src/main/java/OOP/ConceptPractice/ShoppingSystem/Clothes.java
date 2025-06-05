package OOP.ConceptPractice.ShoppingSystem;

public class Clothes extends Product {

    private String size;

    public Clothes(String name, double price, String category, String size) {
        super(name, price, category);
        this.size = size;
    }

    public String getSize() {
        return size;
    }


    @Override
    public double getDiscountedPrice() {
        return getPrice() * 0.90;
    }
}
