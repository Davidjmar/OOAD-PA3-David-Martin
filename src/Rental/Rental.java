package Rental;

import java.util.Random;

import Customer.Customer;
import Tool.Tool;

// Rentals will build a rental by being passed a customer
// Then with the decorator pattern it will add options to the tool record
// It will then add the total of the tools to the total of the options
// before each day the POS will run through the rentals array and complete any
// returns

public abstract class Rental {

    public static Boolean storeBouncer(Tool[] toolInventory, Customer customer) {
        int count = 0;
        for (Tool i : toolInventory) {
            if (i.rented == false) {
                count++;
            }
        }
        if (count >= customer.maxToolsRentable) {
            return true;
        } else {
            return false;
        }
    }

    public static Integer randomValueInRange(Integer max, Integer min) {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(max) + min;
        return randomInt;
    }

    // This will return the array of tools rented by the customer
    public static Tool[] rentTools(Tool[] toolInventory, Customer customer) {
        Tool[] rentedArr;
        // determine the number of tools customer is renting and period customer is
        // renting for (cleared for max tools by bouncer)
        int toolsRenting = randomValueInRange(customer.maxToolsRentable, customer.minToolsRentable);
        int rentalPeriod = randomValueInRange(customer.maxRentalPeriod, customer.minRentalPeriod);

        // ** Pick array of random unrented tools and add to rented array
        // Initialize rented array size
        rentedArr = new Tool[toolsRenting];
        for (Tool rented : rentedArr) {
            // TODO: randomize the possibleTool
            for (Tool possibleTool : toolInventory) {
                if (!possibleTool.rented) {
                    rented = possibleTool;
                    // To be thorough:
                    possibleTool.daysLeftOfRental = rentalPeriod;
                    possibleTool.rentedBy = customer;
                    possibleTool.rented = true;
                    rented.daysLeftOfRental = rentalPeriod;
                    rented.rentedBy = customer;
                    rented.rented = true;
                    // set the tools properties to reflect rental
                }
            }
        }
        return rentedArr;
    }

    // This will add 0-6 options to the rental
    // we may want to seperate this into a different package for the decorator class
    public abstract String options();

    // This will find the total cost of the tools and options
    public abstract Integer getCost();
}
