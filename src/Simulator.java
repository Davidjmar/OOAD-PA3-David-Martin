import Day.*;
import Customer.*;

public class Simulator {
    public static void main(String[] args) {

        // Day = []
        // int days = 35;
        // arr = new Day[days]

        System.out.println("Hello Java");
        // Customers[] customersArr;
        // customersArr = FactoryHandler.FactoryHandler();
        // System.out.println(customersArr);
        System.out.println(CustomerFactory.buildCustomer(CustomerType.REGULAR));
    }
}
