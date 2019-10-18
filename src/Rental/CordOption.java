package Rental;

class Cord extends Rental {

    @Override
    public String options() {
        // TODO: REMOVE BEFORE FLIGHT
        System.out.println("Drawing Cord");
        return "options";
    }

    @Override
    public Integer getCost() {
        // TODO: REMOVE BEFORE FLIGHT
        System.out.println("Drawing Cord");
        return 5;
    }
}
