package Option;

import Rental.Rental;
import Tool.Tool;

public class CordOption extends OptionDecorator {

    @Override
    public String[] setOptions(Tool tool) {
        // TODO: REMOVE BEFORE FLIGHT
        // System.out.println("Drawing Cord");
        String[] cordOption = new String[] { "Extension Cord" };
        tool.options = Rental.combine(cordOption, tool.options);
        System.out.println("In Cord options " + tool.options);
        return tool.options;
    }

    @Override
    public Integer getCost(Tool tool) {
        tool.totalPrice = tool.totalPrice + 5;
        System.out.println("In Cord getCost " + tool.totalPrice);
        return 5;
    }
}
