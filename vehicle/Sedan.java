package homework.vehicle;

import homework.pricePolicy.DailyPricePolicy;
import homework.pricePolicy.MonthlyPricePolicy;
import homework.rent.IDailyRent;
import homework.rent.IMonthlyRent;
import homework.rent.RentalType;

public class Sedan extends Vehicle implements IDailyRent, IMonthlyRent {
    /*MonthlyPricePolicy monthlyPricePolicy;
    DailyPricePolicy dailyPricePolicy;*/


    public Sedan(String color, String fuel, int age, int rentalPrice) {
        super(color, fuel, age, rentalPrice);
        /*this.monthlyPricePolicy = new MonthlyPricePolicy();
        this.dailyPricePolicy = new DailyPricePolicy();
        monthlyPricePolicy.setRentalPolicy(monthlyRentalFactor);
        dailyPricePolicy.setRentalPolicy(dailyRentalFactor);*/
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
