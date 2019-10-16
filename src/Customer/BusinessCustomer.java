package Customer;

public class BusinessCustomer extends Customer {

    BusinessCustomer(String customerName) {
        super(CustomerType.BUSINESS, customerName);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Building business customer");
        // add accessories
        this.minToolsRentable = 3;
        this.maxToolsRentable = 3;
        this.minRentalPeriod = 7;
        this.maxRentalPeriod = 7;
    }
}
