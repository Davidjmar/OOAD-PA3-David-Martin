package Option;

import Rental.Rental;
import Tool.Tool;

public class AccessoryOption extends OptionDecorator {

    @Override
    public String[] setOptions(Tool tool) {
        String[] accessoryOption = new String[] { "Accessories Package" };
        tool.options = Rental.combine(accessoryOption, tool.options);
        return tool.options;
    }

    @Override
    public Integer getCost(Tool tool) {
        tool.totalPrice = tool.totalPrice + 10;
        return 10;
    }
}
