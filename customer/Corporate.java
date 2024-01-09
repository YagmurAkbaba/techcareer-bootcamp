package homework.customer;

import homework.rent.RentalType;
import homework.vehicle.Vehicle;

public class Corporate extends Customer {
    @Override
    public void rent(Vehicle vehicle, RentalType rentalType) {
        vehicle.rent(rentalType);
    }
}
