import Customer.Customer;
import Customer.InitCustomers;
import Rental.Rental;
import Tool.Tool;
import Tool.ToolInventory;

public class Simulator {
    public static void main(String[] args) {

        // Array of days:
        // A for loop over this array will call the
        // rental decorator pattern which will assign rentals
        // to customers of that day, and set the rented status of tools
        //
        Integer[] day;
        int days = 35;
        day = new Integer[days];

        int totaledProfit = 0;

        Tool[] toolArr;
        toolArr = ToolInventory.buildArray();
        // ARRAY OF TOOLS INITIALIZED

        Customer[] customerArr;
        customerArr = InitCustomers.buildArray();
        // ARRAY OF CUSTOMERS INITIALIZED
        // System.out.println(customerArr[6]);
        // System.out.println(customerArr[0].maxToolsRentable);

        // TODO: Build out Rentals(and options) with Decorator pattern

        // DAY SIMULATIONS
        int dailyProfit = 0;
        int totalProfits = 0;
        for (int i = 0; i < days; i++) {

            // PRINT INIT DAILY STATEMENTS
            // List completed rentals and profits before clearing daily profits array
            // System.out.println("Today is day: ", i);
            // System.out.println(count and list of all completed rentals including which
            // tools and options were rented by which customer, for how many days, along
            // with the total fee for that rental);

            // BUILD DAY'S CUSTOMER ARRAY
            // randomly select some number of customers and randomize which customers
            // create a random number from one to 12 and set a counter to that value
            // then in a for loop that loops counter number of times concatenate
            // randomly selected customers from customerarr

            // CHECK IF THERE IS INVENTORY FOR DAY'S CUTOMER[i]
            // Check the inventory allows for the customer to make a rental
            if (Rental.storeBouncer(toolArr, customerArr[i])) {
                // CREATE RENTAL
                // True = creat rental for customer
                // Rental.rentedTools()
            }
            // else let for loop move past customer

            // PRINT RENTED TOOLS AND THE CUSTOMER RENTING
            // Print the tools with rented status = false with the customer name
            // Print count of tools rented status = false

            // PRINT DAY'S PROFIT
            // System.out.println(dailyProfit);
        }
        // rentals should store the tool, options bought, who it was rented by, for how
        // many days, if it was completed
        // probably an array of arrays

        // For Loop over day array:
        // 0. Store bouncer who will determine if there is enough inventory for the
        // customer types coming in
        // 1. List completed rentals and options, by which customer, and what options
        // 2. List tools in inventory with rented boolean = false
        // 3. Sum of profit that day made calculated by rental decorator

        // After For Loop:
        // 1. Total count of completed rentals by each customer type
        // 2. Total count of completed rentals (could just sum previous counts)
        // 3. print totalProfited
    }
}
