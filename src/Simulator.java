import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import Customer.Customer;
import Customer.InitCustomers;
import Rental.Rental;
import Tool.Tool;
import Tool.ToolInventory;

public class Simulator {

    // Remove already selected customers during day customer array initializer
    public static int[] removeTheElement(int[] arr, int index) {
        if (arr == null || index < 0 || index >= arr.length) {
            return arr;
        }
        List<Integer> arrayList = IntStream.of(arr).boxed().collect(Collectors.toList());
        // Remove the indexed element
        arrayList.remove(index);
        // return the resultant array
        return arrayList.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int getArrayIndex(int[] arr, int value) {
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                k = i;
                break;
            }
        }
        return k;
    }

    public static void main(String[] args) throws FileNotFoundException {
        PrintStream out = new PrintStream("./output.txt");
        System.setOut(out);

        int days = 35;

        Tool[] toolArr;
        toolArr = ToolInventory.buildArray();
        // ARRAY OF TOOLS INITIALIZED

        Customer[] customerArr;
        customerArr = InitCustomers.buildArray();
        // ARRAY OF CUSTOMERS INITIALIZED

        // SIMULATION
        // ############################################################
        // CONSTANTS:
        int dailyProfit = 0;
        int totalProfit = 0;
        int completedRentals = 0;
        Tool[][] openRentals;
        Tool[][] currentDaysRentals;
        for (int i = 1; i <= days; i++) {

            System.out.println("Today is day: " + i);

            // TODO:
            // Create and array of arrays from open Rentals where days left == 0,
            // completedrentals = length of array of arrays of completed rentals
            System.out.println("There were " + completedRentals + " completed rentals this morning.");
            // System.out.println(list of all completed rentals including which
            // tools and options were rented by which customer, for how many days, and total
            // fee for that rental);

            // Call a Rental function Completed that removes rented by, days left, options
            // and sets rented = false, and resets total price to tool.price --> arguments =
            // completed rentals array and it returns an array of rentals that have been
            // completed.

            // BUILD DAY'S CUSTOMER ARRAY
            // Randomly select some number of customers and randomize which customers
            // Create a random number from one to 12 and set a counter to that value
            Customer[] dayCustomers;
            int[] randomizerArray;
            randomizerArray = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
            Random rand = new Random();
            int numberOfCustomers = randomizerArray[rand.nextInt(randomizerArray.length)];

            // then in a for loop that loops counter number of times concatenate
            // randomly selected customers from customerarr
            // Set the daily customer array size
            dayCustomers = new Customer[numberOfCustomers];

            // INIT DAY'S POTENTIAL CUSTOMERS
            // //TODO: REMOVE BEFORE FLIGHT
            // System.out.println("Filling day's customer array. There should be: " +
            // numberOfCustomers);
            int[] customerIndex;
            customerIndex = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
            for (int c = 0; c < numberOfCustomers; c++) {
                int pickedCustomer = customerIndex[rand.nextInt(customerIndex.length)];
                dayCustomers[c] = customerArr[pickedCustomer];
                // delete element from customer index
                customerIndex = removeTheElement(customerIndex, getArrayIndex(customerIndex, pickedCustomer));
            }
            // DAY'S CUSTOMER ARRAY INITIALIZED

            // Call the customer to make a rental IF inventory allows it
            for (int j = 0; j < numberOfCustomers; j++) {
                // CHECK IF THERE IS INVENTORY FOR DAY'S CUSTOMER[i]
                if (Rental.storeBouncer(toolArr, dayCustomers[j])) {
                    // CREATE RENTALS FOR CUSTOMER
                    // TODO: BUILD OUT OPTIONS DECORATOR
                    Tool[] customerRented;
                    customerRented = Rental.rentTools(toolArr, dayCustomers[j]);
                    // TODO: REMOVE BEFORE FLIGHT
                    System.out.println(dayCustomers[j].customerName + " rented:");
                    for (int tester = 0; tester < customerRented.length; tester++) {
                        System.out.println(customerRented[tester].toolName);
                    }
                }
                // ELSE let for loop move past the current customer. Let someone else try.
            }

            // PRINT ALL RENTED TOOLS AND THE CUSTOMER RENTING
            // DEPRECATE THE DAYS LEFT OF TOOLS RENTAL WHILE LOOPING THROUGH.
            int activeRentals = 0;
            for (Tool t : toolArr) {
                if (t.rented == true) {
                    activeRentals++;
                    t.daysLeftOfRental--;
                }
            }
            System.out.println("There are " + activeRentals + " active rentals.\n" + "Where: ");
            String[] activeRenter = new String[activeRentals];
            int seperateIndexer = 0;
            for (int r = 0; r < toolArr.length; r++) {
                if (toolArr[r].rented) {
                    activeRenter[seperateIndexer] = (toolArr[r].toolName + " is being rented by "
                            + toolArr[r].rentedBy.customerName);
                    seperateIndexer++;
                }
            }
            for (String r : activeRenter) {
                System.out.println(r);
            }

            // Print Tools left in the store
            System.out.println("The tools still in store are: ");
            for (Tool t : toolArr) {
                if (t.rented == false) {
                    System.out.println(t.toolName);
                }
            }

            // PRINT DAY'S PROFIT
            System.out.println("The amount of money made on day " + i + " was " + dailyProfit);

            // DEPRECATE THE DAYS LEFT OF RENTAL IN THE RENTALS ARRAY
        }

        // TODO:
        // 1. Total count of completed rentals by each customer type
        // 2. Total count of completed rentals (could just sum previous counts)
        // PRINT TOTAL PROFITED
        System.out.println("The total amount of money made over 35 days was " + totalProfit);

        // NOTE:
        // rentals should store the tool, options bought, who it was rented by, for how
        // many days, if it was completed
    }
}
