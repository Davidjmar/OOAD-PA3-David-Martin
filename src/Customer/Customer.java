package Customer;

public abstract class Customer {

    public Customer(CustomerType membership) {
        this.membership = membership;
        arrangeParts();
    }

    private void arrangeParts() {
        // Do one time processing here
    }

    // Do subclass level processing in this method
    protected abstract void construct();

    private CustomerType membership = null;

    public CustomerType getMembership() {
        return membership;
    }

    public void setMembership(CustomerType membership) {
        this.membership = membership;
    }
}
