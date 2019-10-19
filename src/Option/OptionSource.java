package Option;

import Tool.Tool;

public interface OptionSource {
    String[] setOptions(Tool tool);
    // This will concatenate the options given by the handler

    Integer getCost(Tool tool);
    // This will return the individual cost of the item and also add it to the
    // tool's total cost property
}
