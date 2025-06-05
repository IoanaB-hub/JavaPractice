package OOP.ConceptPractice.VehicleManagementSystem;

public class Bicycle extends Vehicle{

    boolean hasBasket;

    public Bicycle(String category, String name, String color, boolean hasBasket) {
        super(category, name, color);
        this.hasBasket=hasBasket;
    }

    @Override
    public String emitSound() {
        return "The bicycle goes ding ding!";
    }
}
