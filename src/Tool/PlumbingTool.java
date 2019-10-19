package Tool;

public class PlumbingTool extends Tool {

    PlumbingTool(String toolName) {
        super(ToolType.PLUMBING, toolName);
        construct();
    }

    @Override
    protected void construct() {
        this.price = 35;
        this.totalPrice = 35;
    }
}
