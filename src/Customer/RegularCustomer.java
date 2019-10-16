package Customer;

public class RegularCustomer extends Customer {

    RegularCustomer() {
        super(CustomerType.REGULAR);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Building regular customer");
        this.minToolsRentable = 1;
        this.maxToolsRentable = 3;
        this.minRentalPeriod = 3;
        this.maxRentalPeriod = 5;
    }
}
