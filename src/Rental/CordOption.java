package Rental;

class Cord extends Rental {

    @Override
    public String options() {
        System.out.println("Drawing Cord");
        return "options";
    }

    @Override
    public Integer getCost() {
        System.out.println("Drawing Cord");
        return 5;
    }
}
