package Tool;

public class YardworkTool extends Tool {

    YardworkTool(String toolName) {
        super(ToolType.YARDWORK, toolName);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Building yardwork tool");
        this.price = 10;
    }
}
