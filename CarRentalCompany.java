package homework;

import homework.customer.Corporate;
import homework.customer.Customer;
import homework.customer.Individual;
import homework.pricePolicy.DailyPricePolicy;
import homework.pricePolicy.MonthlyPricePolicy;
import homework.pricePolicy.PricePolicy;

import homework.vehicle.*;

import javax.swing.text.PlainDocument;
import java.util.Scanner;

public class CarRentalCompany {
    public static void main(String[] args) {

        // Vehicles
        SUV suv = new SUV("Blue", "Diesel", 2, 370);
        Sedan sedan = new Sedan("Red", "Diesel", 1, 450);
        Hatchback hatchback = new Hatchback("White", "Diesel", 5, 200);

        // Customers
        Customer individual = new Individual();
        Customer corporate = new Corporate();

        // corporate rental vehicles
        corporate.setRentalVehicles(sedan);
        corporate.setRentalVehicles(suv);
        corporate.setRentalVehicles(hatchback);

        // individual rental vehicles
        individual.setRentalVehicles(hatchback);

        // corporate daily rent Sedan
        rent(new Corporate(), sedan, new DailyPricePolicy(),
                sedan.getAge()*5, 8,5 );

        // corporate daily rent Suv
        rent(new Corporate(), suv, new DailyPricePolicy(),
                0, 10,3 );

        // corporate daily rent Hatchback
        rent(new Corporate(), hatchback, new DailyPricePolicy(),
                2, 15,15 );


        // corporate monthly rent Sedan
        rent(new Corporate(), sedan, new MonthlyPricePolicy(),
                0, 4,2 );


        // corporate monthly rent Hatchback
        rent(new Corporate(), hatchback, new MonthlyPricePolicy(),
                0, 8,3 );

        // individual daily price policy
        rent(new Individual(), hatchback, new DailyPricePolicy(),
                0, 6,4 );


        // individual monthly price policy
        rent(new Individual(), hatchback, new MonthlyPricePolicy(),
                12, 4,5 );




    }

    public static void rent(Customer customer, Vehicle vehicle, PricePolicy pricePolicy, int rentalDiscountRate, int factor, int rentalPeriod){
        pricePolicy.setRentalPolicy(factor, rentalDiscountRate);
        vehicle.setPricePolicy(pricePolicy);
        System.out.println(customer.rent(vehicle, 4));
    }
}