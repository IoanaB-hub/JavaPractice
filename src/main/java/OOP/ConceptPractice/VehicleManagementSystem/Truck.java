package OOP.ConceptPractice.VehicleManagementSystem;

public class Truck extends Vehicle {

    double loadCapacity;


    public Truck(String category, String name, String color, double loadCapacity) {
        super(category, name, color);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String emitSound() {
        return "The truck goes honk honk!";
    }
}
