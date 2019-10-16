package Customers;

public class Regular extends Customer {
    public Regular() {
        super(customerType.REGULAR);
    }

    @Override
    protected void construct() {
        System.out.println("Building regular customer..");
        this.maxToolsRentable = 3;
        this.minRentalPeriod = 3;
        this.maxRentalPeriod = 5;
        System.out.println(this.maxToolsRentable);
        System.out.println(this.maxRentalPeriod);
        System.out.println(this.minRentalPeriod);
        System.out.println("DONE.");

    }
}
