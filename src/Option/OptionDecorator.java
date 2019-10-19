package Option;

import Tool.Tool;

public abstract class OptionDecorator implements OptionSource {
    private OptionSource option;

    // standard constructors
    @Override
    public String[] setOptions(Tool tool) {
        return option.setOptions(tool);
    }

    @Override
    public Integer getCost(Tool tool) {
        return option.getCost(tool);
    }
    // public abstract void setOptions(Tool tool);
}
