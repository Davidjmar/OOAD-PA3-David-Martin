package Customer;

public class CustomerFactory {
    public static Customer buildCustomer(CustomerType membership) {
        Customer customer = null;
        switch (membership) {

        // case SMALL:
        // car = new SmallCar();
        // break;

        // case SEDAN:
        // car = new SedanCar();
        // break;

        case REGULAR:
            customer = new RegularCustomer();
            break;

        default:
            // throw some exception
            break;
        }
        return customer;
    }

    public static void main(String[] args) {
        System.out.println(CarFactory.buildCar(CarType.LUXURY));
    }
}
