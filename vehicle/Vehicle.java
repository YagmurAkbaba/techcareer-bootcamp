package homework.vehicle;

import homework.pricePolicy.PricePolicy;


import java.util.List;

public abstract class Vehicle {

    private String color;
    private String fuel;
    private int age;
    private int rentalPrice;
    private PricePolicy pricePolicy;

    public Vehicle(String color, String fuel, int age, int rentalPrice){
        this.color = color;
        this.fuel = fuel;
        this.age = age;
        setRentalPrice(rentalPrice);
    }

    public int getRentalPrice() {
        return pricePolicy.getRentalPrice(rentalPrice);
    }

    public void setRentalPrice(int rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

    public void setPricePolicy(PricePolicy pricePolicy) {
        this.pricePolicy = pricePolicy;
    }

    public int getAge() {
        return age;
    }

    public int rent(int rentalPeriod){
        return rentalPeriod * getRentalPrice();
    }
}
