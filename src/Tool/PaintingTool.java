package Tool;

public class PaintingTool extends Tool {

    PaintingTool(String toolName) {
        super(ToolType.PAINTING, toolName);
        construct();
    }

    @Override
    protected void construct() {
        this.price = 20;
        this.totalPrice = 20;
    }
}
