package homework.pricePolicy;

public class PricePolicy {
        private int factor;

        public void setRentalPolicy(int factor){
        this.factor = factor;
    }

        public int getRentalPrice(int price){
            return factor * price;
        }

}
