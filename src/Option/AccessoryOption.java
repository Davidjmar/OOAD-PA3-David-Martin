package Option;

import Rental.Rental;
import Tool.Tool;

public class AccessoryOption extends OptionDecorator {

    @Override
    public String[] setOptions(Tool tool) {
        // TODO: REMOVE BEFORE FLIGHT
        // System.out.println("Drawing Cord");
        String[] accessoryOption = new String[] { "Accessories Package" };
        tool.options = Rental.combine(accessoryOption, tool.options);
        System.out.println("In accessory options " + tool.options);
        return tool.options;
    }

    @Override
    public Integer getCost(Tool tool) {
        tool.totalPrice = tool.totalPrice + 10;
        System.out.println("In accessory getCost " + tool.totalPrice);
        return 10;
    }
}
