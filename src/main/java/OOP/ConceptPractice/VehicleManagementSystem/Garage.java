package OOP.ConceptPractice.VehicleManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Garage {

    List<Vehicle> vehicleList = new ArrayList<>();

    public void addVehicle(Vehicle vehicle) {
        vehicleList.add(vehicle);
    }


    public void startVehicles() {
        for (Vehicle vehicle : vehicleList) {
            System.out.println(vehicle.emitSound());
        }
    }

}
