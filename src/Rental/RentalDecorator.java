package Rental;

abstract class RentalDecorator extends Rental {
    protected Rental decoratedRental;

    public RentalDecorator(Rental decoratedRental) {
        super();
        this.decoratedRental = decoratedRental;
    }
}
