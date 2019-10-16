package Customers;

public class CustomerFactory {
    public static Customers buildCustomer(CustomerType customerType) {
        Customers customer = null;
        switch (customerType) {
        case REGULAR:
            customer = new Regular();
            break;

        case CASUAL:
            customer = new Casual();
            break;

        case BUSINESS:
            customer = new Business();
            break;

        default:
            // throw some exception
            break;
        }
        return customer;
    }

    // Facade to run the customer factory!!
    public buildHandler(){
        int customerCount = 24;
        
    }
}
