package Tool;

public class ConcreteTool extends Tool {

    ConcreteTool(String toolName) {
        super(ToolType.CONCRETE, toolName);
        construct();
    }

    @Override
    protected void construct() {
        this.price = 50;
        this.totalPrice = 50;
    }
}
