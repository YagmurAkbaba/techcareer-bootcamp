package homework;

import homework.customer.Corporate;
import homework.customer.Customer;
import homework.customer.Individual;
import homework.pricePolicy.DailyPricePolicy;
import homework.pricePolicy.MonthlyPricePolicy;
import homework.pricePolicy.PricePolicy;
import homework.rent.RentalType;
import homework.vehicle.Hatchback;
import homework.vehicle.SUV;
import homework.vehicle.Sedan;
import homework.vehicle.Vehicle;

import javax.swing.text.PlainDocument;
import java.util.Scanner;

public class CarRentalCompany {
    public static void main(String[] args) {

        SUV suv = new SUV("Blue", "Diesel", 2, 370);

        Sedan sedan = new Sedan("Red", "Diesel", 1, 450);

        Hatchback hatchback = new Hatchback("White", "Diesel", 5, 200);


        Customer individual = new Individual();


        Customer corporate = new Corporate();


        // daily price policy
        PricePolicy dailyPricePolicy = new DailyPricePolicy();

        // corporate daily rent Sedan
        dailyPricePolicy.setRentalPolicy(8);
        sedan.setPricePolicy(dailyPricePolicy);
        corporate.setRentalVehicles(sedan);
        corporate.rent(sedan, RentalType.DAILY);

        // corporate daily rent Suv
        dailyPricePolicy.setRentalPolicy(10);
        suv.setPricePolicy(dailyPricePolicy);
        corporate.setRentalVehicles(suv);
        corporate.rent(suv, RentalType.DAILY);

        // corporate daily rent Hatchback
        dailyPricePolicy.setRentalPolicy(15);
        hatchback.setPricePolicy(dailyPricePolicy);
        corporate.setRentalVehicles(hatchback);
        corporate.rent(hatchback, RentalType.DAILY);

        // monthly price policy
        PricePolicy monthlyPricePolicy = new MonthlyPricePolicy();

        // corporate monthly rent Sedan
        monthlyPricePolicy.setRentalPolicy(4);
        sedan.setPricePolicy(monthlyPricePolicy);
        corporate.setRentalVehicles(sedan);
        corporate.rent(sedan, RentalType.MONTHLY);

        // corporate monthly rent Hatchback
        monthlyPricePolicy.setRentalPolicy(8);
        hatchback.setPricePolicy(monthlyPricePolicy);
        corporate.setRentalVehicles(hatchback);
        corporate.rent(hatchback, RentalType.MONTHLY);

        // individual daily price policy
        dailyPricePolicy.setRentalPolicy(6);
        hatchback.setPricePolicy(dailyPricePolicy);
        individual.setRentalVehicles(hatchback);
        individual.rent(hatchback, RentalType.DAILY);

        // individual monthly price policy
        monthlyPricePolicy.setRentalPolicy(4);
        hatchback.setPricePolicy(monthlyPricePolicy);
        individual.setRentalVehicles(hatchback);
        individual.rent(hatchback, RentalType.MONTHLY);

        corporate.showRentalVehicles();

/*        boolean flag = true;
        while (flag){

            switch (chooseOperationType()){
                case 0:
                    flag = false;
                    break;
                case 1:


                    break;
                case 2:
                    rentDetails(new Corporate());
                default:
                    System.out.println("Invalid Operation");
                    break;
            }

        }

    }

    public static void rentDetails(Customer customer){
        Scanner scanner = new Scanner(System.in);

        customer.showRentalVehicles();
        System.out.println("Please enter choice number");
        int choiceNumber = scanner.nextInt();
        System.out.println("Please enter rental period choice");
        System.out.println("Daily");
        System.out.println("Monthly");
        String period = scanner.next().toUpperCase();
        customer.rent(customer.getRentableVehicles().get(choiceNumber-1), RentalType.valueOf(period));

    }

    public static int chooseOperationType(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Choose Your Operation Type:");
        System.out.println("Individual - Type 1");
        System.out.println("Corporate - Type 2");
        System.out.println("Exit - Type 0");


        int choice = scanner.nextInt();
        return choice;
    }*/



    }

    public static void showAvailableRentalVehicles(Customer customer){
        customer.showRentalVehicles();
    }



}
