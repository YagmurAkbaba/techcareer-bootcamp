package homework.customer;

import homework.vehicle.Hatchback;

import homework.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Individual extends Customer {

    @Override
    public int rent(Vehicle vehicle, int rentalPeriod) {
        if (rentalVehicles.contains(vehicle) && vehicle instanceof Hatchback) {
           return vehicle.rent(rentalPeriod);
        }
        return 0;
    }

    @Override
    public void setRentalVehicles(Vehicle vehicle) {
        if (vehicle instanceof Hatchback) {
            rentalVehicles.add(vehicle);
        }

    }
}
