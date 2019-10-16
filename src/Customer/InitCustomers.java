package Customer;

import java.util.Random;

public class InitCustomers {
    public static Customer[] buildArray() {
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
        return customerArr;
    }
}
