package homework.customer;


import homework.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public abstract class Customer {

    List<Vehicle> rentalVehicles = new ArrayList<>();

    public abstract int rent(Vehicle vehicle, int rentalPeriod);

    public void showRentalVehicles(){
        int i = 1;
        System.out.println("Rentable Vehicles List: ");
        for (Vehicle vehicle : rentalVehicles){
            System.out.println("Choice " + (i++) + " - " + vehicle);
        }
    }

    public void setRentalVehicles(Vehicle vehicle) {
        rentalVehicles.add(vehicle);
    }

    public List<Vehicle> getRentableVehicles() {
        return rentalVehicles;
    }
}
