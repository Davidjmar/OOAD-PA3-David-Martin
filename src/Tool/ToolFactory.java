package Tool;

public class ToolFactory {
    public static Tool buildTool(ToolType category, String toolName) {
        Tool tool = null;
        switch (category) {

        case PAINTING:
            tool = new PaintingTool(toolName);
            System.out.println(tool.toolName);
            break;

        default:
            // throw some exception
            break;
        }
        return tool;
    }

    public static void main(String[] args) {
        System.out.println(ToolFactory.buildTool(ToolType.PAINTING, "Paint Tool 1"));

    }
}
