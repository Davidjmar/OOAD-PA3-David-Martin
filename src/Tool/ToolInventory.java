package Tool;

public class ToolInventory {
    public static Tool[] buildArray() {
        // USE FACTORY PATTERN TO CREATE RANDOMIZED ARRAY OF TOOL
        Tool[] toolArr;
        int toolSize = 24;
        toolArr = new Tool[toolSize];
        // CREATE ARRAY OF Tool Names
        String[] toolNameArr;
        toolNameArr = new String[] { "Paintbrush", "Paint Tray", "Concrete Mixer", "Concrete Spade", "Yard Rake",
                "Yard LeafBlower", "Wood Powersaw", "Wood Sander", "Plumbing Wrench", "Plumbing Clamp" };
        for (int i = 0; i < toolSize; i++) {
            if (i <= 1) {
                toolArr[i] = ToolFactory.buildTool(ToolType.PAINTING, toolNameArr[i]);
            } else if (i <= 3) {
                toolArr[i] = ToolFactory.buildTool(ToolType.CONCRETE, toolNameArr[i]);
            } else if (i <= 5) {
                toolArr[i] = ToolFactory.buildTool(ToolType.YARDWORK, toolNameArr[i]);
            } else if (i <= 7) {
                toolArr[i] = ToolFactory.buildTool(ToolType.WOODWORK, toolNameArr[i]);
            } else if (i <= 9) {
                toolArr[i] = ToolFactory.buildTool(ToolType.PLUMBING, toolNameArr[i]);
            }
        }
        return toolArr;
    }
}
