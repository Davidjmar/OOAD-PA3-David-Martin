package Tool;

public class ConcreteTool extends Tool {

    ConcreteTool(String toolName) {
        super(ToolType.CONCRETE, toolName);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Building concrete tool");
        this.price = 50;
    }
}
