package Customer;

public class RegularCustomer extends Customer {

    RegularCustomer() {
        super(CustomerType.REGULAR);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Building regular customer");
        // add accessories
    }
}
