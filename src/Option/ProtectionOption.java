package Option;

import Rental.Rental;
import Tool.Tool;

public class ProtectionOption extends OptionDecorator {

    @Override
    public String[] setOptions(Tool tool) {
        String[] protectionOption = new String[] { "Protection Gear" };
        tool.options = Rental.combine(protectionOption, tool.options);
        return tool.options;
    }

    @Override
    public Integer getCost(Tool tool) {
        tool.totalPrice = tool.totalPrice + 10;
        return 10;
    }
}
