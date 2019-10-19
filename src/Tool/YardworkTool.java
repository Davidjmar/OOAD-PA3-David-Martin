package Tool;

public class YardworkTool extends Tool {

    YardworkTool(String toolName) {
        super(ToolType.YARDWORK, toolName);
        construct();
    }

    @Override
    protected void construct() {
        this.price = 10;
        this.totalPrice = 10;
    }
}
