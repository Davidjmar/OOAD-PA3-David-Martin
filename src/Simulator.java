import Day.*;
import Customer.*;

import java.util.Random;

public class Simulator {
    public static void main(String[] args) {

        // TODO: Create Day functionality
        // Day = []
        // int days = 35;
        // arr = new Day[days]

        // TODO: Build out tools factory, be sure to build out options with it
        // Tool [] toolArr

        // TODO:

        // USE FACTORY PATTERN TO CREATE RANDOMIZED ARRAY OF CUSTOMER
        Customer[] customerArr;
        int customerSize = 12;
        customerArr = new Customer[customerSize];
        // SET ONE OF EACH CUSTOMER
        customerArr[0] = CustomerFactory.buildCustomer(CustomerType.REGULAR);
        customerArr[1] = CustomerFactory.buildCustomer(CustomerType.BUSINESS);
        customerArr[2] = CustomerFactory.buildCustomer(CustomerType.CASUAL);
        // RANDOMIZE THE REST OF THE CUSTOMERS
        int[] randomizerArray;
        randomizerArray = new int[] { 1, 2, 3 };
        for (int i = 3; i < customerSize; i++) {
            Random rand = new Random();
            int randomElement = randomizerArray[rand.nextInt(randomizerArray.length)];
            // Set the if's for each customer type
            if (randomElement == 1) {
                customerArr[i] = CustomerFactory.buildCustomer(CustomerType.BUSINESS);
            } else if (randomElement == 2) {
                customerArr[i] = CustomerFactory.buildCustomer(CustomerType.REGULAR);
            } else {
                customerArr[i] = CustomerFactory.buildCustomer(CustomerType.CASUAL);
            }
        }
        // ARRAY OF CUSTOMERS INITIALIZED

        // System.out.println(customerArr);
        // System.out.println(customerArr[0].maxToolsRentable);
        // System.out.println(customerArr[1]);
        // System.out.println(customerArr[2]);
    }
}
