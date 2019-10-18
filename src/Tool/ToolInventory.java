package Tool;

public class ToolInventory {
    public static Tool[] buildArray() {
        // USE FACTORY PATTERN TO CREATE RANDOMIZED ARRAY OF TOOL
        Tool[] toolArr;
        int toolSize = 24;
        toolArr = new Tool[toolSize];
        // CREATE ARRAY OF Tool Names
        String[] toolNameArr;
        toolNameArr = new String[] { "Paint Brush", "Paint Tray", "Paint Roller", "Paint Sprayer", "Paint Remover",
                "Concrete Mixer", "Concrete Spade", "Concrete Molder", "Concrete Buffer", "Concrete Leveler",
                "Yard Rake", "Yard LeafBlower", "Yard Lawnmower", "Yard Weedwacker", "Yard Trashbin", "Wood Powersaw",
                "Wood Sander", "Wood Router", "Wood Sawhorse", "Wood Drill", "Plumbing Wrench", "Plumbing Clamp",
                "Plumbing Gauge", "Plumbing Converter", "Plumbing Pump" };
        for (int i = 0; i < toolSize; i++) {
            if (i <= 4) {
                toolArr[i] = ToolFactory.buildTool(ToolType.PAINTING, toolNameArr[i]);
            } else if (i <= 9) {
                toolArr[i] = ToolFactory.buildTool(ToolType.CONCRETE, toolNameArr[i]);
            } else if (i <= 14) {
                toolArr[i] = ToolFactory.buildTool(ToolType.YARDWORK, toolNameArr[i]);
            } else if (i <= 19) {
                toolArr[i] = ToolFactory.buildTool(ToolType.WOODWORK, toolNameArr[i]);
            } else if (i <= 24) {
                toolArr[i] = ToolFactory.buildTool(ToolType.PLUMBING, toolNameArr[i]);
            }
        }
        return toolArr;
    }
}
