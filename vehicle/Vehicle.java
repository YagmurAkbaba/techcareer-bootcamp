package homework.vehicle;

import homework.pricePolicy.PricePolicy;
import homework.rent.RentalType;

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

    public String getColor() {
        return color;
    }

    public String getFuel() {
        return fuel;
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

    public PricePolicy getPricePolicy() {
        return pricePolicy;
    }

    public abstract void rent(RentalType rentalType);
}
