package OOP.ConceptPractice.VehicleManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        Garage garage = new Garage();


        Car car = new Car("Car", "Toyota Corolla", "Red", 180);
        Bicycle bicycle = new Bicycle("Bicycle", "Giant MTB", "Blue", true);
        Truck truck = new Truck("Truck", "Volvo FH", "White", 15.5);

        garage.addVehicle(car);
        garage.addVehicle(bicycle);
        garage.addVehicle(truck);

        garage.startVehicles();





    }


}
