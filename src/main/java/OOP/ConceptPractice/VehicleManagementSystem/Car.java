package OOP.ConceptPractice.VehicleManagementSystem;

public class Car extends Vehicle {

    private int maxSpeed;

    public Car(String category, String name, String color, int maxSpeed) {
        super(category, name, color);
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public String emitSound() {
        return "The car goes vroom!";
    }
}
