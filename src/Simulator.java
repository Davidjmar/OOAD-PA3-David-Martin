import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import Customer.Customer;
import Customer.InitCustomers;
import Tool.Tool;
import Tool.ToolInventory;
import Rental.*;

public class Simulator {

    // Remove already selected customers during day customer array initializer
    public static int[] removeTheElement(int[] arr, int index) {
        // If the array is empty
        // or the index is not in array range
        // return the original array
        // If the array is empty
        // or the index is not in array range
        // return the original array
        if (arr == null || index < 0 || index >= arr.length) {

            return arr;
        }

        // Create ArrayList from the array
        List<Integer> arrayList = IntStream.of(arr).boxed().collect(Collectors.toList());

        // Remove the specified element
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

    public static void main(String[] args) {

        int days = 35;

        Tool[] toolArr;
        toolArr = ToolInventory.buildArray();
        // ARRAY OF TOOLS INITIALIZED

        Customer[] customerArr;
        customerArr = InitCustomers.buildArray();
        // ARRAY OF CUSTOMERS INITIALIZED
        // Use ex: System.out.println(customerArr[0].maxToolsRentable);

        // TODO: Build out Rentals(and options) with Decorator pattern

        // DAY SIMULATIONS
        // CONSTANTS:
        int dailyProfit = 0;
        int totalProfit = 0;
        for (int i = 0; i < days; i++) {

            // PRINT INIT DAILY STATEMENTS
            // System.out.println("Today is day: ", i);
            // System.out.println(count and list of all completed rentals including which
            // tools and options were rented by which customer, for how many days, and total
            // fee for that rental);

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

            // Fill the day's customer array:
            System.out.println("Filling day's customer array. There should be: " + numberOfCustomers);
            int[] customerIndex;
            customerIndex = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
            for (int c = 0; c < numberOfCustomers; c++) {
                int pickedCustomer = customerIndex[rand.nextInt(customerIndex.length)];
                dayCustomers[c] = customerArr[pickedCustomer];
                // delete element from customer index
                customerIndex = removeTheElement(customerIndex, getArrayIndex(customerIndex, pickedCustomer));
                // PRINT --> Test for day's customer array building correctly
                System.out.println(dayCustomers[c].customerName);
            }
            // DAY'S CUSTOMER ARRAY INITIALIZED

            // CHECK IF THERE IS INVENTORY FOR DAY'S CUSTOMER[i]
            for (int j = 0; j <= numberOfCustomers; j++) {
                if (Rental.storeBouncer(toolArr, customerArr[j])) {
                    // CREATE RENTAL
                    // Rental.rentedTools()
                }
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
