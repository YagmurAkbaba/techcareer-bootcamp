package homework.customer;

import homework.vehicle.Hatchback;
import homework.rent.RentalType;
import homework.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Individual extends Customer {

    @Override
    public void rent(Vehicle vehicle, RentalType rentalType) {
        if (vehicle instanceof Hatchback) {
            vehicle.rent(rentalType);
        }
    }

    @Override
    public void setRentalVehicles(Vehicle vehicle) {
        if (vehicle instanceof Hatchback) {
            rentalVehicles.add(vehicle);
        }

    }
}
