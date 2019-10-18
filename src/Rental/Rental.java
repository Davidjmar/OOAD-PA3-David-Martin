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

    // TODO: LAST! Every once in a blue moon the bouncer let's someone sneak by with
    // more thatn they can rent
    public static Boolean storeBouncer(Tool[] toolInventory, Customer customer) {
        int count = 0;
        for (Tool i : toolInventory) {
            if (i.rented == false) {
                count++;
            }
        }
        // let em' go nuts
        if (count > customer.maxToolsRentable) {
            customer.toolsRenting = randomValueInRange(customer.maxToolsRentable, customer.minToolsRentable);
            customer.rentingPeriod = randomValueInRange(customer.maxRentalPeriod, customer.minRentalPeriod);
            return true;
        }
        // They can only rent the minimal amount
        else if (count == customer.minToolsRentable) {
            // determine the number of tools customer is renting and period customer is
            // renting for (cleared for max tools by bouncer)
            customer.toolsRenting = customer.minToolsRentable;
            customer.rentingPeriod = randomValueInRange(customer.maxRentalPeriod, customer.minRentalPeriod);
            return true;
        } else if (count > customer.minToolsRentable && count < customer.maxToolsRentable) {
            // If the remaining inventory is within their range of rentaable items
            customer.toolsRenting = randomValueInRange(count, customer.minToolsRentable);
            customer.rentingPeriod = randomValueInRange(customer.maxRentalPeriod, customer.minRentalPeriod);
            return true;
        } else {
            return false;
        }
    }

    public static String[] combine(String[] a, String[] b) {
        int length = a.length + b.length;
        String[] result = new String[length];
        System.arraycopy(a, 0, result, 0, a.length);
        System.arraycopy(b, 0, result, a.length, b.length);
        return result;
    }

    public static Integer randomValueInRange(Integer max, Integer min) {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(max) + min;
        return randomInt;
    }

    // This will return the array of tools rented by the customer
    public static Tool[] rentTools(Tool[] toolInventory, Customer customer) {
        // determine the number of tools customer is renting and period customer is
        // renting for (cleared for max tools by bouncer)

        // ** Pick array of random unrented tools and add to rented array
        // Initialize rented array size
        // TODO: REMOVE BEFORE FLIGHT
        // System.out.println("Tools renting = " + customer.toolsRenting);
        Tool[] rentedArr;
        rentedArr = new Tool[customer.toolsRenting];
        for (int rented = 0; rented < rentedArr.length; rented++) {

            // Indexing tool inventory for randomization compatability
            while (rentedArr[rented] == null) {

                int randomIndex = randomValueInRange(toolInventory.length, 0);
                if (toolInventory[randomIndex].rented == false) {
                    rentedArr[rented] = toolInventory[randomIndex];
                    toolInventory[randomIndex].daysLeftOfRental = customer.rentingPeriod;
                    toolInventory[randomIndex].rentedBy = customer;
                    toolInventory[randomIndex].rented = true;
                    rentedArr[rented].daysLeftOfRental = customer.rentingPeriod;
                    rentedArr[rented].rentedBy = customer;
                    rentedArr[rented].rented = true;
                    // TODO:
                    // Call the options handler HERE

                    // set the tools properties to reflect rental
                }
            }
        }
        return rentedArr;
    }

    // TODO: Write the handler that will pick a number from 0-6 and use switches to
    // randomize the package options. The handler will then set the options for each
    // item in the Tool[] it is passed.
    // we may want to seperate this into a different package for the decorator class
    // public abstract void setOptions(Tool tool);
    // // Don't set tools.options yet, leave it null until otherwise

    // // This will return the individual cost of the item and also add it to the
    // // tool's total cost property
    // public abstract Integer getCost(Tool tool);
}
