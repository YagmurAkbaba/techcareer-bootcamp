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

        // daily price policy
        PricePolicy dailyPricePolicy = new DailyPricePolicy();

        // monthly price policy
        PricePolicy monthlyPricePolicy = new MonthlyPricePolicy();

        // corporate daily rent Sedan
        dailyPricePolicy.setRentalPolicy(8, sedan.getAge()*5);
        sedan.setPricePolicy(dailyPricePolicy);
        System.out.println(corporate.rent(sedan,5));

        // corporate daily rent Suv
        dailyPricePolicy.setRentalPolicy(10,0);
        suv.setPricePolicy(dailyPricePolicy);
        System.out.println(corporate.rent(suv,3));

        // corporate daily rent Hatchback
        dailyPricePolicy.setRentalPolicy(15,2);
        hatchback.setPricePolicy(dailyPricePolicy);
        System.out.println(corporate.rent(hatchback, 15));


        // corporate monthly rent Sedan
        monthlyPricePolicy.setRentalPolicy(4,0);
        sedan.setPricePolicy(monthlyPricePolicy);
        System.out.println(corporate.rent(sedan, 2));

        // corporate monthly rent Hatchback
        monthlyPricePolicy.setRentalPolicy(8,0);
        hatchback.setPricePolicy(monthlyPricePolicy);
        System.out.println(corporate.rent(hatchback, 3));

        // individual daily price policy
        dailyPricePolicy.setRentalPolicy(6, 0);
        hatchback.setPricePolicy(dailyPricePolicy);
        System.out.println(individual.rent(hatchback, 4));

        // individual monthly price policy
        monthlyPricePolicy.setRentalPolicy(4,12);
        hatchback.setPricePolicy(monthlyPricePolicy);
        System.out.println(individual.rent(hatchback, 5));




    }}