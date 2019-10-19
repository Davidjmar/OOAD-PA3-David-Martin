package Option;

import Rental.Rental;
import Tool.Tool;

public class OptionHandler {

    public static String[] optionPicker(Tool tool) {
        int optionQuantity = Rental.randomValueInRange(6, 0);
        if (optionQuantity == 0) {
            return tool.options;
        }
        for (int i = 0; i <= optionQuantity; i++) {
            int optionNumber = Rental.randomValueInRange(3, 1);
            switch (optionNumber) {
            case 1:
                OptionSource option1 = new AccessoryOption();
                tool.options = option1.setOptions(tool);
                tool.totalPrice += option1.getCost(tool);
                break;
            case 2:
                OptionSource option2 = new CordOption();
                tool.options = option2.setOptions(tool);
                tool.totalPrice += option2.getCost(tool);
                break;
            case 3:
                OptionSource option3 = new ProtectionOption();
                tool.options = option3.setOptions(tool);
                tool.totalPrice += option3.getCost(tool);
                break;
            }
        }

        return tool.options;
    }

}
