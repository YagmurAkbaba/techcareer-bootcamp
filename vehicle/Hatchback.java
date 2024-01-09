package homework.vehicle;

import homework.pricePolicy.DailyPricePolicy;
import homework.pricePolicy.MonthlyPricePolicy;
import homework.pricePolicy.PricePolicy;
import homework.rent.IDailyRent;
import homework.rent.IMonthlyRent;
import homework.rent.RentalType;

import java.util.List;

public class Hatchback extends Vehicle implements IDailyRent, IMonthlyRent {


    public Hatchback(String color, String fuel, int age, int rentalPrice) {
        super(color, fuel, age, rentalPrice);

    }

    @Override
    public int rentDaily() {
        return getRentalPrice();
    }

    @Override
    public int rentMonthly() {
        return getRentalPrice();
    }

    @Override
    public void rent(RentalType rentalType) {
        if (rentalType == RentalType.DAILY) {
            System.out.println(rentDaily());
        } else if(rentalType == RentalType.MONTHLY){
            System.out.println(rentMonthly());
        } else {
            System.out.println("Incorrect Operation");
        }
    }
}
