package homework.customer;


import homework.vehicle.Vehicle;

public class Corporate extends Customer {
    @Override
    public int rent(Vehicle vehicle, int rentalPeriod) {
        if (rentalVehicles.contains(vehicle)){
          return  vehicle.rent( rentalPeriod);
        }
        return 0;
    }
}
