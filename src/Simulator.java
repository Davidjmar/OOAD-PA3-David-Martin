import Day.*;
import Customer.*;
import Tool.*;

public class Simulator {
    public static void main(String[] args) {

        // TODO: Create Day functionality
        // Day = []
        // int days = 35;
        // arr = new Day[days]

        // TODO: Build out tool Options

        // TODO: Populate 14 more tools (save it for the end if you want)
        Tool[] toolArr;
        toolArr = ToolInventory.buildArray();
        // ARRAY OF TOOLS INITIALIZED

        Customer[] customerArr;
        customerArr = InitCustomers.buildArray();
        // ARRAY OF CUSTOMERS INITIALIZED

        // System.out.println(customerArr[6]);
        // System.out.println(customerArr[0].maxToolsRentable);
    }
}
