package Tool;

public class ToolFactory {
    public static Tool buildTool(ToolType category, String toolName) {
        Tool tool = null;
        switch (category) {

        case YARDWORK:
            tool = new YardworkTool(toolName);
            break;

        case WOODWORK:
            tool = new WoodworkTool(toolName);
            break;

        case PLUMBING:
            tool = new PlumbingTool(toolName);
            break;

        case CONCRETE:
            tool = new ConcreteTool(toolName);
            break;

        case PAINTING:
            tool = new PaintingTool(toolName);
            break;

        default:
            // throw some exception
            break;
        }
        return tool;
    }
}
