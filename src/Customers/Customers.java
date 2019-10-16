package Customer;
// why tf is it not taking customers as a package?

// TODO: Create regular, business and Casual concrete customer instances

public enum CustomerType {
    REGULAR, BUSINESS, CASUAL
}

public abstract class Customers {
    // protected String id;
    protected Integer maxToolsRentable;
    protected Integer maxRentalPeriod;
    protected Integer minRentalPeriod;

    public Customers(CustomerType customer) {
        this.customer = customer;
        assignRentals();
    }

    // maybe set call their rentals here??
    private void assignRentals() {
        // Do one time processing here
    }

    // Do subclass level processing in this method
    protected abstract void construct();

    private CustomerType customer = null;

    public CustomerType getcustomer() {
        return customer;
    }

    public void setcustomer(CustomerType customer) {
        this.customer = customer;
    }
}
