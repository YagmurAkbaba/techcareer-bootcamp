package homework.pricePolicy;

public class PricePolicy {
        private int factor;
        private int rentalDiscountRatio;

        public void setRentalPolicy(int factor, int rentalDiscountRatio){
            this.rentalDiscountRatio = rentalDiscountRatio;
            this.factor = factor;
    }

        public int getRentalPrice(int price){
            return factor * price * (100-rentalDiscountRatio);
        }

}
