package Tool;

public class WoodworkTool extends Tool {

    WoodworkTool(String toolName) {
        super(ToolType.WOODWORK, toolName);
        construct();
    }

    @Override
    protected void construct() {
        this.price = 60;
        this.totalPrice = 60;
    }
}
