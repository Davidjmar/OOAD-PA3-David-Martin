package Customer;

public abstract class Customer {
    public Integer maxToolsRentable;
    public Integer minToolsRentable;
    public Integer maxRentalPeriod;
    public Integer minRentalPeriod;
    public Integer toolsRented = 0;

    public Customer(CustomerType membership) {
        this.membership = membership;
        assignRentals();
    }

    private void assignRentals() {
        // Do one time processing here
        // Maybe not
    }

    // Method for subclass processing
    protected abstract void construct();

    private CustomerType membership = null;

    public CustomerType getMembership() {
        return membership;
    }

    public void setMembership(CustomerType membership) {
        this.membership = membership;
    }
}
