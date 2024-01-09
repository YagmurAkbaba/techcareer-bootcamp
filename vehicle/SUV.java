package homework.vehicle;

import homework.pricePolicy.DailyPricePolicy;
import homework.rent.IDailyRent;
import homework.rent.RentalType;

public class SUV extends Vehicle implements IDailyRent {
    /*DailyPricePolicy dailyPricePolicy;*/


    public SUV(String color, String fuel, int age, int rentalPrice) {
        super(color, fuel, age, rentalPrice);
        /*this.dailyPricePolicy = new DailyPricePolicy();
        dailyPricePolicy.setRentalPolicy(dailyRentalFactor);*/
    }

    @Override
    public int rentDaily() {
        return getRentalPrice();
    }


    @Override
    public void rent(RentalType rentalType) {
        if (rentalType == RentalType.DAILY) {
            System.out.println(rentDaily());
        } else {
            System.out.println("Incorrect Operation");
        }
    }
}
