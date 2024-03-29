package Tool;

import Customer.*;

public abstract class Tool {
    // Name, Catergory, Price, and Rental Status
    public String toolName;
    public String[] options;
    public Integer price;
    public Customer rentedBy;
    public Integer daysLeftOfRental;
    public Boolean rented = false;
    public Integer totalPrice;

    public Tool(ToolType category, String toolName) {
        this.category = category;
        this.toolName = toolName;
        assignRentals();
    }

    private void assignRentals() {
        // Do one time processing here
        // Maybe not
    }

    // Method for subclass processing
    protected abstract void construct();

    private ToolType category = null;

    public ToolType getCategory() {
        return category;
    }

    public void setCategory(ToolType category) {
        this.category = category;
    }
}
