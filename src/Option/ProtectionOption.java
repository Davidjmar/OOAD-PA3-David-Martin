package Option;

import Rental.Rental;
import Tool.Tool;

public class ProtectionOption extends OptionDecorator {

    @Override
    public String[] setOptions(Tool tool) {
        // TODO: REMOVE BEFORE FLIGHT
        // System.out.println("Drawing Cord");
        String[] protectionOption = new String[] { "Protection Gear" };
        tool.options = Rental.combine(protectionOption, tool.options);
        System.out.println("In protection options " + tool.options);
        return tool.options;
    }

    @Override
    public Integer getCost(Tool tool) {
        tool.totalPrice = tool.totalPrice + 10;
        System.out.println("In Cord getCost " + tool.totalPrice);
        return 10;
    }
}
