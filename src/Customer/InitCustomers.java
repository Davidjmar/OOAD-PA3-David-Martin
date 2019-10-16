package Customer;

import java.util.Random;

public class InitCustomers {
    public static Customer[] buildArray() {
        // USE FACTORY PATTERN TO CREATE RANDOMIZED ARRAY OF CUSTOMER
        Customer[] customerArr;
        int customerSize = 12;
        customerArr = new Customer[customerSize];
        // CREATE ARRAY OF CUSTOMER NAMES
        String[] customerNameArr;
        customerNameArr = new String[] { "Reginold", "Barrey", "Connie", "Sixta", "Doyle", "Van", "Matt", "Lavonna",
                "Rona", "Henri", "Marica", "Palmira" };
        // SET ONE OF EACH CUSTOMER
        customerArr[0] = CustomerFactory.buildCustomer(CustomerType.REGULAR, customerNameArr[0]);
        customerArr[1] = CustomerFactory.buildCustomer(CustomerType.BUSINESS, customerNameArr[1]);
        customerArr[2] = CustomerFactory.buildCustomer(CustomerType.CASUAL, customerNameArr[2]);
        // RANDOMIZE THE REST OF THE CUSTOMER TYPES
        int[] randomizerArray;
        randomizerArray = new int[] { 1, 2, 3 };
        for (int i = 3; i < customerSize; i++) {
            Random rand = new Random();
            int randomElement = randomizerArray[rand.nextInt(randomizerArray.length)];
            // Set the if's for each customer type
            if (randomElement == 1) {
                customerArr[i] = CustomerFactory.buildCustomer(CustomerType.BUSINESS, customerNameArr[i]);
            } else if (randomElement == 2) {
                customerArr[i] = CustomerFactory.buildCustomer(CustomerType.REGULAR, customerNameArr[i]);
            } else {
                customerArr[i] = CustomerFactory.buildCustomer(CustomerType.CASUAL, customerNameArr[i]);
            }
        }
        return customerArr;
    }
}
