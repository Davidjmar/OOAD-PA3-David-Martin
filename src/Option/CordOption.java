package Option;

import Tool.Tool;

abstract class Cord extends OptionSource {

    @Override
    public void setOptions(Tool tool) {
        // TODO: REMOVE BEFORE FLIGHT
        // System.out.println("Drawing Cord");
        String[] cordOption = new String[] { "Extension Cord" };
        tool.options = Rental.combine(cordOption, tool.options);
    }

    @Override
    public Integer getCost(Tool tool) {
        tool.totalPrice = tool.totalPrice + 5;
        return 5;
    }
}
