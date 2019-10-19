package Rental;

import java.util.Random;

import Customer.Customer;
import Option.OptionHandler;
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
        int length;
        String[] result;
        if (a == null) {
            return b;
        } else if (b == null) {
            return a;
        } else {
            length = a.length + b.length;
            result = new String[length];
            System.arraycopy(a, 0, result, 0, a.length);
            System.arraycopy(b, 0, result, a.length, b.length);
        }
        return result;
    }

    public static Integer randomValueInRange(Integer max, Integer min) {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(max) + min;
        return randomInt;
    }

    public static Tool[] complete(Tool[] openRental) {
        Tool[] completedRentals;
        int countCompletedRentals = 0;
        for (int i = 0; i < openRental.length; i++) {
            // ...Might be able to remove .rented caluse of if because array passed may only
            // contain open rentals
            if (openRental[i].rented == true && openRental[i].daysLeftOfRental == 0) {
                countCompletedRentals++;
            }
        }
        completedRentals = new Tool[countCompletedRentals];
        for (int i = 0; i < countCompletedRentals; i++) {
            for (int j = 0; j < openRental.length; j++) {
                if (openRental[j].rented == true && openRental[j].daysLeftOfRental == 0) {
                    System.out.println(openRental[j].toolName);
                    completedRentals[i] = openRental[j];
                }
            }
        }
        // We now have an array of completed rentals
        return completedRentals;
    }

    public static void cleanCompleted(Tool[] tool) {
        for (Tool tool2 : tool) {
            if (tool2.rented == true && tool2.daysLeftOfRental == 0) {
                tool2.rented = false;
                tool2.options = null;
                tool2.totalPrice = tool2.price;
                tool2.rentedBy = null;
            }
        }
    }

    // This will return the array of tools rented by the customer
    public static Tool[] rentTools(Tool[] toolInventory, Customer customer) {
        // determine the number of tools customer is renting and period customer is
        // renting for (cleared for max tools by bouncer)

        // ** Pick array of random unrented tools and add to rented array
        Tool[] rentedArr;
        rentedArr = new Tool[customer.toolsRenting];
        for (int rented = 0; rented < rentedArr.length; rented++) {
            // Indexing tool inventory for randomization compatability
            while (rentedArr[rented] == null) {
                int randomIndex = randomValueInRange(toolInventory.length, 0);
                if (toolInventory[randomIndex].rented == false) {
                    toolInventory[randomIndex].daysLeftOfRental = customer.rentingPeriod;
                    toolInventory[randomIndex].rentedBy = customer;
                    toolInventory[randomIndex].rented = true;
                    toolInventory[randomIndex].totalPrice = toolInventory[randomIndex].totalPrice
                            * customer.rentingPeriod;

                    rentedArr[rented] = toolInventory[randomIndex];
                    OptionHandler.optionPicker(rentedArr[rented]);
                    // This should set the options and calculate total checkout cost
                }
            }
        }
        return rentedArr;
    }
}
