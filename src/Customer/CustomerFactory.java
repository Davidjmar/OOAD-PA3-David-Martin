package Customer;

public class CustomerFactory {
    public static Customer buildCustomer(CustomerType membership, String customerName) {
        Customer customer = null;
        switch (membership) {

        case BUSINESS:
            customer = new BusinessCustomer(customerName);
            break;

        case CASUAL:
            customer = new CasualCustomer(customerName);
            break;

        case REGULAR:
            customer = new RegularCustomer(customerName);
            break;

        default:
            // throw some exception
            break;
        }
        return customer;
    }
}
