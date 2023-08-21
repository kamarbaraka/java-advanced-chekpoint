package java_advanced_checkpoint.Question3;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        Vehicle vehicle = new Vehicle();
        Motorcycle motorcycle = new Motorcycle();
        Car car1 = new Car();
        Vehicle hicle1 = new Vehicle();
        Motorcycle cycle = new Motorcycle();

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(car1);
        vehicles.add(vehicle);
        vehicles.add(cycle);
        vehicles.add(hicle1);
        vehicles.add(motorcycle);
        vehicles.add(car);

        vehicles.forEach(Vehicle::drive);

    }
}
