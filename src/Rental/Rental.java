package Rental;

import Customer.Customer;
import Customer.CustomerType;
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

    // This will return the array of tools rented by the customer
    public Tool[] rentTools(Tool[] toolInventory, Customer customer) {
        Tool[] rentedArr;

        return rentedArr;
    }

    // This will add 0-6 options to the rental
    // we may want to seperate this into a different package for the decorator class
    public abstract String options();

    // This will find the total cost of the tools and options
    public abstract Integer getCost();
}
