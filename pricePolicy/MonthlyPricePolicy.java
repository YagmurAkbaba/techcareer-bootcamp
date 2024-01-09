package homework.pricePolicy;

public class MonthlyPricePolicy extends PricePolicy {

    @Override
    public int getRentalPrice(int price){
        return super.getRentalPrice(price) * 30;
    }
}
