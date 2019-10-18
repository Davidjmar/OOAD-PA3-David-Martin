package Tool;

public class YardworkTool extends Tool {

    YardworkTool(String toolName) {
        super(ToolType.YARDWORK, toolName);
        construct();
    }

    @Override
    protected void construct() {
        // TODO: REMOVE BEFORE FLIGHT
        System.out.println("Building yardwork tool");
        this.price = 10;
        this.totalPrice = 10;
    }
}
