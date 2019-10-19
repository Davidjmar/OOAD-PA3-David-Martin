package Option;

import Tool.Tool;

public class OptionImpl implements OptionSource {

    @Override
    public String[] setOptions(Tool tool) {
        return tool.options;
    }

    @Override
    public Integer getCost(Tool tool) {
        return tool.totalPrice;
    }
}
