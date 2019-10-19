package Option;

import Rental.Rental;
import Tool.Tool;

public class CordOption extends OptionDecorator {

    @Override
    public String[] setOptions(Tool tool) {
        String[] cordOption = new String[] { "Extension Cord" };
        tool.options = Rental.combine(cordOption, tool.options);
        return tool.options;
    }

    @Override
    public Integer getCost(Tool tool) {
        tool.totalPrice = tool.totalPrice + 5;
        return 5;
    }
}
