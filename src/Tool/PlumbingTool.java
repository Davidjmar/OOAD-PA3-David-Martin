package Tool;

public class PlumbingTool extends Tool {

    PlumbingTool(String toolName) {
        super(ToolType.PLUMBING, toolName);
        construct();
    }

    @Override
    protected void construct() {
        // TODO: REMOVE BEFORE FLIGHT
        System.out.println("Building plumbing tool");
        this.price = 35;
    }
}
