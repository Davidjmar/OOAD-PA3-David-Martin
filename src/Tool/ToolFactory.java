package Tool;

public class ToolFactory {
    public static Tool buildTool(ToolType category, String toolName) {
        Tool tool = null;
        switch (category) {

        case YARDWORK:
            tool = new YardworkTool(toolName);
            // TODO: REMOVE BEFORE FLIGHT
            System.out.println(tool.toolName);
            break;

        case WOODWORK:
            tool = new WoodworkTool(toolName);
            // TODO: REMOVE BEFORE FLIGHT
            System.out.println(tool.toolName);
            break;

        case PLUMBING:
            tool = new PlumbingTool(toolName);
            // TODO: REMOVE BEFORE FLIGHT
            System.out.println(tool.toolName);
            break;

        case CONCRETE:
            tool = new ConcreteTool(toolName);
            // TODO: REMOVE BEFORE FLIGHT
            System.out.println(tool.toolName);
            break;

        case PAINTING:
            tool = new PaintingTool(toolName);
            // TODO: REMOVE BEFORE FLIGHT
            System.out.println(tool.toolName);
            break;

        default:
            // throw some exception
            break;
        }
        return tool;
    }

    // TODO: REMOVE BEFORE FLIGHT
    public static void main(String[] args) {
        System.out.println(ToolFactory.buildTool(ToolType.PAINTING, "Paint Tool 1"));
        System.out.println(ToolFactory.buildTool(ToolType.PAINTING, "Paint Tool 2"));
        System.out.println(ToolFactory.buildTool(ToolType.CONCRETE, "Conrete Tool 1"));
        System.out.println(ToolFactory.buildTool(ToolType.CONCRETE, "Conrete Tool 2"));
        System.out.println(ToolFactory.buildTool(ToolType.WOODWORK, "Woodwork Tool 1"));
        System.out.println(ToolFactory.buildTool(ToolType.WOODWORK, "Woodwork Tool 2"));
        System.out.println(ToolFactory.buildTool(ToolType.PLUMBING, "Plumbing Tool 1"));
        System.out.println(ToolFactory.buildTool(ToolType.PLUMBING, "Plumbing Tool 2"));
        System.out.println(ToolFactory.buildTool(ToolType.YARDWORK, "Yardwork Tool 1"));
        System.out.println(ToolFactory.buildTool(ToolType.YARDWORK, "Yardwork Tool 2"));

    }
}
