package Customer;

public class CasualCustomer extends Customer {

    CasualCustomer(String customerName) {
        super(CustomerType.CASUAL, customerName);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Building casual customer");
        // add accessories
        this.minToolsRentable = 1;
        this.maxToolsRentable = 2;
        this.minRentalPeriod = 1;
        this.maxRentalPeriod = 2;
    }
}
