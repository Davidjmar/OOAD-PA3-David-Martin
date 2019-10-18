package Customer;

public class CustomerFactory {
    public static Customer buildCustomer(CustomerType membership, String customerName) {
        Customer customer = null;
        switch (membership) {

        case BUSINESS:
            customer = new BusinessCustomer(customerName);
            // TODO: REMOVE BEFORE FLIGHT
            System.out.println(customer.customerName);
            break;

        case CASUAL:
            customer = new CasualCustomer(customerName);
            // TODO: REMOVE BEFORE FLIGHT
            System.out.println(customer.customerName);
            break;

        case REGULAR:
            customer = new RegularCustomer(customerName);
            // TODO: REMOVE BEFORE FLIGHT
            System.out.println(customer.customerName);
            break;

        default:
            // throw some exception
            break;
        }
        return customer;
    }

    // THIS MAIN IS FOR DEBUGGING ONLY
    // TODO: REMOVE BEFORE FLIGHT
    public static void main(String[] args) {
        System.out.println(CustomerFactory.buildCustomer(CustomerType.BUSINESS, "BARNIE"));
        System.out.println(CustomerFactory.buildCustomer(CustomerType.CASUAL, "CARRIE"));
        System.out.println(CustomerFactory.buildCustomer(CustomerType.REGULAR, "RON"));
    }
}
