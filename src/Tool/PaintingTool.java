package Tool;

public class PaintingTool extends Tool {

    PaintingTool(String toolName) {
        super(ToolType.PAINTING, toolName);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Building painting tool");
        this.price = 20;
    }
}
