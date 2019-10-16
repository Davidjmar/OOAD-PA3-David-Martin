package Tool;

public class WoodworkTool extends Tool {

    WoodworkTool(String toolName) {
        super(ToolType.WOODWORK, toolName);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Building woodwork tool");
        this.price = 60;
    }
}
